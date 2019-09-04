package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExternalReportCaptureInputModelBQExternalReportInstanceRecord;
import org.bian.dto.BQInternalNotificationCaptureInputModelCaptureRecordType;

import javax.validation.Valid;
  
/**
 * BQExternalReportCaptureInputModel
 */
public class BQExternalReportCaptureInputModel   {
  private String issuedDeviceStateInstanceReference = null;

  private String externalReportInstanceReference = null;

  private BQExternalReportCaptureInputModelBQExternalReportInstanceRecord bQExternalReportInstanceRecord = null;

  private Object externalReportCaptureActionTaskRecord = null;

  private BQInternalNotificationCaptureInputModelCaptureRecordType captureRecordType = null;


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

  public BQExternalReportCaptureInputModelBQExternalReportInstanceRecord getBQExternalReportInstanceRecord() {
    return bQExternalReportInstanceRecord;
  }

  public void setBQExternalReportInstanceRecord(BQExternalReportCaptureInputModelBQExternalReportInstanceRecord bQExternalReportInstanceRecord) {
    this.bQExternalReportInstanceRecord = bQExternalReportInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return externalReportCaptureActionTaskRecord
  **/

  public Object getExternalReportCaptureActionTaskRecord() {
    return externalReportCaptureActionTaskRecord;
  }

  public void setExternalReportCaptureActionTaskRecord(Object externalReportCaptureActionTaskRecord) {
    this.externalReportCaptureActionTaskRecord = externalReportCaptureActionTaskRecord;
  }


  /**
   * Get captureRecordType
   * @return captureRecordType
  **/

  public BQInternalNotificationCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(BQInternalNotificationCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

