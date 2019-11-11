# SavedCardResourceApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCardUsingPOST**](SavedCardResourceApi.md#createCardUsingPOST) | **POST** /api/saved-cards | createCard
[**deleteCardUsingDELETE**](SavedCardResourceApi.md#deleteCardUsingDELETE) | **DELETE** /api/saved-cards/{id} | deleteCard
[**getAllCardsUsingGET**](SavedCardResourceApi.md#getAllCardsUsingGET) | **GET** /api/saved-cards | getAllCards
[**getCardUsingGET**](SavedCardResourceApi.md#getCardUsingGET) | **GET** /api/saved-cards/{id} | getCard
[**updateCardUsingPUT**](SavedCardResourceApi.md#updateCardUsingPUT) | **PUT** /api/saved-cards | updateCard


<a name="createCardUsingPOST"></a>
# **createCardUsingPOST**
> SavedCard createCardUsingPOST(card)

createCard

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SavedCardResourceApi()
val card : SavedCard =  // SavedCard | card
try {
    val result : SavedCard = apiInstance.createCardUsingPOST(card)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SavedCardResourceApi#createCardUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SavedCardResourceApi#createCardUsingPOST")
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

val apiInstance = SavedCardResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteCardUsingDELETE(id)
} catch (e: ClientException) {
    println("4xx response calling SavedCardResourceApi#deleteCardUsingDELETE")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SavedCardResourceApi#deleteCardUsingDELETE")
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

val apiInstance = SavedCardResourceApi()
try {
    val result : kotlin.Array<SavedCard> = apiInstance.getAllCardsUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SavedCardResourceApi#getAllCardsUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SavedCardResourceApi#getAllCardsUsingGET")
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

val apiInstance = SavedCardResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : SavedCard = apiInstance.getCardUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SavedCardResourceApi#getCardUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SavedCardResourceApi#getCardUsingGET")
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

val apiInstance = SavedCardResourceApi()
val card : SavedCard =  // SavedCard | card
try {
    val result : SavedCard = apiInstance.updateCardUsingPUT(card)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SavedCardResourceApi#updateCardUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SavedCardResourceApi#updateCardUsingPUT")
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

