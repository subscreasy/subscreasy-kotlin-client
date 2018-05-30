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


/**
 * 
 * @param id 
 * @param length 
 * @param recurrenceType 
 */
data class RecurrencePeriod (
    val length: kotlin.Long,
    val recurrenceType: RecurrencePeriod.RecurrenceType,
    val id: kotlin.Long? = null
) {

    /**
    * 
    * Values: sECONDLY,mINUTELY,hOURLY,dAILY,wEEKLY,mONTHLY,yEARLY
    */
    enum class RecurrenceType(val value: kotlin.Any){
    
        sECONDLY("SECONDLY"),
    
        mINUTELY("MINUTELY"),
    
        hOURLY("HOURLY"),
    
        dAILY("DAILY"),
    
        wEEKLY("WEEKLY"),
    
        mONTHLY("MONTHLY"),
    
        yEARLY("YEARLY");
    
    }

}

