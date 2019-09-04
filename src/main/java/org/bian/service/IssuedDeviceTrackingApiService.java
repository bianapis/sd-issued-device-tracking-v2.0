/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface IssuedDeviceTrackingApiService {

	SDIssuedDeviceTrackingActivateOutputModel activate(SDIssuedDeviceTrackingActivateInputModel request);
	
	BQExternalReportCaptureOutputModel captureExternalreport(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExternalReportCaptureInputModel request);
	
	BQInternalNotificationCaptureOutputModel captureInternalnotification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInternalNotificationCaptureInputModel request);
	
	SDIssuedDeviceTrackingConfigureOutputModel configure(String sdReferenceId, SDIssuedDeviceTrackingConfigureInputModel request);
	
	CRIssuedDeviceStateControlOutputModel control(String sdReferenceId, String crReferenceId, CRIssuedDeviceStateControlInputModel request);
	
	SDIssuedDeviceTrackingFeedbackOutputModel feedback(String sdReferenceId, SDIssuedDeviceTrackingFeedbackInputModel request);
	
	CRIssuedDeviceStateInitiateOutputModel initiate(String sdReferenceId, CRIssuedDeviceStateInitiateInputModel request);
	
	BQExternalReportRetrieveOutputModel retrieveExternalreport(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQInternalNotificationRetrieveOutputModel retrieveInternalnotification(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRIssuedDeviceStateRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDIssuedDeviceTrackingRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRIssuedDeviceStateUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRIssuedDeviceStateUpdateInputModel request);
	
	BQExternalReportUpdateOutputModel updateExternalreport(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExternalReportUpdateInputModel request);
	
	BQInternalNotificationUpdateOutputModel updateInternalnotification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInternalNotificationUpdateInputModel request);
	
}
