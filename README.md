# io.swagger.client - Kotlin client library for Api Documentation

## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnalyticsResourceApi* | [**getDashboardAnalyticsUsingGET**](docs/AnalyticsResourceApi.md#getdashboardanalyticsusingget) | **GET** /api/analytics/dashboard | getDashboardAnalytics
*CardResourceApi* | [**createCardUsingPOST**](docs/CardResourceApi.md#createcardusingpost) | **POST** /api/cards | createCard
*CardResourceApi* | [**deleteCardUsingDELETE**](docs/CardResourceApi.md#deletecardusingdelete) | **DELETE** /api/cards/{id} | deleteCard
*CardResourceApi* | [**getAllCardsUsingGET**](docs/CardResourceApi.md#getallcardsusingget) | **GET** /api/cards | getAllCards
*CardResourceApi* | [**getCardUsingGET**](docs/CardResourceApi.md#getcardusingget) | **GET** /api/cards/{id} | getCard
*CardResourceApi* | [**updateCardUsingPUT**](docs/CardResourceApi.md#updatecardusingput) | **PUT** /api/cards | updateCard
*ChargingLogResourceApi* | [**createChargingLogUsingPOST**](docs/ChargingLogResourceApi.md#createcharginglogusingpost) | **POST** /api/charging-logs | createChargingLog
*ChargingLogResourceApi* | [**deleteChargingLogUsingDELETE**](docs/ChargingLogResourceApi.md#deletecharginglogusingdelete) | **DELETE** /api/charging-logs/{id} | deleteChargingLog
*ChargingLogResourceApi* | [**getAllChargingLogsUsingGET**](docs/ChargingLogResourceApi.md#getallcharginglogsusingget) | **GET** /api/charging-logs | getAllChargingLogs
*ChargingLogResourceApi* | [**getChargingLogUsingGET**](docs/ChargingLogResourceApi.md#getcharginglogusingget) | **GET** /api/charging-logs/{id} | getChargingLog
*ChargingLogResourceApi* | [**refundUsingPOST**](docs/ChargingLogResourceApi.md#refundusingpost) | **POST** /api/charging-logs/refund/{chargingLogId} | refund
*ChargingLogResourceApi* | [**updateChargingLogUsingPUT**](docs/ChargingLogResourceApi.md#updatecharginglogusingput) | **PUT** /api/charging-logs | updateChargingLog
*CompanyPropsResourceApi* | [**createCompanyPropsUsingPOST**](docs/CompanyPropsResourceApi.md#createcompanypropsusingpost) | **POST** /api/company-props | createCompanyProps
*CompanyPropsResourceApi* | [**deleteCompanyPropsUsingDELETE**](docs/CompanyPropsResourceApi.md#deletecompanypropsusingdelete) | **DELETE** /api/company-props/{id} | deleteCompanyProps
*CompanyPropsResourceApi* | [**getAllCompanyPropsUsingGET**](docs/CompanyPropsResourceApi.md#getallcompanypropsusingget) | **GET** /api/company-props | getAllCompanyProps
*CompanyPropsResourceApi* | [**getCompanyPropsByCompanyIdUsingGET**](docs/CompanyPropsResourceApi.md#getcompanypropsbycompanyidusingget) | **GET** /api/company-props/company/{companyId} | getCompanyPropsByCompanyId
*CompanyPropsResourceApi* | [**updateCompanyPropsUsingPUT**](docs/CompanyPropsResourceApi.md#updatecompanypropsusingput) | **PUT** /api/company-props | updateCompanyProps
*CompanyResourceApi* | [**createCompanyUsingPOST**](docs/CompanyResourceApi.md#createcompanyusingpost) | **POST** /api/companies | createCompany
*CompanyResourceApi* | [**deleteCompanyUsingDELETE**](docs/CompanyResourceApi.md#deletecompanyusingdelete) | **DELETE** /api/companies/{id} | deleteCompany
*CompanyResourceApi* | [**getAllCompaniesUsingGET**](docs/CompanyResourceApi.md#getallcompaniesusingget) | **GET** /api/companies | getAllCompanies
*CompanyResourceApi* | [**getCompanyUsingGET**](docs/CompanyResourceApi.md#getcompanyusingget) | **GET** /api/companies/{id} | getCompany
*CompanyResourceApi* | [**updateCompanyUsingPUT**](docs/CompanyResourceApi.md#updatecompanyusingput) | **PUT** /api/companies | updateCompany
*CouponResourceApi* | [**createCouponUsingPOST**](docs/CouponResourceApi.md#createcouponusingpost) | **POST** /api/coupons | createCoupon
*CouponResourceApi* | [**deleteCouponUsingDELETE**](docs/CouponResourceApi.md#deletecouponusingdelete) | **DELETE** /api/coupons/{id} | deleteCoupon
*CouponResourceApi* | [**getAllCouponsUsingGET**](docs/CouponResourceApi.md#getallcouponsusingget) | **GET** /api/coupons | getAllCoupons
*CouponResourceApi* | [**getCouponUsingGET**](docs/CouponResourceApi.md#getcouponusingget) | **GET** /api/coupons/{id} | getCoupon
*CouponResourceApi* | [**updateCouponUsingPUT**](docs/CouponResourceApi.md#updatecouponusingput) | **PUT** /api/coupons | updateCoupon
*EndpointsApi* | [**authorizeUsingPUT**](docs/EndpointsApi.md#authorizeusingput) | **PUT** /api/authorize | authorize
*EndpointsApi* | [**deductUsingPUT**](docs/EndpointsApi.md#deductusingput) | **PUT** /api/deduct | deduct
*EndpointsApi* | [**getAuthorizedServicesUsingGET**](docs/EndpointsApi.md#getauthorizedservicesusingget) | **GET** /api/service/subscriber/{secureId} | getAuthorizedServices
*EndpointsApi* | [**getChargingLogBySubscriptionUsingGET**](docs/EndpointsApi.md#getcharginglogbysubscriptionusingget) | **GET** /api/charging-logs/subscription/{id} | getChargingLogBySubscription
*EndpointsApi* | [**getCustomerTotalAmountUsingGET**](docs/EndpointsApi.md#getcustomertotalamountusingget) | **GET** /api/customer-totalAmountCharge/{id} | getCustomerTotalAmount
*EndpointsApi* | [**getInvoiceDetailsUsingGET**](docs/EndpointsApi.md#getinvoicedetailsusingget) | **GET** /api/getInvoiceDetails | getInvoiceDetails
*EndpointsApi* | [**getMessageTemplateUsingGET**](docs/EndpointsApi.md#getmessagetemplateusingget) | **GET** /api/message-templates/email/{lifecycleEventName} | getMessageTemplate
*EndpointsApi* | [**getServiceInstancesBySubscriptionUsingGET**](docs/EndpointsApi.md#getserviceinstancesbysubscriptionusingget) | **GET** /api/service-instances/subscription/{id} | getServiceInstancesBySubscription
*EndpointsApi* | [**getServiceOfferingsBySubscriptionPlanUsingGET**](docs/EndpointsApi.md#getserviceofferingsbysubscriptionplanusingget) | **GET** /api/service-offerings/offer/{id} | getServiceOfferingsBySubscriptionPlan
*EndpointsApi* | [**getTotalRevenuePerMonthUsingGET**](docs/EndpointsApi.md#gettotalrevenuepermonthusingget) | **GET** /api/charging-logs-totalamount-customer/{id} | getTotalRevenuePerMonth
*HistoryResourceApi* | [**createHistoryUsingPOST**](docs/HistoryResourceApi.md#createhistoryusingpost) | **POST** /api/histories | createHistory
*HistoryResourceApi* | [**deleteHistoryUsingDELETE**](docs/HistoryResourceApi.md#deletehistoryusingdelete) | **DELETE** /api/histories/{id} | deleteHistory
*HistoryResourceApi* | [**getAllHistoriesUsingGET**](docs/HistoryResourceApi.md#getallhistoriesusingget) | **GET** /api/histories | getAllHistories
*HistoryResourceApi* | [**getHistoryUsingGET**](docs/HistoryResourceApi.md#gethistoryusingget) | **GET** /api/histories/{id} | getHistory
*HistoryResourceApi* | [**updateHistoryUsingPUT**](docs/HistoryResourceApi.md#updatehistoryusingput) | **PUT** /api/histories | updateHistory
*InvoiceResourceApi* | [**createInvoiceUsingPOST**](docs/InvoiceResourceApi.md#createinvoiceusingpost) | **POST** /api/invoices | createInvoice
*InvoiceResourceApi* | [**deleteInvoiceUsingDELETE**](docs/InvoiceResourceApi.md#deleteinvoiceusingdelete) | **DELETE** /api/invoices/{id} | deleteInvoice
*InvoiceResourceApi* | [**getAllInvoicesUsingGET**](docs/InvoiceResourceApi.md#getallinvoicesusingget) | **GET** /api/invoices | getAllInvoices
*InvoiceResourceApi* | [**getInvoiceBySubscriberUsingGET**](docs/InvoiceResourceApi.md#getinvoicebysubscriberusingget) | **GET** /api/invoices/subscriber/{subscriberSecureId} | getInvoiceBySubscriber
*InvoiceResourceApi* | [**getInvoiceUsingGET**](docs/InvoiceResourceApi.md#getinvoiceusingget) | **GET** /api/invoices/{id} | getInvoice
*InvoiceResourceApi* | [**updateInvoiceUsingPUT**](docs/InvoiceResourceApi.md#updateinvoiceusingput) | **PUT** /api/invoices | updateInvoice
*MessageTemplateResourceApi* | [**createMessageTemplateUsingPOST**](docs/MessageTemplateResourceApi.md#createmessagetemplateusingpost) | **POST** /api/message-templates | createMessageTemplate
*MessageTemplateResourceApi* | [**deleteMessageTemplateUsingDELETE**](docs/MessageTemplateResourceApi.md#deletemessagetemplateusingdelete) | **DELETE** /api/message-templates/{id} | deleteMessageTemplate
*MessageTemplateResourceApi* | [**getAllMessageTemplatesUsingGET**](docs/MessageTemplateResourceApi.md#getallmessagetemplatesusingget) | **GET** /api/message-templates | getAllMessageTemplates
*MessageTemplateResourceApi* | [**getMessageTemplateUsingGET1**](docs/MessageTemplateResourceApi.md#getmessagetemplateusingget1) | **GET** /api/message-templates/{id} | getMessageTemplate
*MessageTemplateResourceApi* | [**updateMessageTemplateUsingPUT**](docs/MessageTemplateResourceApi.md#updatemessagetemplateusingput) | **PUT** /api/message-templates | updateMessageTemplate
*OfferResourceApi* | [**createOfferUsingPOST**](docs/OfferResourceApi.md#createofferusingpost) | **POST** /api/offers | createOffer
*OfferResourceApi* | [**deleteOfferUsingDELETE**](docs/OfferResourceApi.md#deleteofferusingdelete) | **DELETE** /api/offers/{id} | deleteOffer
*OfferResourceApi* | [**getAllOffersUsingGET**](docs/OfferResourceApi.md#getalloffersusingget) | **GET** /api/offers | getAllOffers
*OfferResourceApi* | [**getOfferUsingGET**](docs/OfferResourceApi.md#getofferusingget) | **GET** /api/offers/{id} | getOffer
*OfferResourceApi* | [**updateOfferUsingPUT**](docs/OfferResourceApi.md#updateofferusingput) | **PUT** /api/offers | updateOffer
*ProfileInfoResourceApi* | [**getActiveProfilesUsingGET**](docs/ProfileInfoResourceApi.md#getactiveprofilesusingget) | **GET** /api/profile-info | getActiveProfiles
*ServiceInstanceResourceApi* | [**createServiceInstanceUsingPOST**](docs/ServiceInstanceResourceApi.md#createserviceinstanceusingpost) | **POST** /api/service-instances | createServiceInstance
*ServiceInstanceResourceApi* | [**deleteServiceInstanceUsingDELETE**](docs/ServiceInstanceResourceApi.md#deleteserviceinstanceusingdelete) | **DELETE** /api/service-instances/{id} | deleteServiceInstance
*ServiceInstanceResourceApi* | [**getAllServiceInstancesUsingGET**](docs/ServiceInstanceResourceApi.md#getallserviceinstancesusingget) | **GET** /api/service-instances | getAllServiceInstances
*ServiceInstanceResourceApi* | [**getServiceInstanceUsingGET**](docs/ServiceInstanceResourceApi.md#getserviceinstanceusingget) | **GET** /api/service-instances/{id} | getServiceInstance
*ServiceInstanceResourceApi* | [**updateServiceInstanceUsingPUT**](docs/ServiceInstanceResourceApi.md#updateserviceinstanceusingput) | **PUT** /api/service-instances | updateServiceInstance
*ServiceOfferingResourceApi* | [**createServiceOfferingUsingPOST**](docs/ServiceOfferingResourceApi.md#createserviceofferingusingpost) | **POST** /api/service-offerings | createServiceOffering
*ServiceOfferingResourceApi* | [**deleteServiceOfferingUsingDELETE**](docs/ServiceOfferingResourceApi.md#deleteserviceofferingusingdelete) | **DELETE** /api/service-offerings/{id} | deleteServiceOffering
*ServiceOfferingResourceApi* | [**getAllServiceOfferingsUsingGET**](docs/ServiceOfferingResourceApi.md#getallserviceofferingsusingget) | **GET** /api/service-offerings | getAllServiceOfferings
*ServiceOfferingResourceApi* | [**getServiceOfferingUsingGET**](docs/ServiceOfferingResourceApi.md#getserviceofferingusingget) | **GET** /api/service-offerings/{id} | getServiceOffering
*ServiceOfferingResourceApi* | [**updateServiceOfferingUsingPUT**](docs/ServiceOfferingResourceApi.md#updateserviceofferingusingput) | **PUT** /api/service-offerings | updateServiceOffering
*ServiceResourceApi* | [**createServiceUsingPOST**](docs/ServiceResourceApi.md#createserviceusingpost) | **POST** /api/services | createService
*ServiceResourceApi* | [**deleteServiceUsingDELETE**](docs/ServiceResourceApi.md#deleteserviceusingdelete) | **DELETE** /api/services/{id} | deleteService
*ServiceResourceApi* | [**getAllServicesUsingGET**](docs/ServiceResourceApi.md#getallservicesusingget) | **GET** /api/services | getAllServices
*ServiceResourceApi* | [**getServiceUsingGET**](docs/ServiceResourceApi.md#getserviceusingget) | **GET** /api/services/{id} | getService
*ServiceResourceApi* | [**updateServiceUsingPUT**](docs/ServiceResourceApi.md#updateserviceusingput) | **PUT** /api/services | updateService
*SubscriberResourceApi* | [**createSubscriberUsingPOST**](docs/SubscriberResourceApi.md#createsubscriberusingpost) | **POST** /api/subscribers | createSubscriber
*SubscriberResourceApi* | [**deleteSubscriberUsingDELETE**](docs/SubscriberResourceApi.md#deletesubscriberusingdelete) | **DELETE** /api/subscribers/{id} | deleteSubscriber
*SubscriberResourceApi* | [**getAllSubscribersUsingGET**](docs/SubscriberResourceApi.md#getallsubscribersusingget) | **GET** /api/subscribers | getAllSubscribers
*SubscriberResourceApi* | [**getSubscriberByEmailUsingGET**](docs/SubscriberResourceApi.md#getsubscriberbyemailusingget) | **GET** /api/subscribers/email/{email} | getSubscriberByEmail
*SubscriberResourceApi* | [**getSubscriberByNameUsingGET**](docs/SubscriberResourceApi.md#getsubscriberbynameusingget) | **GET** /api/subscribers/name/{name} | getSubscriberByName
*SubscriberResourceApi* | [**getSubscriberUsingGET**](docs/SubscriberResourceApi.md#getsubscriberusingget) | **GET** /api/subscribers/{id} | getSubscriber
*SubscriberResourceApi* | [**updateSubscriberUsingPUT**](docs/SubscriberResourceApi.md#updatesubscriberusingput) | **PUT** /api/subscribers | updateSubscriber
*SubsriptionResourceApi* | [**cancelSubscriptionUsingPUT**](docs/SubsriptionResourceApi.md#cancelsubscriptionusingput) | **PUT** /api/subscriptions/cancel | cancelSubscription
*SubsriptionResourceApi* | [**getActiveSubscriptionsUsingGET**](docs/SubsriptionResourceApi.md#getactivesubscriptionsusingget) | **GET** /api/subsriptions/subscriber/{secureId} | getActiveSubscriptions
*SubsriptionResourceApi* | [**getAllCompanySubscriptionsUsingGET**](docs/SubsriptionResourceApi.md#getallcompanysubscriptionsusingget) | **GET** /api/subscriptions/company/{id} | getAllCompanySubscriptions
*SubsriptionResourceApi* | [**getSubsriptionUsingGET**](docs/SubsriptionResourceApi.md#getsubsriptionusingget) | **GET** /api/subsriptions/{id} | getSubsription
*SubsriptionResourceApi* | [**startSubscriptionUsingPOST**](docs/SubsriptionResourceApi.md#startsubscriptionusingpost) | **POST** /api/subscriptions/start | startSubscription
*UsageNotificationResourceApi* | [**createUsageNotificationUsingPOST**](docs/UsageNotificationResourceApi.md#createusagenotificationusingpost) | **POST** /api/usage-notifications | createUsageNotification
*UsageNotificationResourceApi* | [**deleteUsageNotificationUsingDELETE**](docs/UsageNotificationResourceApi.md#deleteusagenotificationusingdelete) | **DELETE** /api/usage-notifications/{id} | deleteUsageNotification
*UsageNotificationResourceApi* | [**getAllUsageNotificationsUsingGET**](docs/UsageNotificationResourceApi.md#getallusagenotificationsusingget) | **GET** /api/usage-notifications | getAllUsageNotifications
*UsageNotificationResourceApi* | [**getUsageNotificationUsingGET**](docs/UsageNotificationResourceApi.md#getusagenotificationusingget) | **GET** /api/usage-notifications/{id} | getUsageNotification
*UsageNotificationResourceApi* | [**updateUsageNotificationUsingPUT**](docs/UsageNotificationResourceApi.md#updateusagenotificationusingput) | **PUT** /api/usage-notifications | updateUsageNotification
*UserResourceApi* | [**createUserUsingPOST**](docs/UserResourceApi.md#createuserusingpost) | **POST** /api/users | createUser
*UserResourceApi* | [**deleteUserUsingDELETE**](docs/UserResourceApi.md#deleteuserusingdelete) | **DELETE** /api/users/{login} | deleteUser
*UserResourceApi* | [**getAllUsersUsingGET**](docs/UserResourceApi.md#getallusersusingget) | **GET** /api/users | getAllUsers
*UserResourceApi* | [**getAuthoritiesUsingGET**](docs/UserResourceApi.md#getauthoritiesusingget) | **GET** /api/users/authorities | getAuthorities
*UserResourceApi* | [**getUserUsingGET**](docs/UserResourceApi.md#getuserusingget) | **GET** /api/users/{login} | getUser
*UserResourceApi* | [**updateUserUsingPUT**](docs/UserResourceApi.md#updateuserusingput) | **PUT** /api/users | updateUser


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.kodfarki.subscreasy.client.model.Address](docs/Address.md)
 - [com.kodfarki.subscreasy.client.model.Authority](docs/Authority.md)
 - [com.kodfarki.subscreasy.client.model.Authorization](docs/Authorization.md)
 - [com.kodfarki.subscreasy.client.model.AuthorizedServicesResponse](docs/AuthorizedServicesResponse.md)
 - [com.kodfarki.subscreasy.client.model.Cancellation](docs/Cancellation.md)
 - [com.kodfarki.subscreasy.client.model.ChargingLog](docs/ChargingLog.md)
 - [com.kodfarki.subscreasy.client.model.Company](docs/Company.md)
 - [com.kodfarki.subscreasy.client.model.CompanyProps](docs/CompanyProps.md)
 - [com.kodfarki.subscreasy.client.model.Coupon](docs/Coupon.md)
 - [com.kodfarki.subscreasy.client.model.Deduction](docs/Deduction.md)
 - [com.kodfarki.subscreasy.client.model.DeductionResult](docs/DeductionResult.md)
 - [com.kodfarki.subscreasy.client.model.History](docs/History.md)
 - [com.kodfarki.subscreasy.client.model.Invoice](docs/Invoice.md)
 - [com.kodfarki.subscreasy.client.model.InvoiceRequest](docs/InvoiceRequest.md)
 - [com.kodfarki.subscreasy.client.model.ManagedUserVM](docs/ManagedUserVM.md)
 - [com.kodfarki.subscreasy.client.model.MessageTemplate](docs/MessageTemplate.md)
 - [com.kodfarki.subscreasy.client.model.Offer](docs/Offer.md)
 - [com.kodfarki.subscreasy.client.model.PaymentCard](docs/PaymentCard.md)
 - [com.kodfarki.subscreasy.client.model.ProfileInfoVM](docs/ProfileInfoVM.md)
 - [com.kodfarki.subscreasy.client.model.RecurrencePeriod](docs/RecurrencePeriod.md)
 - [com.kodfarki.subscreasy.client.model.ResponseEntity](docs/ResponseEntity.md)
 - [com.kodfarki.subscreasy.client.model.SavedCard](docs/SavedCard.md)
 - [com.kodfarki.subscreasy.client.model.Service](docs/Service.md)
 - [com.kodfarki.subscreasy.client.model.ServiceInstance](docs/ServiceInstance.md)
 - [com.kodfarki.subscreasy.client.model.ServiceInstanceResult](docs/ServiceInstanceResult.md)
 - [com.kodfarki.subscreasy.client.model.ServiceOffering](docs/ServiceOffering.md)
 - [com.kodfarki.subscreasy.client.model.ServiceOfferingResult](docs/ServiceOfferingResult.md)
 - [com.kodfarki.subscreasy.client.model.StartSubscriptionRequest](docs/StartSubscriptionRequest.md)
 - [com.kodfarki.subscreasy.client.model.Subscriber](docs/Subscriber.md)
 - [com.kodfarki.subscreasy.client.model.SubscriptionCreateResult](docs/SubscriptionCreateResult.md)
 - [com.kodfarki.subscreasy.client.model.SubscriptionPlan](docs/SubscriptionPlan.md)
 - [com.kodfarki.subscreasy.client.model.Subsription](docs/Subsription.md)
 - [com.kodfarki.subscreasy.client.model.UsageNotification](docs/UsageNotification.md)
 - [com.kodfarki.subscreasy.client.model.User](docs/User.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="apiKey"></a>
### apiKey

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

