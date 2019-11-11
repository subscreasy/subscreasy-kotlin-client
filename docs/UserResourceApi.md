# UserResourceApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompanyUserUsingPOST**](UserResourceApi.md#createCompanyUserUsingPOST) | **POST** /api/users/company | createCompanyUser
[**createUserUsingPOST**](UserResourceApi.md#createUserUsingPOST) | **POST** /api/users | createUser
[**deleteUserUsingDELETE**](UserResourceApi.md#deleteUserUsingDELETE) | **DELETE** /api/users/{login} | deleteUser
[**getAllUsersByAuthenticatedCompanyUsingGET**](UserResourceApi.md#getAllUsersByAuthenticatedCompanyUsingGET) | **GET** /api/users/company | getAllUsersByAuthenticatedCompany
[**getAllUsersByCompanyIdUsingGET**](UserResourceApi.md#getAllUsersByCompanyIdUsingGET) | **GET** /api/users/company/{companyId} | getAllUsersByCompanyId
[**getAllUsersUsingGET**](UserResourceApi.md#getAllUsersUsingGET) | **GET** /api/users | getAllUsers
[**getAuthoritiesUsingGET**](UserResourceApi.md#getAuthoritiesUsingGET) | **GET** /api/users/authorities | getAuthorities
[**getUserUsingGET**](UserResourceApi.md#getUserUsingGET) | **GET** /api/users/{login} | getUser
[**updateUserUsingPUT**](UserResourceApi.md#updateUserUsingPUT) | **PUT** /api/users | updateUser


<a name="createCompanyUserUsingPOST"></a>
# **createCompanyUserUsingPOST**
> ResponseEntity createCompanyUserUsingPOST(managedUserVM)

createCompanyUser

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = UserResourceApi()
val managedUserVM : ManagedUserVM =  // ManagedUserVM | managedUserVM
try {
    val result : ResponseEntity = apiInstance.createCompanyUserUsingPOST(managedUserVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserResourceApi#createCompanyUserUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserResourceApi#createCompanyUserUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **managedUserVM** | [**ManagedUserVM**](ManagedUserVM.md)| managedUserVM |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createUserUsingPOST"></a>
# **createUserUsingPOST**
> ResponseEntity createUserUsingPOST(managedUserVM)

createUser

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = UserResourceApi()
val managedUserVM : ManagedUserVM =  // ManagedUserVM | managedUserVM
try {
    val result : ResponseEntity = apiInstance.createUserUsingPOST(managedUserVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserResourceApi#createUserUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserResourceApi#createUserUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **managedUserVM** | [**ManagedUserVM**](ManagedUserVM.md)| managedUserVM |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteUserUsingDELETE"></a>
# **deleteUserUsingDELETE**
> deleteUserUsingDELETE(login)

deleteUser

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = UserResourceApi()
val login : kotlin.String = login_example // kotlin.String | login
try {
    apiInstance.deleteUserUsingDELETE(login)
} catch (e: ClientException) {
    println("4xx response calling UserResourceApi#deleteUserUsingDELETE")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserResourceApi#deleteUserUsingDELETE")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **kotlin.String**| login |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllUsersByAuthenticatedCompanyUsingGET"></a>
# **getAllUsersByAuthenticatedCompanyUsingGET**
> kotlin.Array&lt;User&gt; getAllUsersByAuthenticatedCompanyUsingGET()

getAllUsersByAuthenticatedCompany

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = UserResourceApi()
try {
    val result : kotlin.Array<User> = apiInstance.getAllUsersByAuthenticatedCompanyUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserResourceApi#getAllUsersByAuthenticatedCompanyUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserResourceApi#getAllUsersByAuthenticatedCompanyUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;User&gt;**](User.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllUsersByCompanyIdUsingGET"></a>
# **getAllUsersByCompanyIdUsingGET**
> kotlin.Array&lt;User&gt; getAllUsersByCompanyIdUsingGET(companyId)

getAllUsersByCompanyId

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = UserResourceApi()
val companyId : kotlin.Long = 789 // kotlin.Long | companyId
try {
    val result : kotlin.Array<User> = apiInstance.getAllUsersByCompanyIdUsingGET(companyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserResourceApi#getAllUsersByCompanyIdUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserResourceApi#getAllUsersByCompanyIdUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.Long**| companyId |

### Return type

[**kotlin.Array&lt;User&gt;**](User.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllUsersUsingGET"></a>
# **getAllUsersUsingGET**
> kotlin.Array&lt;User&gt; getAllUsersUsingGET(page, size, sort)

getAllUsers

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = UserResourceApi()
val page : kotlin.Int = 56 // kotlin.Int | Page number of the requested page
val size : kotlin.Int = 56 // kotlin.Int | Size of a page
val sort : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    val result : kotlin.Array<User> = apiInstance.getAllUsersUsingGET(page, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserResourceApi#getAllUsersUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserResourceApi#getAllUsersUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Page number of the requested page | [optional]
 **size** | **kotlin.Int**| Size of a page | [optional]
 **sort** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**kotlin.Array&lt;User&gt;**](User.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAuthoritiesUsingGET"></a>
# **getAuthoritiesUsingGET**
> kotlin.Array&lt;kotlin.String&gt; getAuthoritiesUsingGET()

getAuthorities

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = UserResourceApi()
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.getAuthoritiesUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserResourceApi#getAuthoritiesUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserResourceApi#getAuthoritiesUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUserUsingGET"></a>
# **getUserUsingGET**
> UserDTO getUserUsingGET(login)

getUser

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = UserResourceApi()
val login : kotlin.String = login_example // kotlin.String | login
try {
    val result : UserDTO = apiInstance.getUserUsingGET(login)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserResourceApi#getUserUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserResourceApi#getUserUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **kotlin.String**| login |

### Return type

[**UserDTO**](UserDTO.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateUserUsingPUT"></a>
# **updateUserUsingPUT**
> User updateUserUsingPUT(managedUserVM)

updateUser

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = UserResourceApi()
val managedUserVM : ManagedUserVM =  // ManagedUserVM | managedUserVM
try {
    val result : User = apiInstance.updateUserUsingPUT(managedUserVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserResourceApi#updateUserUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserResourceApi#updateUserUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **managedUserVM** | [**ManagedUserVM**](ManagedUserVM.md)| managedUserVM |

### Return type

[**User**](User.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

