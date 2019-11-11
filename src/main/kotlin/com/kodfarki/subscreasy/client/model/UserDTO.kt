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
package com.kodfarki.subscreasy.client.model

import com.kodfarki.subscreasy.client.model.Company

/**
 * 
 * @param activated 
 * @param authorities 
 * @param company 
 * @param createdBy 
 * @param createdDate 
 * @param email 
 * @param firstName 
 * @param id 
 * @param imageUrl 
 * @param langKey 
 * @param lastModifiedBy 
 * @param lastModifiedDate 
 * @param lastName 
 * @param login 
 * @param password 
 * @param resetDate 
 * @param siteName 
 * @param subscriber 
 */
data class UserDTO (
    val login: kotlin.String,
    val activated: kotlin.Boolean? = null,
    val authorities: kotlin.Array<kotlin.String>? = null,
    val company: Company? = null,
    val createdBy: kotlin.String? = null,
    val createdDate: java.time.LocalDateTime? = null,
    val email: kotlin.String? = null,
    val firstName: kotlin.String? = null,
    val id: kotlin.Long? = null,
    val imageUrl: kotlin.String? = null,
    val langKey: kotlin.String? = null,
    val lastModifiedBy: kotlin.String? = null,
    val lastModifiedDate: java.time.LocalDateTime? = null,
    val lastName: kotlin.String? = null,
    val password: kotlin.String? = null,
    val resetDate: kotlin.String? = null,
    val siteName: kotlin.String? = null,
    val subscriber: kotlin.Boolean? = null
) {

}
