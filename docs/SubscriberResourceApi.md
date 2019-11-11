# SubscriberResourceApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSubscriberUsingPOST**](SubscriberResourceApi.md#createSubscriberUsingPOST) | **POST** /api/subscribers | createSubscriber
[**deleteSubscriberUsingDELETE**](SubscriberResourceApi.md#deleteSubscriberUsingDELETE) | **DELETE** /api/subscribers/{id} | deleteSubscriber
[**findAllSubscribersUsingGET**](SubscriberResourceApi.md#findAllSubscribersUsingGET) | **GET** /api/subscribers/find-all | findAllSubscribers
[**getAllSubscribersUsingGET**](SubscriberResourceApi.md#getAllSubscribersUsingGET) | **GET** /api/subscribers | getAllSubscribers
[**getSubscriberByEmailUsingGET**](SubscriberResourceApi.md#getSubscriberByEmailUsingGET) | **GET** /api/subscribers/email/{email} | getSubscriberByEmail
[**getSubscriberByNameUsingGET**](SubscriberResourceApi.md#getSubscriberByNameUsingGET) | **GET** /api/subscribers/name/{name} | getSubscriberByName
[**getSubscriberBySecureIdUsingGET**](SubscriberResourceApi.md#getSubscriberBySecureIdUsingGET) | **GET** /api/subscribers/secureId/{secureId} | getSubscriberBySecureId
[**getSubscriberUsingGET**](SubscriberResourceApi.md#getSubscriberUsingGET) | **GET** /api/subscribers/{id} | getSubscriber
[**updateSubscriberUsingPUT**](SubscriberResourceApi.md#updateSubscriberUsingPUT) | **PUT** /api/subscribers | updateSubscriber


<a name="createSubscriberUsingPOST"></a>
# **createSubscriberUsingPOST**
> Subscriber createSubscriberUsingPOST(subscriber)

createSubscriber

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubscriberResourceApi()
val subscriber : Subscriber =  // Subscriber | subscriber
try {
    val result : Subscriber = apiInstance.createSubscriberUsingPOST(subscriber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriberResourceApi#createSubscriberUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriberResourceApi#createSubscriberUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriber** | [**Subscriber**](Subscriber.md)| subscriber |

### Return type

[**Subscriber**](Subscriber.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteSubscriberUsingDELETE"></a>
# **deleteSubscriberUsingDELETE**
> deleteSubscriberUsingDELETE(id)

deleteSubscriber

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubscriberResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteSubscriberUsingDELETE(id)
} catch (e: ClientException) {
    println("4xx response calling SubscriberResourceApi#deleteSubscriberUsingDELETE")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriberResourceApi#deleteSubscriberUsingDELETE")
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

<a name="findAllSubscribersUsingGET"></a>
# **findAllSubscribersUsingGET**
> kotlin.Array&lt;Subscriber&gt; findAllSubscribersUsingGET()

findAllSubscribers

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubscriberResourceApi()
try {
    val result : kotlin.Array<Subscriber> = apiInstance.findAllSubscribersUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriberResourceApi#findAllSubscribersUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriberResourceApi#findAllSubscribersUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Subscriber&gt;**](Subscriber.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllSubscribersUsingGET"></a>
# **getAllSubscribersUsingGET**
> kotlin.Array&lt;Subscriber&gt; getAllSubscribersUsingGET(page, size, sort)

getAllSubscribers

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubscriberResourceApi()
val page : kotlin.Int = 56 // kotlin.Int | Page number of the requested page
val size : kotlin.Int = 56 // kotlin.Int | Size of a page
val sort : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    val result : kotlin.Array<Subscriber> = apiInstance.getAllSubscribersUsingGET(page, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriberResourceApi#getAllSubscribersUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriberResourceApi#getAllSubscribersUsingGET")
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

[**kotlin.Array&lt;Subscriber&gt;**](Subscriber.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSubscriberByEmailUsingGET"></a>
# **getSubscriberByEmailUsingGET**
> kotlin.Array&lt;Subscriber&gt; getSubscriberByEmailUsingGET(email, page, size, sort)

getSubscriberByEmail

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubscriberResourceApi()
val email : kotlin.String = email_example // kotlin.String | email
val page : kotlin.Int = 56 // kotlin.Int | Page number of the requested page
val size : kotlin.Int = 56 // kotlin.Int | Size of a page
val sort : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    val result : kotlin.Array<Subscriber> = apiInstance.getSubscriberByEmailUsingGET(email, page, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriberResourceApi#getSubscriberByEmailUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriberResourceApi#getSubscriberByEmailUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **kotlin.String**| email |
 **page** | **kotlin.Int**| Page number of the requested page | [optional]
 **size** | **kotlin.Int**| Size of a page | [optional]
 **sort** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**kotlin.Array&lt;Subscriber&gt;**](Subscriber.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSubscriberByNameUsingGET"></a>
# **getSubscriberByNameUsingGET**
> kotlin.Array&lt;Subscriber&gt; getSubscriberByNameUsingGET(name, page, size, sort)

getSubscriberByName

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubscriberResourceApi()
val name : kotlin.String = name_example // kotlin.String | name
val page : kotlin.Int = 56 // kotlin.Int | Page number of the requested page
val size : kotlin.Int = 56 // kotlin.Int | Size of a page
val sort : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    val result : kotlin.Array<Subscriber> = apiInstance.getSubscriberByNameUsingGET(name, page, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriberResourceApi#getSubscriberByNameUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriberResourceApi#getSubscriberByNameUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**| name |
 **page** | **kotlin.Int**| Page number of the requested page | [optional]
 **size** | **kotlin.Int**| Size of a page | [optional]
 **sort** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**kotlin.Array&lt;Subscriber&gt;**](Subscriber.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSubscriberBySecureIdUsingGET"></a>
# **getSubscriberBySecureIdUsingGET**
> Subscriber getSubscriberBySecureIdUsingGET(secureId)

getSubscriberBySecureId

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubscriberResourceApi()
val secureId : kotlin.String = secureId_example // kotlin.String | secureId
try {
    val result : Subscriber = apiInstance.getSubscriberBySecureIdUsingGET(secureId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriberResourceApi#getSubscriberBySecureIdUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriberResourceApi#getSubscriberBySecureIdUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secureId** | **kotlin.String**| secureId |

### Return type

[**Subscriber**](Subscriber.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSubscriberUsingGET"></a>
# **getSubscriberUsingGET**
> Subscriber getSubscriberUsingGET(id)

getSubscriber

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubscriberResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : Subscriber = apiInstance.getSubscriberUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriberResourceApi#getSubscriberUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriberResourceApi#getSubscriberUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**Subscriber**](Subscriber.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateSubscriberUsingPUT"></a>
# **updateSubscriberUsingPUT**
> Subscriber updateSubscriberUsingPUT(subscriber)

updateSubscriber

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubscriberResourceApi()
val subscriber : Subscriber =  // Subscriber | subscriber
try {
    val result : Subscriber = apiInstance.updateSubscriberUsingPUT(subscriber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriberResourceApi#updateSubscriberUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriberResourceApi#updateSubscriberUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriber** | [**Subscriber**](Subscriber.md)| subscriber |

### Return type

[**Subscriber**](Subscriber.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

