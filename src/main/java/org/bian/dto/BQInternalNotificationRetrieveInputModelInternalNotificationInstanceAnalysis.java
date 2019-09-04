package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInternalNotificationRetrieveInputModelInternalNotificationInstanceAnalysis
 */
public class BQInternalNotificationRetrieveInputModelInternalNotificationInstanceAnalysis   {
  private String internalNotificationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return internalNotificationInstanceAnalysisReference
  **/

  public String getInternalNotificationInstanceAnalysisReference() {
    return internalNotificationInstanceAnalysisReference;
  }

  public void setInternalNotificationInstanceAnalysisReference(String internalNotificationInstanceAnalysisReference) {
    this.internalNotificationInstanceAnalysisReference = internalNotificationInstanceAnalysisReference;
  }


}

