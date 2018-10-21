package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ProfileBase
 */
public class ProfileBase   {
  private String organizationCapitalization = null;

  private String organizationDebtLevel = null;

  private String organizationEconomicIntent = null;

  private String organizationGrowthRate = null;

  private String organizationProfitabilityStocks = null;

  private String organizationRevenueTurnover = null;


  /**
   * `status: Provisionally Registered`  bian-reference: PartyRegistryEntry.RegisteredParty(as Organisation).OrganisationProfile.Capitalisation    general-info: Organization Capitalization   
   * @return organizationCapitalization
  **/

  public String getOrganizationCapitalization() {
    return organizationCapitalization;
  }

  public void setOrganizationCapitalization(String organizationCapitalization) {
    this.organizationCapitalization = organizationCapitalization;
  }


  /**
   * `status: Provisionally Registered`   bian-reference: PartyRegistryEntry.RegisteredParty(as Organisation).OrganisationProfile.DebtLevel    general-info: Organization Debt Level 
   * @return organizationDebtLevel
  **/

  public String getOrganizationDebtLevel() {
    return organizationDebtLevel;
  }

  public void setOrganizationDebtLevel(String organizationDebtLevel) {
    this.organizationDebtLevel = organizationDebtLevel;
  }


  /**
   * `status: Provisionally Registered`   bian-reference: PartyRegistryEntry.RegisteredParty(as Organisation).OrganisationProfile.EconomicIntent     general-info: Organization Economic Intent 
   * @return organizationEconomicIntent
  **/

  public String getOrganizationEconomicIntent() {
    return organizationEconomicIntent;
  }

  public void setOrganizationEconomicIntent(String organizationEconomicIntent) {
    this.organizationEconomicIntent = organizationEconomicIntent;
  }


  /**
   * `status: Provisionally Registered`   bian-reference: PartyRegistryEntry.RegisteredParty(as Organisation).OrganisationProfile.GrowthRate   general-info: Organization Growth Rate 
   * @return organizationGrowthRate
  **/

  public String getOrganizationGrowthRate() {
    return organizationGrowthRate;
  }

  public void setOrganizationGrowthRate(String organizationGrowthRate) {
    this.organizationGrowthRate = organizationGrowthRate;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: PartyRegistryEntry.RegisteredParty(as Organisation).OrganisationProfile.GrowthRate   general-info: Organization Profitability/Stocks 
   * @return organizationProfitabilityStocks
  **/

  public String getOrganizationProfitabilityStocks() {
    return organizationProfitabilityStocks;
  }

  public void setOrganizationProfitabilityStocks(String organizationProfitabilityStocks) {
    this.organizationProfitabilityStocks = organizationProfitabilityStocks;
  }


  /**
   * `status: Provisionally Registered`  bian-reference: PartyRegistryEntry.RegisteredParty(as Organisation).OrganisationProfile.Revenue   general-info: Organization Revenue/Turnover 
   * @return organizationRevenueTurnover
  **/

  public String getOrganizationRevenueTurnover() {
    return organizationRevenueTurnover;
  }

  public void setOrganizationRevenueTurnover(String organizationRevenueTurnover) {
    this.organizationRevenueTurnover = organizationRevenueTurnover;
  }


}

