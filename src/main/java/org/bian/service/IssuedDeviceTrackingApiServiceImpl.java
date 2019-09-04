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
public class IssuedDeviceTrackingApiServiceImpl implements IssuedDeviceTrackingApiService {

	public SDIssuedDeviceTrackingActivateOutputModel activate(SDIssuedDeviceTrackingActivateInputModel request){
		return JsonReader.read("activate-SDIssuedDeviceTrackingActivateOutputModel.json",new TypeReference<SDIssuedDeviceTrackingActivateOutputModel>(){});
	}
	
	public BQExternalReportCaptureOutputModel captureExternalreport(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExternalReportCaptureInputModel request){
		return JsonReader.read("capture-BQExternalReportCaptureOutputModel.json",new TypeReference<BQExternalReportCaptureOutputModel>(){});
	}
	
	public BQInternalNotificationCaptureOutputModel captureInternalnotification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInternalNotificationCaptureInputModel request){
		return JsonReader.read("capture-BQInternalNotificationCaptureOutputModel.json",new TypeReference<BQInternalNotificationCaptureOutputModel>(){});
	}
	
	public SDIssuedDeviceTrackingConfigureOutputModel configure(String sdReferenceId, SDIssuedDeviceTrackingConfigureInputModel request){
		return JsonReader.read("configure-SDIssuedDeviceTrackingConfigureOutputModel.json",new TypeReference<SDIssuedDeviceTrackingConfigureOutputModel>(){});
	}
	
	public CRIssuedDeviceStateControlOutputModel control(String sdReferenceId, String crReferenceId, CRIssuedDeviceStateControlInputModel request){
		return JsonReader.read("control-CRIssuedDeviceStateControlOutputModel.json",new TypeReference<CRIssuedDeviceStateControlOutputModel>(){});
	}
	
	public SDIssuedDeviceTrackingFeedbackOutputModel feedback(String sdReferenceId, SDIssuedDeviceTrackingFeedbackInputModel request){
		return JsonReader.read("feedback-SDIssuedDeviceTrackingFeedbackOutputModel.json",new TypeReference<SDIssuedDeviceTrackingFeedbackOutputModel>(){});
	}
	
	public CRIssuedDeviceStateInitiateOutputModel initiate(String sdReferenceId, CRIssuedDeviceStateInitiateInputModel request){
		return JsonReader.read("initiate-CRIssuedDeviceStateInitiateOutputModel.json",new TypeReference<CRIssuedDeviceStateInitiateOutputModel>(){});
	}
	
	public BQExternalReportRetrieveOutputModel retrieveExternalreport(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQExternalReportRetrieveOutputModel.json",new TypeReference<BQExternalReportRetrieveOutputModel>(){});
	}
	
	public BQInternalNotificationRetrieveOutputModel retrieveInternalnotification(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInternalNotificationRetrieveOutputModel.json",new TypeReference<BQInternalNotificationRetrieveOutputModel>(){});
	}
	
	public CRIssuedDeviceStateRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRIssuedDeviceStateRetrieveOutputModel.json",new TypeReference<CRIssuedDeviceStateRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDIssuedDeviceTrackingRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDIssuedDeviceTrackingRetrieveOutputModel.json",new TypeReference<SDIssuedDeviceTrackingRetrieveOutputModel>(){});
	}
	
	public CRIssuedDeviceStateUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRIssuedDeviceStateUpdateInputModel request){
		return JsonReader.read("update-CRIssuedDeviceStateUpdateOutputModel.json",new TypeReference<CRIssuedDeviceStateUpdateOutputModel>(){});
	}
	
	public BQExternalReportUpdateOutputModel updateExternalreport(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExternalReportUpdateInputModel request){
		return JsonReader.read("update-BQExternalReportUpdateOutputModel.json",new TypeReference<BQExternalReportUpdateOutputModel>(){});
	}
	
	public BQInternalNotificationUpdateOutputModel updateInternalnotification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInternalNotificationUpdateInputModel request){
		return JsonReader.read("update-BQInternalNotificationUpdateOutputModel.json",new TypeReference<BQInternalNotificationUpdateOutputModel>(){});
	}
	
}
