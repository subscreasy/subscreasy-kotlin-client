# EndpointsNoAuthApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**startSubscription3dsUsingPOST**](EndpointsNoAuthApi.md#startSubscription3dsUsingPOST) | **POST** /na/subscription/start/4ds | startSubscription3ds


<a name="startSubscription3dsUsingPOST"></a>
# **startSubscription3dsUsingPOST**
> kotlin.String startSubscription3dsUsingPOST(offer.recurrence.id, offer.recurrence.recurrenceType, offer.recurrence.length, offer.company.address.id, offer.company.address.name, offer.company.address.streetAddress, offer.company.address.postalCode, offer.company.address.city, offer.company.address.stateProvince, offer.company.address.country, offer.company.address.companyId, offer.company.companyProps.id, offer.company.companyProps.callbackUrl, offer.company.companyProps.logoPath, offer.company.companyProps.hostedPageCSSPath, offer.company.companyProps.privacyPolicyUrl, offer.company.companyProps.subscreasyApiKey, offer.company.companyProps.subscreasySecureKey, offer.company.companyProps.paymentGateway, offer.company.companyProps.mobilePaymentGateway, offer.company.companyProps.wirecardUserCode, offer.company.companyProps.wirecardPin, offer.company.companyProps.wirecardTurkcellServisId, offer.company.companyProps.wirecardSuccessfulMessage, offer.company.companyProps.wirecardErrorMessage, offer.company.companyProps.paymentGatewayApiKey, offer.company.companyProps.paymentGatewaySecurityKey, offer.company.companyProps.payuMerchantKeyRenewals, offer.company.companyProps.payuSecretKeyRenewals, offer.company.companyProps.paytrMerchantId, offer.company.companyProps.mobilExpressMerchantKey, offer.company.companyProps.mobilExpressApiPassword, offer.company.companyProps.mobilExpressPosid, offer.company.companyProps.billingDate, offer.company.companyProps.billingThresholdDays, offer.company.companyProps.domainName, offer.company.companyProps.contactEmail, offer.company.companyProps.sendDailyReports, offer.company.companyProps.notifyNewSubscription, offer.company.companyProps.notifyRenewal, offer.company.companyProps.notifySubscriptionCancellation, offer.company.companyProps.branding, offer.company.companyProps.billingInformationMandatory, offer.company.id, offer.company.name, offer.company.siteName, offer.id, offer.secureId, offer.name, offer.description, offer.price, offer.currency, offer.multiplePurchase, offer.recurrenceCount, offer.trialPeriod, offer.productType, offer.renewalType, offer.disablePaymentForm, offer.createDate, offer.imagePath, subscriber.billingAddress.id, subscriber.billingAddress.name, subscriber.billingAddress.streetAddress, subscriber.billingAddress.postalCode, subscriber.billingAddress.city, subscriber.billingAddress.stateProvince, subscriber.billingAddress.country, subscriber.billingAddress.companyId, subscriber.shippingAddress.id, subscriber.shippingAddress.name, subscriber.shippingAddress.streetAddress, subscriber.shippingAddress.postalCode, subscriber.shippingAddress.city, subscriber.shippingAddress.stateProvince, subscriber.shippingAddress.country, subscriber.shippingAddress.companyId, subscriber.company.address.id, subscriber.company.address.name, subscriber.company.address.streetAddress, subscriber.company.address.postalCode, subscriber.company.address.city, subscriber.company.address.stateProvince, subscriber.company.address.country, subscriber.company.address.companyId, subscriber.company.companyProps.id, subscriber.company.companyProps.callbackUrl, subscriber.company.companyProps.logoPath, subscriber.company.companyProps.hostedPageCSSPath, subscriber.company.companyProps.privacyPolicyUrl, subscriber.company.companyProps.subscreasyApiKey, subscriber.company.companyProps.subscreasySecureKey, subscriber.company.companyProps.paymentGateway, subscriber.company.companyProps.mobilePaymentGateway, subscriber.company.companyProps.wirecardUserCode, subscriber.company.companyProps.wirecardPin, subscriber.company.companyProps.wirecardTurkcellServisId, subscriber.company.companyProps.wirecardSuccessfulMessage, subscriber.company.companyProps.wirecardErrorMessage, subscriber.company.companyProps.paymentGatewayApiKey, subscriber.company.companyProps.paymentGatewaySecurityKey, subscriber.company.companyProps.payuMerchantKeyRenewals, subscriber.company.companyProps.payuSecretKeyRenewals, subscriber.company.companyProps.paytrMerchantId, subscriber.company.companyProps.mobilExpressMerchantKey, subscriber.company.companyProps.mobilExpressApiPassword, subscriber.company.companyProps.mobilExpressPosid, subscriber.company.companyProps.billingDate, subscriber.company.companyProps.billingThresholdDays, subscriber.company.companyProps.domainName, subscriber.company.companyProps.contactEmail, subscriber.company.companyProps.sendDailyReports, subscriber.company.companyProps.notifyNewSubscription, subscriber.company.companyProps.notifyRenewal, subscriber.company.companyProps.notifySubscriptionCancellation, subscriber.company.companyProps.branding, subscriber.company.companyProps.billingInformationMandatory, subscriber.company.id, subscriber.company.name, subscriber.company.siteName, subscriber.id, subscriber.secureId, subscriber.merchantSubscriberId, subscriber.email, subscriber.name, subscriber.surname, subscriber.phoneNumber, subscriber.createDate, subscriber.identificationNo, subscriber.taxNumber, subscriber.taxAdministration, subscriber.worksFor, paymentCard.cardHolderName, paymentCard.cardNumber, paymentCard.expireYear, paymentCard.expireMonth, paymentCard.cvc, paymentCard.registerCard, paymentCard.cardAlias, paymentCard.cardToken, paymentCard.cardUserKey, paymentCard.cardFamily, subscriberFromDb.billingAddress.id, subscriberFromDb.billingAddress.name, subscriberFromDb.billingAddress.streetAddress, subscriberFromDb.billingAddress.postalCode, subscriberFromDb.billingAddress.city, subscriberFromDb.billingAddress.stateProvince, subscriberFromDb.billingAddress.country, subscriberFromDb.billingAddress.companyId, subscriberFromDb.shippingAddress.id, subscriberFromDb.shippingAddress.name, subscriberFromDb.shippingAddress.streetAddress, subscriberFromDb.shippingAddress.postalCode, subscriberFromDb.shippingAddress.city, subscriberFromDb.shippingAddress.stateProvince, subscriberFromDb.shippingAddress.country, subscriberFromDb.shippingAddress.companyId, subscriberFromDb.company.address.id, subscriberFromDb.company.address.name, subscriberFromDb.company.address.streetAddress, subscriberFromDb.company.address.postalCode, subscriberFromDb.company.address.city, subscriberFromDb.company.address.stateProvince, subscriberFromDb.company.address.country, subscriberFromDb.company.address.companyId, subscriberFromDb.company.companyProps.id, subscriberFromDb.company.companyProps.callbackUrl, subscriberFromDb.company.companyProps.logoPath, subscriberFromDb.company.companyProps.hostedPageCSSPath, subscriberFromDb.company.companyProps.privacyPolicyUrl, subscriberFromDb.company.companyProps.subscreasyApiKey, subscriberFromDb.company.companyProps.subscreasySecureKey, subscriberFromDb.company.companyProps.paymentGateway, subscriberFromDb.company.companyProps.mobilePaymentGateway, subscriberFromDb.company.companyProps.wirecardUserCode, subscriberFromDb.company.companyProps.wirecardPin, subscriberFromDb.company.companyProps.wirecardTurkcellServisId, subscriberFromDb.company.companyProps.wirecardSuccessfulMessage, subscriberFromDb.company.companyProps.wirecardErrorMessage, subscriberFromDb.company.companyProps.paymentGatewayApiKey, subscriberFromDb.company.companyProps.paymentGatewaySecurityKey, subscriberFromDb.company.companyProps.payuMerchantKeyRenewals, subscriberFromDb.company.companyProps.payuSecretKeyRenewals, subscriberFromDb.company.companyProps.paytrMerchantId, subscriberFromDb.company.companyProps.mobilExpressMerchantKey, subscriberFromDb.company.companyProps.mobilExpressApiPassword, subscriberFromDb.company.companyProps.mobilExpressPosid, subscriberFromDb.company.companyProps.billingDate, subscriberFromDb.company.companyProps.billingThresholdDays, subscriberFromDb.company.companyProps.domainName, subscriberFromDb.company.companyProps.contactEmail, subscriberFromDb.company.companyProps.sendDailyReports, subscriberFromDb.company.companyProps.notifyNewSubscription, subscriberFromDb.company.companyProps.notifyRenewal, subscriberFromDb.company.companyProps.notifySubscriptionCancellation, subscriberFromDb.company.companyProps.branding, subscriberFromDb.company.companyProps.billingInformationMandatory, subscriberFromDb.company.id, subscriberFromDb.company.name, subscriberFromDb.company.siteName, subscriberFromDb.id, subscriberFromDb.secureId, subscriberFromDb.merchantSubscriberId, subscriberFromDb.email, subscriberFromDb.name, subscriberFromDb.surname, subscriberFromDb.phoneNumber, subscriberFromDb.createDate, subscriberFromDb.identificationNo, subscriberFromDb.taxNumber, subscriberFromDb.taxAdministration, subscriberFromDb.worksFor, couponCode, callbackUrl, price, companySiteName, privacyPolicyUrl, paymentType, editable, productType)

