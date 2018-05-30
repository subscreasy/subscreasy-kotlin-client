# SubscriberResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSubscriberUsingPOST**](SubscriberResourceApi.md#createSubscriberUsingPOST) | **POST** /api/subscribers | createSubscriber
[**deleteSubscriberUsingDELETE**](SubscriberResourceApi.md#deleteSubscriberUsingDELETE) | **DELETE** /api/subscribers/{id} | deleteSubscriber
[**getAllSubscribersUsingGET**](SubscriberResourceApi.md#getAllSubscribersUsingGET) | **GET** /api/subscribers | getAllSubscribers
[**getSubscriberByEmailUsingGET**](SubscriberResourceApi.md#getSubscriberByEmailUsingGET) | **GET** /api/subscribers/email/{email} | getSubscriberByEmail
[**getSubscriberByNameUsingGET**](SubscriberResourceApi.md#getSubscriberByNameUsingGET) | **GET** /api/subscribers/name/{name} | getSubscriberByName
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

<a name="getAllSubscribersUsingGET"></a>
# **getAllSubscribersUsingGET**
> kotlin.Array&lt;Subscriber&gt; getAllSubscribersUsingGET()

getAllSubscribers

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubscriberResourceApi()
try {
    val result : kotlin.Array<Subscriber> = apiInstance.getAllSubscribersUsingGET()
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
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Subscriber&gt;**](Subscriber.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSubscriberByEmailUsingGET"></a>
# **getSubscriberByEmailUsingGET**
> kotlin.Array&lt;Subscriber&gt; getSubscriberByEmailUsingGET(email)

getSubscriberByEmail

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubscriberResourceApi()
val email : kotlin.String = email_example // kotlin.String | email
try {
    val result : kotlin.Array<Subscriber> = apiInstance.getSubscriberByEmailUsingGET(email)
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

### Return type

[**kotlin.Array&lt;Subscriber&gt;**](Subscriber.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSubscriberByNameUsingGET"></a>
# **getSubscriberByNameUsingGET**
> kotlin.Array&lt;Subscriber&gt; getSubscriberByNameUsingGET(name)

getSubscriberByName

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubscriberResourceApi()
val name : kotlin.String = name_example // kotlin.String | name
try {
    val result : kotlin.Array<Subscriber> = apiInstance.getSubscriberByNameUsingGET(name)
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

### Return type

[**kotlin.Array&lt;Subscriber&gt;**](Subscriber.md)

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

