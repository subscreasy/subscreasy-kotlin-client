# ChargingLogResourceApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChargingLogUsingPOST**](ChargingLogResourceApi.md#createChargingLogUsingPOST) | **POST** /api/charging-logs | createChargingLog
[**deleteChargingLogUsingDELETE**](ChargingLogResourceApi.md#deleteChargingLogUsingDELETE) | **DELETE** /api/charging-logs/{id} | deleteChargingLog
[**getAllChargingLogsUsingGET**](ChargingLogResourceApi.md#getAllChargingLogsUsingGET) | **GET** /api/charging-logs | getAllChargingLogs
[**getChargingLogUsingGET**](ChargingLogResourceApi.md#getChargingLogUsingGET) | **GET** /api/charging-logs/{id} | getChargingLog
[**getChargingLogsByStatusUsingGET**](ChargingLogResourceApi.md#getChargingLogsByStatusUsingGET) | **GET** /api/charging-logs/status/{status} | getChargingLogsByStatus
[**getPaymentsByMerchantSubscriberIdUsingGET**](ChargingLogResourceApi.md#getPaymentsByMerchantSubscriberIdUsingGET) | **GET** /api/charging-logs/subscriber/m/{merchantSubscriberId} | getPaymentsByMerchantSubscriberId
[**refundUsingPOST**](ChargingLogResourceApi.md#refundUsingPOST) | **POST** /api/charging-logs/refund/{chargingLogId} | refund
[**updateChargingLogUsingPUT**](ChargingLogResourceApi.md#updateChargingLogUsingPUT) | **PUT** /api/charging-logs | updateChargingLog


<a name="createChargingLogUsingPOST"></a>
# **createChargingLogUsingPOST**
> ChargingLog createChargingLogUsingPOST(chargingLog)

createChargingLog

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ChargingLogResourceApi()
val chargingLog : ChargingLog =  // ChargingLog | chargingLog
try {
    val result : ChargingLog = apiInstance.createChargingLogUsingPOST(chargingLog)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChargingLogResourceApi#createChargingLogUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChargingLogResourceApi#createChargingLogUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chargingLog** | [**ChargingLog**](ChargingLog.md)| chargingLog |

### Return type

[**ChargingLog**](ChargingLog.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteChargingLogUsingDELETE"></a>
# **deleteChargingLogUsingDELETE**
> deleteChargingLogUsingDELETE(id)

deleteChargingLog

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ChargingLogResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteChargingLogUsingDELETE(id)
} catch (e: ClientException) {
    println("4xx response calling ChargingLogResourceApi#deleteChargingLogUsingDELETE")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChargingLogResourceApi#deleteChargingLogUsingDELETE")
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

<a name="getAllChargingLogsUsingGET"></a>
# **getAllChargingLogsUsingGET**
> kotlin.Array&lt;ChargingLog&gt; getAllChargingLogsUsingGET(page, size, sort)

getAllChargingLogs

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ChargingLogResourceApi()
val page : kotlin.Int = 56 // kotlin.Int | Page number of the requested page
val size : kotlin.Int = 56 // kotlin.Int | Size of a page
val sort : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    val result : kotlin.Array<ChargingLog> = apiInstance.getAllChargingLogsUsingGET(page, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChargingLogResourceApi#getAllChargingLogsUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChargingLogResourceApi#getAllChargingLogsUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Page number of the requested page | [optional]
 **size** | **kotlin.Int**| Size of a page | [optional]
 **sort** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**kotlin.Array&lt;ChargingLog&gt;**](ChargingLog.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getChargingLogUsingGET"></a>
# **getChargingLogUsingGET**
> ChargingLog getChargingLogUsingGET(id)

getChargingLog

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ChargingLogResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : ChargingLog = apiInstance.getChargingLogUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChargingLogResourceApi#getChargingLogUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChargingLogResourceApi#getChargingLogUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**ChargingLog**](ChargingLog.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getChargingLogsByStatusUsingGET"></a>
# **getChargingLogsByStatusUsingGET**
> kotlin.Array&lt;ChargingLog&gt; getChargingLogsByStatusUsingGET(status, page, size, sort)

getChargingLogsByStatus

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ChargingLogResourceApi()
val status : kotlin.String = status_example // kotlin.String | status
val page : kotlin.Int = 56 // kotlin.Int | Page number of the requested page
val size : kotlin.Int = 56 // kotlin.Int | Size of a page
val sort : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    val result : kotlin.Array<ChargingLog> = apiInstance.getChargingLogsByStatusUsingGET(status, page, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChargingLogResourceApi#getChargingLogsByStatusUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChargingLogResourceApi#getChargingLogsByStatusUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **kotlin.String**| status |
 **page** | **kotlin.Int**| Page number of the requested page | [optional]
 **size** | **kotlin.Int**| Size of a page | [optional]
 **sort** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**kotlin.Array&lt;ChargingLog&gt;**](ChargingLog.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPaymentsByMerchantSubscriberIdUsingGET"></a>
# **getPaymentsByMerchantSubscriberIdUsingGET**
> kotlin.Array&lt;ChargingLog&gt; getPaymentsByMerchantSubscriberIdUsingGET(merchantSubscriberId, page, size, sort)

getPaymentsByMerchantSubscriberId

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ChargingLogResourceApi()
val merchantSubscriberId : kotlin.String = merchantSubscriberId_example // kotlin.String | merchantSubscriberId
val page : kotlin.Int = 56 // kotlin.Int | Page number of the requested page
val size : kotlin.Int = 56 // kotlin.Int | Size of a page
val sort : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    val result : kotlin.Array<ChargingLog> = apiInstance.getPaymentsByMerchantSubscriberIdUsingGET(merchantSubscriberId, page, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChargingLogResourceApi#getPaymentsByMerchantSubscriberIdUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChargingLogResourceApi#getPaymentsByMerchantSubscriberIdUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantSubscriberId** | **kotlin.String**| merchantSubscriberId |
 **page** | **kotlin.Int**| Page number of the requested page | [optional]
 **size** | **kotlin.Int**| Size of a page | [optional]
 **sort** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**kotlin.Array&lt;ChargingLog&gt;**](ChargingLog.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="refundUsingPOST"></a>
# **refundUsingPOST**
> ChargingLog refundUsingPOST(chargingLogId)

refund

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ChargingLogResourceApi()
val chargingLogId : kotlin.Long = 789 // kotlin.Long | chargingLogId
try {
    val result : ChargingLog = apiInstance.refundUsingPOST(chargingLogId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChargingLogResourceApi#refundUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChargingLogResourceApi#refundUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chargingLogId** | **kotlin.Long**| chargingLogId |

### Return type

[**ChargingLog**](ChargingLog.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateChargingLogUsingPUT"></a>
# **updateChargingLogUsingPUT**
> ChargingLog updateChargingLogUsingPUT(chargingLog)

updateChargingLog

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ChargingLogResourceApi()
val chargingLog : ChargingLog =  // ChargingLog | chargingLog
try {
    val result : ChargingLog = apiInstance.updateChargingLogUsingPUT(chargingLog)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChargingLogResourceApi#updateChargingLogUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChargingLogResourceApi#updateChargingLogUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chargingLog** | [**ChargingLog**](ChargingLog.md)| chargingLog |

### Return type

[**ChargingLog**](ChargingLog.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

