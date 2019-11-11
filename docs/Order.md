
# Order

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**buyer** | [**Subscriber**](Subscriber.md) |  | 
**company** | [**Company**](Company.md) |  | 
**createDate** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**id** | **kotlin.Long** |  |  [optional]
**offer** | [**Offer**](Offer.md) |  | 
**payment** | [**ChargingLog**](ChargingLog.md) |  |  [optional]
**shippingAddress** | **kotlin.Long** |  |  [optional]
**shippingCode** | **kotlin.String** |  |  [optional]
**shippingCompany** | [**inline**](#ShippingCompanyEnum) |  |  [optional]
**status** | [**inline**](#StatusEnum) |  | 
**subscription** | **kotlin.Long** |  | 


<a name="ShippingCompanyEnum"></a>
## Enum: shippingCompany
Name | Value
---- | -----
shippingCompany | MNG, SURAT, YURTICI


<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | PREPARING, SHIPPED, DELIVERED, CANCELLED



