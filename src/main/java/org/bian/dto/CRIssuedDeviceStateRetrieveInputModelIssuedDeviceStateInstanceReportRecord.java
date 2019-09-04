package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceStateRetrieveInputModelIssuedDeviceStateInstanceReportRecord
 */
public class CRIssuedDeviceStateRetrieveInputModelIssuedDeviceStateInstanceReportRecord   {
  private String issuedDeviceStateInstanceReportReference = null;

  private String issuedDeviceStateInstanceReportType = null;

  private String issuedDeviceStateInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return issuedDeviceStateInstanceReportReference
  **/

  public String getIssuedDeviceStateInstanceReportReference() {
    return issuedDeviceStateInstanceReportReference;
  }

  public void setIssuedDeviceStateInstanceReportReference(String issuedDeviceStateInstanceReportReference) {
    this.issuedDeviceStateInstanceReportReference = issuedDeviceStateInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return issuedDeviceStateInstanceReportParameters
  **/

  public String getIssuedDeviceStateInstanceReportParameters() {
    return issuedDeviceStateInstanceReportParameters;
  }

  public void setIssuedDeviceStateInstanceReportParameters(String issuedDeviceStateInstanceReportParameters) {
    this.issuedDeviceStateInstanceReportParameters = issuedDeviceStateInstanceReportParameters;
  }


}

