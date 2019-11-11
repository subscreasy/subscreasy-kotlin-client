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

import com.kodfarki.subscreasy.client.model.SavedCard

/**
 * 
 * @param appliedCoupon 
 * @param authCode 
 * @param companyId 
 * @param createDate 
 * @param currency 
 * @param errorCode 
 * @param errorText 
 * @param id 
 * @param invoiceId 
 * @param jobId 
 * @param offerId 
 * @param parentId 
 * @param paymentGateway 
 * @param paymentId 
 * @param price 
 * @param reason 
 * @param refundDate 
 * @param savedCard 
 * @param savedCardId 
 * @param serviceInstanceId 
 * @param status 
 * @param subscriberId 
 * @param subscriberSecureId 
 * @param subscriptionId 
 * @param threeds 
 * @param transactionId 
 */
data class ChargingLog (
    val appliedCoupon: kotlin.Long? = null,
    val authCode: kotlin.String? = null,
    val companyId: kotlin.Long? = null,
    val createDate: java.time.LocalDateTime? = null,
    val currency: kotlin.String? = null,
    val errorCode: kotlin.String? = null,
    val errorText: kotlin.String? = null,
    val id: kotlin.Long? = null,
    val invoiceId: kotlin.Long? = null,
    val jobId: kotlin.Long? = null,
    val offerId: kotlin.Long? = null,
    val parentId: kotlin.Long? = null,
    val paymentGateway: ChargingLog.PaymentGateway? = null,
    val paymentId: kotlin.String? = null,
    val price: java.math.BigDecimal? = null,
    val reason: ChargingLog.Reason? = null,
    val refundDate: java.time.LocalDateTime? = null,
    val savedCard: SavedCard? = null,
    val savedCardId: kotlin.Long? = null,
    val serviceInstanceId: kotlin.Long? = null,
    val status: ChargingLog.Status? = null,
    val subscriberId: kotlin.Long? = null,
    val subscriberSecureId: kotlin.String? = null,
    val subscriptionId: kotlin.Long? = null,
    val threeds: kotlin.Boolean? = null,
    val transactionId: kotlin.String? = null
) {

    /**
    * 
    * Values: oFFLINE,iYZICO,pAYU,pAYTR,mOBILEXPRESS
    */
    enum class PaymentGateway(val value: kotlin.Any){
    
        oFFLINE("OFFLINE"),
    
        iYZICO("IYZICO"),
    
        pAYU("PAYU"),
    
        pAYTR("PAYTR"),
    
        mOBILEXPRESS("MOBILEXPRESS");
    
    }

    /**
    * 
    * Values: sTART,rENEWAL,oVERUSAGE,rEFUND,sAVECARD,tRIALPERIOD
    */
    enum class Reason(val value: kotlin.Any){
    
        sTART("START"),
    
        rENEWAL("RENEWAL"),
    
        oVERUSAGE("OVER_USAGE"),
    
        rEFUND("REFUND"),
    
        sAVECARD("SAVE_CARD"),
    
        tRIALPERIOD("TRIAL_PERIOD");
    
    }

    /**
    * 
    * Values: nOTPAID,pAID,fAIL,rEFUNDED
    */
    enum class Status(val value: kotlin.Any){
    
        nOTPAID("NOT_PAID"),
    
        pAID("PAID"),
    
        fAIL("FAIL"),
    
        rEFUNDED("REFUNDED");
    
    }

}

