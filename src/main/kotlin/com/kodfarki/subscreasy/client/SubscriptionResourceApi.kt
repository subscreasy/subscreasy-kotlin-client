/**
* Api Documentation
* Api Documentation
*
* OpenAPI spec version: 1.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package com.kodfarki.subscreasy.client

import com.kodfarki.subscreasy.client.model.Cancellation
import com.kodfarki.subscreasy.client.model.Job
import com.kodfarki.subscreasy.client.model.StartSubscriptionRequest
import com.kodfarki.subscreasy.client.model.StartSubscriptionResult
import com.kodfarki.subscreasy.client.model.Subsription

import io.swagger.client.infrastructure.*

class SubscriptionResourceApi(basePath: kotlin.String = "https://app.subscreasy.com") : ApiClient(basePath) {

    /**
    * cancelSubscription
    * 
    * @param cancellation cancellation 
    * @return Subsription
    */
    @Suppress("UNCHECKED_CAST")
    fun cancelSubscriptionUsingPUT(cancellation: Cancellation) : Subsription {
        val localVariableBody: kotlin.Any? = cancellation
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/api/subscriptions/cancel",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Subsription>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Subsription
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * changePaymentMethod
    * 
    * @param subscriptionId subscriptionId 
    * @return Subsription
    */
    @Suppress("UNCHECKED_CAST")
    fun changePaymentMethodUsingPUT(subscriptionId: kotlin.Long) : Subsription {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/api/subscriptions/change-payment-method/{subscriptionId}".replace("{"+"subscriptionId"+"}", "$subscriptionId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Subsription>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Subsription
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * chargeEarly
    * 
    * @param subscriptionId subscriptionId 
    * @return Job
    */
    @Suppress("UNCHECKED_CAST")
    fun chargeEarlyUsingPUT(subscriptionId: kotlin.Long) : Job {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/api/subscriptions/charge/{subscriptionId}".replace("{"+"subscriptionId"+"}", "$subscriptionId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Job>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Job
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * getActiveSubscriptionsByEmail
    * 
    * @param email email 
    * @return kotlin.Array<Subsription>
    */
    @Suppress("UNCHECKED_CAST")
    fun getActiveSubscriptionsByEmailUsingGET(email: kotlin.String) : kotlin.Array<Subsription> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/subscriptions/subscriber/email/{email}".replace("{"+"email"+"}", "$email"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Subsription>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Subsription>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * getActiveSubscriptions
    * 
    * @param secureId secureId 
    * @return kotlin.Array<Subsription>
    */
    @Suppress("UNCHECKED_CAST")
    fun getActiveSubscriptionsUsingGET(secureId: kotlin.String) : kotlin.Array<Subsription> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/subscriptions/subscriber/{secureId}".replace("{"+"secureId"+"}", "$secureId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Subsription>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Subsription>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * getAllCompanySubscriptions
    * 
    * @param id id 
    * @return kotlin.Array<Subsription>
    */
    @Suppress("UNCHECKED_CAST")
    fun getAllCompanySubscriptionsUsingGET(id: kotlin.String) : kotlin.Array<Subsription> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/subscriptions/company/{id}".replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Subsription>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Subsription>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * getAllSubscriptionsByOffer
    * 
    * @param id id 
    * @param page Page number of the requested page (optional)
    * @param size Size of a page (optional)
    * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
    * @return kotlin.Array<Subsription>
    */
    @Suppress("UNCHECKED_CAST")
    fun getAllSubscriptionsByOfferUsingGET(id: kotlin.Long, page: kotlin.Int, size: kotlin.Int, sort: kotlin.Array<kotlin.String>) : kotlin.Array<Subsription> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("page" to listOf("$page"), "size" to listOf("$size"), "sort" to toMultiValue(sort.toList(), "multi"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/subscriptions/offer/{id}".replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Subsription>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Subsription>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * getSubscription
    * 
    * @param id id 
    * @return Subsription
    */
    @Suppress("UNCHECKED_CAST")
    fun getSubscriptionUsingGET(id: kotlin.Long) : Subsription {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/subscriptions/{id}".replace("{"+"id"+"}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Subsription>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Subsription
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * getSubscriptionsByMerchantSubscriberId
    * 
    * @param merchantSubscriberId merchantSubscriberId 
    * @param page Page number of the requested page (optional)
    * @param size Size of a page (optional)
    * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
    * @return kotlin.Array<Subsription>
    */
    @Suppress("UNCHECKED_CAST")
    fun getSubscriptionsByMerchantSubscriberIdUsingGET(merchantSubscriberId: kotlin.String, page: kotlin.Int, size: kotlin.Int, sort: kotlin.Array<kotlin.String>) : kotlin.Array<Subsription> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("page" to listOf("$page"), "size" to listOf("$size"), "sort" to toMultiValue(sort.toList(), "multi"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/subscriptions/subscriber/m/{merchantSubscriberId}".replace("{"+"merchantSubscriberId"+"}", "$merchantSubscriberId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Subsription>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Subsription>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * getSubscriptionsByStatus
    * 
    * @param status status 
    * @param page Page number of the requested page (optional)
    * @param size Size of a page (optional)
    * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
    * @return kotlin.Array<Subsription>
    */
    @Suppress("UNCHECKED_CAST")
    fun getSubscriptionsByStatusUsingGET(status: kotlin.String, page: kotlin.Int, size: kotlin.Int, sort: kotlin.Array<kotlin.String>) : kotlin.Array<Subsription> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("page" to listOf("$page"), "size" to listOf("$size"), "sort" to toMultiValue(sort.toList(), "multi"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/subscriptions/status/{status}".replace("{"+"status"+"}", "$status"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Subsription>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Subsription>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * startSubscription
    * 
    * @param request request 
    * @return StartSubscriptionResult
    */
    @Suppress("UNCHECKED_CAST")
    fun startSubscriptionUsingPOST(request: StartSubscriptionRequest) : StartSubscriptionResult {
        val localVariableBody: kotlin.Any? = request
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/api/subscriptions/start",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<StartSubscriptionResult>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as StartSubscriptionResult
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}
