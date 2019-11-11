# ServiceInstanceResourceApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServiceInstanceUsingPOST**](ServiceInstanceResourceApi.md#createServiceInstanceUsingPOST) | **POST** /api/service-instances | createServiceInstance
[**deleteServiceInstanceUsingDELETE**](ServiceInstanceResourceApi.md#deleteServiceInstanceUsingDELETE) | **DELETE** /api/service-instances/{id} | deleteServiceInstance
[**getAllServiceInstancesUsingGET**](ServiceInstanceResourceApi.md#getAllServiceInstancesUsingGET) | **GET** /api/service-instances | getAllServiceInstances
[**getServiceInstanceUsingGET**](ServiceInstanceResourceApi.md#getServiceInstanceUsingGET) | **GET** /api/service-instances/{id} | getServiceInstance
[**updateServiceInstanceUsingPUT**](ServiceInstanceResourceApi.md#updateServiceInstanceUsingPUT) | **PUT** /api/service-instances | updateServiceInstance


<a name="createServiceInstanceUsingPOST"></a>
# **createServiceInstanceUsingPOST**
> ServiceInstance createServiceInstanceUsingPOST(serviceInstance)

createServiceInstance

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ServiceInstanceResourceApi()
val serviceInstance : ServiceInstance =  // ServiceInstance | serviceInstance
try {
    val result : ServiceInstance = apiInstance.createServiceInstanceUsingPOST(serviceInstance)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceInstanceResourceApi#createServiceInstanceUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceInstanceResourceApi#createServiceInstanceUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceInstance** | [**ServiceInstance**](ServiceInstance.md)| serviceInstance |

### Return type

[**ServiceInstance**](ServiceInstance.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteServiceInstanceUsingDELETE"></a>
# **deleteServiceInstanceUsingDELETE**
> deleteServiceInstanceUsingDELETE(id)

deleteServiceInstance

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ServiceInstanceResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteServiceInstanceUsingDELETE(id)
} catch (e: ClientException) {
    println("4xx response calling ServiceInstanceResourceApi#deleteServiceInstanceUsingDELETE")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceInstanceResourceApi#deleteServiceInstanceUsingDELETE")
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

<a name="getAllServiceInstancesUsingGET"></a>
# **getAllServiceInstancesUsingGET**
> kotlin.Array&lt;ServiceInstance&gt; getAllServiceInstancesUsingGET()

getAllServiceInstances

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ServiceInstanceResourceApi()
try {
    val result : kotlin.Array<ServiceInstance> = apiInstance.getAllServiceInstancesUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceInstanceResourceApi#getAllServiceInstancesUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceInstanceResourceApi#getAllServiceInstancesUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;ServiceInstance&gt;**](ServiceInstance.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getServiceInstanceUsingGET"></a>
# **getServiceInstanceUsingGET**
> ServiceInstance getServiceInstanceUsingGET(id)

getServiceInstance

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ServiceInstanceResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : ServiceInstance = apiInstance.getServiceInstanceUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceInstanceResourceApi#getServiceInstanceUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceInstanceResourceApi#getServiceInstanceUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**ServiceInstance**](ServiceInstance.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateServiceInstanceUsingPUT"></a>
# **updateServiceInstanceUsingPUT**
> ServiceInstance updateServiceInstanceUsingPUT(serviceInstance)

updateServiceInstance

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ServiceInstanceResourceApi()
val serviceInstance : ServiceInstance =  // ServiceInstance | serviceInstance
try {
    val result : ServiceInstance = apiInstance.updateServiceInstanceUsingPUT(serviceInstance)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceInstanceResourceApi#updateServiceInstanceUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceInstanceResourceApi#updateServiceInstanceUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceInstance** | [**ServiceInstance**](ServiceInstance.md)| serviceInstance |

### Return type

[**ServiceInstance**](ServiceInstance.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

