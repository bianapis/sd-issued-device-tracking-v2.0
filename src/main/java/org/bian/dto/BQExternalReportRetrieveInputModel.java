package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExternalReportRetrieveInputModelExternalReportInstanceAnalysis;
import org.bian.dto.BQExternalReportRetrieveInputModelExternalReportInstanceReport;

import javax.validation.Valid;
  
/**
 * BQExternalReportRetrieveInputModel
 */
public class BQExternalReportRetrieveInputModel   {
  private Object externalReportRetrieveActionTaskRecord = null;

  private String externalReportRetrieveActionRequest = null;

  private BQExternalReportRetrieveInputModelExternalReportInstanceReport externalReportInstanceReport = null;

  private BQExternalReportRetrieveInputModelExternalReportInstanceAnalysis externalReportInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return externalReportRetrieveActionRequest
  **/

  public String getExternalReportRetrieveActionRequest() {
    return externalReportRetrieveActionRequest;
  }

  public void setExternalReportRetrieveActionRequest(String externalReportRetrieveActionRequest) {
    this.externalReportRetrieveActionRequest = externalReportRetrieveActionRequest;
  }


  /**
   * Get externalReportInstanceReport
   * @return externalReportInstanceReport
  **/

  public BQExternalReportRetrieveInputModelExternalReportInstanceReport getExternalReportInstanceReport() {
    return externalReportInstanceReport;
  }

  public void setExternalReportInstanceReport(BQExternalReportRetrieveInputModelExternalReportInstanceReport externalReportInstanceReport) {
    this.externalReportInstanceReport = externalReportInstanceReport;
  }


  /**
   * Get externalReportInstanceAnalysis
   * @return externalReportInstanceAnalysis
  **/

  public BQExternalReportRetrieveInputModelExternalReportInstanceAnalysis getExternalReportInstanceAnalysis() {
    return externalReportInstanceAnalysis;
  }

  public void setExternalReportInstanceAnalysis(BQExternalReportRetrieveInputModelExternalReportInstanceAnalysis externalReportInstanceAnalysis) {
    this.externalReportInstanceAnalysis = externalReportInstanceAnalysis;
  }


}