startSubscription3ds

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import com.kodfarki.subscreasy.client.model.*

val apiInstance = EndpointsNoAuthApi()
val offer.recurrence.id : kotlin.Long = 789 // kotlin.Long | 
val offer.recurrence.recurrenceType : kotlin.String = offer.recurrence.recurrenceType_example // kotlin.String | 
val offer.recurrence.length : kotlin.Long = 789 // kotlin.Long | 
val offer.company.address.id : kotlin.Long = 789 // kotlin.Long | 
val offer.company.address.name : kotlin.String = offer.company.address.name_example // kotlin.String | 
val offer.company.address.streetAddress : kotlin.String = offer.company.address.streetAddress_example // kotlin.String | 
val offer.company.address.postalCode : kotlin.String = offer.company.address.postalCode_example // kotlin.String | 
val offer.company.address.city : kotlin.String = offer.company.address.city_example // kotlin.String | 
val offer.company.address.stateProvince : kotlin.String = offer.company.address.stateProvince_example // kotlin.String | 
val offer.company.address.country : kotlin.String = offer.company.address.country_example // kotlin.String | 
val offer.company.address.companyId : kotlin.Long = 789 // kotlin.Long | 
val offer.company.companyProps.id : kotlin.Long = 789 // kotlin.Long | 
val offer.company.companyProps.callbackUrl : kotlin.String = offer.company.companyProps.callbackUrl_example // kotlin.String | 
val offer.company.companyProps.logoPath : kotlin.String = offer.company.companyProps.logoPath_example // kotlin.String | 
val offer.company.companyProps.hostedPageCSSPath : kotlin.String = offer.company.companyProps.hostedPageCSSPath_example // kotlin.String | 
val offer.company.companyProps.privacyPolicyUrl : kotlin.String = offer.company.companyProps.privacyPolicyUrl_example // kotlin.String | 
val offer.company.companyProps.subscreasyApiKey : kotlin.String = offer.company.companyProps.subscreasyApiKey_example // kotlin.String | 
val offer.company.companyProps.subscreasySecureKey : kotlin.String = offer.company.companyProps.subscreasySecureKey_example // kotlin.String | 
val offer.company.companyProps.paymentGateway : kotlin.String = offer.company.companyProps.paymentGateway_example // kotlin.String | 
val offer.company.companyProps.mobilePaymentGateway : kotlin.String = offer.company.companyProps.mobilePaymentGateway_example // kotlin.String | 
val offer.company.companyProps.wirecardUserCode : kotlin.String = offer.company.companyProps.wirecardUserCode_example // kotlin.String | 
val offer.company.companyProps.wirecardPin : kotlin.String = offer.company.companyProps.wirecardPin_example // kotlin.String | 
val offer.company.companyProps.wirecardTurkcellServisId : kotlin.String = offer.company.companyProps.wirecardTurkcellServisId_example // kotlin.String | 
val offer.company.companyProps.wirecardSuccessfulMessage : kotlin.String = offer.company.companyProps.wirecardSuccessfulMessage_example // kotlin.String | 
val offer.company.companyProps.wirecardErrorMessage : kotlin.String = offer.company.companyProps.wirecardErrorMessage_example // kotlin.String | 
val offer.company.companyProps.paymentGatewayApiKey : kotlin.String = offer.company.companyProps.paymentGatewayApiKey_example // kotlin.String | 
val offer.company.companyProps.paymentGatewaySecurityKey : kotlin.String = offer.company.companyProps.paymentGatewaySecurityKey_example // kotlin.String | 
val offer.company.companyProps.payuMerchantKeyRenewals : kotlin.String = offer.company.companyProps.payuMerchantKeyRenewals_example // kotlin.String | 
val offer.company.companyProps.payuSecretKeyRenewals : kotlin.String = offer.company.companyProps.payuSecretKeyRenewals_example // kotlin.String | 
val offer.company.companyProps.paytrMerchantId : kotlin.Int = 56 // kotlin.Int | 
val offer.company.companyProps.mobilExpressMerchantKey : kotlin.String = offer.company.companyProps.mobilExpressMerchantKey_example // kotlin.String | 
val offer.company.companyProps.mobilExpressApiPassword : kotlin.String = offer.company.companyProps.mobilExpressApiPassword_example // kotlin.String | 
val offer.company.companyProps.mobilExpressPosid : kotlin.Int = 56 // kotlin.Int | 
val offer.company.companyProps.billingDate : kotlin.Int = 56 // kotlin.Int | 
val offer.company.companyProps.billingThresholdDays : kotlin.Int = 56 // kotlin.Int | 
val offer.company.companyProps.domainName : kotlin.String = offer.company.companyProps.domainName_example // kotlin.String | 
val offer.company.companyProps.contactEmail : kotlin.String = offer.company.companyProps.contactEmail_example // kotlin.String | 
val offer.company.companyProps.sendDailyReports : kotlin.String = offer.company.companyProps.sendDailyReports_example // kotlin.String | 
val offer.company.companyProps.notifyNewSubscription : kotlin.Boolean = true // kotlin.Boolean | 
val offer.company.companyProps.notifyRenewal : kotlin.Boolean = true // kotlin.Boolean | 
val offer.company.companyProps.notifySubscriptionCancellation : kotlin.Boolean = true // kotlin.Boolean | 
val offer.company.companyProps.branding : kotlin.Boolean = true // kotlin.Boolean | 
val offer.company.companyProps.billingInformationMandatory : kotlin.Boolean = true // kotlin.Boolean | 
val offer.company.id : kotlin.Long = 789 // kotlin.Long | 
val offer.company.name : kotlin.String = offer.company.name_example // kotlin.String | 
val offer.company.siteName : kotlin.String = offer.company.siteName_example // kotlin.String | 
val offer.id : kotlin.Long = 789 // kotlin.Long | 
val offer.secureId : kotlin.String = offer.secureId_example // kotlin.String | 
val offer.name : kotlin.String = offer.name_example // kotlin.String | 
val offer.description : kotlin.String = offer.description_example // kotlin.String | 
val offer.price : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val offer.currency : kotlin.String = offer.currency_example // kotlin.String | 
val offer.multiplePurchase : kotlin.Boolean = true // kotlin.Boolean | 
val offer.recurrenceCount : kotlin.Int = 56 // kotlin.Int | 
val offer.trialPeriod : kotlin.Int = 56 // kotlin.Int | 
val offer.productType : kotlin.String = offer.productType_example // kotlin.String | 
val offer.renewalType : kotlin.String = offer.renewalType_example // kotlin.String | 
val offer.disablePaymentForm : kotlin.Boolean = true // kotlin.Boolean | 
val offer.createDate : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val offer.imagePath : kotlin.String = offer.imagePath_example // kotlin.String | 
val subscriber.billingAddress.id : kotlin.Long = 789 // kotlin.Long | 
val subscriber.billingAddress.name : kotlin.String = subscriber.billingAddress.name_example // kotlin.String | 
val subscriber.billingAddress.streetAddress : kotlin.String = subscriber.billingAddress.streetAddress_example // kotlin.String | 
val subscriber.billingAddress.postalCode : kotlin.String = subscriber.billingAddress.postalCode_example // kotlin.String | 
val subscriber.billingAddress.city : kotlin.String = subscriber.billingAddress.city_example // kotlin.String | 
val subscriber.billingAddress.stateProvince : kotlin.String = subscriber.billingAddress.stateProvince_example // kotlin.String | 
val subscriber.billingAddress.country : kotlin.String = subscriber.billingAddress.country_example // kotlin.String | 
val subscriber.billingAddress.companyId : kotlin.Long = 789 // kotlin.Long | 
val subscriber.shippingAddress.id : kotlin.Long = 789 // kotlin.Long | 
val subscriber.shippingAddress.name : kotlin.String = subscriber.shippingAddress.name_example // kotlin.String | 
val subscriber.shippingAddress.streetAddress : kotlin.String = subscriber.shippingAddress.streetAddress_example // kotlin.String | 
val subscriber.shippingAddress.postalCode : kotlin.String = subscriber.shippingAddress.postalCode_example // kotlin.String | 
val subscriber.shippingAddress.city : kotlin.String = subscriber.shippingAddress.city_example // kotlin.String | 
val subscriber.shippingAddress.stateProvince : kotlin.String = subscriber.shippingAddress.stateProvince_example // kotlin.String | 
val subscriber.shippingAddress.country : kotlin.String = subscriber.shippingAddress.country_example // kotlin.String | 
val subscriber.shippingAddress.companyId : kotlin.Long = 789 // kotlin.Long | 
val subscriber.company.address.id : kotlin.Long = 789 // kotlin.Long | 
val subscriber.company.address.name : kotlin.String = subscriber.company.address.name_example // kotlin.String | 
val subscriber.company.address.streetAddress : kotlin.String = subscriber.company.address.streetAddress_example // kotlin.String | 
val subscriber.company.address.postalCode : kotlin.String = subscriber.company.address.postalCode_example // kotlin.String | 
val subscriber.company.address.city : kotlin.String = subscriber.company.address.city_example // kotlin.String | 
val subscriber.company.address.stateProvince : kotlin.String = subscriber.company.address.stateProvince_example // kotlin.String | 
val subscriber.company.address.country : kotlin.String = subscriber.company.address.country_example // kotlin.String | 
val subscriber.company.address.companyId : kotlin.Long = 789 // kotlin.Long | 
val subscriber.company.companyProps.id : kotlin.Long = 789 // kotlin.Long | 
val subscriber.company.companyProps.callbackUrl : kotlin.String = subscriber.company.companyProps.callbackUrl_example // kotlin.String | 
val subscriber.company.companyProps.logoPath : kotlin.String = subscriber.company.companyProps.logoPath_example // kotlin.String | 
val subscriber.company.companyProps.hostedPageCSSPath : kotlin.String = subscriber.company.companyProps.hostedPageCSSPath_example // kotlin.String | 
val subscriber.company.companyProps.privacyPolicyUrl : kotlin.String = subscriber.company.companyProps.privacyPolicyUrl_example // kotlin.String | 
val subscriber.company.companyProps.subscreasyApiKey : kotlin.String = subscriber.company.companyProps.subscreasyApiKey_example // kotlin.String | 
val subscriber.company.companyProps.subscreasySecureKey : kotlin.String = subscriber.company.companyProps.subscreasySecureKey_example // kotlin.String | 
val subscriber.company.companyProps.paymentGateway : kotlin.String = subscriber.company.companyProps.paymentGateway_example // kotlin.String | 
val subscriber.company.companyProps.mobilePaymentGateway : kotlin.String = subscriber.company.companyProps.mobilePaymentGateway_example // kotlin.String | 
val subscriber.company.companyProps.wirecardUserCode : kotlin.String = subscriber.company.companyProps.wirecardUserCode_example // kotlin.String | 
val subscriber.company.companyProps.wirecardPin : kotlin.String = subscriber.company.companyProps.wirecardPin_example // kotlin.String | 
val subscriber.company.companyProps.wirecardTurkcellServisId : kotlin.String = subscriber.company.companyProps.wirecardTurkcellServisId_example // kotlin.String | 
val subscriber.company.companyProps.wirecardSuccessfulMessage : kotlin.String = subscriber.company.companyProps.wirecardSuccessfulMessage_example // kotlin.String | 
val subscriber.company.companyProps.wirecardErrorMessage : kotlin.String = subscriber.company.companyProps.wirecardErrorMessage_example // kotlin.String | 
val subscriber.company.companyProps.paymentGatewayApiKey : kotlin.String = subscriber.company.companyProps.paymentGatewayApiKey_example // kotlin.String | 
val subscriber.company.companyProps.paymentGatewaySecurityKey : kotlin.String = subscriber.company.companyProps.paymentGatewaySecurityKey_example // kotlin.String | 
val subscriber.company.companyProps.payuMerchantKeyRenewals : kotlin.String = subscriber.company.companyProps.payuMerchantKeyRenewals_example // kotlin.String | 
val subscriber.company.companyProps.payuSecretKeyRenewals : kotlin.String = subscriber.company.companyProps.payuSecretKeyRenewals_example // kotlin.String | 
val subscriber.company.companyProps.paytrMerchantId : kotlin.Int = 56 // kotlin.Int | 
val subscriber.company.companyProps.mobilExpressMerchantKey : kotlin.String = subscriber.company.companyProps.mobilExpressMerchantKey_example // kotlin.String | 
val subscriber.company.companyProps.mobilExpressApiPassword : kotlin.String = subscriber.company.companyProps.mobilExpressApiPassword_example // kotlin.String | 
val subscriber.company.companyProps.mobilExpressPosid : kotlin.Int = 56 // kotlin.Int | 
val subscriber.company.companyProps.billingDate : kotlin.Int = 56 // kotlin.Int | 
val subscriber.company.companyProps.billingThresholdDays : kotlin.Int = 56 // kotlin.Int | 
val subscriber.company.companyProps.domainName : kotlin.String = subscriber.company.companyProps.domainName_example // kotlin.String | 
val subscriber.company.companyProps.contactEmail : kotlin.String = subscriber.company.companyProps.contactEmail_example // kotlin.String | 
val subscriber.company.companyProps.sendDailyReports : kotlin.String = subscriber.company.companyProps.sendDailyReports_example // kotlin.String | 
val subscriber.company.companyProps.notifyNewSubscription : kotlin.Boolean = true // kotlin.Boolean | 
val subscriber.company.companyProps.notifyRenewal : kotlin.Boolean = true // kotlin.Boolean | 
val subscriber.company.companyProps.notifySubscriptionCancellation : kotlin.Boolean = true // kotlin.Boolean | 
val subscriber.company.companyProps.branding : kotlin.Boolean = true // kotlin.Boolean | 
val subscriber.company.companyProps.billingInformationMandatory : kotlin.Boolean = true // kotlin.Boolean | 
val subscriber.company.id : kotlin.Long = 789 // kotlin.Long | 
val subscriber.company.name : kotlin.String = subscriber.company.name_example // kotlin.String | 
val subscriber.company.siteName : kotlin.String = subscriber.company.siteName_example // kotlin.String | 
val subscriber.id : kotlin.Long = 789 // kotlin.Long | 
val subscriber.secureId : kotlin.String = subscriber.secureId_example // kotlin.String | 
val subscriber.merchantSubscriberId : kotlin.String = subscriber.merchantSubscriberId_example // kotlin.String | 
val subscriber.email : kotlin.String = subscriber.email_example // kotlin.String | 
val subscriber.name : kotlin.String = subscriber.name_example // kotlin.String | 
val subscriber.surname : kotlin.String = subscriber.surname_example // kotlin.String | 
val subscriber.phoneNumber : kotlin.String = subscriber.phoneNumber_example // kotlin.String | 
val subscriber.createDate : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val subscriber.identificationNo : kotlin.String = subscriber.identificationNo_example // kotlin.String | 
val subscriber.taxNumber : kotlin.String = subscriber.taxNumber_example // kotlin.String | 
val subscriber.taxAdministration : kotlin.String = subscriber.taxAdministration_example // kotlin.String | 
val subscriber.worksFor : kotlin.String = subscriber.worksFor_example // kotlin.String | 
val paymentCard.cardHolderName : kotlin.String = paymentCard.cardHolderName_example // kotlin.String | 
val paymentCard.cardNumber : kotlin.String = paymentCard.cardNumber_example // kotlin.String | 
val paymentCard.expireYear : kotlin.String = paymentCard.expireYear_example // kotlin.String | 
val paymentCard.expireMonth : kotlin.String = paymentCard.expireMonth_example // kotlin.String | 
val paymentCard.cvc : kotlin.String = paymentCard.cvc_example // kotlin.String | 
val paymentCard.registerCard : kotlin.Int = 56 // kotlin.Int | 
val paymentCard.cardAlias : kotlin.String = paymentCard.cardAlias_example // kotlin.String | 
val paymentCard.cardToken : kotlin.String = paymentCard.cardToken_example // kotlin.String | 
val paymentCard.cardUserKey : kotlin.String = paymentCard.cardUserKey_example // kotlin.String | 
val paymentCard.cardFamily : kotlin.String = paymentCard.cardFamily_example // kotlin.String | 
val subscriberFromDb.billingAddress.id : kotlin.Long = 789 // kotlin.Long | 
val subscriberFromDb.billingAddress.name : kotlin.String = subscriberFromDb.billingAddress.name_example // kotlin.String | 
val subscriberFromDb.billingAddress.streetAddress : kotlin.String = subscriberFromDb.billingAddress.streetAddress_example // kotlin.String | 
val subscriberFromDb.billingAddress.postalCode : kotlin.String = subscriberFromDb.billingAddress.postalCode_example // kotlin.String | 
val subscriberFromDb.billingAddress.city : kotlin.String = subscriberFromDb.billingAddress.city_example // kotlin.String | 
val subscriberFromDb.billingAddress.stateProvince : kotlin.String = subscriberFromDb.billingAddress.stateProvince_example // kotlin.String | 
val subscriberFromDb.billingAddress.country : kotlin.String = subscriberFromDb.billingAddress.country_example // kotlin.String | 
val subscriberFromDb.billingAddress.companyId : kotlin.Long = 789 // kotlin.Long | 
val subscriberFromDb.shippingAddress.id : kotlin.Long = 789 // kotlin.Long | 
val subscriberFromDb.shippingAddress.name : kotlin.String = subscriberFromDb.shippingAddress.name_example // kotlin.String | 
val subscriberFromDb.shippingAddress.streetAddress : kotlin.String = subscriberFromDb.shippingAddress.streetAddress_example // kotlin.String | 
val subscriberFromDb.shippingAddress.postalCode : kotlin.String = subscriberFromDb.shippingAddress.postalCode_example // kotlin.String | 
val subscriberFromDb.shippingAddress.city : kotlin.String = subscriberFromDb.shippingAddress.city_example // kotlin.String | 
val subscriberFromDb.shippingAddress.stateProvince : kotlin.String = subscriberFromDb.shippingAddress.stateProvince_example // kotlin.String | 
val subscriberFromDb.shippingAddress.country : kotlin.String = subscriberFromDb.shippingAddress.country_example // kotlin.String | 
val subscriberFromDb.shippingAddress.companyId : kotlin.Long = 789 // kotlin.Long | 
val subscriberFromDb.company.address.id : kotlin.Long = 789 // kotlin.Long | 
val subscriberFromDb.company.address.name : kotlin.String = subscriberFromDb.company.address.name_example // kotlin.String | 
val subscriberFromDb.company.address.streetAddress : kotlin.String = subscriberFromDb.company.address.streetAddress_example // kotlin.String | 
val subscriberFromDb.company.address.postalCode : kotlin.String = subscriberFromDb.company.address.postalCode_example // kotlin.String | 
val subscriberFromDb.company.address.city : kotlin.String = subscriberFromDb.company.address.city_example // kotlin.String | 
val subscriberFromDb.company.address.stateProvince : kotlin.String = subscriberFromDb.company.address.stateProvince_example // kotlin.String | 
val subscriberFromDb.company.address.country : kotlin.String = subscriberFromDb.company.address.country_example // kotlin.String | 
val subscriberFromDb.company.address.companyId : kotlin.Long = 789 // kotlin.Long | 
val subscriberFromDb.company.companyProps.id : kotlin.Long = 789 // kotlin.Long | 
val subscriberFromDb.company.companyProps.callbackUrl : kotlin.String = subscriberFromDb.company.companyProps.callbackUrl_example // kotlin.String | 
val subscriberFromDb.company.companyProps.logoPath : kotlin.String = subscriberFromDb.company.companyProps.logoPath_example // kotlin.String | 
val subscriberFromDb.company.companyProps.hostedPageCSSPath : kotlin.String = subscriberFromDb.company.companyProps.hostedPageCSSPath_example // kotlin.String | 
val subscriberFromDb.company.companyProps.privacyPolicyUrl : kotlin.String = subscriberFromDb.company.companyProps.privacyPolicyUrl_example // kotlin.String | 
val subscriberFromDb.company.companyProps.subscreasyApiKey : kotlin.String = subscriberFromDb.company.companyProps.subscreasyApiKey_example // kotlin.String | 
val subscriberFromDb.company.companyProps.subscreasySecureKey : kotlin.String = subscriberFromDb.company.companyProps.subscreasySecureKey_example // kotlin.String | 
val subscriberFromDb.company.companyProps.paymentGateway : kotlin.String = subscriberFromDb.company.companyProps.paymentGateway_example // kotlin.String | 
val subscriberFromDb.company.companyProps.mobilePaymentGateway : kotlin.String = subscriberFromDb.company.companyProps.mobilePaymentGateway_example // kotlin.String | 
val subscriberFromDb.company.companyProps.wirecardUserCode : kotlin.String = subscriberFromDb.company.companyProps.wirecardUserCode_example // kotlin.String | 
val subscriberFromDb.company.companyProps.wirecardPin : kotlin.String = subscriberFromDb.company.companyProps.wirecardPin_example // kotlin.String | 
val subscriberFromDb.company.companyProps.wirecardTurkcellServisId : kotlin.String = subscriberFromDb.company.companyProps.wirecardTurkcellServisId_example // kotlin.String | 
val subscriberFromDb.company.companyProps.wirecardSuccessfulMessage : kotlin.String = subscriberFromDb.company.companyProps.wirecardSuccessfulMessage_example // kotlin.String | 
val subscriberFromDb.company.companyProps.wirecardErrorMessage : kotlin.String = subscriberFromDb.company.companyProps.wirecardErrorMessage_example // kotlin.String | 
val subscriberFromDb.company.companyProps.paymentGatewayApiKey : kotlin.String = subscriberFromDb.company.companyProps.paymentGatewayApiKey_example // kotlin.String | 
val subscriberFromDb.company.companyProps.paymentGatewaySecurityKey : kotlin.String = subscriberFromDb.company.companyProps.paymentGatewaySecurityKey_example // kotlin.String | 
val subscriberFromDb.company.companyProps.payuMerchantKeyRenewals : kotlin.String = subscriberFromDb.company.companyProps.payuMerchantKeyRenewals_example // kotlin.String | 
val subscriberFromDb.company.companyProps.payuSecretKeyRenewals : kotlin.String = subscriberFromDb.company.companyProps.payuSecretKeyRenewals_example // kotlin.String | 
val subscriberFromDb.company.companyProps.paytrMerchantId : kotlin.Int = 56 // kotlin.Int | 
val subscriberFromDb.company.companyProps.mobilExpressMerchantKey : kotlin.String = subscriberFromDb.company.companyProps.mobilExpressMerchantKey_example // kotlin.String | 
val subscriberFromDb.company.companyProps.mobilExpressApiPassword : kotlin.String = subscriberFromDb.company.companyProps.mobilExpressApiPassword_example // kotlin.String | 
val subscriberFromDb.company.companyProps.mobilExpressPosid : kotlin.Int = 56 // kotlin.Int | 
val subscriberFromDb.company.companyProps.billingDate : kotlin.Int = 56 // kotlin.Int | 
val subscriberFromDb.company.companyProps.billingThresholdDays : kotlin.Int = 56 // kotlin.Int | 
val subscriberFromDb.company.companyProps.domainName : kotlin.String = subscriberFromDb.company.companyProps.domainName_example // kotlin.String | 
val subscriberFromDb.company.companyProps.contactEmail : kotlin.String = subscriberFromDb.company.companyProps.contactEmail_example // kotlin.String | 
val subscriberFromDb.company.companyProps.sendDailyReports : kotlin.String = subscriberFromDb.company.companyProps.sendDailyReports_example // kotlin.String | 
val subscriberFromDb.company.companyProps.notifyNewSubscription : kotlin.Boolean = true // kotlin.Boolean | 
val subscriberFromDb.company.companyProps.notifyRenewal : kotlin.Boolean = true // kotlin.Boolean | 
val subscriberFromDb.company.companyProps.notifySubscriptionCancellation : kotlin.Boolean = true // kotlin.Boolean | 
val subscriberFromDb.company.companyProps.branding : kotlin.Boolean = true // kotlin.Boolean | 
val subscriberFromDb.company.companyProps.billingInformationMandatory : kotlin.Boolean = true // kotlin.Boolean | 
val subscriberFromDb.company.id : kotlin.Long = 789 // kotlin.Long | 
val subscriberFromDb.company.name : kotlin.String = subscriberFromDb.company.name_example // kotlin.String | 
val subscriberFromDb.company.siteName : kotlin.String = subscriberFromDb.company.siteName_example // kotlin.String | 
val subscriberFromDb.id : kotlin.Long = 789 // kotlin.Long | 
val subscriberFromDb.secureId : kotlin.String = subscriberFromDb.secureId_example // kotlin.String | 
val subscriberFromDb.merchantSubscriberId : kotlin.String = subscriberFromDb.merchantSubscriberId_example // kotlin.String | 
val subscriberFromDb.email : kotlin.String = subscriberFromDb.email_example // kotlin.String | 
val subscriberFromDb.name : kotlin.String = subscriberFromDb.name_example // kotlin.String | 
val subscriberFromDb.surname : kotlin.String = subscriberFromDb.surname_example // kotlin.String | 
val subscriberFromDb.phoneNumber : kotlin.String = subscriberFromDb.phoneNumber_example // kotlin.String | 
val subscriberFromDb.createDate : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | 
val subscriberFromDb.identificationNo : kotlin.String = subscriberFromDb.identificationNo_example // kotlin.String | 
val subscriberFromDb.taxNumber : kotlin.String = subscriberFromDb.taxNumber_example // kotlin.String | 
val subscriberFromDb.taxAdministration : kotlin.String = subscriberFromDb.taxAdministration_example // kotlin.String | 
val subscriberFromDb.worksFor : kotlin.String = subscriberFromDb.worksFor_example // kotlin.String | 
val couponCode : kotlin.String = couponCode_example // kotlin.String | 
val callbackUrl : kotlin.String = callbackUrl_example // kotlin.String | 
val price : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val companySiteName : kotlin.String = companySiteName_example // kotlin.String | 
val privacyPolicyUrl : kotlin.Boolean = true // kotlin.Boolean | 
val paymentType : kotlin.String = paymentType_example // kotlin.String | 
val editable : kotlin.Boolean = true // kotlin.Boolean | 
val productType : kotlin.String = productType_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.startSubscription3dsUsingPOST(offer.recurrence.id, offer.recurrence.recurrenceType, offer.recurrence.length, offer.company.address.id, offer.company.address.name, offer.company.address.streetAddress, offer.company.address.postalCode, offer.company.address.city, offer.company.address.stateProvince, offer.company.address.country, offer.company.address.companyId, offer.company.companyProps.id, offer.company.companyProps.callbackUrl, offer.company.companyProps.logoPath, offer.company.companyProps.hostedPageCSSPath, offer.company.companyProps.privacyPolicyUrl, offer.company.companyProps.subscreasyApiKey, offer.company.companyProps.subscreasySecureKey, offer.company.companyProps.paymentGateway, offer.company.companyProps.mobilePaymentGateway, offer.company.companyProps.wirecardUserCode, offer.company.companyProps.wirecardPin, offer.company.companyProps.wirecardTurkcellServisId, offer.company.companyProps.wirecardSuccessfulMessage, offer.company.companyProps.wirecardErrorMessage, offer.company.companyProps.paymentGatewayApiKey, offer.company.companyProps.paymentGatewaySecurityKey, offer.company.companyProps.payuMerchantKeyRenewals, offer.company.companyProps.payuSecretKeyRenewals, offer.company.companyProps.paytrMerchantId, offer.company.companyProps.mobilExpressMerchantKey, offer.company.companyProps.mobilExpressApiPassword, offer.company.companyProps.mobilExpressPosid, offer.company.companyProps.billingDate, offer.company.companyProps.billingThresholdDays, offer.company.companyProps.domainName, offer.company.companyProps.contactEmail, offer.company.companyProps.sendDailyReports, offer.company.companyProps.notifyNewSubscription, offer.company.companyProps.notifyRenewal, offer.company.companyProps.notifySubscriptionCancellation, offer.company.companyProps.branding, offer.company.companyProps.billingInformationMandatory, offer.company.id, offer.company.name, offer.company.siteName, offer.id, offer.secureId, offer.name, offer.description, offer.price, offer.currency, offer.multiplePurchase, offer.recurrenceCount, offer.trialPeriod, offer.productType, offer.renewalType, offer.disablePaymentForm, offer.createDate, offer.imagePath, subscriber.billingAddress.id, subscriber.billingAddress.name, subscriber.billingAddress.streetAddress, subscriber.billingAddress.postalCode, subscriber.billingAddress.city, subscriber.billingAddress.stateProvince, subscriber.billingAddress.country, subscriber.billingAddress.companyId, subscriber.shippingAddress.id, subscriber.shippingAddress.name, subscriber.shippingAddress.streetAddress, subscriber.shippingAddress.postalCode, subscriber.shippingAddress.city, subscriber.shippingAddress.stateProvince, subscriber.shippingAddress.country, subscriber.shippingAddress.companyId, subscriber.company.address.id, subscriber.company.address.name, subscriber.company.address.streetAddress, subscriber.company.address.postalCode, subscriber.company.address.city, subscriber.company.address.stateProvince, subscriber.company.address.country, subscriber.company.address.companyId, subscriber.company.companyProps.id, subscriber.company.companyProps.callbackUrl, subscriber.company.companyProps.logoPath, subscriber.company.companyProps.hostedPageCSSPath, subscriber.company.companyProps.privacyPolicyUrl, subscriber.company.companyProps.subscreasyApiKey, subscriber.company.companyProps.subscreasySecureKey, subscriber.company.companyProps.paymentGateway, subscriber.company.companyProps.mobilePaymentGateway, subscriber.company.companyProps.wirecardUserCode, subscriber.company.companyProps.wirecardPin, subscriber.company.companyProps.wirecardTurkcellServisId, subscriber.company.companyProps.wirecardSuccessfulMessage, subscriber.company.companyProps.wirecardErrorMessage, subscriber.company.companyProps.paymentGatewayApiKey, subscriber.company.companyProps.paymentGatewaySecurityKey, subscriber.company.companyProps.payuMerchantKeyRenewals, subscriber.company.companyProps.payuSecretKeyRenewals, subscriber.company.companyProps.paytrMerchantId, subscriber.company.companyProps.mobilExpressMerchantKey, subscriber.company.companyProps.mobilExpressApiPassword, subscriber.company.companyProps.mobilExpressPosid, subscriber.company.companyProps.billingDate, subscriber.company.companyProps.billingThresholdDays, subscriber.company.companyProps.domainName, subscriber.company.companyProps.contactEmail, subscriber.company.companyProps.sendDailyReports, subscriber.company.companyProps.notifyNewSubscription, subscriber.company.companyProps.notifyRenewal, subscriber.company.companyProps.notifySubscriptionCancellation, subscriber.company.companyProps.branding, subscriber.company.companyProps.billingInformationMandatory, subscriber.company.id, subscriber.company.name, subscriber.company.siteName, subscriber.id, subscriber.secureId, subscriber.merchantSubscriberId, subscriber.email, subscriber.name, subscriber.surname, subscriber.phoneNumber, subscriber.createDate, subscriber.identificationNo, subscriber.taxNumber, subscriber.taxAdministration, subscriber.worksFor, paymentCard.cardHolderName, paymentCard.cardNumber, paymentCard.expireYear, paymentCard.expireMonth, paymentCard.cvc, paymentCard.registerCard, paymentCard.cardAlias, paymentCard.cardToken, paymentCard.cardUserKey, paymentCard.cardFamily, subscriberFromDb.billingAddress.id, subscriberFromDb.billingAddress.name, subscriberFromDb.billingAddress.streetAddress, subscriberFromDb.billingAddress.postalCode, subscriberFromDb.billingAddress.city, subscriberFromDb.billingAddress.stateProvince, subscriberFromDb.billingAddress.country, subscriberFromDb.billingAddress.companyId, subscriberFromDb.shippingAddress.id, subscriberFromDb.shippingAddress.name, subscriberFromDb.shippingAddress.streetAddress, subscriberFromDb.shippingAddress.postalCode, subscriberFromDb.shippingAddress.city, subscriberFromDb.shippingAddress.stateProvince, subscriberFromDb.shippingAddress.country, subscriberFromDb.shippingAddress.companyId, subscriberFromDb.company.address.id, subscriberFromDb.company.address.name, subscriberFromDb.company.address.streetAddress, subscriberFromDb.company.address.postalCode, subscriberFromDb.company.address.city, subscriberFromDb.company.address.stateProvince, subscriberFromDb.company.address.country, subscriberFromDb.company.address.companyId, subscriberFromDb.company.companyProps.id, subscriberFromDb.company.companyProps.callbackUrl, subscriberFromDb.company.companyProps.logoPath, subscriberFromDb.company.companyProps.hostedPageCSSPath, subscriberFromDb.company.companyProps.privacyPolicyUrl, subscriberFromDb.company.companyProps.subscreasyApiKey, subscriberFromDb.company.companyProps.subscreasySecureKey, subscriberFromDb.company.companyProps.paymentGateway, subscriberFromDb.company.companyProps.mobilePaymentGateway, subscriberFromDb.company.companyProps.wirecardUserCode, subscriberFromDb.company.companyProps.wirecardPin, subscriberFromDb.company.companyProps.wirecardTurkcellServisId, subscriberFromDb.company.companyProps.wirecardSuccessfulMessage, subscriberFromDb.company.companyProps.wirecardErrorMessage, subscriberFromDb.company.companyProps.paymentGatewayApiKey, subscriberFromDb.company.companyProps.paymentGatewaySecurityKey, subscriberFromDb.company.companyProps.payuMerchantKeyRenewals, subscriberFromDb.company.companyProps.payuSecretKeyRenewals, subscriberFromDb.company.companyProps.paytrMerchantId, subscriberFromDb.company.companyProps.mobilExpressMerchantKey, subscriberFromDb.company.companyProps.mobilExpressApiPassword, subscriberFromDb.company.companyProps.mobilExpressPosid, subscriberFromDb.company.companyProps.billingDate, subscriberFromDb.company.companyProps.billingThresholdDays, subscriberFromDb.company.companyProps.domainName, subscriberFromDb.company.companyProps.contactEmail, subscriberFromDb.company.companyProps.sendDailyReports, subscriberFromDb.company.companyProps.notifyNewSubscription, subscriberFromDb.company.companyProps.notifyRenewal, subscriberFromDb.company.companyProps.notifySubscriptionCancellation, subscriberFromDb.company.companyProps.branding, subscriberFromDb.company.companyProps.billingInformationMandatory, subscriberFromDb.company.id, subscriberFromDb.company.name, subscriberFromDb.company.siteName, subscriberFromDb.id, subscriberFromDb.secureId, subscriberFromDb.merchantSubscriberId, subscriberFromDb.email, subscriberFromDb.name, subscriberFromDb.surname, subscriberFromDb.phoneNumber, subscriberFromDb.createDate, subscriberFromDb.identificationNo, subscriberFromDb.taxNumber, subscriberFromDb.taxAdministration, subscriberFromDb.worksFor, couponCode, callbackUrl, price, companySiteName, privacyPolicyUrl, paymentType, editable, productType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EndpointsNoAuthApi#startSubscription3dsUsingPOST")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EndpointsNoAuthApi#startSubscription3dsUsingPOST")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offer.recurrence.id** | **kotlin.Long**|  | [optional]
 **offer.recurrence.recurrenceType** | **kotlin.String**|  | [optional] [enum: SECONDLY, MINUTELY, HOURLY, DAILY, WEEKLY, MONTHLY, YEARLY]
 **offer.recurrence.length** | **kotlin.Long**|  | [optional]
 **offer.company.address.id** | **kotlin.Long**|  | [optional]
 **offer.company.address.name** | **kotlin.String**|  | [optional]
 **offer.company.address.streetAddress** | **kotlin.String**|  | [optional]
 **offer.company.address.postalCode** | **kotlin.String**|  | [optional]
 **offer.company.address.city** | **kotlin.String**|  | [optional]
 **offer.company.address.stateProvince** | **kotlin.String**|  | [optional]
 **offer.company.address.country** | **kotlin.String**|  | [optional]
 **offer.company.address.companyId** | **kotlin.Long**|  | [optional]
 **offer.company.companyProps.id** | **kotlin.Long**|  | [optional]
 **offer.company.companyProps.callbackUrl** | **kotlin.String**|  | [optional]
 **offer.company.companyProps.logoPath** | **kotlin.String**|  | [optional]
 **offer.company.companyProps.hostedPageCSSPath** | **kotlin.String**|  | [optional]
 **offer.company.companyProps.privacyPolicyUrl** | **kotlin.String**|  | [optional]
 **offer.company.companyProps.subscreasyApiKey** | **kotlin.String**|  | [optional]
 **offer.company.companyProps.subscreasySecureKey** | **kotlin.String**|  | [optional]
 **offer.company.companyProps.paymentGateway** | **kotlin.String**|  | [optional] [enum: OFFLINE, IYZICO, PAYU, PAYTR, MOBILEXPRESS]
 **offer.company.companyProps.mobilePaymentGateway** | **kotlin.String**|  | [optional] [enum: DISABLED, WIRECARD]
 **offer.company.companyProps.wirecardUserCode** | **kotlin.String**|  | [optional]
 **offer.company.companyProps.wirecardPin** | **kotlin.String**|  | [optional]
 **offer.company.companyProps.wirecardTurkcellServisId** | **kotlin.String**|  | [optional]
 **offer.company.companyProps.wirecardSuccessfulMessage** | **kotlin.String**|  | [optional]
 **offer.company.companyProps.wirecardErrorMessage** | **kotlin.String**|  | [optional]
 **offer.company.companyProps.paymentGatewayApiKey** | **kotlin.String**|  | [optional]
 **offer.company.companyProps.paymentGatewaySecurityKey** | **kotlin.String**|  | [optional]
 **offer.company.companyProps.payuMerchantKeyRenewals** | **kotlin.String**|  | [optional]
 **offer.company.companyProps.payuSecretKeyRenewals** | **kotlin.String**|  | [optional]
 **offer.company.companyProps.paytrMerchantId** | **kotlin.Int**|  | [optional]
 **offer.company.companyProps.mobilExpressMerchantKey** | **kotlin.String**|  | [optional]
 **offer.company.companyProps.mobilExpressApiPassword** | **kotlin.String**|  | [optional]
 **offer.company.companyProps.mobilExpressPosid** | **kotlin.Int**|  | [optional]
 **offer.company.companyProps.billingDate** | **kotlin.Int**|  | [optional]
 **offer.company.companyProps.billingThresholdDays** | **kotlin.Int**|  | [optional]
 **offer.company.companyProps.domainName** | **kotlin.String**|  | [optional]
 **offer.company.companyProps.contactEmail** | **kotlin.String**|  | [optional]
 **offer.company.companyProps.sendDailyReports** | **kotlin.String**|  | [optional]
 **offer.company.companyProps.notifyNewSubscription** | **kotlin.Boolean**|  | [optional]
 **offer.company.companyProps.notifyRenewal** | **kotlin.Boolean**|  | [optional]
 **offer.company.companyProps.notifySubscriptionCancellation** | **kotlin.Boolean**|  | [optional]
 **offer.company.companyProps.branding** | **kotlin.Boolean**|  | [optional]
 **offer.company.companyProps.billingInformationMandatory** | **kotlin.Boolean**|  | [optional]
 **offer.company.id** | **kotlin.Long**|  | [optional]
 **offer.company.name** | **kotlin.String**|  | [optional]
 **offer.company.siteName** | **kotlin.String**|  | [optional]
 **offer.id** | **kotlin.Long**|  | [optional]
 **offer.secureId** | **kotlin.String**|  | [optional]
 **offer.name** | **kotlin.String**|  | [optional]
 **offer.description** | **kotlin.String**|  | [optional]
 **offer.price** | **java.math.BigDecimal**|  | [optional]
 **offer.currency** | **kotlin.String**|  | [optional] [enum: TRY, USD]
 **offer.multiplePurchase** | **kotlin.Boolean**|  | [optional]
 **offer.recurrenceCount** | **kotlin.Int**|  | [optional]
 **offer.trialPeriod** | **kotlin.Int**|  | [optional]
 **offer.productType** | **kotlin.String**|  | [optional] [enum: PHYSICAL, SERVICE]
 **offer.renewalType** | **kotlin.String**|  | [optional] [enum: BILLCYCLE, START_DATE]
 **offer.disablePaymentForm** | **kotlin.Boolean**|  | [optional]
 **offer.createDate** | **java.time.LocalDateTime**|  | [optional]
 **offer.imagePath** | **kotlin.String**|  | [optional]
 **subscriber.billingAddress.id** | **kotlin.Long**|  | [optional]
 **subscriber.billingAddress.name** | **kotlin.String**|  | [optional]
 **subscriber.billingAddress.streetAddress** | **kotlin.String**|  | [optional]
 **subscriber.billingAddress.postalCode** | **kotlin.String**|  | [optional]
 **subscriber.billingAddress.city** | **kotlin.String**|  | [optional]
 **subscriber.billingAddress.stateProvince** | **kotlin.String**|  | [optional]
 **subscriber.billingAddress.country** | **kotlin.String**|  | [optional]
 **subscriber.billingAddress.companyId** | **kotlin.Long**|  | [optional]
 **subscriber.shippingAddress.id** | **kotlin.Long**|  | [optional]
 **subscriber.shippingAddress.name** | **kotlin.String**|  | [optional]
 **subscriber.shippingAddress.streetAddress** | **kotlin.String**|  | [optional]
 **subscriber.shippingAddress.postalCode** | **kotlin.String**|  | [optional]
 **subscriber.shippingAddress.city** | **kotlin.String**|  | [optional]
 **subscriber.shippingAddress.stateProvince** | **kotlin.String**|  | [optional]
 **subscriber.shippingAddress.country** | **kotlin.String**|  | [optional]
 **subscriber.shippingAddress.companyId** | **kotlin.Long**|  | [optional]
 **subscriber.company.address.id** | **kotlin.Long**|  | [optional]
 **subscriber.company.address.name** | **kotlin.String**|  | [optional]
 **subscriber.company.address.streetAddress** | **kotlin.String**|  | [optional]
 **subscriber.company.address.postalCode** | **kotlin.String**|  | [optional]
 **subscriber.company.address.city** | **kotlin.String**|  | [optional]
 **subscriber.company.address.stateProvince** | **kotlin.String**|  | [optional]
 **subscriber.company.address.country** | **kotlin.String**|  | [optional]
 **subscriber.company.address.companyId** | **kotlin.Long**|  | [optional]
 **subscriber.company.companyProps.id** | **kotlin.Long**|  | [optional]
 **subscriber.company.companyProps.callbackUrl** | **kotlin.String**|  | [optional]
 **subscriber.company.companyProps.logoPath** | **kotlin.String**|  | [optional]
 **subscriber.company.companyProps.hostedPageCSSPath** | **kotlin.String**|  | [optional]
 **subscriber.company.companyProps.privacyPolicyUrl** | **kotlin.String**|  | [optional]
 **subscriber.company.companyProps.subscreasyApiKey** | **kotlin.String**|  | [optional]
 **subscriber.company.companyProps.subscreasySecureKey** | **kotlin.String**|  | [optional]
 **subscriber.company.companyProps.paymentGateway** | **kotlin.String**|  | [optional] [enum: OFFLINE, IYZICO, PAYU, PAYTR, MOBILEXPRESS]
 **subscriber.company.companyProps.mobilePaymentGateway** | **kotlin.String**|  | [optional] [enum: DISABLED, WIRECARD]
 **subscriber.company.companyProps.wirecardUserCode** | **kotlin.String**|  | [optional]
 **subscriber.company.companyProps.wirecardPin** | **kotlin.String**|  | [optional]
 **subscriber.company.companyProps.wirecardTurkcellServisId** | **kotlin.String**|  | [optional]
 **subscriber.company.companyProps.wirecardSuccessfulMessage** | **kotlin.String**|  | [optional]
 **subscriber.company.companyProps.wirecardErrorMessage** | **kotlin.String**|  | [optional]
 **subscriber.company.companyProps.paymentGatewayApiKey** | **kotlin.String**|  | [optional]
 **subscriber.company.companyProps.paymentGatewaySecurityKey** | **kotlin.String**|  | [optional]
 **subscriber.company.companyProps.payuMerchantKeyRenewals** | **kotlin.String**|  | [optional]
 **subscriber.company.companyProps.payuSecretKeyRenewals** | **kotlin.String**|  | [optional]
 **subscriber.company.companyProps.paytrMerchantId** | **kotlin.Int**|  | [optional]
 **subscriber.company.companyProps.mobilExpressMerchantKey** | **kotlin.String**|  | [optional]
 **subscriber.company.companyProps.mobilExpressApiPassword** | **kotlin.String**|  | [optional]
 **subscriber.company.companyProps.mobilExpressPosid** | **kotlin.Int**|  | [optional]
 **subscriber.company.companyProps.billingDate** | **kotlin.Int**|  | [optional]
 **subscriber.company.companyProps.billingThresholdDays** | **kotlin.Int**|  | [optional]
 **subscriber.company.companyProps.domainName** | **kotlin.String**|  | [optional]
 **subscriber.company.companyProps.contactEmail** | **kotlin.String**|  | [optional]
 **subscriber.company.companyProps.sendDailyReports** | **kotlin.String**|  | [optional]
 **subscriber.company.companyProps.notifyNewSubscription** | **kotlin.Boolean**|  | [optional]
 **subscriber.company.companyProps.notifyRenewal** | **kotlin.Boolean**|  | [optional]
 **subscriber.company.companyProps.notifySubscriptionCancellation** | **kotlin.Boolean**|  | [optional]
 **subscriber.company.companyProps.branding** | **kotlin.Boolean**|  | [optional]
 **subscriber.company.companyProps.billingInformationMandatory** | **kotlin.Boolean**|  | [optional]
 **subscriber.company.id** | **kotlin.Long**|  | [optional]
 **subscriber.company.name** | **kotlin.String**|  | [optional]
 **subscriber.company.siteName** | **kotlin.String**|  | [optional]
 **subscriber.id** | **kotlin.Long**|  | [optional]
 **subscriber.secureId** | **kotlin.String**|  | [optional]
 **subscriber.merchantSubscriberId** | **kotlin.String**|  | [optional]
 **subscriber.email** | **kotlin.String**|  | [optional]
 **subscriber.name** | **kotlin.String**|  | [optional]
 **subscriber.surname** | **kotlin.String**|  | [optional]
 **subscriber.phoneNumber** | **kotlin.String**|  | [optional]
 **subscriber.createDate** | **java.time.LocalDateTime**|  | [optional]
 **subscriber.identificationNo** | **kotlin.String**|  | [optional]
 **subscriber.taxNumber** | **kotlin.String**|  | [optional]
 **subscriber.taxAdministration** | **kotlin.String**|  | [optional]
 **subscriber.worksFor** | **kotlin.String**|  | [optional]
 **paymentCard.cardHolderName** | **kotlin.String**|  | [optional]
 **paymentCard.cardNumber** | **kotlin.String**|  | [optional]
 **paymentCard.expireYear** | **kotlin.String**|  | [optional]
 **paymentCard.expireMonth** | **kotlin.String**|  | [optional]
 **paymentCard.cvc** | **kotlin.String**|  | [optional]
 **paymentCard.registerCard** | **kotlin.Int**|  | [optional]
 **paymentCard.cardAlias** | **kotlin.String**|  | [optional]
 **paymentCard.cardToken** | **kotlin.String**|  | [optional]
 **paymentCard.cardUserKey** | **kotlin.String**|  | [optional]
 **paymentCard.cardFamily** | **kotlin.String**|  | [optional]
 **subscriberFromDb.billingAddress.id** | **kotlin.Long**|  | [optional]
 **subscriberFromDb.billingAddress.name** | **kotlin.String**|  | [optional]
 **subscriberFromDb.billingAddress.streetAddress** | **kotlin.String**|  | [optional]
 **subscriberFromDb.billingAddress.postalCode** | **kotlin.String**|  | [optional]
 **subscriberFromDb.billingAddress.city** | **kotlin.String**|  | [optional]
 **subscriberFromDb.billingAddress.stateProvince** | **kotlin.String**|  | [optional]
 **subscriberFromDb.billingAddress.country** | **kotlin.String**|  | [optional]
 **subscriberFromDb.billingAddress.companyId** | **kotlin.Long**|  | [optional]
 **subscriberFromDb.shippingAddress.id** | **kotlin.Long**|  | [optional]
 **subscriberFromDb.shippingAddress.name** | **kotlin.String**|  | [optional]
 **subscriberFromDb.shippingAddress.streetAddress** | **kotlin.String**|  | [optional]
 **subscriberFromDb.shippingAddress.postalCode** | **kotlin.String**|  | [optional]
 **subscriberFromDb.shippingAddress.city** | **kotlin.String**|  | [optional]
 **subscriberFromDb.shippingAddress.stateProvince** | **kotlin.String**|  | [optional]
 **subscriberFromDb.shippingAddress.country** | **kotlin.String**|  | [optional]
 **subscriberFromDb.shippingAddress.companyId** | **kotlin.Long**|  | [optional]
 **subscriberFromDb.company.address.id** | **kotlin.Long**|  | [optional]
 **subscriberFromDb.company.address.name** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.address.streetAddress** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.address.postalCode** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.address.city** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.address.stateProvince** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.address.country** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.address.companyId** | **kotlin.Long**|  | [optional]
 **subscriberFromDb.company.companyProps.id** | **kotlin.Long**|  | [optional]
 **subscriberFromDb.company.companyProps.callbackUrl** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.companyProps.logoPath** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.companyProps.hostedPageCSSPath** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.companyProps.privacyPolicyUrl** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.companyProps.subscreasyApiKey** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.companyProps.subscreasySecureKey** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.companyProps.paymentGateway** | **kotlin.String**|  | [optional] [enum: OFFLINE, IYZICO, PAYU, PAYTR, MOBILEXPRESS]
 **subscriberFromDb.company.companyProps.mobilePaymentGateway** | **kotlin.String**|  | [optional] [enum: DISABLED, WIRECARD]
 **subscriberFromDb.company.companyProps.wirecardUserCode** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.companyProps.wirecardPin** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.companyProps.wirecardTurkcellServisId** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.companyProps.wirecardSuccessfulMessage** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.companyProps.wirecardErrorMessage** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.companyProps.paymentGatewayApiKey** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.companyProps.paymentGatewaySecurityKey** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.companyProps.payuMerchantKeyRenewals** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.companyProps.payuSecretKeyRenewals** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.companyProps.paytrMerchantId** | **kotlin.Int**|  | [optional]
 **subscriberFromDb.company.companyProps.mobilExpressMerchantKey** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.companyProps.mobilExpressApiPassword** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.companyProps.mobilExpressPosid** | **kotlin.Int**|  | [optional]
 **subscriberFromDb.company.companyProps.billingDate** | **kotlin.Int**|  | [optional]
 **subscriberFromDb.company.companyProps.billingThresholdDays** | **kotlin.Int**|  | [optional]
 **subscriberFromDb.company.companyProps.domainName** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.companyProps.contactEmail** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.companyProps.sendDailyReports** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.companyProps.notifyNewSubscription** | **kotlin.Boolean**|  | [optional]
 **subscriberFromDb.company.companyProps.notifyRenewal** | **kotlin.Boolean**|  | [optional]
 **subscriberFromDb.company.companyProps.notifySubscriptionCancellation** | **kotlin.Boolean**|  | [optional]
 **subscriberFromDb.company.companyProps.branding** | **kotlin.Boolean**|  | [optional]
 **subscriberFromDb.company.companyProps.billingInformationMandatory** | **kotlin.Boolean**|  | [optional]
 **subscriberFromDb.company.id** | **kotlin.Long**|  | [optional]
 **subscriberFromDb.company.name** | **kotlin.String**|  | [optional]
 **subscriberFromDb.company.siteName** | **kotlin.String**|  | [optional]
 **subscriberFromDb.id** | **kotlin.Long**|  | [optional]
 **subscriberFromDb.secureId** | **kotlin.String**|  | [optional]
 **subscriberFromDb.merchantSubscriberId** | **kotlin.String**|  | [optional]
 **subscriberFromDb.email** | **kotlin.String**|  | [optional]
 **subscriberFromDb.name** | **kotlin.String**|  | [optional]
 **subscriberFromDb.surname** | **kotlin.String**|  | [optional]
 **subscriberFromDb.phoneNumber** | **kotlin.String**|  | [optional]
 **subscriberFromDb.createDate** | **java.time.LocalDateTime**|  | [optional]
 **subscriberFromDb.identificationNo** | **kotlin.String**|  | [optional]
 **subscriberFromDb.taxNumber** | **kotlin.String**|  | [optional]
 **subscriberFromDb.taxAdministration** | **kotlin.String**|  | [optional]
 **subscriberFromDb.worksFor** | **kotlin.String**|  | [optional]
 **couponCode** | **kotlin.String**|  | [optional]
 **callbackUrl** | **kotlin.String**|  | [optional]
 **price** | **java.math.BigDecimal**|  | [optional]
 **companySiteName** | **kotlin.String**|  | [optional]
 **privacyPolicyUrl** | **kotlin.Boolean**|  | [optional]
 **paymentType** | **kotlin.String**|  | [optional] [enum: OFFLINE, CC, MOBILE]
 **editable** | **kotlin.Boolean**|  | [optional]
 **productType** | **kotlin.String**|  | [optional] [enum: PHYSICAL, SERVICE]

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded;charset=UTF-8
 - **Accept**: text/html;charset=UTF-8

