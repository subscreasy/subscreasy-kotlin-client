# CompanyResourceApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompanyUsingPOST**](CompanyResourceApi.md#createCompanyUsingPOST) | **POST** /api/companies | createCompany
[**deleteCompanyUsingDELETE**](CompanyResourceApi.md#deleteCompanyUsingDELETE) | **DELETE** /api/companies/{id} | deleteCompany
[**getAllCompaniesUsingGET**](CompanyResourceApi.md#getAllCompaniesUsingGET) | **GET** /api/companies | getAllCompanies
[**getCompanyUsingGET**](CompanyResourceApi.md#getCompanyUsingGET) | **GET** /api/companies/{id} | getCompany
[**updateCompanyUsingPUT**](CompanyResourceApi.md#updateCompanyUsingPUT) | **PUT** /api/companies | updateCompany


<a name="createCompanyUsingPOST"></a>
# **createCompanyUsingPOST**
> Company createCompanyUsingPOST(company)

createCompany

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CompanyResourceApi()
val company : Company =  // Company | company
try {
    val result : Company = apiInstance.createCompanyUsingPOST(company)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyResourceApi#createCompanyUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyResourceApi#createCompanyUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company** | [**Company**](Company.md)| company |

### Return type

[**Company**](Company.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCompanyUsingDELETE"></a>
# **deleteCompanyUsingDELETE**
> deleteCompanyUsingDELETE(id)

deleteCompany

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CompanyResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteCompanyUsingDELETE(id)
} catch (e: ClientException) {
    println("4xx response calling CompanyResourceApi#deleteCompanyUsingDELETE")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyResourceApi#deleteCompanyUsingDELETE")
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

<a name="getAllCompaniesUsingGET"></a>
# **getAllCompaniesUsingGET**
> kotlin.Array&lt;Company&gt; getAllCompaniesUsingGET()

getAllCompanies

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CompanyResourceApi()
try {
    val result : kotlin.Array<Company> = apiInstance.getAllCompaniesUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyResourceApi#getAllCompaniesUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyResourceApi#getAllCompaniesUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Company&gt;**](Company.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCompanyUsingGET"></a>
# **getCompanyUsingGET**
> Company getCompanyUsingGET(id)

getCompany

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CompanyResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : Company = apiInstance.getCompanyUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyResourceApi#getCompanyUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyResourceApi#getCompanyUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**Company**](Company.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateCompanyUsingPUT"></a>
# **updateCompanyUsingPUT**
> Company updateCompanyUsingPUT(company)

updateCompany

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CompanyResourceApi()
val company : Company =  // Company | company
try {
    val result : Company = apiInstance.updateCompanyUsingPUT(company)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyResourceApi#updateCompanyUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyResourceApi#updateCompanyUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company** | [**Company**](Company.md)| company |

### Return type

[**Company**](Company.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

