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

import com.kodfarki.subscreasy.client.model.Authority
import com.kodfarki.subscreasy.client.model.Company

/**
 * 
 * @param activated 
 * @param authorities 
 * @param company 
 * @param companyOwner 
 * @param createdDate 
 * @param email 
 * @param firstName 
 * @param id 
 * @param imageUrl 
 * @param langKey 
 * @param lastModifiedDate 
 * @param lastName 
 * @param login 
 * @param loginCount 
 * @param resetDate 
 */
data class User (
    val activated: kotlin.Boolean,
    val companyOwner: kotlin.Boolean,
    val login: kotlin.String,
    val authorities: kotlin.Array<Authority>? = null,
    val company: Company? = null,
    val createdDate: java.time.LocalDateTime? = null,
    val email: kotlin.String? = null,
    val firstName: kotlin.String? = null,
    val id: kotlin.Long? = null,
    val imageUrl: kotlin.String? = null,
    val langKey: kotlin.String? = null,
    val lastModifiedDate: java.time.LocalDateTime? = null,
    val lastName: kotlin.String? = null,
    val loginCount: kotlin.Long? = null,
    val resetDate: java.time.LocalDateTime? = null
) {

}

