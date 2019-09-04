package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceStateRetrieveOutputModelIssuedDeviceStateInstanceAnalysis
 */
public class CRIssuedDeviceStateRetrieveOutputModelIssuedDeviceStateInstanceAnalysis   {
  private String issuedDeviceStateInstanceAnalysisData = null;

  private String issuedDeviceStateInstanceAnalysisReportType = null;

  private Object issuedDeviceStateInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return issuedDeviceStateInstanceAnalysisData
  **/

  public String getIssuedDeviceStateInstanceAnalysisData() {
    return issuedDeviceStateInstanceAnalysisData;
  }

  public void setIssuedDeviceStateInstanceAnalysisData(String issuedDeviceStateInstanceAnalysisData) {
    this.issuedDeviceStateInstanceAnalysisData = issuedDeviceStateInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return issuedDeviceStateInstanceAnalysisReportType
  **/

  public String getIssuedDeviceStateInstanceAnalysisReportType() {
    return issuedDeviceStateInstanceAnalysisReportType;
  }

  public void setIssuedDeviceStateInstanceAnalysisReportType(String issuedDeviceStateInstanceAnalysisReportType) {
    this.issuedDeviceStateInstanceAnalysisReportType = issuedDeviceStateInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return issuedDeviceStateInstanceAnalysisReport
  **/

  public Object getIssuedDeviceStateInstanceAnalysisReport() {
    return issuedDeviceStateInstanceAnalysisReport;
  }

  public void setIssuedDeviceStateInstanceAnalysisReport(Object issuedDeviceStateInstanceAnalysisReport) {
    this.issuedDeviceStateInstanceAnalysisReport = issuedDeviceStateInstanceAnalysisReport;
  }


}

