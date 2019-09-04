package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceStateControlInputModelIssuedDeviceStateControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceStateControlInputModel
 */
public class CRIssuedDeviceStateControlInputModel   {
  private String issuedDeviceTrackingServicingSessionReference = null;

  private String issuedDeviceStateInstanceReference = null;

  private Object issuedDeviceStateControlActionTaskRecord = null;

  private CRIssuedDeviceStateControlInputModelIssuedDeviceStateControlActionRequest issuedDeviceStateControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return issuedDeviceTrackingServicingSessionReference
  **/

  public String getIssuedDeviceTrackingServicingSessionReference() {
    return issuedDeviceTrackingServicingSessionReference;
  }

  public void setIssuedDeviceTrackingServicingSessionReference(String issuedDeviceTrackingServicingSessionReference) {
    this.issuedDeviceTrackingServicingSessionReference = issuedDeviceTrackingServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issued Device State instance 
   * @return issuedDeviceStateInstanceReference
  **/

  public String getIssuedDeviceStateInstanceReference() {
    return issuedDeviceStateInstanceReference;
  }

  public void setIssuedDeviceStateInstanceReference(String issuedDeviceStateInstanceReference) {
    this.issuedDeviceStateInstanceReference = issuedDeviceStateInstanceReference;
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
   * Get issuedDeviceStateControlActionRequest
   * @return issuedDeviceStateControlActionRequest
  **/

  public CRIssuedDeviceStateControlInputModelIssuedDeviceStateControlActionRequest getIssuedDeviceStateControlActionRequest() {
    return issuedDeviceStateControlActionRequest;
  }

  public void setIssuedDeviceStateControlActionRequest(CRIssuedDeviceStateControlInputModelIssuedDeviceStateControlActionRequest issuedDeviceStateControlActionRequest) {
    this.issuedDeviceStateControlActionRequest = issuedDeviceStateControlActionRequest;
  }


}

