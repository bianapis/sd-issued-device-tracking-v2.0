package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceStateInitiateOutputModelCRIssuedDeviceTrackingInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceStateInitiateOutputModel
 */
public class CRIssuedDeviceStateInitiateOutputModel   {
  private String issuedDeviceStateInstanceReference = null;

  private String issuedDeviceStateInitiateActionReference = null;

  private Object issuedDeviceStateInitiateActionRecord = null;

  private String issuedDeviceStateInstanceStatus = null;

  private CRIssuedDeviceStateInitiateOutputModelCRIssuedDeviceTrackingInstanceRecord cRIssuedDeviceTrackingInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issued Device State instance 
   * @return issuedDeviceStateInstanceReference
  **/

  public String getIssuedDeviceStateInstanceReference() {
    return issuedDeviceStateInstanceReference;
  }

  public void setIssuedDeviceStateInstanceReference(String issuedDeviceStateInstanceReference) {
    this.issuedDeviceStateInstanceReference = issuedDeviceStateInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return issuedDeviceStateInitiateActionReference
  **/

  public String getIssuedDeviceStateInitiateActionReference() {
    return issuedDeviceStateInitiateActionReference;
  }

  public void setIssuedDeviceStateInitiateActionReference(String issuedDeviceStateInitiateActionReference) {
    this.issuedDeviceStateInitiateActionReference = issuedDeviceStateInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return issuedDeviceStateInitiateActionRecord
  **/

  public Object getIssuedDeviceStateInitiateActionRecord() {
    return issuedDeviceStateInitiateActionRecord;
  }

  public void setIssuedDeviceStateInitiateActionRecord(Object issuedDeviceStateInitiateActionRecord) {
    this.issuedDeviceStateInitiateActionRecord = issuedDeviceStateInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Issued Device State instance (e.g. initialised, pending, active) 
   * @return issuedDeviceStateInstanceStatus
  **/

  public String getIssuedDeviceStateInstanceStatus() {
    return issuedDeviceStateInstanceStatus;
  }

  public void setIssuedDeviceStateInstanceStatus(String issuedDeviceStateInstanceStatus) {
    this.issuedDeviceStateInstanceStatus = issuedDeviceStateInstanceStatus;
  }


  /**
   * Get cRIssuedDeviceTrackingInstanceRecord
   * @return cRIssuedDeviceTrackingInstanceRecord
  **/

  public CRIssuedDeviceStateInitiateOutputModelCRIssuedDeviceTrackingInstanceRecord getCRIssuedDeviceTrackingInstanceRecord() {
    return cRIssuedDeviceTrackingInstanceRecord;
  }

  @JsonProperty("cRIssuedDeviceTrackingInstanceRecord")
  public void setCRIssuedDeviceTrackingInstanceRecord(CRIssuedDeviceStateInitiateOutputModelCRIssuedDeviceTrackingInstanceRecord cRIssuedDeviceTrackingInstanceRecord) {
    this.cRIssuedDeviceTrackingInstanceRecord = cRIssuedDeviceTrackingInstanceRecord;
  }


}

