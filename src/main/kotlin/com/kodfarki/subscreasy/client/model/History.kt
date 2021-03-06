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
    * Values: sTARTED,rENEWED,rENEWALFAILED,fINISHED,cANCELLED,sUBSCRIBERCREATED,sUBSCRIBERUPDATED,tRIALENDING,pAYMENTUPDATED,iMMEDIATECANCELLATIONREQUESTED,eNDOFPERIODCANCELLATIONREQUESTED,pRICEUPDATED
    */
    enum class Name(val value: kotlin.Any){
    
        sTARTED("STARTED"),
    
        rENEWED("RENEWED"),
    
        rENEWALFAILED("RENEWAL_FAILED"),
    
        fINISHED("FINISHED"),
    
        cANCELLED("CANCELLED"),
    
        sUBSCRIBERCREATED("SUBSCRIBER_CREATED"),
    
        sUBSCRIBERUPDATED("SUBSCRIBER_UPDATED"),
    
        tRIALENDING("TRIAL_ENDING"),
    
        pAYMENTUPDATED("PAYMENT_UPDATED"),
    
        iMMEDIATECANCELLATIONREQUESTED("IMMEDIATE_CANCELLATION_REQUESTED"),
    
        eNDOFPERIODCANCELLATIONREQUESTED("ENDOFPERIOD_CANCELLATION_REQUESTED"),
    
        pRICEUPDATED("PRICE_UPDATED");
    
    }

}

