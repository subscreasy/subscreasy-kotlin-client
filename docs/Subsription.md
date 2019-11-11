
# Subsription

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appliedCoupon** | [**Coupon**](Coupon.md) |  |  [optional]
**cancelDate** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**card** | [**SavedCard**](SavedCard.md) |  |  [optional]
**company** | [**Company**](Company.md) |  | 
**endDate** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**id** | **kotlin.Long** |  |  [optional]
**lastEvent** | [**inline**](#LastEventEnum) |  |  [optional]
**offer** | [**Offer**](Offer.md) |  | 
**paymentMethod** | [**inline**](#PaymentMethodEnum) |  |  [optional]
**services** | [**kotlin.Array&lt;ServiceInstance&gt;**](ServiceInstance.md) |  |  [optional]
**startDate** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**status** | [**inline**](#StatusEnum) |  |  [optional]
**subscriber** | [**Subscriber**](Subscriber.md) |  |  [optional]
**subscriberSecureId** | **kotlin.String** |  |  [optional]
**termEndDate** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**termStartDate** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**trialEndDate** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]


<a name="LastEventEnum"></a>
## Enum: lastEvent
Name | Value
---- | -----
lastEvent | STARTED, RENEWED, RENEWAL_FAILED, FINISHED, CANCELLED, SUBSCRIBER_CREATED, SUBSCRIBER_UPDATED, TRIAL_ENDING, PAYMENT_UPDATED, IMMEDIATE_CANCELLATION_REQUESTED, ENDOFPERIOD_CANCELLATION_REQUESTED, PRICE_UPDATED


<a name="PaymentMethodEnum"></a>
## Enum: paymentMethod
Name | Value
---- | -----
paymentMethod | OFFLINE, CC, MOBILE


<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | NEW, ACTIVE, SUSPENDED, FINISHED, CANCELLED, IN_TRIAL, PAYMENT_DUE



