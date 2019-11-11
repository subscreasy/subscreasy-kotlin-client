# EndpointsApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorizeUsingPUT**](EndpointsApi.md#authorizeUsingPUT) | **PUT** /api/authorize | authorize
[**deductUsingPUT**](EndpointsApi.md#deductUsingPUT) | **PUT** /api/deduct | deduct
[**getAuthorizedServicesUsingGET**](EndpointsApi.md#getAuthorizedServicesUsingGET) | **GET** /api/service/subscriber/{secureId} | getAuthorizedServices
[**getChargingLogBySubscriptionUsingGET**](EndpointsApi.md#getChargingLogBySubscriptionUsingGET) | **GET** /api/charging-logs/subscription/{id} | getChargingLogBySubscription
[**getCustomerTotalAmountUsingGET**](EndpointsApi.md#getCustomerTotalAmountUsingGET) | **GET** /api/customer-totalAmountCharge/{id} | getCustomerTotalAmount
[**getInvoiceDetailsUsingGET**](EndpointsApi.md#getInvoiceDetailsUsingGET) | **GET** /api/getInvoiceDetails | getInvoiceDetails
[**getMessageTemplateUsingGET**](EndpointsApi.md#getMessageTemplateUsingGET) | **GET** /api/message-templates/email/{lifecycleEventName} | getMessageTemplate
[**getServiceInstancesBySubscriptionUsingGET**](EndpointsApi.md#getServiceInstancesBySubscriptionUsingGET) | **GET** /api/service-instances/subscription/{id} | getServiceInstancesBySubscription
[**getServiceOfferingsBySubscriptionPlanUsingGET**](EndpointsApi.md#getServiceOfferingsBySubscriptionPlanUsingGET) | **GET** /api/service-offerings/offer/{id} | getServiceOfferingsBySubscriptionPlan
[**getTotalRevenuePerMonthUsingGET**](EndpointsApi.md#getTotalRevenuePerMonthUsingGET) | **GET** /api/charging-logs-totalamount-customer/{id} | getTotalRevenuePerMonth


<a name="authorizeUsingPUT"></a>
# **authorizeUsingPUT**
> kotlin.Boolean authorizeUsingPUT(authorization)

authorize

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = EndpointsApi()
val authorization : Authorization =  // Authorization | authorization
try {
    val result : kotlin.Boolean = apiInstance.authorizeUsingPUT(authorization)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointsApi#authorizeUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointsApi#authorizeUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | [**Authorization**](Authorization.md)| authorization |

### Return type

**kotlin.Boolean**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deductUsingPUT"></a>
# **deductUsingPUT**
> DeductionResult deductUsingPUT(deduction)

deduct

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = EndpointsApi()
val deduction : Deduction =  // Deduction | deduction
try {
    val result : DeductionResult = apiInstance.deductUsingPUT(deduction)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointsApi#deductUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointsApi#deductUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deduction** | [**Deduction**](Deduction.md)| deduction |

### Return type

[**DeductionResult**](DeductionResult.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthorizedServicesUsingGET"></a>
# **getAuthorizedServicesUsingGET**
> AuthorizedServicesResponse getAuthorizedServicesUsingGET(secureId)

getAuthorizedServices

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = EndpointsApi()
val secureId : kotlin.String = secureId_example // kotlin.String | secureId
try {
    val result : AuthorizedServicesResponse = apiInstance.getAuthorizedServicesUsingGET(secureId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointsApi#getAuthorizedServicesUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointsApi#getAuthorizedServicesUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secureId** | **kotlin.String**| secureId |

### Return type

[**AuthorizedServicesResponse**](AuthorizedServicesResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getChargingLogBySubscriptionUsingGET"></a>
# **getChargingLogBySubscriptionUsingGET**
> kotlin.Array&lt;ChargingLog&gt; getChargingLogBySubscriptionUsingGET(id)

getChargingLogBySubscription

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = EndpointsApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : kotlin.Array<ChargingLog> = apiInstance.getChargingLogBySubscriptionUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointsApi#getChargingLogBySubscriptionUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointsApi#getChargingLogBySubscriptionUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**kotlin.Array&lt;ChargingLog&gt;**](ChargingLog.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCustomerTotalAmountUsingGET"></a>
# **getCustomerTotalAmountUsingGET**
> kotlin.Long getCustomerTotalAmountUsingGET(id)

getCustomerTotalAmount

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = EndpointsApi()
val id : kotlin.String = id_example // kotlin.String | id
try {
    val result : kotlin.Long = apiInstance.getCustomerTotalAmountUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointsApi#getCustomerTotalAmountUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointsApi#getCustomerTotalAmountUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id |

### Return type

**kotlin.Long**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInvoiceDetailsUsingGET"></a>
# **getInvoiceDetailsUsingGET**
> kotlin.Any getInvoiceDetailsUsingGET(invoiceRequest)

getInvoiceDetails

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = EndpointsApi()
val invoiceRequest : InvoiceRequest =  // InvoiceRequest | invoiceRequest
try {
    val result : kotlin.Any = apiInstance.getInvoiceDetailsUsingGET(invoiceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointsApi#getInvoiceDetailsUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointsApi#getInvoiceDetailsUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceRequest** | [**InvoiceRequest**](InvoiceRequest.md)| invoiceRequest |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getMessageTemplateUsingGET"></a>
# **getMessageTemplateUsingGET**
> MessageTemplate getMessageTemplateUsingGET(lifecycleEventName)

getMessageTemplate

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = EndpointsApi()
val lifecycleEventName : kotlin.String = lifecycleEventName_example // kotlin.String | lifecycleEventName
try {
    val result : MessageTemplate = apiInstance.getMessageTemplateUsingGET(lifecycleEventName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointsApi#getMessageTemplateUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointsApi#getMessageTemplateUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lifecycleEventName** | **kotlin.String**| lifecycleEventName |

### Return type

[**MessageTemplate**](MessageTemplate.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getServiceInstancesBySubscriptionUsingGET"></a>
# **getServiceInstancesBySubscriptionUsingGET**
> kotlin.Array&lt;ServiceInstanceResult&gt; getServiceInstancesBySubscriptionUsingGET(id)

getServiceInstancesBySubscription

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = EndpointsApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : kotlin.Array<ServiceInstanceResult> = apiInstance.getServiceInstancesBySubscriptionUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointsApi#getServiceInstancesBySubscriptionUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointsApi#getServiceInstancesBySubscriptionUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**kotlin.Array&lt;ServiceInstanceResult&gt;**](ServiceInstanceResult.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getServiceOfferingsBySubscriptionPlanUsingGET"></a>
# **getServiceOfferingsBySubscriptionPlanUsingGET**
> kotlin.Array&lt;ServiceOfferingResult&gt; getServiceOfferingsBySubscriptionPlanUsingGET(id)

getServiceOfferingsBySubscriptionPlan

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = EndpointsApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : kotlin.Array<ServiceOfferingResult> = apiInstance.getServiceOfferingsBySubscriptionPlanUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointsApi#getServiceOfferingsBySubscriptionPlanUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointsApi#getServiceOfferingsBySubscriptionPlanUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**kotlin.Array&lt;ServiceOfferingResult&gt;**](ServiceOfferingResult.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTotalRevenuePerMonthUsingGET"></a>
# **getTotalRevenuePerMonthUsingGET**
> kotlin.Array&lt;kotlin.Any&gt; getTotalRevenuePerMonthUsingGET(id)

getTotalRevenuePerMonth

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = EndpointsApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : kotlin.Array<kotlin.Any> = apiInstance.getTotalRevenuePerMonthUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointsApi#getTotalRevenuePerMonthUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointsApi#getTotalRevenuePerMonthUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**kotlin.Array&lt;kotlin.Any&gt;**](kotlin.Any.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

