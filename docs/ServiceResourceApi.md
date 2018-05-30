# ServiceResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServiceUsingPOST**](ServiceResourceApi.md#createServiceUsingPOST) | **POST** /api/services | createService
[**deleteServiceUsingDELETE**](ServiceResourceApi.md#deleteServiceUsingDELETE) | **DELETE** /api/services/{id} | deleteService
[**getAllServicesUsingGET**](ServiceResourceApi.md#getAllServicesUsingGET) | **GET** /api/services | getAllServices
[**getServiceUsingGET**](ServiceResourceApi.md#getServiceUsingGET) | **GET** /api/services/{id} | getService
[**updateServiceUsingPUT**](ServiceResourceApi.md#updateServiceUsingPUT) | **PUT** /api/services | updateService


<a name="createServiceUsingPOST"></a>
# **createServiceUsingPOST**
> Service createServiceUsingPOST(service)

createService

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ServiceResourceApi()
val service : Service =  // Service | service
try {
    val result : Service = apiInstance.createServiceUsingPOST(service)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceResourceApi#createServiceUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceResourceApi#createServiceUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **service** | [**Service**](Service.md)| service |

### Return type

[**Service**](Service.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteServiceUsingDELETE"></a>
# **deleteServiceUsingDELETE**
> deleteServiceUsingDELETE(id)

deleteService

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ServiceResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteServiceUsingDELETE(id)
} catch (e: ClientException) {
    println("4xx response calling ServiceResourceApi#deleteServiceUsingDELETE")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceResourceApi#deleteServiceUsingDELETE")
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

<a name="getAllServicesUsingGET"></a>
# **getAllServicesUsingGET**
> kotlin.Array&lt;Service&gt; getAllServicesUsingGET()

getAllServices

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ServiceResourceApi()
try {
    val result : kotlin.Array<Service> = apiInstance.getAllServicesUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceResourceApi#getAllServicesUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceResourceApi#getAllServicesUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Service&gt;**](Service.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getServiceUsingGET"></a>
# **getServiceUsingGET**
> Service getServiceUsingGET(id)

getService

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ServiceResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : Service = apiInstance.getServiceUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceResourceApi#getServiceUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceResourceApi#getServiceUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**Service**](Service.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateServiceUsingPUT"></a>
# **updateServiceUsingPUT**
> Service updateServiceUsingPUT(service)

updateService

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ServiceResourceApi()
val service : Service =  // Service | service
try {
    val result : Service = apiInstance.updateServiceUsingPUT(service)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceResourceApi#updateServiceUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceResourceApi#updateServiceUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **service** | [**Service**](Service.md)| service |

### Return type

[**Service**](Service.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

