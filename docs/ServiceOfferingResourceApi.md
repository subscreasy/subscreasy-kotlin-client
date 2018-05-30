# ServiceOfferingResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServiceOfferingUsingPOST**](ServiceOfferingResourceApi.md#createServiceOfferingUsingPOST) | **POST** /api/service-offerings | createServiceOffering
[**deleteServiceOfferingUsingDELETE**](ServiceOfferingResourceApi.md#deleteServiceOfferingUsingDELETE) | **DELETE** /api/service-offerings/{id} | deleteServiceOffering
[**getAllServiceOfferingsUsingGET**](ServiceOfferingResourceApi.md#getAllServiceOfferingsUsingGET) | **GET** /api/service-offerings | getAllServiceOfferings
[**getServiceOfferingUsingGET**](ServiceOfferingResourceApi.md#getServiceOfferingUsingGET) | **GET** /api/service-offerings/{id} | getServiceOffering
[**updateServiceOfferingUsingPUT**](ServiceOfferingResourceApi.md#updateServiceOfferingUsingPUT) | **PUT** /api/service-offerings | updateServiceOffering


<a name="createServiceOfferingUsingPOST"></a>
# **createServiceOfferingUsingPOST**
> ServiceOffering createServiceOfferingUsingPOST(serviceOffering)

createServiceOffering

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ServiceOfferingResourceApi()
val serviceOffering : ServiceOffering =  // ServiceOffering | serviceOffering
try {
    val result : ServiceOffering = apiInstance.createServiceOfferingUsingPOST(serviceOffering)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceOfferingResourceApi#createServiceOfferingUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceOfferingResourceApi#createServiceOfferingUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceOffering** | [**ServiceOffering**](ServiceOffering.md)| serviceOffering |

### Return type

[**ServiceOffering**](ServiceOffering.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteServiceOfferingUsingDELETE"></a>
# **deleteServiceOfferingUsingDELETE**
> deleteServiceOfferingUsingDELETE(id)

deleteServiceOffering

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ServiceOfferingResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteServiceOfferingUsingDELETE(id)
} catch (e: ClientException) {
    println("4xx response calling ServiceOfferingResourceApi#deleteServiceOfferingUsingDELETE")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceOfferingResourceApi#deleteServiceOfferingUsingDELETE")
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

<a name="getAllServiceOfferingsUsingGET"></a>
# **getAllServiceOfferingsUsingGET**
> kotlin.Array&lt;ServiceOffering&gt; getAllServiceOfferingsUsingGET()

getAllServiceOfferings

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ServiceOfferingResourceApi()
try {
    val result : kotlin.Array<ServiceOffering> = apiInstance.getAllServiceOfferingsUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceOfferingResourceApi#getAllServiceOfferingsUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceOfferingResourceApi#getAllServiceOfferingsUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;ServiceOffering&gt;**](ServiceOffering.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getServiceOfferingUsingGET"></a>
# **getServiceOfferingUsingGET**
> ServiceOffering getServiceOfferingUsingGET(id)

getServiceOffering

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ServiceOfferingResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : ServiceOffering = apiInstance.getServiceOfferingUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceOfferingResourceApi#getServiceOfferingUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceOfferingResourceApi#getServiceOfferingUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**ServiceOffering**](ServiceOffering.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateServiceOfferingUsingPUT"></a>
# **updateServiceOfferingUsingPUT**
> ServiceOffering updateServiceOfferingUsingPUT(serviceOffering)

updateServiceOffering

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ServiceOfferingResourceApi()
val serviceOffering : ServiceOffering =  // ServiceOffering | serviceOffering
try {
    val result : ServiceOffering = apiInstance.updateServiceOfferingUsingPUT(serviceOffering)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceOfferingResourceApi#updateServiceOfferingUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceOfferingResourceApi#updateServiceOfferingUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceOffering** | [**ServiceOffering**](ServiceOffering.md)| serviceOffering |

### Return type

[**ServiceOffering**](ServiceOffering.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

