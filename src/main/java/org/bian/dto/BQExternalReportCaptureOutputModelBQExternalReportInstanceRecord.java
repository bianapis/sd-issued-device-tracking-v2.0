package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExternalReportCaptureOutputModelBQExternalReportInstanceRecord
 */
public class BQExternalReportCaptureOutputModelBQExternalReportInstanceRecord   {
  private String statusUpdateResult = null;

  private String date = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The response to the status update request (e.g. update processed) 
   * @return statusUpdateResult
  **/

  public String getStatusUpdateResult() {
    return statusUpdateResult;
  }

  public void setStatusUpdateResult(String statusUpdateResult) {
    this.statusUpdateResult = statusUpdateResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Key dates and times associated with the external notification 
   * @return date
  **/

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


}

