package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInternalNotificationRetrieveOutputModelCRIssuedDeviceTrackingInstanceRecord;
import org.bian.dto.BQInternalNotificationRetrieveOutputModelInternalNotificationInstanceAnalysis;
import org.bian.dto.BQInternalNotificationRetrieveOutputModelInternalNotificationInstanceRecord;
import org.bian.dto.BQInternalNotificationRetrieveOutputModelInternalNotificationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInternalNotificationRetrieveOutputModel
 */
public class BQInternalNotificationRetrieveOutputModel   {
  private BQInternalNotificationRetrieveOutputModelCRIssuedDeviceTrackingInstanceRecord cRIssuedDeviceTrackingInstanceRecord = null;

  private BQInternalNotificationRetrieveOutputModelInternalNotificationInstanceRecord internalNotificationInstanceRecord = null;

  private String internalNotificationRetrieveActionTaskReference = null;

  private Object internalNotificationRetrieveActionTaskRecord = null;

  private String internalNotificationRetrieveActionResponse = null;

  private BQInternalNotificationRetrieveOutputModelInternalNotificationInstanceReport internalNotificationInstanceReport = null;

  private BQInternalNotificationRetrieveOutputModelInternalNotificationInstanceAnalysis internalNotificationInstanceAnalysis = null;


  /**
   * Get cRIssuedDeviceTrackingInstanceRecord
   * @return cRIssuedDeviceTrackingInstanceRecord
  **/

  public BQInternalNotificationRetrieveOutputModelCRIssuedDeviceTrackingInstanceRecord getCRIssuedDeviceTrackingInstanceRecord() {
    return cRIssuedDeviceTrackingInstanceRecord;
  }

  @JsonProperty("cRIssuedDeviceTrackingInstanceRecord")
  public void setCRIssuedDeviceTrackingInstanceRecord(BQInternalNotificationRetrieveOutputModelCRIssuedDeviceTrackingInstanceRecord cRIssuedDeviceTrackingInstanceRecord) {
    this.cRIssuedDeviceTrackingInstanceRecord = cRIssuedDeviceTrackingInstanceRecord;
  }


  /**
   * Get internalNotificationInstanceRecord
   * @return internalNotificationInstanceRecord
  **/

  public BQInternalNotificationRetrieveOutputModelInternalNotificationInstanceRecord getInternalNotificationInstanceRecord() {
    return internalNotificationInstanceRecord;
  }

  public void setInternalNotificationInstanceRecord(BQInternalNotificationRetrieveOutputModelInternalNotificationInstanceRecord internalNotificationInstanceRecord) {
    this.internalNotificationInstanceRecord = internalNotificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Internal Notification instance retrieve service call 
   * @return internalNotificationRetrieveActionTaskReference
  **/

  public String getInternalNotificationRetrieveActionTaskReference() {
    return internalNotificationRetrieveActionTaskReference;
  }

  public void setInternalNotificationRetrieveActionTaskReference(String internalNotificationRetrieveActionTaskReference) {
    this.internalNotificationRetrieveActionTaskReference = internalNotificationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return internalNotificationRetrieveActionTaskRecord
  **/

  public Object getInternalNotificationRetrieveActionTaskRecord() {
    return internalNotificationRetrieveActionTaskRecord;
  }

  public void setInternalNotificationRetrieveActionTaskRecord(Object internalNotificationRetrieveActionTaskRecord) {
    this.internalNotificationRetrieveActionTaskRecord = internalNotificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return internalNotificationRetrieveActionResponse
  **/

  public String getInternalNotificationRetrieveActionResponse() {
    return internalNotificationRetrieveActionResponse;
  }

  public void setInternalNotificationRetrieveActionResponse(String internalNotificationRetrieveActionResponse) {
    this.internalNotificationRetrieveActionResponse = internalNotificationRetrieveActionResponse;
  }


  /**
   * Get internalNotificationInstanceReport
   * @return internalNotificationInstanceReport
  **/

  public BQInternalNotificationRetrieveOutputModelInternalNotificationInstanceReport getInternalNotificationInstanceReport() {
    return internalNotificationInstanceReport;
  }

  public void setInternalNotificationInstanceReport(BQInternalNotificationRetrieveOutputModelInternalNotificationInstanceReport internalNotificationInstanceReport) {
    this.internalNotificationInstanceReport = internalNotificationInstanceReport;
  }


  /**
   * Get internalNotificationInstanceAnalysis
   * @return internalNotificationInstanceAnalysis
  **/

  public BQInternalNotificationRetrieveOutputModelInternalNotificationInstanceAnalysis getInternalNotificationInstanceAnalysis() {
    return internalNotificationInstanceAnalysis;
  }

  public void setInternalNotificationInstanceAnalysis(BQInternalNotificationRetrieveOutputModelInternalNotificationInstanceAnalysis internalNotificationInstanceAnalysis) {
    this.internalNotificationInstanceAnalysis = internalNotificationInstanceAnalysis;
  }


}

