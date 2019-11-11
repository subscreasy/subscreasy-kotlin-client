
# Offer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**company** | [**Company**](Company.md) |  | 
**createDate** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**currency** | [**inline**](#CurrencyEnum) |  | 
**description** | **kotlin.String** |  |  [optional]
**disablePaymentForm** | **kotlin.Boolean** |  | 
**id** | **kotlin.Long** |  |  [optional]
**imagePath** | **kotlin.String** |  |  [optional]
**multiplePurchase** | **kotlin.Boolean** |  | 
**name** | **kotlin.String** |  | 
**openEnded** | **kotlin.Boolean** |  | 
**physicalProduct** | **kotlin.Boolean** |  |  [optional]
**price** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**productType** | [**inline**](#ProductTypeEnum) |  |  [optional]
**recurrence** | [**RecurrencePeriod**](RecurrencePeriod.md) |  |  [optional]
**recurrenceCount** | **kotlin.Int** |  |  [optional]
**renewalBillcycleBased** | **kotlin.Boolean** |  |  [optional]
**renewalType** | [**inline**](#RenewalTypeEnum) |  |  [optional]
**secureId** | **kotlin.String** |  |  [optional]
**trialPeriod** | **kotlin.Int** |  |  [optional]


<a name="CurrencyEnum"></a>
## Enum: currency
Name | Value
---- | -----
currency | TRY, USD


<a name="ProductTypeEnum"></a>
## Enum: productType
Name | Value
---- | -----
productType | PHYSICAL, SERVICE


<a name="RenewalTypeEnum"></a>
## Enum: renewalType
Name | Value
---- | -----
renewalType | BILLCYCLE, START_DATE



