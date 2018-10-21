package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * AssociationBaseWithId
 */
public class AssociationBaseWithId   {
  private String partyDirectoryEntryReference = null;

  private String associationDirectoryEntryReference = null;

  private String legalEntityAssociationReference = null;

  private String legalEntityAssociationType = null;

  private String legalEntityAssociationObligation = null;

  private String parentLegalEntityReference = null;

  private String subsidiaryLegalEntityReference = null;

  private String shareholdingProfile = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return partyDirectoryEntryReference
  **/

  public String getPartyDirectoryEntryReference() {
    return partyDirectoryEntryReference;
  }

  public void setPartyDirectoryEntryReference(String partyDirectoryEntryReference) {
    this.partyDirectoryEntryReference = partyDirectoryEntryReference;
  }


  /**
   * `status: Not Mapped core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return associationDirectoryEntryReference
  **/

  public String getAssociationDirectoryEntryReference() {
    return associationDirectoryEntryReference;
  }

  public void setAssociationDirectoryEntryReference(String associationDirectoryEntryReference) {
    this.associationDirectoryEntryReference = associationDirectoryEntryReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: PartyRegistryEntry.RegisteredParty(as RolePlayer).Role.PartyRelationship general-info: Legal Entity Association Reference (company or individual) 
   * @return legalEntityAssociationReference
  **/

  public String getLegalEntityAssociationReference() {
    return legalEntityAssociationReference;
  }

  public void setLegalEntityAssociationReference(String legalEntityAssociationReference) {
    this.legalEntityAssociationReference = legalEntityAssociationReference;
  }


  /**
   * `status: Provisionally Registered`   bian-reference: PartyRegistryEntry.RegisteredParty(as RolePlayer).Role.PartyRelationship.PartyRelationshipType   general-info: Legal Entity Association Type (corporate or familial) 
   * @return legalEntityAssociationType
  **/

  public String getLegalEntityAssociationType() {
    return legalEntityAssociationType;
  }

  public void setLegalEntityAssociationType(String legalEntityAssociationType) {
    this.legalEntityAssociationType = legalEntityAssociationType;
  }


  /**
   * `status: Provisionally Registered` bian-reference: PartyRegistryEntry.RegisteredParty(as RolePlayer).Role.PartyRelationship.RelationshipAgreement.Obligation  general-info: Legal Entity Association Obligation (e.g. shareholder, director, guardian, guarantor) 
   * @return legalEntityAssociationObligation
  **/

  public String getLegalEntityAssociationObligation() {
    return legalEntityAssociationObligation;
  }

  public void setLegalEntityAssociationObligation(String legalEntityAssociationObligation) {
    this.legalEntityAssociationObligation = legalEntityAssociationObligation;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FEHzNMTGEeChad0JzLk7QA_-1382123937/elements/_yagFILl5EeOpCN0IL2Swqw) general-info: Parent Legal Entity 
   * @return parentLegalEntityReference
  **/

  public String getParentLegalEntityReference() {
    return parentLegalEntityReference;
  }

  public void setParentLegalEntityReference(String parentLegalEntityReference) {
    this.parentLegalEntityReference = parentLegalEntityReference;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FEHzNMTGEeChad0JzLk7QA_-1382123937/elements/_yagFILl5EeOpCN0IL2Swqw) general-info: Subsidiary Legal Entity Reference 
   * @return subsidiaryLegalEntityReference
  **/

  public String getSubsidiaryLegalEntityReference() {
    return subsidiaryLegalEntityReference;
  }

  public void setSubsidiaryLegalEntityReference(String subsidiaryLegalEntityReference) {
    this.subsidiaryLegalEntityReference = subsidiaryLegalEntityReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: PartyRegistryEntry.RegisteredParty(as Organisation).ShareholderRegister  general-info: Shareholding Profile (lists major shareholders and shareholdings of significance) 
   * @return shareholdingProfile
  **/

  public String getShareholdingProfile() {
    return shareholdingProfile;
  }

  public void setShareholdingProfile(String shareholdingProfile) {
    this.shareholdingProfile = shareholdingProfile;
  }


}

