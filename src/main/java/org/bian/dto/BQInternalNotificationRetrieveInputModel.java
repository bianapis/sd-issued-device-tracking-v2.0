package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInternalNotificationRetrieveInputModelInternalNotificationInstanceAnalysis;
import org.bian.dto.BQInternalNotificationRetrieveInputModelInternalNotificationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInternalNotificationRetrieveInputModel
 */
public class BQInternalNotificationRetrieveInputModel   {
  private Object internalNotificationRetrieveActionTaskRecord = null;

  private String internalNotificationRetrieveActionRequest = null;

  private BQInternalNotificationRetrieveInputModelInternalNotificationInstanceReport internalNotificationInstanceReport = null;

  private BQInternalNotificationRetrieveInputModelInternalNotificationInstanceAnalysis internalNotificationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return internalNotificationRetrieveActionRequest
  **/

  public String getInternalNotificationRetrieveActionRequest() {
    return internalNotificationRetrieveActionRequest;
  }

  public void setInternalNotificationRetrieveActionRequest(String internalNotificationRetrieveActionRequest) {
    this.internalNotificationRetrieveActionRequest = internalNotificationRetrieveActionRequest;
  }


  /**
   * Get internalNotificationInstanceReport
   * @return internalNotificationInstanceReport
  **/

  public BQInternalNotificationRetrieveInputModelInternalNotificationInstanceReport getInternalNotificationInstanceReport() {
    return internalNotificationInstanceReport;
  }

  public void setInternalNotificationInstanceReport(BQInternalNotificationRetrieveInputModelInternalNotificationInstanceReport internalNotificationInstanceReport) {
    this.internalNotificationInstanceReport = internalNotificationInstanceReport;
  }


  /**
   * Get internalNotificationInstanceAnalysis
   * @return internalNotificationInstanceAnalysis
  **/

  public BQInternalNotificationRetrieveInputModelInternalNotificationInstanceAnalysis getInternalNotificationInstanceAnalysis() {
    return internalNotificationInstanceAnalysis;
  }

  public void setInternalNotificationInstanceAnalysis(BQInternalNotificationRetrieveInputModelInternalNotificationInstanceAnalysis internalNotificationInstanceAnalysis) {
    this.internalNotificationInstanceAnalysis = internalNotificationInstanceAnalysis;
  }


}

