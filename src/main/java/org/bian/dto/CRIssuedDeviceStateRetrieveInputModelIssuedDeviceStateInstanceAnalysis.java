package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceStateRetrieveInputModelIssuedDeviceStateInstanceAnalysis
 */
public class CRIssuedDeviceStateRetrieveInputModelIssuedDeviceStateInstanceAnalysis   {
  private String issuedDeviceStateInstanceAnalysisReference = null;

  private String issuedDeviceStateInstanceAnalysisReportType = null;

  private String issuedDeviceStateInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return issuedDeviceStateInstanceAnalysisReference
  **/

  public String getIssuedDeviceStateInstanceAnalysisReference() {
    return issuedDeviceStateInstanceAnalysisReference;
  }

  public void setIssuedDeviceStateInstanceAnalysisReference(String issuedDeviceStateInstanceAnalysisReference) {
    this.issuedDeviceStateInstanceAnalysisReference = issuedDeviceStateInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return issuedDeviceStateInstanceAnalysisParameters
  **/

  public String getIssuedDeviceStateInstanceAnalysisParameters() {
    return issuedDeviceStateInstanceAnalysisParameters;
  }

  public void setIssuedDeviceStateInstanceAnalysisParameters(String issuedDeviceStateInstanceAnalysisParameters) {
    this.issuedDeviceStateInstanceAnalysisParameters = issuedDeviceStateInstanceAnalysisParameters;
  }


}

