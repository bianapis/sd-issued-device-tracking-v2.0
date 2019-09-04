package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExternalReportRetrieveOutputModelBQExternalReportInstanceRecord;
import org.bian.dto.BQExternalReportRetrieveOutputModelCRIssuedDeviceTrackingInstanceRecord;
import org.bian.dto.BQExternalReportRetrieveOutputModelExternalReportInstanceAnalysis;
import org.bian.dto.BQExternalReportRetrieveOutputModelExternalReportInstanceReport;

import javax.validation.Valid;
  
/**
 * BQExternalReportRetrieveOutputModel
 */
public class BQExternalReportRetrieveOutputModel   {
  private BQExternalReportRetrieveOutputModelCRIssuedDeviceTrackingInstanceRecord cRIssuedDeviceTrackingInstanceRecord = null;

  private BQExternalReportRetrieveOutputModelBQExternalReportInstanceRecord bQExternalReportInstanceRecord = null;

  private String externalReportRetrieveActionTaskReference = null;

  private Object externalReportRetrieveActionTaskRecord = null;

  private String externalReportRetrieveActionResponse = null;

  private BQExternalReportRetrieveOutputModelExternalReportInstanceReport externalReportInstanceReport = null;

  private BQExternalReportRetrieveOutputModelExternalReportInstanceAnalysis externalReportInstanceAnalysis = null;


  /**
   * Get cRIssuedDeviceTrackingInstanceRecord
   * @return cRIssuedDeviceTrackingInstanceRecord
  **/

  public BQExternalReportRetrieveOutputModelCRIssuedDeviceTrackingInstanceRecord getCRIssuedDeviceTrackingInstanceRecord() {
    return cRIssuedDeviceTrackingInstanceRecord;
  }

  @JsonProperty("cRIssuedDeviceTrackingInstanceRecord")
  public void setCRIssuedDeviceTrackingInstanceRecord(BQExternalReportRetrieveOutputModelCRIssuedDeviceTrackingInstanceRecord cRIssuedDeviceTrackingInstanceRecord) {
    this.cRIssuedDeviceTrackingInstanceRecord = cRIssuedDeviceTrackingInstanceRecord;
  }


  /**
   * Get bQExternalReportInstanceRecord
   * @return bQExternalReportInstanceRecord
  **/

  public BQExternalReportRetrieveOutputModelBQExternalReportInstanceRecord getBQExternalReportInstanceRecord() {
    return bQExternalReportInstanceRecord;
  }

  @JsonProperty("bQExternalReportInstanceRecord")
  public void setBQExternalReportInstanceRecord(BQExternalReportRetrieveOutputModelBQExternalReportInstanceRecord bQExternalReportInstanceRecord) {
    this.bQExternalReportInstanceRecord = bQExternalReportInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a External Report instance retrieve service call 
   * @return externalReportRetrieveActionTaskReference
  **/

  public String getExternalReportRetrieveActionTaskReference() {
    return externalReportRetrieveActionTaskReference;
  }

  public void setExternalReportRetrieveActionTaskReference(String externalReportRetrieveActionTaskReference) {
    this.externalReportRetrieveActionTaskReference = externalReportRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return externalReportRetrieveActionTaskRecord
  **/

  public Object getExternalReportRetrieveActionTaskRecord() {
    return externalReportRetrieveActionTaskRecord;
  }

  public void setExternalReportRetrieveActionTaskRecord(Object externalReportRetrieveActionTaskRecord) {
    this.externalReportRetrieveActionTaskRecord = externalReportRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return externalReportRetrieveActionResponse
  **/

  public String getExternalReportRetrieveActionResponse() {
    return externalReportRetrieveActionResponse;
  }

  public void setExternalReportRetrieveActionResponse(String externalReportRetrieveActionResponse) {
    this.externalReportRetrieveActionResponse = externalReportRetrieveActionResponse;
  }


  /**
   * Get externalReportInstanceReport
   * @return externalReportInstanceReport
  **/

  public BQExternalReportRetrieveOutputModelExternalReportInstanceReport getExternalReportInstanceReport() {
    return externalReportInstanceReport;
  }

  public void setExternalReportInstanceReport(BQExternalReportRetrieveOutputModelExternalReportInstanceReport externalReportInstanceReport) {
    this.externalReportInstanceReport = externalReportInstanceReport;
  }


  /**
   * Get externalReportInstanceAnalysis
   * @return externalReportInstanceAnalysis
  **/

  public BQExternalReportRetrieveOutputModelExternalReportInstanceAnalysis getExternalReportInstanceAnalysis() {
    return externalReportInstanceAnalysis;
  }

  public void setExternalReportInstanceAnalysis(BQExternalReportRetrieveOutputModelExternalReportInstanceAnalysis externalReportInstanceAnalysis) {
    this.externalReportInstanceAnalysis = externalReportInstanceAnalysis;
  }


}

