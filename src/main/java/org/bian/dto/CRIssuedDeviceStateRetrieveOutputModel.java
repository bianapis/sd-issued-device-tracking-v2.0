package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceStateRetrieveOutputModelCRIssuedDeviceTrackingInstanceRecord;
import org.bian.dto.CRIssuedDeviceStateRetrieveOutputModelIssuedDeviceStateInstanceAnalysis;
import org.bian.dto.CRIssuedDeviceStateRetrieveOutputModelIssuedDeviceStateInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceStateRetrieveOutputModel
 */
public class CRIssuedDeviceStateRetrieveOutputModel   {
  private CRIssuedDeviceStateRetrieveOutputModelCRIssuedDeviceTrackingInstanceRecord cRIssuedDeviceTrackingInstanceRecord = null;

  private String issuedDeviceStateRetrieveActionTaskReference = null;

  private Object issuedDeviceStateRetrieveActionTaskRecord = null;

  private String issuedDeviceStateRetrieveActionResponse = null;

  private CRIssuedDeviceStateRetrieveOutputModelIssuedDeviceStateInstanceReportRecord issuedDeviceStateInstanceReportRecord = null;

  private CRIssuedDeviceStateRetrieveOutputModelIssuedDeviceStateInstanceAnalysis issuedDeviceStateInstanceAnalysis = null;


  /**
   * Get cRIssuedDeviceTrackingInstanceRecord
   * @return cRIssuedDeviceTrackingInstanceRecord
  **/

  public CRIssuedDeviceStateRetrieveOutputModelCRIssuedDeviceTrackingInstanceRecord getCRIssuedDeviceTrackingInstanceRecord() {
    return cRIssuedDeviceTrackingInstanceRecord;
  }

  @JsonProperty("cRIssuedDeviceTrackingInstanceRecord")
  public void setCRIssuedDeviceTrackingInstanceRecord(CRIssuedDeviceStateRetrieveOutputModelCRIssuedDeviceTrackingInstanceRecord cRIssuedDeviceTrackingInstanceRecord) {
    this.cRIssuedDeviceTrackingInstanceRecord = cRIssuedDeviceTrackingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Issued Device State instance retrieve service call 
   * @return issuedDeviceStateRetrieveActionTaskReference
  **/

  public String getIssuedDeviceStateRetrieveActionTaskReference() {
    return issuedDeviceStateRetrieveActionTaskReference;
  }

  public void setIssuedDeviceStateRetrieveActionTaskReference(String issuedDeviceStateRetrieveActionTaskReference) {
    this.issuedDeviceStateRetrieveActionTaskReference = issuedDeviceStateRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return issuedDeviceStateRetrieveActionTaskRecord
  **/

  public Object getIssuedDeviceStateRetrieveActionTaskRecord() {
    return issuedDeviceStateRetrieveActionTaskRecord;
  }

  public void setIssuedDeviceStateRetrieveActionTaskRecord(Object issuedDeviceStateRetrieveActionTaskRecord) {
    this.issuedDeviceStateRetrieveActionTaskRecord = issuedDeviceStateRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return issuedDeviceStateRetrieveActionResponse
  **/

  public String getIssuedDeviceStateRetrieveActionResponse() {
    return issuedDeviceStateRetrieveActionResponse;
  }

  public void setIssuedDeviceStateRetrieveActionResponse(String issuedDeviceStateRetrieveActionResponse) {
    this.issuedDeviceStateRetrieveActionResponse = issuedDeviceStateRetrieveActionResponse;
  }


  /**
   * Get issuedDeviceStateInstanceReportRecord
   * @return issuedDeviceStateInstanceReportRecord
  **/

  public CRIssuedDeviceStateRetrieveOutputModelIssuedDeviceStateInstanceReportRecord getIssuedDeviceStateInstanceReportRecord() {
    return issuedDeviceStateInstanceReportRecord;
  }

  public void setIssuedDeviceStateInstanceReportRecord(CRIssuedDeviceStateRetrieveOutputModelIssuedDeviceStateInstanceReportRecord issuedDeviceStateInstanceReportRecord) {
    this.issuedDeviceStateInstanceReportRecord = issuedDeviceStateInstanceReportRecord;
  }


  /**
   * Get issuedDeviceStateInstanceAnalysis
   * @return issuedDeviceStateInstanceAnalysis
  **/

  public CRIssuedDeviceStateRetrieveOutputModelIssuedDeviceStateInstanceAnalysis getIssuedDeviceStateInstanceAnalysis() {
    return issuedDeviceStateInstanceAnalysis;
  }

  public void setIssuedDeviceStateInstanceAnalysis(CRIssuedDeviceStateRetrieveOutputModelIssuedDeviceStateInstanceAnalysis issuedDeviceStateInstanceAnalysis) {
    this.issuedDeviceStateInstanceAnalysis = issuedDeviceStateInstanceAnalysis;
  }


}

