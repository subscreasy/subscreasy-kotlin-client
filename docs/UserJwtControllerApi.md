# UserJwtControllerApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorizeUsingPOST**](UserJwtControllerApi.md#authorizeUsingPOST) | **POST** /api/authenticate | authorize


<a name="authorizeUsingPOST"></a>
# **authorizeUsingPOST**
> ResponseEntity authorizeUsingPOST(loginVM)

authorize

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = UserJwtControllerApi()
val loginVM : LoginVM =  // LoginVM | loginVM
try {
    val result : ResponseEntity = apiInstance.authorizeUsingPOST(loginVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserJwtControllerApi#authorizeUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserJwtControllerApi#authorizeUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loginVM** | [**LoginVM**](LoginVM.md)| loginVM |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

