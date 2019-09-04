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
import org.bian.annotation.functionalpattern.Monitor;

@BianRestController
public class IssuedDeviceTrackingApiController {

	@Autowired
	IssuedDeviceTrackingApiService service;
	
	@Monitor.Activate
	public BianResponse<SDIssuedDeviceTrackingActivateOutputModel> activate(@RequestBody BianRequest<SDIssuedDeviceTrackingActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("externalreport")
	@Monitor.Capture
	public BianResponse<BQExternalReportCaptureOutputModel> captureExternalreport(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQExternalReportCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureExternalreport(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("internalnotification")
	@Monitor.Capture
	public BianResponse<BQInternalNotificationCaptureOutputModel> captureInternalnotification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInternalNotificationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureInternalnotification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Configure
	public BianResponse<SDIssuedDeviceTrackingConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDIssuedDeviceTrackingConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Control
	public BianResponse<CRIssuedDeviceStateControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRIssuedDeviceStateControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Feedback
	public BianResponse<SDIssuedDeviceTrackingFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDIssuedDeviceTrackingFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Initiate
	public BianResponse<CRIssuedDeviceStateInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRIssuedDeviceStateInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("externalreport")
	@Monitor.Retrieve
	public BianResponse<BQExternalReportRetrieveOutputModel> retrieveExternalreport(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveExternalreport(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("internalnotification")
	@Monitor.Retrieve
	public BianResponse<BQInternalNotificationRetrieveOutputModel> retrieveInternalnotification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInternalnotification(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Monitor.Retrieve
	public BianResponse<CRIssuedDeviceStateRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Monitor.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Monitor.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Monitor.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Monitor.RetrieveSD
	public BianResponse<SDIssuedDeviceTrackingRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Monitor.Update
	public BianResponse<CRIssuedDeviceStateUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRIssuedDeviceStateUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("externalreport")
	@Monitor.Update
	public BianResponse<BQExternalReportUpdateOutputModel> updateExternalreport(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQExternalReportUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateExternalreport(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("internalnotification")
	@Monitor.Update
	public BianResponse<BQInternalNotificationUpdateOutputModel> updateInternalnotification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInternalNotificationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateInternalnotification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
