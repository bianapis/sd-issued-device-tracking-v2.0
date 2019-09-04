package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExternalReportRetrieveInputModelExternalReportInstanceReport
 */
public class BQExternalReportRetrieveInputModelExternalReportInstanceReport   {
  private String externalReportInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return externalReportInstanceReportReference
  **/

  public String getExternalReportInstanceReportReference() {
    return externalReportInstanceReportReference;
  }

  public void setExternalReportInstanceReportReference(String externalReportInstanceReportReference) {
    this.externalReportInstanceReportReference = externalReportInstanceReportReference;
  }


}

