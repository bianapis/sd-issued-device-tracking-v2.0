package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExternalReportUpdateInputModelBQExternalReportInstanceRecordInformationFeedServiceContentRecord;

import javax.validation.Valid;
  
/**
 * BQExternalReportUpdateInputModelBQExternalReportInstanceRecord
 */
public class BQExternalReportUpdateInputModelBQExternalReportInstanceRecord   {
  private BQExternalReportUpdateInputModelBQExternalReportInstanceRecordInformationFeedServiceContentRecord informationFeedServiceContentRecord = null;


  /**
   * Get informationFeedServiceContentRecord
   * @return informationFeedServiceContentRecord
  **/

  public BQExternalReportUpdateInputModelBQExternalReportInstanceRecordInformationFeedServiceContentRecord getInformationFeedServiceContentRecord() {
    return informationFeedServiceContentRecord;
  }

  public void setInformationFeedServiceContentRecord(BQExternalReportUpdateInputModelBQExternalReportInstanceRecordInformationFeedServiceContentRecord informationFeedServiceContentRecord) {
    this.informationFeedServiceContentRecord = informationFeedServiceContentRecord;
  }


}

