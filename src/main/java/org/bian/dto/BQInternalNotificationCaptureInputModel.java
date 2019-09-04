package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInternalNotificationCaptureInputModelCaptureRecordType;
import org.bian.dto.BQInternalNotificationCaptureInputModelInternalNotificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInternalNotificationCaptureInputModel
 */
public class BQInternalNotificationCaptureInputModel   {
  private String issuedDeviceStateInstanceReference = null;

  private String internalNotificationInstanceReference = null;

  private BQInternalNotificationCaptureInputModelInternalNotificationInstanceRecord internalNotificationInstanceRecord = null;

  private Object internalNotificationCaptureActionTaskRecord = null;

  private BQInternalNotificationCaptureInputModelCaptureRecordType captureRecordType = null;


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

  public BQInternalNotificationCaptureInputModelInternalNotificationInstanceRecord getInternalNotificationInstanceRecord() {
    return internalNotificationInstanceRecord;
  }

  public void setInternalNotificationInstanceRecord(BQInternalNotificationCaptureInputModelInternalNotificationInstanceRecord internalNotificationInstanceRecord) {
    this.internalNotificationInstanceRecord = internalNotificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return internalNotificationCaptureActionTaskRecord
  **/

  public Object getInternalNotificationCaptureActionTaskRecord() {
    return internalNotificationCaptureActionTaskRecord;
  }

  public void setInternalNotificationCaptureActionTaskRecord(Object internalNotificationCaptureActionTaskRecord) {
    this.internalNotificationCaptureActionTaskRecord = internalNotificationCaptureActionTaskRecord;
  }


  /**
   * Get captureRecordType
   * @return captureRecordType
  **/

  public BQInternalNotificationCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(BQInternalNotificationCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

