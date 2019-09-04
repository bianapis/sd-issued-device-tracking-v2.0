package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExternalReportCaptureOutputModelBQExternalReportInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQExternalReportCaptureOutputModel
 */
public class BQExternalReportCaptureOutputModel   {
  private BQExternalReportCaptureOutputModelBQExternalReportInstanceRecord bQExternalReportInstanceRecord = null;

  private String externalReportCaptureActionTaskReference = null;

  private Object externalReportCaptureActionTaskRecord = null;

  private String externalReportCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get bQExternalReportInstanceRecord
   * @return bQExternalReportInstanceRecord
  **/

  public BQExternalReportCaptureOutputModelBQExternalReportInstanceRecord getBQExternalReportInstanceRecord() {
    return bQExternalReportInstanceRecord;
  }

  @JsonProperty("bQExternalReportInstanceRecord")
  public void setBQExternalReportInstanceRecord(BQExternalReportCaptureOutputModelBQExternalReportInstanceRecord bQExternalReportInstanceRecord) {
    this.bQExternalReportInstanceRecord = bQExternalReportInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a External Report instance capture service call 
   * @return externalReportCaptureActionTaskReference
  **/

  public String getExternalReportCaptureActionTaskReference() {
    return externalReportCaptureActionTaskReference;
  }

  public void setExternalReportCaptureActionTaskReference(String externalReportCaptureActionTaskReference) {
    this.externalReportCaptureActionTaskReference = externalReportCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the External Report structured input transaction/record 
   * @return externalReportCaptureRecordReference
  **/

  public String getExternalReportCaptureRecordReference() {
    return externalReportCaptureRecordReference;
  }

  public void setExternalReportCaptureRecordReference(String externalReportCaptureRecordReference) {
    this.externalReportCaptureRecordReference = externalReportCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

