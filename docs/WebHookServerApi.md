# WebHookServerApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentUpdatedUsingPOST**](WebHookServerApi.md#paymentUpdatedUsingPOST) | **POST** /subscreasy/webhook/payment-updated | paymentUpdated
[**subscriberCreatedUsingPOST**](WebHookServerApi.md#subscriberCreatedUsingPOST) | **POST** /subscreasy/webhook/subscriber-created | subscriberCreated
[**subscriberUpdatedUsingPOST**](WebHookServerApi.md#subscriberUpdatedUsingPOST) | **POST** /subscreasy/webhook/subscriber-updated | subscriberUpdated
[**subscriptionEndedUsingPOST**](WebHookServerApi.md#subscriptionEndedUsingPOST) | **POST** /subscreasy/webhook/subscription-ended | subscriptionEnded
[**subscriptionRenewalFailedUsingPOST**](WebHookServerApi.md#subscriptionRenewalFailedUsingPOST) | **POST** /subscreasy/webhook/subscription-renewal-failed | subscriptionRenewalFailed
[**subscriptionRenewedUsingPOST**](WebHookServerApi.md#subscriptionRenewedUsingPOST) | **POST** /subscreasy/webhook/subscription-renewed | subscriptionRenewed
[**subscriptionStartedUsingPOST**](WebHookServerApi.md#subscriptionStartedUsingPOST) | **POST** /subscreasy/webhook/subscription-started | subscriptionStarted


<a name="paymentUpdatedUsingPOST"></a>
# **paymentUpdatedUsingPOST**
> kotlin.Any paymentUpdatedUsingPOST(r)

paymentUpdated

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = WebHookServerApi()
val r : WebHookRequest =  // WebHookRequest | r
try {
    val result : kotlin.Any = apiInstance.paymentUpdatedUsingPOST(r)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebHookServerApi#paymentUpdatedUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebHookServerApi#paymentUpdatedUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **r** | [**WebHookRequest**](WebHookRequest.md)| r |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="subscriberCreatedUsingPOST"></a>
# **subscriberCreatedUsingPOST**
> kotlin.Any subscriberCreatedUsingPOST(r)

subscriberCreated

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = WebHookServerApi()
val r : WebHookRequest =  // WebHookRequest | r
try {
    val result : kotlin.Any = apiInstance.subscriberCreatedUsingPOST(r)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebHookServerApi#subscriberCreatedUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebHookServerApi#subscriberCreatedUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **r** | [**WebHookRequest**](WebHookRequest.md)| r |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="subscriberUpdatedUsingPOST"></a>
# **subscriberUpdatedUsingPOST**
> kotlin.Any subscriberUpdatedUsingPOST(r)

subscriberUpdated

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = WebHookServerApi()
val r : WebHookRequest =  // WebHookRequest | r
try {
    val result : kotlin.Any = apiInstance.subscriberUpdatedUsingPOST(r)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebHookServerApi#subscriberUpdatedUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebHookServerApi#subscriberUpdatedUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **r** | [**WebHookRequest**](WebHookRequest.md)| r |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="subscriptionEndedUsingPOST"></a>
# **subscriptionEndedUsingPOST**
> kotlin.Any subscriptionEndedUsingPOST(r)

subscriptionEnded

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = WebHookServerApi()
val r : WebHookRequest =  // WebHookRequest | r
try {
    val result : kotlin.Any = apiInstance.subscriptionEndedUsingPOST(r)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebHookServerApi#subscriptionEndedUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebHookServerApi#subscriptionEndedUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **r** | [**WebHookRequest**](WebHookRequest.md)| r |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="subscriptionRenewalFailedUsingPOST"></a>
# **subscriptionRenewalFailedUsingPOST**
> kotlin.Any subscriptionRenewalFailedUsingPOST(r)

subscriptionRenewalFailed

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = WebHookServerApi()
val r : WebHookRequest =  // WebHookRequest | r
try {
    val result : kotlin.Any = apiInstance.subscriptionRenewalFailedUsingPOST(r)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebHookServerApi#subscriptionRenewalFailedUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebHookServerApi#subscriptionRenewalFailedUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **r** | [**WebHookRequest**](WebHookRequest.md)| r |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="subscriptionRenewedUsingPOST"></a>
# **subscriptionRenewedUsingPOST**
> kotlin.Any subscriptionRenewedUsingPOST(r)

subscriptionRenewed

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = WebHookServerApi()
val r : WebHookRequest =  // WebHookRequest | r
try {
    val result : kotlin.Any = apiInstance.subscriptionRenewedUsingPOST(r)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebHookServerApi#subscriptionRenewedUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebHookServerApi#subscriptionRenewedUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **r** | [**WebHookRequest**](WebHookRequest.md)| r |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="subscriptionStartedUsingPOST"></a>
# **subscriptionStartedUsingPOST**
> kotlin.Any subscriptionStartedUsingPOST(r)

subscriptionStarted

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = WebHookServerApi()
val r : WebHookRequest =  // WebHookRequest | r
try {
    val result : kotlin.Any = apiInstance.subscriptionStartedUsingPOST(r)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebHookServerApi#subscriptionStartedUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebHookServerApi#subscriptionStartedUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **r** | [**WebHookRequest**](WebHookRequest.md)| r |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

