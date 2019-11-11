
# Job

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activityId** | **kotlin.Int** |  |  [optional]
**company** | [**Company**](Company.md) |  |  [optional]
**createDate** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**detailProps** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**details** | **kotlin.String** |  |  [optional]
**executionCount** | **kotlin.Int** |  |  [optional]
**executionDate** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**executionStatus** | [**inline**](#ExecutionStatusEnum) |  |  [optional]
**firstExecutionDate** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**id** | **kotlin.Long** |  |  [optional]
**modifyDate** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**priority** | **kotlin.Int** |  |  [optional]
**retryDate** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**retryRequired** | **kotlin.Boolean** |  |  [optional]
**subscription** | [**Subsription**](Subsription.md) |  |  [optional]
**workflowId** | [**inline**](#WorkflowIdEnum) |  |  [optional]


<a name="ExecutionStatusEnum"></a>
## Enum: executionStatus
Name | Value
---- | -----
executionStatus | NEW, WAITING, RUNNING, PENDING, FINISHED, FAILED, CANCELLED, EXPIRED


<a name="WorkflowIdEnum"></a>
## Enum: workflowId
Name | Value
---- | -----
workflowId | CHARGING, NOTIFY, TERMINATION, DAILY, OFFLINE_PAYMENT_CHECK



