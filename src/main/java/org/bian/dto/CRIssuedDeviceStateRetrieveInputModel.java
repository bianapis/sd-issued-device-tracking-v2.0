package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceStateRetrieveInputModelIssuedDeviceStateInstanceAnalysis;
import org.bian.dto.CRIssuedDeviceStateRetrieveInputModelIssuedDeviceStateInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceStateRetrieveInputModel
 */
public class CRIssuedDeviceStateRetrieveInputModel   {
  private Object issuedDeviceStateRetrieveActionTaskRecord = null;

  private String issuedDeviceStateRetrieveActionRequest = null;

  private CRIssuedDeviceStateRetrieveInputModelIssuedDeviceStateInstanceReportRecord issuedDeviceStateInstanceReportRecord = null;

  private CRIssuedDeviceStateRetrieveInputModelIssuedDeviceStateInstanceAnalysis issuedDeviceStateInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return issuedDeviceStateRetrieveActionRequest
  **/

  public String getIssuedDeviceStateRetrieveActionRequest() {
    return issuedDeviceStateRetrieveActionRequest;
  }

  public void setIssuedDeviceStateRetrieveActionRequest(String issuedDeviceStateRetrieveActionRequest) {
    this.issuedDeviceStateRetrieveActionRequest = issuedDeviceStateRetrieveActionRequest;
  }


  /**
   * Get issuedDeviceStateInstanceReportRecord
   * @return issuedDeviceStateInstanceReportRecord
  **/

  public CRIssuedDeviceStateRetrieveInputModelIssuedDeviceStateInstanceReportRecord getIssuedDeviceStateInstanceReportRecord() {
    return issuedDeviceStateInstanceReportRecord;
  }

  public void setIssuedDeviceStateInstanceReportRecord(CRIssuedDeviceStateRetrieveInputModelIssuedDeviceStateInstanceReportRecord issuedDeviceStateInstanceReportRecord) {
    this.issuedDeviceStateInstanceReportRecord = issuedDeviceStateInstanceReportRecord;
  }


  /**
   * Get issuedDeviceStateInstanceAnalysis
   * @return issuedDeviceStateInstanceAnalysis
  **/

  public CRIssuedDeviceStateRetrieveInputModelIssuedDeviceStateInstanceAnalysis getIssuedDeviceStateInstanceAnalysis() {
    return issuedDeviceStateInstanceAnalysis;
  }

  public void setIssuedDeviceStateInstanceAnalysis(CRIssuedDeviceStateRetrieveInputModelIssuedDeviceStateInstanceAnalysis issuedDeviceStateInstanceAnalysis) {
    this.issuedDeviceStateInstanceAnalysis = issuedDeviceStateInstanceAnalysis;
  }


}

