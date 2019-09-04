package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInternalNotificationUpdateInputModelCRIssuedDeviceTrackingInstanceRecord;
import org.bian.dto.BQInternalNotificationUpdateInputModelInternalNotificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInternalNotificationUpdateOutputModel
 */
public class BQInternalNotificationUpdateOutputModel   {
  private BQInternalNotificationUpdateInputModelCRIssuedDeviceTrackingInstanceRecord cRIssuedDeviceTrackingInstanceRecord = null;

  private BQInternalNotificationUpdateInputModelInternalNotificationInstanceRecord internalNotificationInstanceRecord = null;

  private String internalNotificationUpdateActionTaskReference = null;

  private Object internalNotificationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get cRIssuedDeviceTrackingInstanceRecord
   * @return cRIssuedDeviceTrackingInstanceRecord
  **/

  public BQInternalNotificationUpdateInputModelCRIssuedDeviceTrackingInstanceRecord getCRIssuedDeviceTrackingInstanceRecord() {
    return cRIssuedDeviceTrackingInstanceRecord;
  }

  @JsonProperty("cRIssuedDeviceTrackingInstanceRecord")
  public void setCRIssuedDeviceTrackingInstanceRecord(BQInternalNotificationUpdateInputModelCRIssuedDeviceTrackingInstanceRecord cRIssuedDeviceTrackingInstanceRecord) {
    this.cRIssuedDeviceTrackingInstanceRecord = cRIssuedDeviceTrackingInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return internalNotificationUpdateActionTaskReference
  **/

  public String getInternalNotificationUpdateActionTaskReference() {
    return internalNotificationUpdateActionTaskReference;
  }

  public void setInternalNotificationUpdateActionTaskReference(String internalNotificationUpdateActionTaskReference) {
    this.internalNotificationUpdateActionTaskReference = internalNotificationUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

