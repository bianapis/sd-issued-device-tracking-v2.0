package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExternalReportCaptureInputModelBQExternalReportInstanceRecordInformationFeedServiceContentRecord;

import javax.validation.Valid;
  
/**
 * BQExternalReportCaptureInputModelBQExternalReportInstanceRecord
 */
public class BQExternalReportCaptureInputModelBQExternalReportInstanceRecord   {
  private BQExternalReportCaptureInputModelBQExternalReportInstanceRecordInformationFeedServiceContentRecord informationFeedServiceContentRecord = null;


  /**
   * Get informationFeedServiceContentRecord
   * @return informationFeedServiceContentRecord
  **/

  public BQExternalReportCaptureInputModelBQExternalReportInstanceRecordInformationFeedServiceContentRecord getInformationFeedServiceContentRecord() {
    return informationFeedServiceContentRecord;
  }

  public void setInformationFeedServiceContentRecord(BQExternalReportCaptureInputModelBQExternalReportInstanceRecordInformationFeedServiceContentRecord informationFeedServiceContentRecord) {
    this.informationFeedServiceContentRecord = informationFeedServiceContentRecord;
  }


}

