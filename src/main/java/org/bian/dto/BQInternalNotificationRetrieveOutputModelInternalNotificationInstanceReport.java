package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInternalNotificationRetrieveOutputModelInternalNotificationInstanceReport
 */
public class BQInternalNotificationRetrieveOutputModelInternalNotificationInstanceReport   {
  private Object internalNotificationInstanceReportRecord = null;

  private String internalNotificationInstanceReportType = null;

  private String internalNotificationInstanceReportParameters = null;

  private Object internalNotificationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return internalNotificationInstanceReportRecord
  **/

  public Object getInternalNotificationInstanceReportRecord() {
    return internalNotificationInstanceReportRecord;
  }

  public void setInternalNotificationInstanceReportRecord(Object internalNotificationInstanceReportRecord) {
    this.internalNotificationInstanceReportRecord = internalNotificationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return internalNotificationInstanceReportType
  **/

  public String getInternalNotificationInstanceReportType() {
    return internalNotificationInstanceReportType;
  }

  public void setInternalNotificationInstanceReportType(String internalNotificationInstanceReportType) {
    this.internalNotificationInstanceReportType = internalNotificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return internalNotificationInstanceReportParameters
  **/

  public String getInternalNotificationInstanceReportParameters() {
    return internalNotificationInstanceReportParameters;
  }

  public void setInternalNotificationInstanceReportParameters(String internalNotificationInstanceReportParameters) {
    this.internalNotificationInstanceReportParameters = internalNotificationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return internalNotificationInstanceReport
  **/

  public Object getInternalNotificationInstanceReport() {
    return internalNotificationInstanceReport;
  }

  public void setInternalNotificationInstanceReport(Object internalNotificationInstanceReport) {
    this.internalNotificationInstanceReport = internalNotificationInstanceReport;
  }


}

