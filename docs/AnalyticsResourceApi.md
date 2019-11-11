# AnalyticsResourceApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDashboardAnalyticsUsingGET**](AnalyticsResourceApi.md#getDashboardAnalyticsUsingGET) | **GET** /api/analytics/dashboard | getDashboardAnalytics


<a name="getDashboardAnalyticsUsingGET"></a>
# **getDashboardAnalyticsUsingGET**
> kotlin.Any getDashboardAnalyticsUsingGET()

getDashboardAnalytics

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = AnalyticsResourceApi()
try {
    val result : kotlin.Any = apiInstance.getDashboardAnalyticsUsingGET()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsResourceApi#getDashboardAnalyticsUsingGET")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsResourceApi#getDashboardAnalyticsUsingGET")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

