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

import com.kodfarki.subscreasy.client.model.Subsription

/**
 * 
 * @param id 
 * @param name 
 * @param subscription 
 */
data class History (
    val id: kotlin.Long? = null,
    val name: History.Name? = null,
    val subscription: Subsription? = null
) {

    /**
    * 
    * Values: sTARTED,rENEWED,fINISHED,cANCELLED
    */
    enum class Name(val value: kotlin.Any){
    
        sTARTED("STARTED"),
    
        rENEWED("RENEWED"),
    
        fINISHED("FINISHED"),
    
        cANCELLED("CANCELLED");
    
    }

}

