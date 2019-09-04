package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceStateInitiateInputModelCRIssuedDeviceTrackingInstanceRecordIssuedDeviceAllocationInstanceReference
 */
public class CRIssuedDeviceStateInitiateInputModelCRIssuedDeviceTrackingInstanceRecordIssuedDeviceAllocationInstanceReference   {
  private String issuedDeviceAllocationStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Is the status of the issued device that is updated 
   * @return issuedDeviceAllocationStatus
  **/

  public String getIssuedDeviceAllocationStatus() {
    return issuedDeviceAllocationStatus;
  }

  public void setIssuedDeviceAllocationStatus(String issuedDeviceAllocationStatus) {
    this.issuedDeviceAllocationStatus = issuedDeviceAllocationStatus;
  }


}

