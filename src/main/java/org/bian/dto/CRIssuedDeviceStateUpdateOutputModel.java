package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceStateUpdateInputModelCRIssuedDeviceTrackingInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceStateUpdateOutputModel
 */
public class CRIssuedDeviceStateUpdateOutputModel   {
  private CRIssuedDeviceStateUpdateInputModelCRIssuedDeviceTrackingInstanceRecord cRIssuedDeviceTrackingInstanceRecord = null;

  private String issuedDeviceStateUpdateActionTaskReference = null;

  private Object issuedDeviceStateUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get cRIssuedDeviceTrackingInstanceRecord
   * @return cRIssuedDeviceTrackingInstanceRecord
  **/

  public CRIssuedDeviceStateUpdateInputModelCRIssuedDeviceTrackingInstanceRecord getCRIssuedDeviceTrackingInstanceRecord() {
    return cRIssuedDeviceTrackingInstanceRecord;
  }

  @JsonProperty("cRIssuedDeviceTrackingInstanceRecord")
  public void setCRIssuedDeviceTrackingInstanceRecord(CRIssuedDeviceStateUpdateInputModelCRIssuedDeviceTrackingInstanceRecord cRIssuedDeviceTrackingInstanceRecord) {
    this.cRIssuedDeviceTrackingInstanceRecord = cRIssuedDeviceTrackingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return issuedDeviceStateUpdateActionTaskReference
  **/

  public String getIssuedDeviceStateUpdateActionTaskReference() {
    return issuedDeviceStateUpdateActionTaskReference;
  }

  public void setIssuedDeviceStateUpdateActionTaskReference(String issuedDeviceStateUpdateActionTaskReference) {
    this.issuedDeviceStateUpdateActionTaskReference = issuedDeviceStateUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

