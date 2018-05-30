
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
**nextChargingDate** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**offer** | [**Offer**](Offer.md) |  | 
**services** | [**kotlin.Array&lt;ServiceInstance&gt;**](ServiceInstance.md) |  |  [optional]
**startDate** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**status** | [**inline**](#StatusEnum) |  |  [optional]
**subscriberId** | **kotlin.String** |  |  [optional]
**version** | **kotlin.Long** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | NEW, ACTIVE, SUSPENDED, FINISHED, CANCELLED



