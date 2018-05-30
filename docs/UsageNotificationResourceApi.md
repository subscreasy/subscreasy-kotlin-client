# UsageNotificationResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUsageNotificationUsingPOST**](UsageNotificationResourceApi.md#createUsageNotificationUsingPOST) | **POST** /api/usage-notifications | createUsageNotification
[**deleteUsageNotificationUsingDELETE**](UsageNotificationResourceApi.md#deleteUsageNotificationUsingDELETE) | **DELETE** /api/usage-notifications/{id} | deleteUsageNotification
[**getAllUsageNotificationsUsingGET**](UsageNotificationResourceApi.md#getAllUsageNotificationsUsingGET) | **GET** /api/usage-notifications | getAllUsageNotifications
[**getUsageNotificationUsingGET**](UsageNotificationResourceApi.md#getUsageNotificationUsingGET) | **GET** /api/usage-notifications/{id} | getUsageNotification
[**updateUsageNotificationUsingPUT**](UsageNotificationResourceApi.md#updateUsageNotificationUsingPUT) | **PUT** /api/usage-notifications | updateUsageNotification


<a name="createUsageNotificationUsingPOST"></a>
# **createUsageNotificationUsingPOST**
> UsageNotification createUsageNotificationUsingPOST(usageNotification)

createUsageNotification

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = UsageNotificationResourceApi()
val usageNotification : UsageNotification =  // UsageNotification | usageNotification
try {
    val result : UsageNotification = apiInstance.createUsageNotificationUsingPOST(usageNotification)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsageNotificationResourceApi#createUsageNotificationUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsageNotificationResourceApi#createUsageNotificationUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usageNotification** | [**UsageNotification**](UsageNotification.md)| usageNotification |

### Return type

[**UsageNotification**](UsageNotification.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteUsageNotificationUsingDELETE"></a>
# **deleteUsageNotificationUsingDELETE**
> deleteUsageNotificationUsingDELETE(id)

deleteUsageNotification

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = UsageNotificationResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteUsageNotificationUsingDELETE(id)
} catch (e: ClientException) {
    println("4xx response calling UsageNotificationResourceApi#deleteUsageNotificationUsingDELETE")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsageNotificationResourceApi#deleteUsageNotificationUsingDELETE")
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

<a name="getAllUsageNotificationsUsingGET"></a>
# **getAllUsageNotificationsUsingGET**
> kotlin.Array&lt;UsageNotification&gt; getAllUsageNotificationsUsingGET()

getAllUsageNotifications

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = UsageNotificationResourceApi()
try {
    val result : kotlin.Array<UsageNotification> = apiInstance.getAllUsageNotificationsUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsageNotificationResourceApi#getAllUsageNotificationsUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsageNotificationResourceApi#getAllUsageNotificationsUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;UsageNotification&gt;**](UsageNotification.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUsageNotificationUsingGET"></a>
# **getUsageNotificationUsingGET**
> UsageNotification getUsageNotificationUsingGET(id)

getUsageNotification

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = UsageNotificationResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : UsageNotification = apiInstance.getUsageNotificationUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsageNotificationResourceApi#getUsageNotificationUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsageNotificationResourceApi#getUsageNotificationUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**UsageNotification**](UsageNotification.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateUsageNotificationUsingPUT"></a>
# **updateUsageNotificationUsingPUT**
> UsageNotification updateUsageNotificationUsingPUT(usageNotification)

updateUsageNotification

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = UsageNotificationResourceApi()
val usageNotification : UsageNotification =  // UsageNotification | usageNotification
try {
    val result : UsageNotification = apiInstance.updateUsageNotificationUsingPUT(usageNotification)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsageNotificationResourceApi#updateUsageNotificationUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsageNotificationResourceApi#updateUsageNotificationUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usageNotification** | [**UsageNotification**](UsageNotification.md)| usageNotification |

### Return type

[**UsageNotification**](UsageNotification.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

