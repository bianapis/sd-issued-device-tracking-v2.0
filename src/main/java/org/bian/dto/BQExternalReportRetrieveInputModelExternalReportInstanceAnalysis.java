package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExternalReportRetrieveInputModelExternalReportInstanceAnalysis
 */
public class BQExternalReportRetrieveInputModelExternalReportInstanceAnalysis   {
  private String externalReportInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return externalReportInstanceAnalysisReference
  **/

  public String getExternalReportInstanceAnalysisReference() {
    return externalReportInstanceAnalysisReference;
  }

  public void setExternalReportInstanceAnalysisReference(String externalReportInstanceAnalysisReference) {
    this.externalReportInstanceAnalysisReference = externalReportInstanceAnalysisReference;
  }


}

