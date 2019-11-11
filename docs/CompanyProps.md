
# CompanyProps

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billingDate** | **kotlin.Int** |  |  [optional]
**billingInformationMandatory** | **kotlin.Boolean** |  | 
**billingThresholdDays** | **kotlin.Int** |  |  [optional]
**branding** | **kotlin.Boolean** |  | 
**callbackUrl** | **kotlin.String** |  |  [optional]
**company** | [**Company**](Company.md) |  |  [optional]
**contactEmail** | **kotlin.String** |  |  [optional]
**domainName** | **kotlin.String** |  | 
**hostedPageCSSPath** | **kotlin.String** |  |  [optional]
**id** | **kotlin.Long** |  |  [optional]
**logoPath** | **kotlin.String** |  |  [optional]
**mobilExpressApiPassword** | **kotlin.String** |  |  [optional]
**mobilExpressMerchantKey** | **kotlin.String** |  |  [optional]
**mobilExpressPosid** | **kotlin.Int** |  |  [optional]
**mobilePaymentGateway** | [**inline**](#MobilePaymentGatewayEnum) |  |  [optional]
**notifyNewSubscription** | **kotlin.Boolean** |  | 
**notifyRenewal** | **kotlin.Boolean** |  | 
**notifySubscriptionCancellation** | **kotlin.Boolean** |  | 
**paymentGateway** | [**inline**](#PaymentGatewayEnum) |  |  [optional]
**paymentGatewayApiKey** | **kotlin.String** |  |  [optional]
**paymentGatewaySecurityKey** | **kotlin.String** |  |  [optional]
**paytrDirectApiEnabled** | **kotlin.Boolean** |  |  [optional]
**paytrMerchantId** | **kotlin.Int** |  |  [optional]
**payuMerchantKeyRenewals** | **kotlin.String** |  |  [optional]
**payuSecretKeyRenewals** | **kotlin.String** |  |  [optional]
**privacyPolicyUrl** | **kotlin.String** |  |  [optional]
**sendDailyReports** | **kotlin.String** |  |  [optional]
**subscreasyApiKey** | **kotlin.String** |  |  [optional]
**subscreasySecureKey** | **kotlin.String** |  |  [optional]
**wirecardErrorMessage** | **kotlin.String** |  |  [optional]
**wirecardPin** | **kotlin.String** |  |  [optional]
**wirecardSuccessfulMessage** | **kotlin.String** |  |  [optional]
**wirecardTurkcellServisId** | **kotlin.String** |  |  [optional]
**wirecardUserCode** | **kotlin.String** |  |  [optional]


<a name="MobilePaymentGatewayEnum"></a>
## Enum: mobilePaymentGateway
Name | Value
---- | -----
mobilePaymentGateway | DISABLED, WIRECARD


<a name="PaymentGatewayEnum"></a>
## Enum: paymentGateway
Name | Value
---- | -----
paymentGateway | OFFLINE, IYZICO, PAYU, PAYTR, MOBILEXPRESS



