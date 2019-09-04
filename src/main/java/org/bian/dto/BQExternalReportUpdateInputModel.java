package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExternalReportUpdateInputModelBQExternalReportInstanceRecord;
import org.bian.dto.BQExternalReportUpdateInputModelCRIssuedDeviceTrackingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQExternalReportUpdateInputModel
 */
public class BQExternalReportUpdateInputModel   {
  private BQExternalReportUpdateInputModelCRIssuedDeviceTrackingInstanceRecord cRIssuedDeviceTrackingInstanceRecord = null;

  private String issuedDeviceStateInstanceReference = null;

  private String externalReportInstanceReference = null;

  private BQExternalReportUpdateInputModelBQExternalReportInstanceRecord bQExternalReportInstanceRecord = null;

  private Object externalReportUpdateActionTaskRecord = null;

  private String externalReportUpdateActionRequest = null;


  /**
   * Get cRIssuedDeviceTrackingInstanceRecord
   * @return cRIssuedDeviceTrackingInstanceRecord
  **/

  public BQExternalReportUpdateInputModelCRIssuedDeviceTrackingInstanceRecord getCRIssuedDeviceTrackingInstanceRecord() {
    return cRIssuedDeviceTrackingInstanceRecord;
  }

  public void setCRIssuedDeviceTrackingInstanceRecord(BQExternalReportUpdateInputModelCRIssuedDeviceTrackingInstanceRecord cRIssuedDeviceTrackingInstanceRecord) {
    this.cRIssuedDeviceTrackingInstanceRecord = cRIssuedDeviceTrackingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Issued Device State instance 
   * @return issuedDeviceStateInstanceReference
  **/

  public String getIssuedDeviceStateInstanceReference() {
    return issuedDeviceStateInstanceReference;
  }

  public void setIssuedDeviceStateInstanceReference(String issuedDeviceStateInstanceReference) {
    this.issuedDeviceStateInstanceReference = issuedDeviceStateInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the External Report instance 
   * @return externalReportInstanceReference
  **/

  public String getExternalReportInstanceReference() {
    return externalReportInstanceReference;
  }

  public void setExternalReportInstanceReference(String externalReportInstanceReference) {
    this.externalReportInstanceReference = externalReportInstanceReference;
  }


  /**
   * Get bQExternalReportInstanceRecord
   * @return bQExternalReportInstanceRecord
  **/

  public BQExternalReportUpdateInputModelBQExternalReportInstanceRecord getBQExternalReportInstanceRecord() {
    return bQExternalReportInstanceRecord;
  }

  public void setBQExternalReportInstanceRecord(BQExternalReportUpdateInputModelBQExternalReportInstanceRecord bQExternalReportInstanceRecord) {
    this.bQExternalReportInstanceRecord = bQExternalReportInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return externalReportUpdateActionRequest
  **/

  public String getExternalReportUpdateActionRequest() {
    return externalReportUpdateActionRequest;
  }

  public void setExternalReportUpdateActionRequest(String externalReportUpdateActionRequest) {
    this.externalReportUpdateActionRequest = externalReportUpdateActionRequest;
  }


}

