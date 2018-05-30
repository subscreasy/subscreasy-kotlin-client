# OfferResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOfferUsingPOST**](OfferResourceApi.md#createOfferUsingPOST) | **POST** /api/offers | createOffer
[**deleteOfferUsingDELETE**](OfferResourceApi.md#deleteOfferUsingDELETE) | **DELETE** /api/offers/{id} | deleteOffer
[**getAllOffersUsingGET**](OfferResourceApi.md#getAllOffersUsingGET) | **GET** /api/offers | getAllOffers
[**getOfferUsingGET**](OfferResourceApi.md#getOfferUsingGET) | **GET** /api/offers/{id} | getOffer
[**updateOfferUsingPUT**](OfferResourceApi.md#updateOfferUsingPUT) | **PUT** /api/offers | updateOffer


<a name="createOfferUsingPOST"></a>
# **createOfferUsingPOST**
> Offer createOfferUsingPOST(offer)

createOffer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = OfferResourceApi()
val offer : Offer =  // Offer | offer
try {
    val result : Offer = apiInstance.createOfferUsingPOST(offer)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OfferResourceApi#createOfferUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OfferResourceApi#createOfferUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offer** | [**Offer**](Offer.md)| offer |

### Return type

[**Offer**](Offer.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteOfferUsingDELETE"></a>
# **deleteOfferUsingDELETE**
> deleteOfferUsingDELETE(id)

deleteOffer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = OfferResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteOfferUsingDELETE(id)
} catch (e: ClientException) {
    println("4xx response calling OfferResourceApi#deleteOfferUsingDELETE")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OfferResourceApi#deleteOfferUsingDELETE")
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

<a name="getAllOffersUsingGET"></a>
# **getAllOffersUsingGET**
> kotlin.Array&lt;Offer&gt; getAllOffersUsingGET()

getAllOffers

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = OfferResourceApi()
try {
    val result : kotlin.Array<Offer> = apiInstance.getAllOffersUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OfferResourceApi#getAllOffersUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OfferResourceApi#getAllOffersUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Offer&gt;**](Offer.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOfferUsingGET"></a>
# **getOfferUsingGET**
> Offer getOfferUsingGET(id)

getOffer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = OfferResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : Offer = apiInstance.getOfferUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OfferResourceApi#getOfferUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OfferResourceApi#getOfferUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**Offer**](Offer.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateOfferUsingPUT"></a>
# **updateOfferUsingPUT**
> Offer updateOfferUsingPUT(offer)

updateOffer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = OfferResourceApi()
val offer : Offer =  // Offer | offer
try {
    val result : Offer = apiInstance.updateOfferUsingPUT(offer)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OfferResourceApi#updateOfferUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OfferResourceApi#updateOfferUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offer** | [**Offer**](Offer.md)| offer |

### Return type

[**Offer**](Offer.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

