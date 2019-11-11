# CompanyPropsResourceApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompanyPropsUsingPOST**](CompanyPropsResourceApi.md#createCompanyPropsUsingPOST) | **POST** /api/company-props | createCompanyProps
[**deleteCompanyPropsUsingDELETE**](CompanyPropsResourceApi.md#deleteCompanyPropsUsingDELETE) | **DELETE** /api/company-props/{id} | deleteCompanyProps
[**getAllCompanyPropsUsingGET**](CompanyPropsResourceApi.md#getAllCompanyPropsUsingGET) | **GET** /api/company-props | getAllCompanyProps
[**getCompanyPropsByCompanyIdUsingGET**](CompanyPropsResourceApi.md#getCompanyPropsByCompanyIdUsingGET) | **GET** /api/company-props/company/{companyId} | getCompanyPropsByCompanyId
[**updateCompanyPropsUsingPUT**](CompanyPropsResourceApi.md#updateCompanyPropsUsingPUT) | **PUT** /api/company-props | updateCompanyProps
[**uploadCSSUsingPOST**](CompanyPropsResourceApi.md#uploadCSSUsingPOST) | **POST** /api/company-props/uploadCSS | uploadCSS
[**uploadFileUsingPOST**](CompanyPropsResourceApi.md#uploadFileUsingPOST) | **POST** /api/company-props/uploadFile | uploadFile


<a name="createCompanyPropsUsingPOST"></a>
# **createCompanyPropsUsingPOST**
> CompanyProps createCompanyPropsUsingPOST(companyProps)

createCompanyProps

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CompanyPropsResourceApi()
val companyProps : CompanyProps =  // CompanyProps | companyProps
try {
    val result : CompanyProps = apiInstance.createCompanyPropsUsingPOST(companyProps)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyPropsResourceApi#createCompanyPropsUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyPropsResourceApi#createCompanyPropsUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyProps** | [**CompanyProps**](CompanyProps.md)| companyProps |

### Return type

[**CompanyProps**](CompanyProps.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCompanyPropsUsingDELETE"></a>
# **deleteCompanyPropsUsingDELETE**
> deleteCompanyPropsUsingDELETE(id)

deleteCompanyProps

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CompanyPropsResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteCompanyPropsUsingDELETE(id)
} catch (e: ClientException) {
    println("4xx response calling CompanyPropsResourceApi#deleteCompanyPropsUsingDELETE")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyPropsResourceApi#deleteCompanyPropsUsingDELETE")
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

<a name="getAllCompanyPropsUsingGET"></a>
# **getAllCompanyPropsUsingGET**
> kotlin.Array&lt;CompanyProps&gt; getAllCompanyPropsUsingGET()

getAllCompanyProps

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CompanyPropsResourceApi()
try {
    val result : kotlin.Array<CompanyProps> = apiInstance.getAllCompanyPropsUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyPropsResourceApi#getAllCompanyPropsUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyPropsResourceApi#getAllCompanyPropsUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;CompanyProps&gt;**](CompanyProps.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCompanyPropsByCompanyIdUsingGET"></a>
# **getCompanyPropsByCompanyIdUsingGET**
> CompanyProps getCompanyPropsByCompanyIdUsingGET(companyId)

getCompanyPropsByCompanyId

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CompanyPropsResourceApi()
val companyId : kotlin.Long = 789 // kotlin.Long | companyId
try {
    val result : CompanyProps = apiInstance.getCompanyPropsByCompanyIdUsingGET(companyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyPropsResourceApi#getCompanyPropsByCompanyIdUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyPropsResourceApi#getCompanyPropsByCompanyIdUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.Long**| companyId |

### Return type

[**CompanyProps**](CompanyProps.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateCompanyPropsUsingPUT"></a>
# **updateCompanyPropsUsingPUT**
> CompanyProps updateCompanyPropsUsingPUT(companyProps)

updateCompanyProps

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CompanyPropsResourceApi()
val companyProps : CompanyProps =  // CompanyProps | companyProps
try {
    val result : CompanyProps = apiInstance.updateCompanyPropsUsingPUT(companyProps)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyPropsResourceApi#updateCompanyPropsUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyPropsResourceApi#updateCompanyPropsUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyProps** | [**CompanyProps**](CompanyProps.md)| companyProps |

### Return type

[**CompanyProps**](CompanyProps.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="uploadCSSUsingPOST"></a>
# **uploadCSSUsingPOST**
> kotlin.Any uploadCSSUsingPOST(file)

uploadCSS

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CompanyPropsResourceApi()
val file : java.io.File = /path/to/file.txt // java.io.File | file
try {
    val result : kotlin.Any = apiInstance.uploadCSSUsingPOST(file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyPropsResourceApi#uploadCSSUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyPropsResourceApi#uploadCSSUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**| file |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="uploadFileUsingPOST"></a>
# **uploadFileUsingPOST**
> kotlin.Any uploadFileUsingPOST(file)

uploadFile

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CompanyPropsResourceApi()
val file : java.io.File = /path/to/file.txt // java.io.File | file
try {
    val result : kotlin.Any = apiInstance.uploadFileUsingPOST(file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyPropsResourceApi#uploadFileUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyPropsResourceApi#uploadFileUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**| file |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

