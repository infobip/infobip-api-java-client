# Versioning Strategy

This document defines the versioning strategy for the Infobip Java API Client SDK.

---

## 1. Versioning Model

The SDK follows a **pragmatic Semantic Versioning** model:

```
MAJOR.MINOR.PATCH
```

While we adhere to the core principles of SemVer, the SDK evolves in tandem with Infobip's backend APIs, which may require **occasional breaking changes in MINOR releases**. These will always be documented clearly.

### Summary of Intent

* **MAJOR** → Large, coordinated breaking changes across multiple areas, architectural redesigns, endpoint version migrations.
* **MINOR** → New features, new endpoints, model updates, and in some cases *breaking changes required by API correctness*.
* **PATCH** → Bug fixes, documentation fixes, safe dependency bumps.

---

## 2. Change Classification

### 2.1 Patch Changes (PATCH)

PATCH versions include changes that are fully backward compatible:

* Bug fixes.
* Typo and Javadoc corrections.
* Safe dependency upgrades.
* Internal refactors with no public API impact.

---

### 2.2 New Features and API Updates (MINOR)

MINOR versions introduce:

* New endpoints, webhooks, or new request/response fields.
* Support for new message types, enums, or capabilities.
* Fixing wrong field types (e.g., `String` → `Enum`).
* Removing fields or models when upstream endpoints no longer support them.
* Unifying models (e.g., platform enums, validity windows, message statuses).
* Replacing request/response classes due to upstream schema changes.

**Breaking changes may appear in MINOR releases** when necessary.

---

### 2.3 Major Changes (MAJOR)

MAJOR releases are reserved for **significant, multi-area-breaking changes**, such as:

* Full API reorganization.
* Global unification or rework of API surface.
* Endpoint version migrations across several products.
* Architectural redesigns.
* Removal of deprecated features accumulated over multiple MINOR releases.

---

## 3. Handling Upstream API Changes

* **Correctness takes priority over Java API backward compatibility.**
* When upstream APIs change field types, remove fields, or alter schemas, the SDK must remain consistent.
* Such updates may cause MINOR releases to include breaking changes.
* These will always be documented with a ⚠️ note in the CHANGELOG.

This ensures the SDK remains reliable and accurate for production usage.

---

## 4. Java and Dependency Compatibility Policy

### 4.1 Minimum Java Version Changes

Increasing the **minimum supported Java version** (e.g., Java 11 → Java 21) is always treated as a **MAJOR** version change.  Such a change may break compilation and runtime compatibility for existing users and therefore constitutes a breaking API change.

### 4.2 Dependency Upgrade Policy

**PATCH**

* Only patch-level dependency updates are allowed (e.g., Jackson 2.17.0 → 2.17.2).
* Must not introduce behavior changes, serialization differences, or require consumers to adjust their dependencies.
* Test/build-only dependency bumps are allowed.

**MINOR**

* Patch or minor dependency updates are allowed (e.g., Jackson 2.15 → 2.16).
* No breaking serialization or model changes caused solely by dependency bumps.

**MAJOR**

* All dependency upgrades are allowed, including breaking changes.
* Major dependency upgrades (e.g., Jackson 2 → 3, OkHttp 3 → 4) should be shipped in major releases.
* Framework switches (e.g., Gson → Jackson), large refactors, or structural changes belong here.

All dependency-related breaking changes will be clearly documented in the CHANGELOG.