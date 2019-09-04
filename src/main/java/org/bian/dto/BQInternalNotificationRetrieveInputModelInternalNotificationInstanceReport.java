package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInternalNotificationRetrieveInputModelInternalNotificationInstanceReport
 */
public class BQInternalNotificationRetrieveInputModelInternalNotificationInstanceReport   {
  private String internalNotificationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return internalNotificationInstanceReportReference
  **/

  public String getInternalNotificationInstanceReportReference() {
    return internalNotificationInstanceReportReference;
  }

  public void setInternalNotificationInstanceReportReference(String internalNotificationInstanceReportReference) {
    this.internalNotificationInstanceReportReference = internalNotificationInstanceReportReference;
  }


}

