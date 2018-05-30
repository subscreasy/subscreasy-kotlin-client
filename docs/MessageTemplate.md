
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
eventType | STARTED, RENEWED, FINISHED, CANCELLED


<a name="NotificationTypeEnum"></a>
## Enum: notificationType
Name | Value
---- | -----
notificationType | WEBHOOK, EMAIL



