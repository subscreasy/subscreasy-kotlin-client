
# ServiceInstance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capacity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**currentUsage** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**endDate** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**id** | **kotlin.Long** |  |  [optional]
**name** | **kotlin.String** |  |  [optional]
**numberOfUnits** | **kotlin.Int** |  |  [optional]
**offer** | [**Offer**](Offer.md) |  |  [optional]
**overUsage** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**overUsageQuota** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**quotaOrigin** | [**inline**](#QuotaOriginEnum) |  |  [optional]
**serviceOffering** | [**ServiceOffering**](ServiceOffering.md) |  |  [optional]
**serviceType** | [**inline**](#ServiceTypeEnum) |  |  [optional]
**startDate** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**status** | [**inline**](#StatusEnum) |  |  [optional]
**subscriberId** | **kotlin.String** |  |  [optional]
**subscription** | [**Subsription**](Subsription.md) |  |  [optional]
**type** | [**inline**](#TypeEnum) |  |  [optional]
**version** | **kotlin.Long** |  |  [optional]


<a name="QuotaOriginEnum"></a>
## Enum: quotaOrigin
Name | Value
---- | -----
quotaOrigin | SUBS, OVER


<a name="ServiceTypeEnum"></a>
## Enum: serviceType
Name | Value
---- | -----
serviceType | ONOFF, SEAT_BASED, USAGE_BASED


<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | NEW, ACTIVE, SUSPENDED, FINISHED, CANCELLED


<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | ONOFF, SEAT_BASED, USAGE_BASED



