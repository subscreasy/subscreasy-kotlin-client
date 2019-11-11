# ProductResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProductUsingPOST**](ProductResourceApi.md#createProductUsingPOST) | **POST** /api/products | createProduct
[**getAllCompanyProductUsingGET**](ProductResourceApi.md#getAllCompanyProductUsingGET) | **GET** /api/na/products2/{companyName} | getAllCompanyProduct
[**getAllProductsUsingGET**](ProductResourceApi.md#getAllProductsUsingGET) | **GET** /api/products | getAllProducts
[**getCompanyProductUsingGET**](ProductResourceApi.md#getCompanyProductUsingGET) | **GET** /api/na/products/{companyName}/{id} | getCompanyProduct
[**getProductUsingGET**](ProductResourceApi.md#getProductUsingGET) | **GET** /api/products/{id} | getProduct
[**updateProductUsingPUT**](ProductResourceApi.md#updateProductUsingPUT) | **PUT** /api/products | updateProduct


<a name="createProductUsingPOST"></a>
# **createProductUsingPOST**
> Product createProductUsingPOST(product)

createProduct

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ProductResourceApi()
val product : Product =  // Product | product
try {
    val result : Product = apiInstance.createProductUsingPOST(product)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductResourceApi#createProductUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductResourceApi#createProductUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**Product**](Product.md)| product |

### Return type

[**Product**](Product.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAllCompanyProductUsingGET"></a>
# **getAllCompanyProductUsingGET**
> kotlin.Array&lt;Product&gt; getAllCompanyProductUsingGET(companyName)

getAllCompanyProduct

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ProductResourceApi()
val companyName : kotlin.String = companyName_example // kotlin.String | companyName
try {
    val result : kotlin.Array<Product> = apiInstance.getAllCompanyProductUsingGET(companyName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductResourceApi#getAllCompanyProductUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductResourceApi#getAllCompanyProductUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyName** | **kotlin.String**| companyName |

### Return type

[**kotlin.Array&lt;Product&gt;**](Product.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllProductsUsingGET"></a>
# **getAllProductsUsingGET**
> kotlin.Array&lt;Product&gt; getAllProductsUsingGET()

getAllProducts

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ProductResourceApi()
try {
    val result : kotlin.Array<Product> = apiInstance.getAllProductsUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductResourceApi#getAllProductsUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductResourceApi#getAllProductsUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Product&gt;**](Product.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCompanyProductUsingGET"></a>
# **getCompanyProductUsingGET**
> Product getCompanyProductUsingGET(companyName, id)

getCompanyProduct

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ProductResourceApi()
val companyName : kotlin.String = companyName_example // kotlin.String | companyName
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : Product = apiInstance.getCompanyProductUsingGET(companyName, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductResourceApi#getCompanyProductUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductResourceApi#getCompanyProductUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyName** | **kotlin.String**| companyName |
 **id** | **kotlin.Long**| id |

### Return type

[**Product**](Product.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProductUsingGET"></a>
# **getProductUsingGET**
> Product getProductUsingGET(id)

getProduct

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ProductResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : Product = apiInstance.getProductUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductResourceApi#getProductUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductResourceApi#getProductUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**Product**](Product.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateProductUsingPUT"></a>
# **updateProductUsingPUT**
> Product updateProductUsingPUT(product)

updateProduct

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = ProductResourceApi()
val product : Product =  // Product | product
try {
    val result : Product = apiInstance.updateProductUsingPUT(product)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductResourceApi#updateProductUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductResourceApi#updateProductUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**Product**](Product.md)| product |

### Return type

[**Product**](Product.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

