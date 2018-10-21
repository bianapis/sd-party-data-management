package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ReferenceBase
 */
public class ReferenceBase   {
  private String legalEntityReference = null;

  private String legalEntityOfficialName = null;

  private String legalEntityType = null;

  private String sectorsofOperation = null;

  private String registeredAddress = null;

  private String headquartersLocation = null;

  private String dateofIncorporation = null;

  private String jurisdictionofIncorporation = null;

  private String registrationAuthority = null;

  private String primaryRegulator = null;

  private String taxIdentifier = null;

  private String contactRole = null;

  private String contactAddressDetails = null;


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FEHzNMTGEeChad0JzLk7QA_-1382123937/elements/_yagFILl5EeOpCN0IL2Swqw) general-info: Legal Entity 
   * @return legalEntityReference
  **/

  public String getLegalEntityReference() {
    return legalEntityReference;
  }

  public void setLegalEntityReference(String legalEntityReference) {
    this.legalEntityReference = legalEntityReference;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E7L5qcTGEeChad0JzLk7QA_-1556021177/elements/_E7VDkMTGEeChad0JzLk7QA_151261734) general-info: Legal Entity Official Name 
   * @return legalEntityOfficialName
  **/

  public String getLegalEntityOfficialName() {
    return legalEntityOfficialName;
  }

  public void setLegalEntityOfficialName(String legalEntityOfficialName) {
    this.legalEntityOfficialName = legalEntityOfficialName;
  }


  /**
   * `status: Registered`  iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FEHzNMTGEeChad0JzLk7QA_-1382123937/elements/_zJK20OVaEeG_peKHD7roXg_-1787384341)  general-info: Legal Entity Type 
   * @return legalEntityType
  **/

  public String getLegalEntityType() {
    return legalEntityType;
  }

  public void setLegalEntityType(String legalEntityType) {
    this.legalEntityType = legalEntityType;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNg_x8TGEeChad0JzLk7QA_908383601/elements/_FNqJssTGEeChad0JzLk7QA_-694813541) general-info: Sectors of Operation 
   * @return sectorsofOperation
  **/

  public String getSectorsofOperation() {
    return sectorsofOperation;
  }

  public void setSectorsofOperation(String sectorsofOperation) {
    this.sectorsofOperation = sectorsofOperation;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNg_w8TGEeChad0JzLk7QA_1650940768/elements/_FNg_xcTGEeChad0JzLk7QA_1331688362) general-info: Registered Address 
   * @return registeredAddress
  **/

  public String getRegisteredAddress() {
    return registeredAddress;
  }

  public void setRegisteredAddress(String registeredAddress) {
    this.registeredAddress = registeredAddress;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633/elements/_z2I6YGx5EeKmZJ0Ago--9g_239738909) general-info: Headquarters Location 
   * @return headquartersLocation
  **/

  public String getHeadquartersLocation() {
    return headquartersLocation;
  }

  public void setHeadquartersLocation(String headquartersLocation) {
    this.headquartersLocation = headquartersLocation;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNg_x8TGEeChad0JzLk7QA_908383601/elements/_FNqJsMTGEeChad0JzLk7QA_-992959099) general-info: Date Of InCorporation 
   * @return dateofIncorporation
  **/

  public String getDateofIncorporation() {
    return dateofIncorporation;
  }

  public void setDateofIncorporation(String dateofIncorporation) {
    this.dateofIncorporation = dateofIncorporation;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNg_w8TGEeChad0JzLk7QA_1650940768/elements/__-cVZ2IiEeGD28DQaMef-g) general-info: Jurisdiction of Incorporation 
   * @return jurisdictionofIncorporation
  **/

  public String getJurisdictionofIncorporation() {
    return jurisdictionofIncorporation;
  }

  public void setJurisdictionofIncorporation(String jurisdictionofIncorporation) {
    this.jurisdictionofIncorporation = jurisdictionofIncorporation;
  }


  /**
   * `status: Provisionally Registered` bian-reference: PartyRegistryEntry.RegisteredParty(as Organisation).RegistraftionAuthority general-info: Registration Authority 
   * @return registrationAuthority
  **/

  public String getRegistrationAuthority() {
    return registrationAuthority;
  }

  public void setRegistrationAuthority(String registrationAuthority) {
    this.registrationAuthority = registrationAuthority;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FI4-csTGEeChad0JzLk7QA_-1972046907/elements/_I8jqIHQzEeKIFpWttHerUA_2136525583) general-info: Primary Regulator 
   * @return primaryRegulator
  **/

  public String getPrimaryRegulator() {
    return primaryRegulator;
  }

  public void setPrimaryRegulator(String primaryRegulator) {
    this.primaryRegulator = primaryRegulator;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FEHzNMTGEeChad0JzLk7QA_-1382123937/elements/_FEHzNcTGEeChad0JzLk7QA_-1792766550) general-info: Tax Identifier 
   * @return taxIdentifier
  **/

  public String getTaxIdentifier() {
    return taxIdentifier;
  }

  public void setTaxIdentifier(String taxIdentifier) {
    this.taxIdentifier = taxIdentifier;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNg_x8TGEeChad0JzLk7QA_908383601/elements/_YaxeYNTxEeO8xr27LwkIFw) general-info: Contact Role 
   * @return contactRole
  **/

  public String getContactRole() {
    return contactRole;
  }

  public void setContactRole(String contactRole) {
    this.contactRole = contactRole;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633/elements/_FEHzOMTGEeChad0JzLk7QA_-1894201405) general-info: Contact Address Details 
   * @return contactAddressDetails
  **/

  public String getContactAddressDetails() {
    return contactAddressDetails;
  }

  public void setContactAddressDetails(String contactAddressDetails) {
    this.contactAddressDetails = contactAddressDetails;
  }


}

