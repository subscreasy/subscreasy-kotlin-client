# CardResourceApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**saveCardUsingPOST**](CardResourceApi.md#saveCardUsingPOST) | **POST** /api/card | saveCard


<a name="saveCardUsingPOST"></a>
# **saveCardUsingPOST**
> kotlin.Any saveCardUsingPOST(request)

saveCard

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CardResourceApi()
val request : SaveCardRequest =  // SaveCardRequest | request
try {
    val result : kotlin.Any = apiInstance.saveCardUsingPOST(request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CardResourceApi#saveCardUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CardResourceApi#saveCardUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SaveCardRequest**](SaveCardRequest.md)| request |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

