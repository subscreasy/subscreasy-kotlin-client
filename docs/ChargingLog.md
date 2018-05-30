
# ChargingLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appliedCoupon** | **kotlin.Long** |  |  [optional]
**authCode** | **kotlin.String** |  |  [optional]
**companyId** | **kotlin.Long** |  |  [optional]
**createDate** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**currency** | **kotlin.String** |  |  [optional]
**errorCode** | **kotlin.String** |  |  [optional]
**errorText** | **kotlin.String** |  |  [optional]
**id** | **kotlin.Long** |  |  [optional]
**invoiceId** | **kotlin.Long** |  |  [optional]
**jobId** | **kotlin.Long** |  |  [optional]
**parent** | [**ChargingLog**](ChargingLog.md) |  |  [optional]
**paymentGateway** | [**inline**](#PaymentGatewayEnum) |  |  [optional]
**paymentId** | **kotlin.String** |  |  [optional]
**price** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**reason** | [**inline**](#ReasonEnum) |  |  [optional]
**serviceInstanceId** | **kotlin.Long** |  |  [optional]
**status** | [**inline**](#StatusEnum) |  |  [optional]
**subscriberSecureId** | **kotlin.String** |  |  [optional]
**subscriptionId** | **kotlin.Long** |  |  [optional]
**transactionId** | **kotlin.String** |  |  [optional]


<a name="PaymentGatewayEnum"></a>
## Enum: paymentGateway
Name | Value
---- | -----
paymentGateway | OFFLINE, IYZICO, PAYU


<a name="ReasonEnum"></a>
## Enum: reason
Name | Value
---- | -----
reason | START, RENEWAL, OVER_USAGE, REFUND


<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | NOT_PAID, SUCCESS, FAIL, REFUNDED



