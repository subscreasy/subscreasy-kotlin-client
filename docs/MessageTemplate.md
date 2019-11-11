
# MessageTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**company** | [**Company**](Company.md) |  | 
**enabled** | **kotlin.Boolean** |  |  [optional]
**eventType** | [**inline**](#EventTypeEnum) |  |  [optional]
**id** | **kotlin.Long** |  |  [optional]
**messageTemplate** | **kotlin.String** |  |  [optional]
**notificationType** | [**inline**](#NotificationTypeEnum) |  |  [optional]
**sender** | **kotlin.String** |  |  [optional]
**subject** | **kotlin.String** |  |  [optional]


<a name="EventTypeEnum"></a>
## Enum: eventType
Name | Value
---- | -----
eventType | STARTED, RENEWED, RENEWAL_FAILED, FINISHED, CANCELLED, SUBSCRIBER_CREATED, SUBSCRIBER_UPDATED, TRIAL_ENDING, PAYMENT_UPDATED, IMMEDIATE_CANCELLATION_REQUESTED, ENDOFPERIOD_CANCELLATION_REQUESTED, PRICE_UPDATED


<a name="NotificationTypeEnum"></a>
## Enum: notificationType
Name | Value
---- | -----
notificationType | WEBHOOK, EMAIL



