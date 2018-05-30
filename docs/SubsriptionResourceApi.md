# SubsriptionResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelSubscriptionUsingPUT**](SubsriptionResourceApi.md#cancelSubscriptionUsingPUT) | **PUT** /api/subscriptions/cancel | cancelSubscription
[**getActiveSubscriptionsUsingGET**](SubsriptionResourceApi.md#getActiveSubscriptionsUsingGET) | **GET** /api/subsriptions/subscriber/{secureId} | getActiveSubscriptions
[**getAllCompanySubscriptionsUsingGET**](SubsriptionResourceApi.md#getAllCompanySubscriptionsUsingGET) | **GET** /api/subscriptions/company/{id} | getAllCompanySubscriptions
[**getSubsriptionUsingGET**](SubsriptionResourceApi.md#getSubsriptionUsingGET) | **GET** /api/subsriptions/{id} | getSubsription
[**startSubscriptionUsingPOST**](SubsriptionResourceApi.md#startSubscriptionUsingPOST) | **POST** /api/subscriptions/start | startSubscription


<a name="cancelSubscriptionUsingPUT"></a>
# **cancelSubscriptionUsingPUT**
> Subsription cancelSubscriptionUsingPUT(cancellation)

cancelSubscription

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubsriptionResourceApi()
val cancellation : Cancellation =  // Cancellation | cancellation
try {
    val result : Subsription = apiInstance.cancelSubscriptionUsingPUT(cancellation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubsriptionResourceApi#cancelSubscriptionUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubsriptionResourceApi#cancelSubscriptionUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cancellation** | [**Cancellation**](Cancellation.md)| cancellation |

### Return type

[**Subsription**](Subsription.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getActiveSubscriptionsUsingGET"></a>
# **getActiveSubscriptionsUsingGET**
> kotlin.Array&lt;Subsription&gt; getActiveSubscriptionsUsingGET(secureId)

getActiveSubscriptions

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubsriptionResourceApi()
val secureId : kotlin.String = secureId_example // kotlin.String | secureId
try {
    val result : kotlin.Array<Subsription> = apiInstance.getActiveSubscriptionsUsingGET(secureId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubsriptionResourceApi#getActiveSubscriptionsUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubsriptionResourceApi#getActiveSubscriptionsUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secureId** | **kotlin.String**| secureId |

### Return type

[**kotlin.Array&lt;Subsription&gt;**](Subsription.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllCompanySubscriptionsUsingGET"></a>
# **getAllCompanySubscriptionsUsingGET**
> kotlin.Array&lt;Subsription&gt; getAllCompanySubscriptionsUsingGET(id)

getAllCompanySubscriptions

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubsriptionResourceApi()
val id : kotlin.String = id_example // kotlin.String | id
try {
    val result : kotlin.Array<Subsription> = apiInstance.getAllCompanySubscriptionsUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubsriptionResourceApi#getAllCompanySubscriptionsUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubsriptionResourceApi#getAllCompanySubscriptionsUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |

### Return type

[**kotlin.Array&lt;Subsription&gt;**](Subsription.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSubsriptionUsingGET"></a>
# **getSubsriptionUsingGET**
> Subsription getSubsriptionUsingGET(id)

getSubsription

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubsriptionResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : Subsription = apiInstance.getSubsriptionUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubsriptionResourceApi#getSubsriptionUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubsriptionResourceApi#getSubsriptionUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**Subsription**](Subsription.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="startSubscriptionUsingPOST"></a>
# **startSubscriptionUsingPOST**
> SubscriptionCreateResult startSubscriptionUsingPOST(request)

startSubscription

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubsriptionResourceApi()
val request : StartSubscriptionRequest =  // StartSubscriptionRequest | request
try {
    val result : SubscriptionCreateResult = apiInstance.startSubscriptionUsingPOST(request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubsriptionResourceApi#startSubscriptionUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubsriptionResourceApi#startSubscriptionUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**StartSubscriptionRequest**](StartSubscriptionRequest.md)| request |

### Return type

[**SubscriptionCreateResult**](SubscriptionCreateResult.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

