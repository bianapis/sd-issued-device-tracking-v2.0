package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceStateInitiateInputModelCRIssuedDeviceTrackingInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceStateInitiateInputModel
 */
public class CRIssuedDeviceStateInitiateInputModel   {
  private String issuedDeviceTrackingServicingSessionReference = null;

  private Object issuedDeviceStateInitiateActionRecord = null;

  private String issuedDeviceStateInstanceStatus = null;

  private CRIssuedDeviceStateInitiateInputModelCRIssuedDeviceTrackingInstanceRecord cRIssuedDeviceTrackingInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return issuedDeviceTrackingServicingSessionReference
  **/

  public String getIssuedDeviceTrackingServicingSessionReference() {
    return issuedDeviceTrackingServicingSessionReference;
  }

  public void setIssuedDeviceTrackingServicingSessionReference(String issuedDeviceTrackingServicingSessionReference) {
    this.issuedDeviceTrackingServicingSessionReference = issuedDeviceTrackingServicingSessionReference;
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

  public CRIssuedDeviceStateInitiateInputModelCRIssuedDeviceTrackingInstanceRecord getCRIssuedDeviceTrackingInstanceRecord() {
    return cRIssuedDeviceTrackingInstanceRecord;
  }

  public void setCRIssuedDeviceTrackingInstanceRecord(CRIssuedDeviceStateInitiateInputModelCRIssuedDeviceTrackingInstanceRecord cRIssuedDeviceTrackingInstanceRecord) {
    this.cRIssuedDeviceTrackingInstanceRecord = cRIssuedDeviceTrackingInstanceRecord;
  }


}

