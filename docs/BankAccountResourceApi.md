# BankAccountResourceApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBankAccountUsingPOST**](BankAccountResourceApi.md#createBankAccountUsingPOST) | **POST** /api/bank-accounts | createBankAccount
[**deleteBankAccountUsingDELETE**](BankAccountResourceApi.md#deleteBankAccountUsingDELETE) | **DELETE** /api/bank-accounts/{id} | deleteBankAccount
[**getAllBankAccountsUsingGET**](BankAccountResourceApi.md#getAllBankAccountsUsingGET) | **GET** /api/bank-accounts | getAllBankAccounts
[**getBankAccountUsingGET**](BankAccountResourceApi.md#getBankAccountUsingGET) | **GET** /api/bank-accounts/{id} | getBankAccount
[**getBankAccountsByCompanyUsingGET**](BankAccountResourceApi.md#getBankAccountsByCompanyUsingGET) | **GET** /api/bank-accounts/company/{companyId} | getBankAccountsByCompany
[**updateBankAccountUsingPUT**](BankAccountResourceApi.md#updateBankAccountUsingPUT) | **PUT** /api/bank-accounts | updateBankAccount


<a name="createBankAccountUsingPOST"></a>
# **createBankAccountUsingPOST**
> BankAccount createBankAccountUsingPOST(bankAccount)

createBankAccount

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = BankAccountResourceApi()
val bankAccount : BankAccount =  // BankAccount | bankAccount
try {
    val result : BankAccount = apiInstance.createBankAccountUsingPOST(bankAccount)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankAccountResourceApi#createBankAccountUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankAccountResourceApi#createBankAccountUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankAccount** | [**BankAccount**](BankAccount.md)| bankAccount |

### Return type

[**BankAccount**](BankAccount.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteBankAccountUsingDELETE"></a>
# **deleteBankAccountUsingDELETE**
> deleteBankAccountUsingDELETE(id)

deleteBankAccount

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = BankAccountResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteBankAccountUsingDELETE(id)
} catch (e: ClientException) {
    println("4xx response calling BankAccountResourceApi#deleteBankAccountUsingDELETE")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankAccountResourceApi#deleteBankAccountUsingDELETE")
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

<a name="getAllBankAccountsUsingGET"></a>
# **getAllBankAccountsUsingGET**
> kotlin.Array&lt;BankAccount&gt; getAllBankAccountsUsingGET()

getAllBankAccounts

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = BankAccountResourceApi()
try {
    val result : kotlin.Array<BankAccount> = apiInstance.getAllBankAccountsUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankAccountResourceApi#getAllBankAccountsUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankAccountResourceApi#getAllBankAccountsUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;BankAccount&gt;**](BankAccount.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBankAccountUsingGET"></a>
# **getBankAccountUsingGET**
> BankAccount getBankAccountUsingGET(id)

getBankAccount

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = BankAccountResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : BankAccount = apiInstance.getBankAccountUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankAccountResourceApi#getBankAccountUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankAccountResourceApi#getBankAccountUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**BankAccount**](BankAccount.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBankAccountsByCompanyUsingGET"></a>
# **getBankAccountsByCompanyUsingGET**
> kotlin.Array&lt;BankAccount&gt; getBankAccountsByCompanyUsingGET(companyId)

getBankAccountsByCompany

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = BankAccountResourceApi()
val companyId : kotlin.Long = 789 // kotlin.Long | companyId
try {
    val result : kotlin.Array<BankAccount> = apiInstance.getBankAccountsByCompanyUsingGET(companyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankAccountResourceApi#getBankAccountsByCompanyUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankAccountResourceApi#getBankAccountsByCompanyUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.Long**| companyId |

### Return type

[**kotlin.Array&lt;BankAccount&gt;**](BankAccount.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateBankAccountUsingPUT"></a>
# **updateBankAccountUsingPUT**
> BankAccount updateBankAccountUsingPUT(bankAccount)

updateBankAccount

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = BankAccountResourceApi()
val bankAccount : BankAccount =  // BankAccount | bankAccount
try {
    val result : BankAccount = apiInstance.updateBankAccountUsingPUT(bankAccount)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankAccountResourceApi#updateBankAccountUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankAccountResourceApi#updateBankAccountUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankAccount** | [**BankAccount**](BankAccount.md)| bankAccount |

### Return type

[**BankAccount**](BankAccount.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

