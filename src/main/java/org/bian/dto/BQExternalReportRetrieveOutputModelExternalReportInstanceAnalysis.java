package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExternalReportRetrieveOutputModelExternalReportInstanceAnalysis
 */
public class BQExternalReportRetrieveOutputModelExternalReportInstanceAnalysis   {
  private Object externalReportInstanceAnalysisRecord = null;

  private String externalReportInstanceAnalysisReportType = null;

  private String externalReportInstanceAnalysisParameters = null;

  private Object externalReportInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return externalReportInstanceAnalysisRecord
  **/

  public Object getExternalReportInstanceAnalysisRecord() {
    return externalReportInstanceAnalysisRecord;
  }

  public void setExternalReportInstanceAnalysisRecord(Object externalReportInstanceAnalysisRecord) {
    this.externalReportInstanceAnalysisRecord = externalReportInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return externalReportInstanceAnalysisReportType
  **/

  public String getExternalReportInstanceAnalysisReportType() {
    return externalReportInstanceAnalysisReportType;
  }

  public void setExternalReportInstanceAnalysisReportType(String externalReportInstanceAnalysisReportType) {
    this.externalReportInstanceAnalysisReportType = externalReportInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return externalReportInstanceAnalysisParameters
  **/

  public String getExternalReportInstanceAnalysisParameters() {
    return externalReportInstanceAnalysisParameters;
  }

  public void setExternalReportInstanceAnalysisParameters(String externalReportInstanceAnalysisParameters) {
    this.externalReportInstanceAnalysisParameters = externalReportInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return externalReportInstanceAnalysisReport
  **/

  public Object getExternalReportInstanceAnalysisReport() {
    return externalReportInstanceAnalysisReport;
  }

  public void setExternalReportInstanceAnalysisReport(Object externalReportInstanceAnalysisReport) {
    this.externalReportInstanceAnalysisReport = externalReportInstanceAnalysisReport;
  }


}

