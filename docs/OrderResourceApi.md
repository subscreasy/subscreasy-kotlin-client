# OrderResourceApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrderUsingPOST**](OrderResourceApi.md#createOrderUsingPOST) | **POST** /api/orders | createOrder
[**deleteOrderUsingDELETE**](OrderResourceApi.md#deleteOrderUsingDELETE) | **DELETE** /api/orders/{id} | deleteOrder
[**getAllOrdersUsingGET**](OrderResourceApi.md#getAllOrdersUsingGET) | **GET** /api/orders | getAllOrders
[**getOrderUsingGET**](OrderResourceApi.md#getOrderUsingGET) | **GET** /api/orders/{id} | getOrder
[**updateOrderUsingPUT**](OrderResourceApi.md#updateOrderUsingPUT) | **PUT** /api/orders | updateOrder


<a name="createOrderUsingPOST"></a>
# **createOrderUsingPOST**
> Order createOrderUsingPOST(order)

createOrder

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = OrderResourceApi()
val order : Order =  // Order | order
try {
    val result : Order = apiInstance.createOrderUsingPOST(order)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderResourceApi#createOrderUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderResourceApi#createOrderUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**Order**](Order.md)| order |

### Return type

[**Order**](Order.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteOrderUsingDELETE"></a>
# **deleteOrderUsingDELETE**
> deleteOrderUsingDELETE(id)

deleteOrder

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = OrderResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteOrderUsingDELETE(id)
} catch (e: ClientException) {
    println("4xx response calling OrderResourceApi#deleteOrderUsingDELETE")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderResourceApi#deleteOrderUsingDELETE")
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

<a name="getAllOrdersUsingGET"></a>
# **getAllOrdersUsingGET**
> kotlin.Array&lt;Order&gt; getAllOrdersUsingGET()

getAllOrders

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = OrderResourceApi()
try {
    val result : kotlin.Array<Order> = apiInstance.getAllOrdersUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderResourceApi#getAllOrdersUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderResourceApi#getAllOrdersUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Order&gt;**](Order.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOrderUsingGET"></a>
# **getOrderUsingGET**
> Order getOrderUsingGET(id)

getOrder

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = OrderResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : Order = apiInstance.getOrderUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderResourceApi#getOrderUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderResourceApi#getOrderUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**Order**](Order.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateOrderUsingPUT"></a>
# **updateOrderUsingPUT**
> Order updateOrderUsingPUT(order)

updateOrder

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = OrderResourceApi()
val order : Order =  // Order | order
try {
    val result : Order = apiInstance.updateOrderUsingPUT(order)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderResourceApi#updateOrderUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderResourceApi#updateOrderUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**Order**](Order.md)| order |

### Return type

[**Order**](Order.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

