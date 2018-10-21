package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * DirectoryEntryRefreshResponse
 */
public class DirectoryEntryRefreshResponse   {
  private String refreshStatus = null;


  /**
   * `status: Not Mapped` BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return refreshStatus
  **/

  public String getRefreshStatus() {
    return refreshStatus;
  }

  public void setRefreshStatus(String refreshStatus) {
    this.refreshStatus = refreshStatus;
  }


}

