
# Coupon

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **kotlin.String** |  |  [optional]
**company** | [**Company**](Company.md) |  |  [optional]
**currentUsage** | **kotlin.Int** |  |  [optional]
**discountAmount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**discountType** | [**inline**](#DiscountTypeEnum) |  | 
**expireDate** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**id** | **kotlin.Long** |  |  [optional]
**maxLimit** | **kotlin.Int** |  | 


<a name="DiscountTypeEnum"></a>
## Enum: discountType
Name | Value
---- | -----
discountType | FIXED, PERCENTAGE



