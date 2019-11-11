# InvoiceResourceApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInvoiceUsingPOST**](InvoiceResourceApi.md#createInvoiceUsingPOST) | **POST** /api/invoices | createInvoice
[**deleteInvoiceUsingDELETE**](InvoiceResourceApi.md#deleteInvoiceUsingDELETE) | **DELETE** /api/invoices/{id} | deleteInvoice
[**getAllInvoicesUsingGET**](InvoiceResourceApi.md#getAllInvoicesUsingGET) | **GET** /api/invoices | getAllInvoices
[**getInvoiceBySubscriberUsingGET**](InvoiceResourceApi.md#getInvoiceBySubscriberUsingGET) | **GET** /api/invoices/subscriber/{subscriberSecureId} | getInvoiceBySubscriber
[**getInvoiceUsingGET**](InvoiceResourceApi.md#getInvoiceUsingGET) | **GET** /api/invoices/{id} | getInvoice
[**updateInvoiceUsingPUT**](InvoiceResourceApi.md#updateInvoiceUsingPUT) | **PUT** /api/invoices | updateInvoice


<a name="createInvoiceUsingPOST"></a>
# **createInvoiceUsingPOST**
> Invoice createInvoiceUsingPOST(invoice)

createInvoice

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = InvoiceResourceApi()
val invoice : Invoice =  // Invoice | invoice
try {
    val result : Invoice = apiInstance.createInvoiceUsingPOST(invoice)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoiceResourceApi#createInvoiceUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoiceResourceApi#createInvoiceUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice** | [**Invoice**](Invoice.md)| invoice |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteInvoiceUsingDELETE"></a>
# **deleteInvoiceUsingDELETE**
> deleteInvoiceUsingDELETE(id)

deleteInvoice

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = InvoiceResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteInvoiceUsingDELETE(id)
} catch (e: ClientException) {
    println("4xx response calling InvoiceResourceApi#deleteInvoiceUsingDELETE")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoiceResourceApi#deleteInvoiceUsingDELETE")
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

<a name="getAllInvoicesUsingGET"></a>
# **getAllInvoicesUsingGET**
> kotlin.Array&lt;Invoice&gt; getAllInvoicesUsingGET()

getAllInvoices

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = InvoiceResourceApi()
try {
    val result : kotlin.Array<Invoice> = apiInstance.getAllInvoicesUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoiceResourceApi#getAllInvoicesUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoiceResourceApi#getAllInvoicesUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Invoice&gt;**](Invoice.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInvoiceBySubscriberUsingGET"></a>
# **getInvoiceBySubscriberUsingGET**
> kotlin.Array&lt;Invoice&gt; getInvoiceBySubscriberUsingGET(subscriberSecureId)

getInvoiceBySubscriber

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = InvoiceResourceApi()
val subscriberSecureId : kotlin.String = subscriberSecureId_example // kotlin.String | subscriberSecureId
try {
    val result : kotlin.Array<Invoice> = apiInstance.getInvoiceBySubscriberUsingGET(subscriberSecureId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoiceResourceApi#getInvoiceBySubscriberUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoiceResourceApi#getInvoiceBySubscriberUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriberSecureId** | **kotlin.String**| subscriberSecureId |

### Return type

[**kotlin.Array&lt;Invoice&gt;**](Invoice.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInvoiceUsingGET"></a>
# **getInvoiceUsingGET**
> Invoice getInvoiceUsingGET(id)

getInvoice

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = InvoiceResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : Invoice = apiInstance.getInvoiceUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoiceResourceApi#getInvoiceUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoiceResourceApi#getInvoiceUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateInvoiceUsingPUT"></a>
# **updateInvoiceUsingPUT**
> Invoice updateInvoiceUsingPUT(invoice)

updateInvoice

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = InvoiceResourceApi()
val invoice : Invoice =  // Invoice | invoice
try {
    val result : Invoice = apiInstance.updateInvoiceUsingPUT(invoice)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoiceResourceApi#updateInvoiceUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoiceResourceApi#updateInvoiceUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice** | [**Invoice**](Invoice.md)| invoice |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

