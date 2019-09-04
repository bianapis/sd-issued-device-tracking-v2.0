package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceStateRetrieveOutputModelIssuedDeviceStateInstanceReportRecord
 */
public class CRIssuedDeviceStateRetrieveOutputModelIssuedDeviceStateInstanceReportRecord   {
  private String issuedDeviceStateInstanceReportData = null;

  private String issuedDeviceStateInstanceReportType = null;

  private Object issuedDeviceStateInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return issuedDeviceStateInstanceReportData
  **/

  public String getIssuedDeviceStateInstanceReportData() {
    return issuedDeviceStateInstanceReportData;
  }

  public void setIssuedDeviceStateInstanceReportData(String issuedDeviceStateInstanceReportData) {
    this.issuedDeviceStateInstanceReportData = issuedDeviceStateInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return issuedDeviceStateInstanceReportType
  **/

  public String getIssuedDeviceStateInstanceReportType() {
    return issuedDeviceStateInstanceReportType;
  }

  public void setIssuedDeviceStateInstanceReportType(String issuedDeviceStateInstanceReportType) {
    this.issuedDeviceStateInstanceReportType = issuedDeviceStateInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return issuedDeviceStateInstanceReport
  **/

  public Object getIssuedDeviceStateInstanceReport() {
    return issuedDeviceStateInstanceReport;
  }

  public void setIssuedDeviceStateInstanceReport(Object issuedDeviceStateInstanceReport) {
    this.issuedDeviceStateInstanceReport = issuedDeviceStateInstanceReport;
  }


}

