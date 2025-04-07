# Guidelines For Contributing

✨✨ First off, thanks for taking the time to contribute! ✨✨

The following is a set of guidelines for contributing to Infobip API Python client library, these are mostly guidelines, not rules. You are free to propose changes to this document in a pull request.

## 🚩 Issues

How to report a bug?

If you've seen something that is or may seem like a bug or a mistake in documentation, or you simply have a suggestion for a new feature, please go ahead and open [an issue][issue-link].
Include as much information as you have. Before you submit your issue, please do the archive search first, as there may be a similar question that's already been answered or is pending a response.

If you haven't found any related issues among the already asked, feel free to open a new one. For new feature requests, any sort of bug, anomaly, issue, etc. please try to provide information, as structured below.
You don't have to follow it to the letter, but having it structured like below may save us a lot of time to pinpoint and fix the issue quicker.

### New issue structure (bugs, anomalies, improvements...)

Providing the following information will increase the chances of your issue being dealt with quickly:

* **Short TO-THE-POINT Overview** - what seems to be the issue.
* **Description** - more detailed explanation of the issue. The stack trace in cases where it is applicable.
* **Which `infobip-api-java-client` version(s)** - which library version(s) you used when the issue occurred.
* **Reproducing** - how did it happen? Is it an isolated anomaly, can you recreate it, what are the steps to recreate it?
* **Related Issues** - is there something similar to this issue that has been reported before? If so, please tag that issue(s) as a reference.

