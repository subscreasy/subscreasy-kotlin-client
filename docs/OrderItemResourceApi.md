# OrderItemResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrderItemUsingPOST**](OrderItemResourceApi.md#createOrderItemUsingPOST) | **POST** /api/order-items | createOrderItem
[**deleteOrderItemUsingDELETE**](OrderItemResourceApi.md#deleteOrderItemUsingDELETE) | **DELETE** /api/order-items/{id} | deleteOrderItem
[**getAllOrderItemsUsingGET**](OrderItemResourceApi.md#getAllOrderItemsUsingGET) | **GET** /api/order-items | getAllOrderItems
[**getOrderItemUsingGET**](OrderItemResourceApi.md#getOrderItemUsingGET) | **GET** /api/order-items/{id} | getOrderItem
[**updateOrderItemUsingPUT**](OrderItemResourceApi.md#updateOrderItemUsingPUT) | **PUT** /api/order-items | updateOrderItem


<a name="createOrderItemUsingPOST"></a>
# **createOrderItemUsingPOST**
> OrderItem createOrderItemUsingPOST(orderItem)

createOrderItem

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = OrderItemResourceApi()
val orderItem : OrderItem =  // OrderItem | orderItem
try {
    val result : OrderItem = apiInstance.createOrderItemUsingPOST(orderItem)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderItemResourceApi#createOrderItemUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderItemResourceApi#createOrderItemUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderItem** | [**OrderItem**](OrderItem.md)| orderItem |

### Return type

[**OrderItem**](OrderItem.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteOrderItemUsingDELETE"></a>
# **deleteOrderItemUsingDELETE**
> deleteOrderItemUsingDELETE(id)

deleteOrderItem

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = OrderItemResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteOrderItemUsingDELETE(id)
} catch (e: ClientException) {
    println("4xx response calling OrderItemResourceApi#deleteOrderItemUsingDELETE")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderItemResourceApi#deleteOrderItemUsingDELETE")
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

<a name="getAllOrderItemsUsingGET"></a>
# **getAllOrderItemsUsingGET**
> kotlin.Array&lt;OrderItem&gt; getAllOrderItemsUsingGET()

getAllOrderItems

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = OrderItemResourceApi()
try {
    val result : kotlin.Array<OrderItem> = apiInstance.getAllOrderItemsUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderItemResourceApi#getAllOrderItemsUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderItemResourceApi#getAllOrderItemsUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;OrderItem&gt;**](OrderItem.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOrderItemUsingGET"></a>
# **getOrderItemUsingGET**
> OrderItem getOrderItemUsingGET(id)

getOrderItem

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = OrderItemResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : OrderItem = apiInstance.getOrderItemUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderItemResourceApi#getOrderItemUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderItemResourceApi#getOrderItemUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**OrderItem**](OrderItem.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateOrderItemUsingPUT"></a>
# **updateOrderItemUsingPUT**
> OrderItem updateOrderItemUsingPUT(orderItem)

updateOrderItem

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = OrderItemResourceApi()
val orderItem : OrderItem =  // OrderItem | orderItem
try {
    val result : OrderItem = apiInstance.updateOrderItemUsingPUT(orderItem)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderItemResourceApi#updateOrderItemUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderItemResourceApi#updateOrderItemUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderItem** | [**OrderItem**](OrderItem.md)| orderItem |

### Return type

[**OrderItem**](OrderItem.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

