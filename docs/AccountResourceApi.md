# AccountResourceApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**isAuthenticatedUsingGET**](AccountResourceApi.md#isAuthenticatedUsingGET) | **GET** /api/authenticate | isAuthenticated
[**registerAccountUsingPOST**](AccountResourceApi.md#registerAccountUsingPOST) | **POST** /api/register | registerAccount


<a name="isAuthenticatedUsingGET"></a>
# **isAuthenticatedUsingGET**
> kotlin.String isAuthenticatedUsingGET()

isAuthenticated

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = AccountResourceApi()
try {
    val result : kotlin.String = apiInstance.isAuthenticatedUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountResourceApi#isAuthenticatedUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountResourceApi#isAuthenticatedUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="registerAccountUsingPOST"></a>
# **registerAccountUsingPOST**
> ResponseEntity registerAccountUsingPOST(managedUserVM)

registerAccount

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = AccountResourceApi()
val managedUserVM : UserDTO =  // UserDTO | managedUserVM
try {
    val result : ResponseEntity = apiInstance.registerAccountUsingPOST(managedUserVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountResourceApi#registerAccountUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountResourceApi#registerAccountUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **managedUserVM** | [**UserDTO**](UserDTO.md)| managedUserVM |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

