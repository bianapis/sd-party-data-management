/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface PartyDataManagementApiService {

	PartyDataManagementRecordResponse record(String crReferenceId, PartyDataManagementRecordRequest request);
	
	AssociationBaseWithId registerAtAssociations(String crReferenceId, AssociationBase request);
	
	ProfileBaseWithId registerAtProfiles(String crReferenceId, ProfileBase request);
	
	ReferenceBaseWithId registerAtReferences(String crReferenceId, ReferenceBase request);
	
	DirectoryEntryRefreshResponse requestPut(String crReferenceId);
	
	AssociationBaseWithId retrieveAssociations(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	ProfileBaseWithId retrieveProfiles(String crReferenceId, String bqReferenceId);
	
	ReferenceBaseWithId retrieveReferences(String crReferenceId, String bqReferenceId);
	
	AssociationBaseWithId updateAssociation(String crReferenceId, String bqReferenceId, AssociationBase request);
	
	ProfileBaseWithId updateProfiles(String crReferenceId, String bqReferenceId, ProfileBase request);
	
	ReferenceBaseWithId updateReferences(String crReferenceId, String bqReferenceId, ReferenceBase request);
	
}
