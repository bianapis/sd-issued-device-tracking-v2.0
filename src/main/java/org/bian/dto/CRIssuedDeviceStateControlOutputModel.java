package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceStateControlOutputModel
 */
public class CRIssuedDeviceStateControlOutputModel   {
  private String issuedDeviceStateControlActionTaskReference = null;

  private Object issuedDeviceStateControlActionTaskRecord = null;

  private String issuedDeviceStateControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Issued Device State instance control processing service call 
   * @return issuedDeviceStateControlActionTaskReference
  **/

  public String getIssuedDeviceStateControlActionTaskReference() {
    return issuedDeviceStateControlActionTaskReference;
  }

  public void setIssuedDeviceStateControlActionTaskReference(String issuedDeviceStateControlActionTaskReference) {
    this.issuedDeviceStateControlActionTaskReference = issuedDeviceStateControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return issuedDeviceStateControlActionTaskRecord
  **/

  public Object getIssuedDeviceStateControlActionTaskRecord() {
    return issuedDeviceStateControlActionTaskRecord;
  }

  public void setIssuedDeviceStateControlActionTaskRecord(Object issuedDeviceStateControlActionTaskRecord) {
    this.issuedDeviceStateControlActionTaskRecord = issuedDeviceStateControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return issuedDeviceStateControlActionResponse
  **/

  public String getIssuedDeviceStateControlActionResponse() {
    return issuedDeviceStateControlActionResponse;
  }

  public void setIssuedDeviceStateControlActionResponse(String issuedDeviceStateControlActionResponse) {
    this.issuedDeviceStateControlActionResponse = issuedDeviceStateControlActionResponse;
  }


}

