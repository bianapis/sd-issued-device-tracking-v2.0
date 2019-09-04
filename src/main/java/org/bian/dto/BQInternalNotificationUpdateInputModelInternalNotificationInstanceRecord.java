package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInternalNotificationUpdateInputModelInternalNotificationInstanceRecord
 */
public class BQInternalNotificationUpdateInputModelInternalNotificationInstanceRecord   {
  private String issuedDeviceReference = null;

  private String issuedDeviceType = null;

  private String customerReference = null;

  private String productInstanceReference = null;

  private String statusUpdateDetails = null;

  private String statusUpdateResult = null;

  private String date = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Provided reference to the target issued device 
   * @return issuedDeviceReference
  **/

  public String getIssuedDeviceReference() {
    return issuedDeviceReference;
  }

  public void setIssuedDeviceReference(String issuedDeviceReference) {
    this.issuedDeviceReference = issuedDeviceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Type of issued device being notified 
   * @return issuedDeviceType
  **/

  public String getIssuedDeviceType() {
    return issuedDeviceType;
  }

  public void setIssuedDeviceType(String issuedDeviceType) {
    this.issuedDeviceType = issuedDeviceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated customer if applicable 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated product instance if appropriate 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The details of the status update (e.g. reported lost or stolen device, device broken) 
   * @return statusUpdateDetails
  **/

  public String getStatusUpdateDetails() {
    return statusUpdateDetails;
  }

  public void setStatusUpdateDetails(String statusUpdateDetails) {
    this.statusUpdateDetails = statusUpdateDetails;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The response to the status update request (e.g. update processed) 
   * @return statusUpdateResult
  **/

  public String getStatusUpdateResult() {
    return statusUpdateResult;
  }

  public void setStatusUpdateResult(String statusUpdateResult) {
    this.statusUpdateResult = statusUpdateResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Key dates and times associated with the notification 
   * @return date
  **/

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


}