If you want to provide the solution to the issue yourself, you are free to do that as well 😊
We welcome and encourage any effort from the community to take part in solving the issues.
For more details on how to properly provide bugfixes, please check the [Pull request](#%EF%B8%8F-pull-request) section.

## 🚀 Enhancements/Suggestions/Improvements

We welcome any suggestion to improve the project! If you have an idea for a new feature or an improvement,
please follow these guidelines to help us understand your proposal and evaluate its feasibility:

* **Check Existing Issues First** - before suggesting a new enhancement, please search the issue tracker to see if a similar idea or request has already been discussed or proposed.
  If you find a related issue, feel free to add a comment to it, offering additional context or your thoughts, instead of opening a new one.
* **Open a New Enhancement Issue** - if your suggestion is new, please open a new issue and prefix it with "ENHANCEMENT" or "SUGGESTION".
  Please try to title your issue as clearly as possible to summarize your enhancement idea.
* **Provide a Detailed Description** - in your issue description, try to include as much of the following information:
  * **Problem:** What problem does this enhancement solve? Why is this feature needed?
  * **Proposed Solution:** Describe the enhancement or feature you’re suggesting. How should it work? Provide as much detail as possible.
  * **Alternatives Considered:** Have you thought of other ways to solve the problem? If so, briefly explain why your proposed solution is better.
  * **Additional Context:** Share any examples, mockups, screenshots, or links to similar implementations (if applicable).
* **Stay Focused and Specific** - try to keep your enhancement idea focused on a single problem or feature. If you have multiple ideas, consider creating separate issues for each to make the discussion easier to follow.
* **Be Open to Feedback** - we encourage healthy discussion about proposed enhancements. Be open to feedback, as maintainers and other contributors may have questions or alternative suggestions.
* **Contribute the Enhancement** - if you want implement your suggestion or if you're interested in working on the other people's enhancements yourself, please check the [Pull request](#%EF%B8%8F-pull-request) section on how to do that.

## ℹ️ Asking for General Help

The [Infobip website](https://www.infobip.com/docs/api) has a list of resources for getting programming help and more.
For any question contributors are available at [DevRel@infobip.com](mailto:DevRel@infobip.com).

## ⬇️ Pull request

### 🍴 Step 1: Fork

Fork the project on GitHub and clone your fork locally:

```bash
git clone https://github.com/<your username>/infobip-api-java-client.git
cd infobip-api-java-client
git remote add upstream https://github.com/infobip/infobip-api-java-client
git fetch upstream
```

### 🛠️ Step 2: Build

This is a [Maven](https://maven.apache.org/) project so make sure you have Maven installed on your machine, ideally the latest version.
Build the project and run the tests, all tests should pass:

```bash
mvn clean install
```

❕Note: Additionally, you should run the Maven command once with a `-Pgit-hook ` option in order to activate `git-hook` Maven profile which enables the git pre-commit hook that is used for code formatting, see more in [Code](#-step-4-code) section.

### 🌱 Step 3: Branch

To keep your development environment organized, create local branches to hold your work.
These should be branched directly off of the master branch.

```bash
git checkout -b my-branch -t upstream/main
```

### 💻 Step 4: Code

Please follow code structure and naming structure that is already in the repository.
Code follows [Palantir Java Format](https://github.com/palantir/palantir-java-format) which is based on [google-java-format](https://github.com/google/google-java-format).

❗Your build will fail if the code does not adhere to the format.

Formatter for this is already included in the project via [Spotless](https://github.com/diffplug/spotless/blob/main/plugin-maven/README.md) plugin for Maven and will be run automatically before each commit if you've enabled `git-hook` Maven profile.

If you want, you can also check if your code adheres to the format manually without committing anything via the following command:

```bash
mvn spotless:check
```
If any format violations are found, you can fix them with the following command:

```bash
mvn spotless:apply
```

### ✅ Step 5: Commit

#### Commit your changes

It is recommended to keep your changes grouped logically within individual commits.
Many contributors find it easier to review changes that are split across multiple commits.
There is no limit to the number of commits in a pull request.

```bash
git add my/changed/files
git commit -m "Commit message"
```

Note that multiple commits get squashed when the branch is merged to master.
A good commit message should describe what changed and why.
Commit message should:

* Contain a short description of the change (preferably 50 characters or less, and no more than 72 characters)
* First letter should be capital and rest entirely in lowercase with the exception of proper nouns, acronyms,
  and the words that refer to code, like function/variable names

#### ⚠️ Breaking Changes

When commit has the breaking change first line of commit text should be BREAKING CHANGE.

### 📌 Step 6: Rebase

Once you have committed your changes, it is a good idea to use git rebase (not git merge) to synchronize your work with the main repository.

```bash
git fetch upstream
git rebase upstream/main
```

### 🧪 Step 7: Tests

Before submitting your changes in a pull request, always run the full test suite.
You can take a look at other tests for inspiration. Bug fixes and features should always come with tests.
Make sure the linter does not report any issues and that all tests pass. Please do not submit patches that fail either check.

### 🚀 Step 8: Push

Once your commits are ready to go -- with passing tests and linting -- begin the process of opening a pull request by pushing your working branch to GitHub.
```bash
git push origin my-branch
```

### 📬 Step 9: Opening the Pull Request

From within GitHub, open new pull request.
Your PR may be delayed in being merged as maintainers seek more information or clarify ambiguities.

### 🤼 Step 10: Discuss and update

You will probably get feedback or requests for changes to your pull request.
This is a big part of the submission process so don't be discouraged!

To make changes to an existing pull request, make the changes to your local branch,
add a new commit with those changes, and push those to your fork. GitHub will automatically update the pull request.

```bash
git add my/changed/files
git commit -m "Commit message"
git push origin my-branch
```

Feel free to post a comment in the pull request to ping reviewers if you are awaiting an answer on something.

### 🌍 Step 11: Merging

In order for a pull request to be merged, it needs to be reviewed and approved by at least one repository owner and pass the CI.
After that, if there are no objections from other contributors, the pull request can be merged.

🎉🎊 Congratulations and thanks for your contribution! 🎊🎉

Every pull request is tested on the Continuous Integration (CI) system to confirm that it works.
Ideally, the pull request will pass ("be green") on all of CI's tests.
This means that all tests pass and there are no linting errors.

## 📚 Further Reading

For more in-depth guides on developing SDKs, see
[Readme](README.md) and [Infobip's website](https://www.infobip.com/docs/api).

[issue-link]: https://github.com/infobip/infobip-api-java-client/issues/new