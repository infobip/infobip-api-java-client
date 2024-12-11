# Moments quickstart

This quick guide aims to help you start with [Infobip Moments API](https://www.infobip.com/docs/api/customer-engagement/moments). After reading it, you should know how to use Moments.

The first step is to create an `ApiClient` instance with some configuration.

```java
    ApiClient apiClient = ApiClient.forApiKey(ApiKey.from(API_KEY))
        .withBaseUrl(BaseUrl.from(BASE_URL))
        .build();
```

## Flow API

You can now create an instance of `FlowApi` which allows you to manage your flows.

````java
    FlowApi flowApi = new FlowApi(apiClient);
````
### Add participants to flow

To add participants to a flow, you can use the following code:

````java
    Long campaignId = 123L;
    String notifyUrl = "https://example.com";
    String callbackData = "Callback Data";
    String identifier = "370329180020364";

    FlowPersonUniqueFieldType personUniqueFieldType = FlowPersonUniqueFieldType.FACEBOOK;
    FlowParticipant givenParticipant = new FlowParticipant()
        .identifyBy(new FlowPersonUniqueField().identifier(identifier).type(personUniqueFieldType));

    FlowAddFlowParticipantsRequest request = new FlowAddFlowParticipantsRequest()
        .addParticipantsItem(givenParticipant)
        .notifyUrl(notifyUrl)
        .callbackData(callbackData);

    flowApi.addFlowParticipants(campaignId, request)
        .execute();
````

### Get a report on participants added to flow

To fetch a report to confirm that all persons have been successfully added to the flow, you can use the following code:

````java
    Long campaignId = 123L;
    String givenOperationId = "03f2d474-0508-46bf-9f3d-d8e2c28adaea";

    flowApi.getFlowParticipantsAddedReport(campaignId, givenOperationId)
        .execute();
````

### Remove person from flow

To remove a person from a flow, you can use the following code:

````java
    Long campaignId = 123L;

    flowApi.removePeopleFromFlow(campaignId)
        .execute();
````


## Forms API

You can now create an instance of `FormsApi` which allows you to manage your forms.

````java
    FormsApi formsApi = new FlowApi(apiClient);
````

### Get forms

To get all forms, you can use the following code:

````java
    FormsResponse response = formsApi
        .getForms()
        .execute();
````

### Get form by ID

To get a specific form by ID, you can use the following code:

````java
    String formId = "cec5dfd2-4238-48e0-933b-9acbdb2e6f5f";

    FormsResponseContent response = formsApi
        .getForm(formId)
        .execute();
````

### Increment form view count

To increase the view counter of a specific form, you can use the following code:

````java
    String formId = "cec5dfd2-4238-48e0-933b-9acbdb2e6f5f";
    FormsStatusResponse response = formsApi
        .incrementViewCount(formId)
        .execute();
````

### Submit form data

To submit data to a specific form, you can use the following code:

````java
    var firstValue = 26;
    var secondValue = true;
    
    String formId = "cec5dfd2-4238-48e0-933b-9acbdb2e6f5f";
    Map<String, Object> formDataRequest = Map.of(
        "firstValue", firstValue,
        "secondValue", secondValue
    );

    FormsStatusResponse response = formsApi
            .submitFormData(formId, formDataRequest)
            .execute();
````
