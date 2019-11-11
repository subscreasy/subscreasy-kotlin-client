# WebHookResourceApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebHookUsingPOST**](WebHookResourceApi.md#createWebHookUsingPOST) | **POST** /api/web-hooks | createWebHook
[**deleteWebHookUsingDELETE**](WebHookResourceApi.md#deleteWebHookUsingDELETE) | **DELETE** /api/web-hooks/{id} | deleteWebHook
[**getAllWebHooksUsingGET**](WebHookResourceApi.md#getAllWebHooksUsingGET) | **GET** /api/web-hooks | getAllWebHooks
[**getWebHookUsingGET**](WebHookResourceApi.md#getWebHookUsingGET) | **GET** /api/web-hooks/{id} | getWebHook
[**updateWebHookUsingPUT**](WebHookResourceApi.md#updateWebHookUsingPUT) | **PUT** /api/web-hooks | updateWebHook


<a name="createWebHookUsingPOST"></a>
# **createWebHookUsingPOST**
> WebHook createWebHookUsingPOST(webHook)

createWebHook

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = WebHookResourceApi()
val webHook : WebHook =  // WebHook | webHook
try {
    val result : WebHook = apiInstance.createWebHookUsingPOST(webHook)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebHookResourceApi#createWebHookUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebHookResourceApi#createWebHookUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webHook** | [**WebHook**](WebHook.md)| webHook |

### Return type

[**WebHook**](WebHook.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteWebHookUsingDELETE"></a>
# **deleteWebHookUsingDELETE**
> deleteWebHookUsingDELETE(id)

deleteWebHook

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = WebHookResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteWebHookUsingDELETE(id)
} catch (e: ClientException) {
    println("4xx response calling WebHookResourceApi#deleteWebHookUsingDELETE")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebHookResourceApi#deleteWebHookUsingDELETE")
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

<a name="getAllWebHooksUsingGET"></a>
# **getAllWebHooksUsingGET**
> kotlin.Array&lt;WebHook&gt; getAllWebHooksUsingGET()

getAllWebHooks

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = WebHookResourceApi()
try {
    val result : kotlin.Array<WebHook> = apiInstance.getAllWebHooksUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebHookResourceApi#getAllWebHooksUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebHookResourceApi#getAllWebHooksUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;WebHook&gt;**](WebHook.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getWebHookUsingGET"></a>
# **getWebHookUsingGET**
> WebHook getWebHookUsingGET(id)

getWebHook

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = WebHookResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : WebHook = apiInstance.getWebHookUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebHookResourceApi#getWebHookUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebHookResourceApi#getWebHookUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**WebHook**](WebHook.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateWebHookUsingPUT"></a>
# **updateWebHookUsingPUT**
> WebHook updateWebHookUsingPUT(webHook)

updateWebHook

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = WebHookResourceApi()
val webHook : WebHook =  // WebHook | webHook
try {
    val result : WebHook = apiInstance.updateWebHookUsingPUT(webHook)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebHookResourceApi#updateWebHookUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebHookResourceApi#updateWebHookUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webHook** | [**WebHook**](WebHook.md)| webHook |

### Return type

[**WebHook**](WebHook.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

