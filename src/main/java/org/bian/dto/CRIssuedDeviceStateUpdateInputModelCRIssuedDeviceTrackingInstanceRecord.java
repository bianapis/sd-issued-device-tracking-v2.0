package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceStateInitiateInputModelCRIssuedDeviceTrackingInstanceRecordIssuedDeviceAllocationInstanceReference;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceStateUpdateInputModelCRIssuedDeviceTrackingInstanceRecord
 */
public class CRIssuedDeviceStateUpdateInputModelCRIssuedDeviceTrackingInstanceRecord   {
  private String informationFeedProviderReference = null;

  private CRIssuedDeviceStateInitiateInputModelCRIssuedDeviceTrackingInstanceRecordIssuedDeviceAllocationInstanceReference issuedDeviceAllocationInstanceReference = null;

  private Object issuedDeviceAllocationInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the external information feed service supplier (IP) providing device status reports 
   * @return informationFeedProviderReference
  **/

  public String getInformationFeedProviderReference() {
    return informationFeedProviderReference;
  }

  public void setInformationFeedProviderReference(String informationFeedProviderReference) {
    this.informationFeedProviderReference = informationFeedProviderReference;
  }


  /**
   * Get issuedDeviceAllocationInstanceReference
   * @return issuedDeviceAllocationInstanceReference
  **/

  public CRIssuedDeviceStateInitiateInputModelCRIssuedDeviceTrackingInstanceRecordIssuedDeviceAllocationInstanceReference getIssuedDeviceAllocationInstanceReference() {
    return issuedDeviceAllocationInstanceReference;
  }

  public void setIssuedDeviceAllocationInstanceReference(CRIssuedDeviceStateInitiateInputModelCRIssuedDeviceTrackingInstanceRecordIssuedDeviceAllocationInstanceReference issuedDeviceAllocationInstanceReference) {
    this.issuedDeviceAllocationInstanceReference = issuedDeviceAllocationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the issued device for reference as necessary 
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public Object getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(Object issuedDeviceAllocationInstanceRecord) {
    this.issuedDeviceAllocationInstanceRecord = issuedDeviceAllocationInstanceRecord;
  }


}

