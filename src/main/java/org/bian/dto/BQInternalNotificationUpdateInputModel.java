package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInternalNotificationUpdateInputModelCRIssuedDeviceTrackingInstanceRecord;
import org.bian.dto.BQInternalNotificationUpdateInputModelInternalNotificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInternalNotificationUpdateInputModel
 */
public class BQInternalNotificationUpdateInputModel   {
  private BQInternalNotificationUpdateInputModelCRIssuedDeviceTrackingInstanceRecord cRIssuedDeviceTrackingInstanceRecord = null;

  private String issuedDeviceStateInstanceReference = null;

  private String internalNotificationInstanceReference = null;

  private BQInternalNotificationUpdateInputModelInternalNotificationInstanceRecord internalNotificationInstanceRecord = null;

  private Object internalNotificationUpdateActionTaskRecord = null;

  private String internalNotificationUpdateActionRequest = null;


  /**
   * Get cRIssuedDeviceTrackingInstanceRecord
   * @return cRIssuedDeviceTrackingInstanceRecord
  **/

  public BQInternalNotificationUpdateInputModelCRIssuedDeviceTrackingInstanceRecord getCRIssuedDeviceTrackingInstanceRecord() {
    return cRIssuedDeviceTrackingInstanceRecord;
  }

  public void setCRIssuedDeviceTrackingInstanceRecord(BQInternalNotificationUpdateInputModelCRIssuedDeviceTrackingInstanceRecord cRIssuedDeviceTrackingInstanceRecord) {
    this.cRIssuedDeviceTrackingInstanceRecord = cRIssuedDeviceTrackingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Issued Device State instance 
   * @return issuedDeviceStateInstanceReference
  **/

  public String getIssuedDeviceStateInstanceReference() {
    return issuedDeviceStateInstanceReference;
  }

  public void setIssuedDeviceStateInstanceReference(String issuedDeviceStateInstanceReference) {
    this.issuedDeviceStateInstanceReference = issuedDeviceStateInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Internal Notification instance 
   * @return internalNotificationInstanceReference
  **/

  public String getInternalNotificationInstanceReference() {
    return internalNotificationInstanceReference;
  }

  public void setInternalNotificationInstanceReference(String internalNotificationInstanceReference) {
    this.internalNotificationInstanceReference = internalNotificationInstanceReference;
  }


  /**
   * Get internalNotificationInstanceRecord
   * @return internalNotificationInstanceRecord
  **/

  public BQInternalNotificationUpdateInputModelInternalNotificationInstanceRecord getInternalNotificationInstanceRecord() {
    return internalNotificationInstanceRecord;
  }

  public void setInternalNotificationInstanceRecord(BQInternalNotificationUpdateInputModelInternalNotificationInstanceRecord internalNotificationInstanceRecord) {
    this.internalNotificationInstanceRecord = internalNotificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return internalNotificationUpdateActionTaskRecord
  **/

  public Object getInternalNotificationUpdateActionTaskRecord() {
    return internalNotificationUpdateActionTaskRecord;
  }

  public void setInternalNotificationUpdateActionTaskRecord(Object internalNotificationUpdateActionTaskRecord) {
    this.internalNotificationUpdateActionTaskRecord = internalNotificationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return internalNotificationUpdateActionRequest
  **/

  public String getInternalNotificationUpdateActionRequest() {
    return internalNotificationUpdateActionRequest;
  }

  public void setInternalNotificationUpdateActionRequest(String internalNotificationUpdateActionRequest) {
    this.internalNotificationUpdateActionRequest = internalNotificationUpdateActionRequest;
  }


}

