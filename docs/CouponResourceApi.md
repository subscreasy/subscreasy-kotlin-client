# CouponResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCouponUsingPOST**](CouponResourceApi.md#createCouponUsingPOST) | **POST** /api/coupons | createCoupon
[**deleteCouponUsingDELETE**](CouponResourceApi.md#deleteCouponUsingDELETE) | **DELETE** /api/coupons/{id} | deleteCoupon
[**getAllCouponsUsingGET**](CouponResourceApi.md#getAllCouponsUsingGET) | **GET** /api/coupons | getAllCoupons
[**getCouponUsingGET**](CouponResourceApi.md#getCouponUsingGET) | **GET** /api/coupons/{id} | getCoupon
[**updateCouponUsingPUT**](CouponResourceApi.md#updateCouponUsingPUT) | **PUT** /api/coupons | updateCoupon


<a name="createCouponUsingPOST"></a>
# **createCouponUsingPOST**
> Coupon createCouponUsingPOST(coupon)

createCoupon

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CouponResourceApi()
val coupon : Coupon =  // Coupon | coupon
try {
    val result : Coupon = apiInstance.createCouponUsingPOST(coupon)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CouponResourceApi#createCouponUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CouponResourceApi#createCouponUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coupon** | [**Coupon**](Coupon.md)| coupon |

### Return type

[**Coupon**](Coupon.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCouponUsingDELETE"></a>
# **deleteCouponUsingDELETE**
> deleteCouponUsingDELETE(id)

deleteCoupon

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CouponResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    apiInstance.deleteCouponUsingDELETE(id)
} catch (e: ClientException) {
    println("4xx response calling CouponResourceApi#deleteCouponUsingDELETE")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CouponResourceApi#deleteCouponUsingDELETE")
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

<a name="getAllCouponsUsingGET"></a>
# **getAllCouponsUsingGET**
> kotlin.Array&lt;Coupon&gt; getAllCouponsUsingGET()

getAllCoupons

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CouponResourceApi()
try {
    val result : kotlin.Array<Coupon> = apiInstance.getAllCouponsUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CouponResourceApi#getAllCouponsUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CouponResourceApi#getAllCouponsUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Coupon&gt;**](Coupon.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCouponUsingGET"></a>
# **getCouponUsingGET**
> Coupon getCouponUsingGET(id)

getCoupon

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CouponResourceApi()
val id : kotlin.Long = 789 // kotlin.Long | id
try {
    val result : Coupon = apiInstance.getCouponUsingGET(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CouponResourceApi#getCouponUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CouponResourceApi#getCouponUsingGET")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| id |

### Return type

[**Coupon**](Coupon.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateCouponUsingPUT"></a>
# **updateCouponUsingPUT**
> Coupon updateCouponUsingPUT(coupon)

updateCoupon

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = CouponResourceApi()
val coupon : Coupon =  // Coupon | coupon
try {
    val result : Coupon = apiInstance.updateCouponUsingPUT(coupon)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CouponResourceApi#updateCouponUsingPUT")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CouponResourceApi#updateCouponUsingPUT")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coupon** | [**Coupon**](Coupon.md)| coupon |

### Return type

[**Coupon**](Coupon.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

