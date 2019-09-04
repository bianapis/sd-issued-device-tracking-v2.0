package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInternalNotificationRetrieveOutputModelInternalNotificationInstanceAnalysis
 */
public class BQInternalNotificationRetrieveOutputModelInternalNotificationInstanceAnalysis   {
  private Object internalNotificationInstanceAnalysisRecord = null;

  private String internalNotificationInstanceAnalysisReportType = null;

  private String internalNotificationInstanceAnalysisParameters = null;

  private Object internalNotificationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return internalNotificationInstanceAnalysisRecord
  **/

  public Object getInternalNotificationInstanceAnalysisRecord() {
    return internalNotificationInstanceAnalysisRecord;
  }

  public void setInternalNotificationInstanceAnalysisRecord(Object internalNotificationInstanceAnalysisRecord) {
    this.internalNotificationInstanceAnalysisRecord = internalNotificationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return internalNotificationInstanceAnalysisReportType
  **/

  public String getInternalNotificationInstanceAnalysisReportType() {
    return internalNotificationInstanceAnalysisReportType;
  }

  public void setInternalNotificationInstanceAnalysisReportType(String internalNotificationInstanceAnalysisReportType) {
    this.internalNotificationInstanceAnalysisReportType = internalNotificationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return internalNotificationInstanceAnalysisParameters
  **/

  public String getInternalNotificationInstanceAnalysisParameters() {
    return internalNotificationInstanceAnalysisParameters;
  }

  public void setInternalNotificationInstanceAnalysisParameters(String internalNotificationInstanceAnalysisParameters) {
    this.internalNotificationInstanceAnalysisParameters = internalNotificationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return internalNotificationInstanceAnalysisReport
  **/

  public Object getInternalNotificationInstanceAnalysisReport() {
    return internalNotificationInstanceAnalysisReport;
  }

  public void setInternalNotificationInstanceAnalysisReport(Object internalNotificationInstanceAnalysisReport) {
    this.internalNotificationInstanceAnalysisReport = internalNotificationInstanceAnalysisReport;
  }


}

