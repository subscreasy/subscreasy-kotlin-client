# SubscriptionResourceApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelSubscriptionUsingPUT**](SubscriptionResourceApi.md#cancelSubscriptionUsingPUT) | **PUT** /api/subscriptions/cancel | cancelSubscription
[**changePaymentMethodUsingPUT**](SubscriptionResourceApi.md#changePaymentMethodUsingPUT) | **PUT** /api/subscriptions/change-payment-method/{subscriptionId} | changePaymentMethod
[**chargeEarlyUsingPUT**](SubscriptionResourceApi.md#chargeEarlyUsingPUT) | **PUT** /api/subscriptions/charge/{subscriptionId} | chargeEarly
[**getActiveSubscriptionsByEmailUsingGET**](SubscriptionResourceApi.md#getActiveSubscriptionsByEmailUsingGET) | **GET** /api/subscriptions/subscriber/email/{email} | getActiveSubscriptionsByEmail
[**getActiveSubscriptionsUsingGET**](SubscriptionResourceApi.md#getActiveSubscriptionsUsingGET) | **GET** /api/subscriptions/subscriber/{secureId} | getActiveSubscriptions
[**getAllCompanySubscriptionsUsingGET**](SubscriptionResourceApi.md#getAllCompanySubscriptionsUsingGET) | **GET** /api/subscriptions/company/{id} | getAllCompanySubscriptions
[**getAllSubscriptionsByOfferUsingGET**](SubscriptionResourceApi.md#getAllSubscriptionsByOfferUsingGET) | **GET** /api/subscriptions/offer/{id} | getAllSubscriptionsByOffer
[**getSubscriptionUsingGET**](SubscriptionResourceApi.md#getSubscriptionUsingGET) | **GET** /api/subscriptions/{id} | getSubscription
[**getSubscriptionsByMerchantSubscriberIdUsingGET**](SubscriptionResourceApi.md#getSubscriptionsByMerchantSubscriberIdUsingGET) | **GET** /api/subscriptions/subscriber/m/{merchantSubscriberId} | getSubscriptionsByMerchantSubscriberId
[**getSubscriptionsByStatusUsingGET**](SubscriptionResourceApi.md#getSubscriptionsByStatusUsingGET) | **GET** /api/subscriptions/status/{status} | getSubscriptionsByStatus
[**startSubscriptionUsingPOST**](SubscriptionResourceApi.md#startSubscriptionUsingPOST) | **POST** /api/subscriptions/start | startSubscription


<a name="cancelSubscriptionUsingPUT"></a>
# **cancelSubscriptionUsingPUT**
> Subsription cancelSubscriptionUsingPUT(cancellation)

cancelSubscription

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubscriptionResourceApi()
val cancellation : Cancellation =  // Cancellation | cancellation
try {
    val result : Subsription = apiInstance.cancelSubscriptionUsingPUT(cancellation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionResourceApi#cancelSubscriptionUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionResourceApi#cancelSubscriptionUsingPUT")
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

<a name="changePaymentMethodUsingPUT"></a>
# **changePaymentMethodUsingPUT**
> Subsription changePaymentMethodUsingPUT(subscriptionId)

changePaymentMethod

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubscriptionResourceApi()
val subscriptionId : kotlin.Long = 789 // kotlin.Long | subscriptionId
try {
    val result : Subsription = apiInstance.changePaymentMethodUsingPUT(subscriptionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionResourceApi#changePaymentMethodUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionResourceApi#changePaymentMethodUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.Long**| subscriptionId |

### Return type

[**Subsription**](Subsription.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="chargeEarlyUsingPUT"></a>
# **chargeEarlyUsingPUT**
> Job chargeEarlyUsingPUT(subscriptionId)

chargeEarly

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubscriptionResourceApi()
val subscriptionId : kotlin.Long = 789 // kotlin.Long | subscriptionId
try {
    val result : Job = apiInstance.chargeEarlyUsingPUT(subscriptionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionResourceApi#chargeEarlyUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionResourceApi#chargeEarlyUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.Long**| subscriptionId |

### Return type

[**Job**](Job.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getActiveSubscriptionsByEmailUsingGET"></a>
# **getActiveSubscriptionsByEmailUsingGET**
> kotlin.Array&lt;Subsription&gt; getActiveSubscriptionsByEmailUsingGET(email)

getActiveSubscriptionsByEmail

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubscriptionResourceApi()
val email : kotlin.String = email_example // kotlin.String | email
try {
    val result : kotlin.Array<Subsription> = apiInstance.getActiveSubscriptionsByEmailUsingGET(email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionResourceApi#getActiveSubscriptionsByEmailUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionResourceApi#getActiveSubscriptionsByEmailUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **kotlin.String**| email |

### Return type

[**kotlin.Array&lt;Subsription&gt;**](Subsription.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
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

val apiInstance = SubscriptionResourceApi()
val secureId : kotlin.String = secureId_example // kotlin.String | secureId
try {
    val result : kotlin.Array<Subsription> = apiInstance.getActiveSubscriptionsUsingGET(secureId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionResourceApi#getActiveSubscriptionsUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionResourceApi#getActiveSubscriptionsUsingGET")
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

val apiInstance = SubscriptionResourceApi()
val id : kotlin.String = id_example // kotlin.String | id
try {
    val result : kotlin.Array<Subsription> = apiInstance.getAllCompanySubscriptionsUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionResourceApi#getAllCompanySubscriptionsUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionResourceApi#getAllCompanySubscriptionsUsingGET")
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

<a name="getAllSubscriptionsByOfferUsingGET"></a>
# **getAllSubscriptionsByOfferUsingGET**
> kotlin.Array&lt;Subsription&gt; getAllSubscriptionsByOfferUsingGET(id, page, size, sort)

getAllSubscriptionsByOffer

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubscriptionResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
val page : kotlin.Int = 56 // kotlin.Int | Page number of the requested page
val size : kotlin.Int = 56 // kotlin.Int | Size of a page
val sort : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    val result : kotlin.Array<Subsription> = apiInstance.getAllSubscriptionsByOfferUsingGET(id, page, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionResourceApi#getAllSubscriptionsByOfferUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionResourceApi#getAllSubscriptionsByOfferUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |
 **page** | **kotlin.Int**| Page number of the requested page | [optional]
 **size** | **kotlin.Int**| Size of a page | [optional]
 **sort** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**kotlin.Array&lt;Subsription&gt;**](Subsription.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSubscriptionUsingGET"></a>
# **getSubscriptionUsingGET**
> Subsription getSubscriptionUsingGET(id)

getSubscription

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubscriptionResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : Subsription = apiInstance.getSubscriptionUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionResourceApi#getSubscriptionUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionResourceApi#getSubscriptionUsingGET")
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

<a name="getSubscriptionsByMerchantSubscriberIdUsingGET"></a>
# **getSubscriptionsByMerchantSubscriberIdUsingGET**
> kotlin.Array&lt;Subsription&gt; getSubscriptionsByMerchantSubscriberIdUsingGET(merchantSubscriberId, page, size, sort)

getSubscriptionsByMerchantSubscriberId

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubscriptionResourceApi()
val merchantSubscriberId : kotlin.String = merchantSubscriberId_example // kotlin.String | merchantSubscriberId
val page : kotlin.Int = 56 // kotlin.Int | Page number of the requested page
val size : kotlin.Int = 56 // kotlin.Int | Size of a page
val sort : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    val result : kotlin.Array<Subsription> = apiInstance.getSubscriptionsByMerchantSubscriberIdUsingGET(merchantSubscriberId, page, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionResourceApi#getSubscriptionsByMerchantSubscriberIdUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionResourceApi#getSubscriptionsByMerchantSubscriberIdUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantSubscriberId** | **kotlin.String**| merchantSubscriberId |
 **page** | **kotlin.Int**| Page number of the requested page | [optional]
 **size** | **kotlin.Int**| Size of a page | [optional]
 **sort** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**kotlin.Array&lt;Subsription&gt;**](Subsription.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSubscriptionsByStatusUsingGET"></a>
# **getSubscriptionsByStatusUsingGET**
> kotlin.Array&lt;Subsription&gt; getSubscriptionsByStatusUsingGET(status, page, size, sort)

getSubscriptionsByStatus

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubscriptionResourceApi()
val status : kotlin.String = status_example // kotlin.String | status
val page : kotlin.Int = 56 // kotlin.Int | Page number of the requested page
val size : kotlin.Int = 56 // kotlin.Int | Size of a page
val sort : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    val result : kotlin.Array<Subsription> = apiInstance.getSubscriptionsByStatusUsingGET(status, page, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionResourceApi#getSubscriptionsByStatusUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionResourceApi#getSubscriptionsByStatusUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **kotlin.String**| status |
 **page** | **kotlin.Int**| Page number of the requested page | [optional]
 **size** | **kotlin.Int**| Size of a page | [optional]
 **sort** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**kotlin.Array&lt;Subsription&gt;**](Subsription.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="startSubscriptionUsingPOST"></a>
# **startSubscriptionUsingPOST**
> StartSubscriptionResult startSubscriptionUsingPOST(request)

startSubscription

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = SubscriptionResourceApi()
val request : StartSubscriptionRequest =  // StartSubscriptionRequest | request
try {
    val result : StartSubscriptionResult = apiInstance.startSubscriptionUsingPOST(request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionResourceApi#startSubscriptionUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionResourceApi#startSubscriptionUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**StartSubscriptionRequest**](StartSubscriptionRequest.md)| request |

### Return type

[**StartSubscriptionResult**](StartSubscriptionResult.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

