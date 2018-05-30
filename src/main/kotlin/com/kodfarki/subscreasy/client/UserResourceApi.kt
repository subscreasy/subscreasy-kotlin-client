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

import com.kodfarki.subscreasy.client.model.ManagedUserVM
import com.kodfarki.subscreasy.client.model.ResponseEntity
import com.kodfarki.subscreasy.client.model.User

import io.swagger.client.infrastructure.*

class UserResourceApi(basePath: kotlin.String = "https://localhost:8080") : ApiClient(basePath) {

    /**
    * createUser
    * 
    * @param managedUserVM managedUserVM 
    * @return ResponseEntity
    */
    @Suppress("UNCHECKED_CAST")
    fun createUserUsingPOST(managedUserVM: ManagedUserVM) : ResponseEntity {
        val localVariableBody: kotlin.Any? = managedUserVM
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/api/users",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<ResponseEntity>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ResponseEntity
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * deleteUser
    * 
    * @param login login 
    * @return void
    */
    fun deleteUserUsingDELETE(login: kotlin.String) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/api/users/{login}".replace("{"+"login"+"}", "$login"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * getAllUsers
    * 
    * @param page Page number of the requested page (optional)
    * @param size Size of a page (optional)
    * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
    * @return kotlin.Array<User>
    */
    @Suppress("UNCHECKED_CAST")
    fun getAllUsersUsingGET(page: kotlin.Int, size: kotlin.Int, sort: kotlin.Array<kotlin.String>) : kotlin.Array<User> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("page" to listOf("$page"), "size" to listOf("$size"), "sort" to toMultiValue(sort.toList(), "multi"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/users",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<User>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<User>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * getAuthorities
    * 
    * @return kotlin.Array<kotlin.String>
    */
    @Suppress("UNCHECKED_CAST")
    fun getAuthoritiesUsingGET() : kotlin.Array<kotlin.String> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/users/authorities",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<kotlin.String>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<kotlin.String>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * getUser
    * 
    * @param login login 
    * @return User
    */
    @Suppress("UNCHECKED_CAST")
    fun getUserUsingGET(login: kotlin.String) : User {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/users/{login}".replace("{"+"login"+"}", "$login"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<User>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as User
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * updateUser
    * 
    * @param managedUserVM managedUserVM 
    * @return User
    */
    @Suppress("UNCHECKED_CAST")
    fun updateUserUsingPUT(managedUserVM: ManagedUserVM) : User {
        val localVariableBody: kotlin.Any? = managedUserVM
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/api/users",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<User>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as User
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}
