# MessageTemplateResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMessageTemplateUsingPOST**](MessageTemplateResourceApi.md#createMessageTemplateUsingPOST) | **POST** /api/message-templates | createMessageTemplate
[**deleteMessageTemplateUsingDELETE**](MessageTemplateResourceApi.md#deleteMessageTemplateUsingDELETE) | **DELETE** /api/message-templates/{id} | deleteMessageTemplate
[**getAllMessageTemplatesUsingGET**](MessageTemplateResourceApi.md#getAllMessageTemplatesUsingGET) | **GET** /api/message-templates | getAllMessageTemplates
[**getMessageTemplateUsingGET1**](MessageTemplateResourceApi.md#getMessageTemplateUsingGET1) | **GET** /api/message-templates/{id} | getMessageTemplate
[**updateMessageTemplateUsingPUT**](MessageTemplateResourceApi.md#updateMessageTemplateUsingPUT) | **PUT** /api/message-templates | updateMessageTemplate


<a name="createMessageTemplateUsingPOST"></a>
# **createMessageTemplateUsingPOST**
> MessageTemplate createMessageTemplateUsingPOST(messageTemplate)

createMessageTemplate

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = MessageTemplateResourceApi()
val messageTemplate : MessageTemplate =  // MessageTemplate | messageTemplate
try {
    val result : MessageTemplate = apiInstance.createMessageTemplateUsingPOST(messageTemplate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageTemplateResourceApi#createMessageTemplateUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageTemplateResourceApi#createMessageTemplateUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageTemplate** | [**MessageTemplate**](MessageTemplate.md)| messageTemplate |

### Return type

[**MessageTemplate**](MessageTemplate.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteMessageTemplateUsingDELETE"></a>
# **deleteMessageTemplateUsingDELETE**
> deleteMessageTemplateUsingDELETE(id)

deleteMessageTemplate

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = MessageTemplateResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteMessageTemplateUsingDELETE(id)
} catch (e: ClientException) {
    println("4xx response calling MessageTemplateResourceApi#deleteMessageTemplateUsingDELETE")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageTemplateResourceApi#deleteMessageTemplateUsingDELETE")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllMessageTemplatesUsingGET"></a>
# **getAllMessageTemplatesUsingGET**
> kotlin.Array&lt;MessageTemplate&gt; getAllMessageTemplatesUsingGET()

getAllMessageTemplates

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = MessageTemplateResourceApi()
try {
    val result : kotlin.Array<MessageTemplate> = apiInstance.getAllMessageTemplatesUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageTemplateResourceApi#getAllMessageTemplatesUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageTemplateResourceApi#getAllMessageTemplatesUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;MessageTemplate&gt;**](MessageTemplate.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getMessageTemplateUsingGET1"></a>
# **getMessageTemplateUsingGET1**
> MessageTemplate getMessageTemplateUsingGET1(id)

getMessageTemplate

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = MessageTemplateResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : MessageTemplate = apiInstance.getMessageTemplateUsingGET1(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageTemplateResourceApi#getMessageTemplateUsingGET1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageTemplateResourceApi#getMessageTemplateUsingGET1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**MessageTemplate**](MessageTemplate.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateMessageTemplateUsingPUT"></a>
# **updateMessageTemplateUsingPUT**
> MessageTemplate updateMessageTemplateUsingPUT(messageTemplate)

updateMessageTemplate

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = MessageTemplateResourceApi()
val messageTemplate : MessageTemplate =  // MessageTemplate | messageTemplate
try {
    val result : MessageTemplate = apiInstance.updateMessageTemplateUsingPUT(messageTemplate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MessageTemplateResourceApi#updateMessageTemplateUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MessageTemplateResourceApi#updateMessageTemplateUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageTemplate** | [**MessageTemplate**](MessageTemplate.md)| messageTemplate |

### Return type

[**MessageTemplate**](MessageTemplate.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

