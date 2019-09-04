package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInternalNotificationCaptureOutputModelInternalNotificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInternalNotificationCaptureOutputModel
 */
public class BQInternalNotificationCaptureOutputModel   {
  private BQInternalNotificationCaptureOutputModelInternalNotificationInstanceRecord internalNotificationInstanceRecord = null;

  private String internalNotificationCaptureActionTaskReference = null;

  private Object internalNotificationCaptureActionTaskRecord = null;

  private String internalNotificationCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get internalNotificationInstanceRecord
   * @return internalNotificationInstanceRecord
  **/

  public BQInternalNotificationCaptureOutputModelInternalNotificationInstanceRecord getInternalNotificationInstanceRecord() {
    return internalNotificationInstanceRecord;
  }

  public void setInternalNotificationInstanceRecord(BQInternalNotificationCaptureOutputModelInternalNotificationInstanceRecord internalNotificationInstanceRecord) {
    this.internalNotificationInstanceRecord = internalNotificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Internal Notification instance capture service call 
   * @return internalNotificationCaptureActionTaskReference
  **/

  public String getInternalNotificationCaptureActionTaskReference() {
    return internalNotificationCaptureActionTaskReference;
  }

  public void setInternalNotificationCaptureActionTaskReference(String internalNotificationCaptureActionTaskReference) {
    this.internalNotificationCaptureActionTaskReference = internalNotificationCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Internal Notification structured input transaction/record 
   * @return internalNotificationCaptureRecordReference
  **/

  public String getInternalNotificationCaptureRecordReference() {
    return internalNotificationCaptureRecordReference;
  }

  public void setInternalNotificationCaptureRecordReference(String internalNotificationCaptureRecordReference) {
    this.internalNotificationCaptureRecordReference = internalNotificationCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

