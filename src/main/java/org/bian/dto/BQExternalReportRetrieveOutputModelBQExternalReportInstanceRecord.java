package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExternalReportRetrieveOutputModelBQExternalReportInstanceRecordInformationFeedServiceContentRecord;

import javax.validation.Valid;
  
/**
 * BQExternalReportRetrieveOutputModelBQExternalReportInstanceRecord
 */
public class BQExternalReportRetrieveOutputModelBQExternalReportInstanceRecord   {
  private BQExternalReportRetrieveOutputModelBQExternalReportInstanceRecordInformationFeedServiceContentRecord informationFeedServiceContentRecord = null;


  /**
   * Get informationFeedServiceContentRecord
   * @return informationFeedServiceContentRecord
  **/

  public BQExternalReportRetrieveOutputModelBQExternalReportInstanceRecordInformationFeedServiceContentRecord getInformationFeedServiceContentRecord() {
    return informationFeedServiceContentRecord;
  }

  public void setInformationFeedServiceContentRecord(BQExternalReportRetrieveOutputModelBQExternalReportInstanceRecordInformationFeedServiceContentRecord informationFeedServiceContentRecord) {
    this.informationFeedServiceContentRecord = informationFeedServiceContentRecord;
  }


}

