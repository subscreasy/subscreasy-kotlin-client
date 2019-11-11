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

import com.kodfarki.subscreasy.client.model.ChargingLog
import com.kodfarki.subscreasy.client.model.SavedCard
import com.kodfarki.subscreasy.client.model.Subscriber
import com.kodfarki.subscreasy.client.model.Subsription

/**
 * 
 * @param paymentLog 
 * @param savedCard 
 * @param subscriber 
 * @param subscription 
 * @param txId 
 */
data class WebHookRequest (
    val paymentLog: ChargingLog? = null,
    val savedCard: SavedCard? = null,
    val subscriber: Subscriber? = null,
    val subscription: Subsription? = null,
    val txId: kotlin.String? = null
) {

}

