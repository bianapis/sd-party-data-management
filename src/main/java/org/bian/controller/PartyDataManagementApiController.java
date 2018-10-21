/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Register;

@BianRestController
public class PartyDataManagementApiController {

	@Autowired
	PartyDataManagementApiService service;
	
	@Register.Record
	public BianResponse<PartyDataManagementRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<PartyDataManagementRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("associations")
	@Register.RegisterAt
	public BianResponse<AssociationBaseWithId> registerAtAssociations(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<AssociationBase> bianRequest) {
		return BianResponse.forSuccess(service.registerAtAssociations(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("profiles")
	@Register.RegisterAt
	public BianResponse<ProfileBaseWithId> registerAtProfiles(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ProfileBase> bianRequest) {
		return BianResponse.forSuccess(service.registerAtProfiles(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("references")
	@Register.RegisterAt
	public BianResponse<ReferenceBaseWithId> registerAtReferences(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ReferenceBase> bianRequest) {
		return BianResponse.forSuccess(service.registerAtReferences(crReferenceId, bianRequest.getData()));
	}
	
	@Register.RequestPut
	public BianResponse<DirectoryEntryRefreshResponse> requestPut(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId));
	}
	
	@BQ("associations")
	@Register.Retrieve
	public BianResponse<AssociationBaseWithId> retrieveAssociations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAssociations(crReferenceId, bqReferenceId));
	}
	
	@Register.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Register.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Register.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("profiles")
	@Register.Retrieve
	public BianResponse<ProfileBaseWithId> retrieveProfiles(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProfiles(crReferenceId, bqReferenceId));
	}
	
	@BQ("references")
	@Register.Retrieve
	public BianResponse<ReferenceBaseWithId> retrieveReferences(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReferences(crReferenceId, bqReferenceId));
	}
	
	@BQ("association")
	@Register.Update
	public BianResponse<AssociationBaseWithId> updateAssociation(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<AssociationBase> bianRequest) {
		return BianResponse.forSuccess(service.updateAssociation(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("profiles")
	@Register.Update
	public BianResponse<ProfileBaseWithId> updateProfiles(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ProfileBase> bianRequest) {
		return BianResponse.forSuccess(service.updateProfiles(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("references")
	@Register.Update
	public BianResponse<ReferenceBaseWithId> updateReferences(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ReferenceBase> bianRequest) {
		return BianResponse.forSuccess(service.updateReferences(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
