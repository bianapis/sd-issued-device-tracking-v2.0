package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceStateUpdateInputModelCRIssuedDeviceTrackingInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceStateUpdateInputModel
 */
public class CRIssuedDeviceStateUpdateInputModel   {
  private String issuedDeviceTrackingServicingSessionReference = null;

  private String issuedDeviceStateInstanceReference = null;

  private CRIssuedDeviceStateUpdateInputModelCRIssuedDeviceTrackingInstanceRecord cRIssuedDeviceTrackingInstanceRecord = null;

  private Object issuedDeviceStateUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get cRIssuedDeviceTrackingInstanceRecord
   * @return cRIssuedDeviceTrackingInstanceRecord
  **/

  public CRIssuedDeviceStateUpdateInputModelCRIssuedDeviceTrackingInstanceRecord getCRIssuedDeviceTrackingInstanceRecord() {
    return cRIssuedDeviceTrackingInstanceRecord;
  }

  public void setCRIssuedDeviceTrackingInstanceRecord(CRIssuedDeviceStateUpdateInputModelCRIssuedDeviceTrackingInstanceRecord cRIssuedDeviceTrackingInstanceRecord) {
    this.cRIssuedDeviceTrackingInstanceRecord = cRIssuedDeviceTrackingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return issuedDeviceStateUpdateActionTaskRecord
  **/

  public Object getIssuedDeviceStateUpdateActionTaskRecord() {
    return issuedDeviceStateUpdateActionTaskRecord;
  }

  public void setIssuedDeviceStateUpdateActionTaskRecord(Object issuedDeviceStateUpdateActionTaskRecord) {
    this.issuedDeviceStateUpdateActionTaskRecord = issuedDeviceStateUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

