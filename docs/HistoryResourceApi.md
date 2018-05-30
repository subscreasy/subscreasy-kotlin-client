# HistoryResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createHistoryUsingPOST**](HistoryResourceApi.md#createHistoryUsingPOST) | **POST** /api/histories | createHistory
[**deleteHistoryUsingDELETE**](HistoryResourceApi.md#deleteHistoryUsingDELETE) | **DELETE** /api/histories/{id} | deleteHistory
[**getAllHistoriesUsingGET**](HistoryResourceApi.md#getAllHistoriesUsingGET) | **GET** /api/histories | getAllHistories
[**getHistoryUsingGET**](HistoryResourceApi.md#getHistoryUsingGET) | **GET** /api/histories/{id} | getHistory
[**updateHistoryUsingPUT**](HistoryResourceApi.md#updateHistoryUsingPUT) | **PUT** /api/histories | updateHistory


<a name="createHistoryUsingPOST"></a>
# **createHistoryUsingPOST**
> History createHistoryUsingPOST(history)

createHistory

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = HistoryResourceApi()
val history : History =  // History | history
try {
    val result : History = apiInstance.createHistoryUsingPOST(history)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HistoryResourceApi#createHistoryUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HistoryResourceApi#createHistoryUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **history** | [**History**](History.md)| history |

### Return type

[**History**](History.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteHistoryUsingDELETE"></a>
# **deleteHistoryUsingDELETE**
> deleteHistoryUsingDELETE(id)

deleteHistory

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = HistoryResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteHistoryUsingDELETE(id)
} catch (e: ClientException) {
    println("4xx response calling HistoryResourceApi#deleteHistoryUsingDELETE")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HistoryResourceApi#deleteHistoryUsingDELETE")
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

<a name="getAllHistoriesUsingGET"></a>
# **getAllHistoriesUsingGET**
> kotlin.Array&lt;History&gt; getAllHistoriesUsingGET()

getAllHistories

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = HistoryResourceApi()
try {
    val result : kotlin.Array<History> = apiInstance.getAllHistoriesUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HistoryResourceApi#getAllHistoriesUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HistoryResourceApi#getAllHistoriesUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;History&gt;**](History.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getHistoryUsingGET"></a>
# **getHistoryUsingGET**
> History getHistoryUsingGET(id)

getHistory

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = HistoryResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : History = apiInstance.getHistoryUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HistoryResourceApi#getHistoryUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HistoryResourceApi#getHistoryUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**History**](History.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateHistoryUsingPUT"></a>
# **updateHistoryUsingPUT**
> History updateHistoryUsingPUT(history)

updateHistory

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = HistoryResourceApi()
val history : History =  // History | history
try {
    val result : History = apiInstance.updateHistoryUsingPUT(history)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HistoryResourceApi#updateHistoryUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HistoryResourceApi#updateHistoryUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **history** | [**History**](History.md)| history |

### Return type

[**History**](History.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

