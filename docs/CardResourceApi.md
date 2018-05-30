# CardResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCardUsingPOST**](CardResourceApi.md#createCardUsingPOST) | **POST** /api/cards | createCard
[**deleteCardUsingDELETE**](CardResourceApi.md#deleteCardUsingDELETE) | **DELETE** /api/cards/{id} | deleteCard
[**getAllCardsUsingGET**](CardResourceApi.md#getAllCardsUsingGET) | **GET** /api/cards | getAllCards
[**getCardUsingGET**](CardResourceApi.md#getCardUsingGET) | **GET** /api/cards/{id} | getCard
[**updateCardUsingPUT**](CardResourceApi.md#updateCardUsingPUT) | **PUT** /api/cards | updateCard


<a name="createCardUsingPOST"></a>
# **createCardUsingPOST**
> SavedCard createCardUsingPOST(card)

createCard

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CardResourceApi()
val card : SavedCard =  // SavedCard | card
try {
    val result : SavedCard = apiInstance.createCardUsingPOST(card)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CardResourceApi#createCardUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CardResourceApi#createCardUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card** | [**SavedCard**](SavedCard.md)| card |

### Return type

[**SavedCard**](SavedCard.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCardUsingDELETE"></a>
# **deleteCardUsingDELETE**
> deleteCardUsingDELETE(id)

deleteCard

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CardResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteCardUsingDELETE(id)
} catch (e: ClientException) {
    println("4xx response calling CardResourceApi#deleteCardUsingDELETE")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CardResourceApi#deleteCardUsingDELETE")
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

<a name="getAllCardsUsingGET"></a>
# **getAllCardsUsingGET**
> kotlin.Array&lt;SavedCard&gt; getAllCardsUsingGET()

getAllCards

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CardResourceApi()
try {
    val result : kotlin.Array<SavedCard> = apiInstance.getAllCardsUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CardResourceApi#getAllCardsUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CardResourceApi#getAllCardsUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;SavedCard&gt;**](SavedCard.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCardUsingGET"></a>
# **getCardUsingGET**
> SavedCard getCardUsingGET(id)

getCard

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CardResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : SavedCard = apiInstance.getCardUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CardResourceApi#getCardUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CardResourceApi#getCardUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**SavedCard**](SavedCard.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateCardUsingPUT"></a>
# **updateCardUsingPUT**
> SavedCard updateCardUsingPUT(card)

updateCard

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CardResourceApi()
val card : SavedCard =  // SavedCard | card
try {
    val result : SavedCard = apiInstance.updateCardUsingPUT(card)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CardResourceApi#updateCardUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CardResourceApi#updateCardUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card** | [**SavedCard**](SavedCard.md)| card |

### Return type

[**SavedCard**](SavedCard.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

