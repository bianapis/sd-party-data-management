/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class PartyDataManagementApiServiceImpl implements PartyDataManagementApiService {

	public PartyDataManagementRecordResponse record(String crReferenceId, PartyDataManagementRecordRequest request){
		return JsonReader.read("record-PartyDataManagementRecordResponse.json",new TypeReference<PartyDataManagementRecordResponse>(){});
	}
	
	public AssociationBaseWithId registerAtAssociations(String crReferenceId, AssociationBase request){
		return JsonReader.read("registerAt-AssociationBaseWithId.json",new TypeReference<AssociationBaseWithId>(){});
	}
	
	public ProfileBaseWithId registerAtProfiles(String crReferenceId, ProfileBase request){
		return JsonReader.read("registerAt-ProfileBaseWithId.json",new TypeReference<ProfileBaseWithId>(){});
	}
	
	public ReferenceBaseWithId registerAtReferences(String crReferenceId, ReferenceBase request){
		return JsonReader.read("registerAt-ReferenceBaseWithId.json",new TypeReference<ReferenceBaseWithId>(){});
	}
	
	public DirectoryEntryRefreshResponse requestPut(String crReferenceId){
		return JsonReader.read("requestPut-DirectoryEntryRefreshResponse.json",new TypeReference<DirectoryEntryRefreshResponse>(){});
	}
	
	public AssociationBaseWithId retrieveAssociations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-AssociationBaseWithId.json",new TypeReference<AssociationBaseWithId>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public ProfileBaseWithId retrieveProfiles(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ProfileBaseWithId.json",new TypeReference<ProfileBaseWithId>(){});
	}
	
	public ReferenceBaseWithId retrieveReferences(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ReferenceBaseWithId.json",new TypeReference<ReferenceBaseWithId>(){});
	}
	
	public AssociationBaseWithId updateAssociation(String crReferenceId, String bqReferenceId, AssociationBase request){
		return JsonReader.read("update-AssociationBaseWithId.json",new TypeReference<AssociationBaseWithId>(){});
	}
	
	public ProfileBaseWithId updateProfiles(String crReferenceId, String bqReferenceId, ProfileBase request){
		return JsonReader.read("update-ProfileBaseWithId.json",new TypeReference<ProfileBaseWithId>(){});
	}
	
	public ReferenceBaseWithId updateReferences(String crReferenceId, String bqReferenceId, ReferenceBase request){
		return JsonReader.read("update-ReferenceBaseWithId.json",new TypeReference<ReferenceBaseWithId>(){});
	}
	
}
