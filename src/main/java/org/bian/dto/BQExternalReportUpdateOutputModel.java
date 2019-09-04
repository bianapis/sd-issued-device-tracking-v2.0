package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExternalReportUpdateInputModelBQExternalReportInstanceRecord;
import org.bian.dto.BQExternalReportUpdateInputModelCRIssuedDeviceTrackingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQExternalReportUpdateOutputModel
 */
public class BQExternalReportUpdateOutputModel   {
  private BQExternalReportUpdateInputModelCRIssuedDeviceTrackingInstanceRecord cRIssuedDeviceTrackingInstanceRecord = null;

  private BQExternalReportUpdateInputModelBQExternalReportInstanceRecord bQExternalReportInstanceRecord = null;

  private String externalReportUpdateActionTaskReference = null;

  private Object externalReportUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get cRIssuedDeviceTrackingInstanceRecord
   * @return cRIssuedDeviceTrackingInstanceRecord
  **/

  public BQExternalReportUpdateInputModelCRIssuedDeviceTrackingInstanceRecord getCRIssuedDeviceTrackingInstanceRecord() {
    return cRIssuedDeviceTrackingInstanceRecord;
  }

  @JsonProperty("cRIssuedDeviceTrackingInstanceRecord")
  public void setCRIssuedDeviceTrackingInstanceRecord(BQExternalReportUpdateInputModelCRIssuedDeviceTrackingInstanceRecord cRIssuedDeviceTrackingInstanceRecord) {
    this.cRIssuedDeviceTrackingInstanceRecord = cRIssuedDeviceTrackingInstanceRecord;
  }


  /**
   * Get bQExternalReportInstanceRecord
   * @return bQExternalReportInstanceRecord
  **/

  public BQExternalReportUpdateInputModelBQExternalReportInstanceRecord getBQExternalReportInstanceRecord() {
    return bQExternalReportInstanceRecord;
  }

  @JsonProperty("bQExternalReportInstanceRecord")
  public void setBQExternalReportInstanceRecord(BQExternalReportUpdateInputModelBQExternalReportInstanceRecord bQExternalReportInstanceRecord) {
    this.bQExternalReportInstanceRecord = bQExternalReportInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return externalReportUpdateActionTaskReference
  **/

  public String getExternalReportUpdateActionTaskReference() {
    return externalReportUpdateActionTaskReference;
  }

  public void setExternalReportUpdateActionTaskReference(String externalReportUpdateActionTaskReference) {
    this.externalReportUpdateActionTaskReference = externalReportUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return externalReportUpdateActionTaskRecord
  **/

  public Object getExternalReportUpdateActionTaskRecord() {
    return externalReportUpdateActionTaskRecord;
  }

  public void setExternalReportUpdateActionTaskRecord(Object externalReportUpdateActionTaskRecord) {
    this.externalReportUpdateActionTaskRecord = externalReportUpdateActionTaskRecord;
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

