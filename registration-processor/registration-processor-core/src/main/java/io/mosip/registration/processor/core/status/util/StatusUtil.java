package io.mosip.registration.processor.core.status.util;

public enum StatusUtil {
	//Packet Receiver Stage
	PACKET_RECEIVED(StatusConstants.PACKET_RECEIVER_MODULE_SUCCESS + "001" , "Packet has reached Packet Receiver"),
	PACKET_UPLOADED_TO_LANDING_ZONE(StatusConstants.PACKET_RECEIVER_MODULE_SUCCESS + "002" , "Packet is Uploaded to Landing Zone"),
	VIRUS_SCANNER_FAILED(StatusConstants.PACKET_RECEIVER_MODULE_FAILURE + "001" , "Packet is virus infected"),
	PACKET_DECRYPTION_FAILED(StatusConstants.PACKET_RECEIVER_MODULE_FAILURE + "002" , "Packet decryption failed"),
	
	//Packet uploader stage
	PACKET_UPLOADED(StatusConstants.PACKET_UPLOADER_MODULE_SUCCESS + "001","Packet uploaded to Packet Store"),
	PACKET_CLEANUP_FAILED(StatusConstants.PACKET_UPLOADER_MODULE_FAILED + "001","Packet clean up failed from Landing Zone"),
	PACKET_ARCHIVAL_FAILED(StatusConstants.PACKET_UPLOADER_MODULE_FAILED + "002" , "Packet archival failed"),
	PACKET_UPLOAD_FAILED(StatusConstants.PACKET_UPLOADER_MODULE_FAILED + "003" , "Packet upload failed "),
	PACKET_NOT_FOUND_LANDING_ZIONE(StatusConstants.PACKET_UPLOADER_MODULE_FAILED + "004" , "Packet not found in Landing Zone"),
	PACKET_HASHCODE_VALIDATION_FAILED(StatusConstants.PACKET_UPLOADER_MODULE_FAILED + "005" , "Packet hash code validation failed"),
	VIRUS_SCANNER_FAILED_UPLOADER(StatusConstants.PACKET_UPLOADER_MODULE_FAILED + "006" , "Packet is virus infected"),

	//Quality checker stage
	INDIVIDUAL_BIOMETRIC_NOT_FOUND(StatusConstants.QUALITY_CHECKER_MODULE_SUCCESS + "001", "Individual biometric parameter not found in ID json"),
	BIOMETRIC_QUALITY_CHECK_SUCCESS(StatusConstants.QUALITY_CHECKER_MODULE_SUCCESS + "002" , "Biometric quality check sucessful"),
	BIOMETRIC_QUALITY_CHECK_FAILED(StatusConstants.QUALITY_CHECKER_MODULE_FAILED + "001" , "Quality score of biometrics is below threshold"),
	
	//packet validator stage
	PACKET_STRUCTURAL_VALIDATION_SUCCESS(StatusConstants.PACKET_VALIDATOR_MODULE_SUCCESS + "001" , "Packet validation sucessful"),
	FILE_VALIDATION_FAILED(StatusConstants.PACKET_VALIDATOR_MODULE_FAILED + "001", "File validation failed"),
	SCHEMA_VALIDATION_FAILED(StatusConstants.PACKET_VALIDATOR_MODULE_FAILED + "002" , "Schema validation failed"),
	CHECKSUM_VALIDATION_FAILED(StatusConstants.PACKET_VALIDATOR_MODULE_FAILED + "003" , "Checksum validation failed"),
	INDIVIDUAL_BIOMETRIC_VALIDATION_FAILED(StatusConstants.PACKET_VALIDATOR_MODULE_FAILED + "004" , "Individual biometric validation failed"),
	APPLICANT_DOCUMENT_VALIDATION_FAILED(StatusConstants.PACKET_VALIDATOR_MODULE_FAILED + "005" , "Applicant document validation failed"),
	MASTER_DATA_VALIDATION_FAILED(StatusConstants.PACKET_VALIDATOR_MODULE_FAILED + "006" , "Master data validation failed"),
	ACTIVATE_DEACTIVATE_FAILED(StatusConstants.PACKET_VALIDATOR_MODULE_FAILED + "007" , "Activate/Deactivate packet validation failed"),
	UIN_NOT_FOUND_IDREPO(StatusConstants.PACKET_VALIDATOR_MODULE_FAILED + "008" , "UIN not found in ID Repositary"),
	MANDATORY_VALIDATION_FAILED(StatusConstants.PACKET_VALIDATOR_MODULE_FAILED + "009" , "Mandatory fields are not present in ID object"),
	
	//External stage
	EXTERNAL_STAGE_SUCCESS(StatusConstants.EXTERNAL_SATGE_MODULE_SUCCESS + "001" , "Packet processing in External stage is sucessful"),
	EXTERNAL_STAGE_FAILED(StatusConstants.EXTERNAL_SATGE_MODULE_SUCCESS + "001" , "Packet processing in External stage failed"),

	//OSI Validator  stage
	//1.UMC Validator stage
	GPS_DETAILS_NOT_FOUND(StatusConstants.OSI_VALIDAOR_MODULE_FAILED + "001" , "GPS details are not found in packet"),
	CENTER_ID_NOT_FOUND(StatusConstants.OSI_VALIDAOR_MODULE_FAILED + "002" , "CenterId not found in packet"),
	CENTER_ID_INACTIVE(StatusConstants.OSI_VALIDAOR_MODULE_FAILED + "003" , "CenterId was inactive during packet creation - "),
	MACHINE_ID_NOT_FOUND(StatusConstants.OSI_VALIDAOR_MODULE_FAILED + "004" , "MachineId not found in packet"),
	MACHINE_ID_NOT_ACTIVE(StatusConstants.OSI_VALIDAOR_MODULE_FAILED + "005" , "MachineId was inactive during packet creation - "),
	MACHINE_ID_NOT_FOUND_MASTER_DB(StatusConstants.OSI_VALIDAOR_MODULE_FAILED + "023" , "MachineId not found in master db - "),
	SUPERVISOR_OFFICER_NOT_ACTIVE(StatusConstants.OSI_VALIDAOR_MODULE_FAILED + "006" , "SupervisorId and OfficerId are inActive"),
	CENTER_DEVICE_MAPPING_NOT_FOUND(StatusConstants.OSI_VALIDAOR_MODULE_FAILED + "007" , "Center-Device Mapping Not Found - "),
	CENTER_DEVICE_MAPPING_INACTIVE(StatusConstants.OSI_VALIDAOR_MODULE_FAILED + "008" , "Center-Device Mapping was InActive during Packet Creation - "),
    DEVICE_NOT_FOUND_MASTER_DB(StatusConstants.OSI_VALIDAOR_MODULE_FAILED + "009" , "Device Not Found in Master DB - "),
    DEVICE_ID_INACTIVE(StatusConstants.OSI_VALIDAOR_MODULE_FAILED + "010" , "Device ID was InActive during Packet Creation - "),
    PACKET_CREATION_WORKING_HOURS(StatusConstants.OSI_VALIDAOR_MODULE_FAILED + "011" , "Packet was Not Created during Working Hours - "),
    
    SUPERVISOR_OFFICER_NOT_FOUND_PACKET(StatusConstants.OSI_VALIDAOR_MODULE_FAILED + "012" , "Both Officer and Supervisor IDs are NULL"),
    SUPERVISOR_OR_OFFICER_WAS_INACTIVE(StatusConstants.OSI_VALIDAOR_MODULE_FAILED + "013" , "Officer or Supervisor was Not Active during Packet Creation - "),
    PACKET_CREATION_DATE_NOT_FOUND_IN_PACKET(StatusConstants.OSI_VALIDAOR_MODULE_FAILED + "014" , "Packet Creation Date is NULL"),
    //System Exceptions
	VIRUS_SCANNER_SERVICE_NOT_ACCESSIBLE(StatusConstants.SYSTEM_EXCEPTION_CODE , "Virus scanner service is not accessible "),
	DB_NOT_ACCESSIBLE(StatusConstants.SYSTEM_EXCEPTION_CODE , "Database not accessible"),
	PACKET_NOT_FOUND_PACKET_STORE(StatusConstants.SYSTEM_EXCEPTION_CODE , "Packet not found in file system"),
	FS_ADAPTER_EXCEPTION(StatusConstants.SYSTEM_EXCEPTION_CODE , "FileSystem adapter exception occured"),
	JSCH_EXCEPTION_OCCURED(StatusConstants.SYSTEM_EXCEPTION_CODE , "JSCH exception occured"),
	SFTP_FILE_OPERATION_EXCEPTION(StatusConstants.SYSTEM_EXCEPTION_CODE , "SFTP file operation exception occured"),
	IO_EXCEPTION(StatusConstants.SYSTEM_EXCEPTION_CODE , "IO exception occured"),
	BIO_METRIC_EXCEPTION(StatusConstants.SYSTEM_EXCEPTION_CODE , "Biometric exception occured in IDA"),
	BIO_METRIC_FILE_MISSING(StatusConstants.SYSTEM_EXCEPTION_CODE , "Applicant biometric fileName/file is missing"),
	
	
	UNKNOWN_EXCEPTION_OCCURED(StatusConstants.SYSTEM_EXCEPTION_CODE , "Unknown exception occured "),
	API_RESOUCE_ACCESS_FAILED(StatusConstants.SYSTEM_EXCEPTION_CODE , "Unable to access API resource" ),
    JSON_PARSING_EXCEPTION(StatusConstants.SYSTEM_EXCEPTION_CODE , "Error occured while parsing json"),
    BASE_CHECKED_EXCEPTION(StatusConstants.SYSTEM_EXCEPTION_CODE , "Packet validation failed "),
    BASE_UNCHECKED_EXCEPTION(StatusConstants.SYSTEM_EXCEPTION_CODE , "Packet validation failed "),
    
    
    OFFICER_AUTHENTICATION_FAILED(StatusConstants.SYSTEM_EXCEPTION_CODE , "Officer Authentication Failed: "),

    
	PACKET_CLEANUP_FAILED1("","");
	
	private final String statusComment;
	private final String statusCode;
	
	private StatusUtil(String statusCode, String statusComment) {
		this.statusCode = statusCode;
		this.statusComment = statusComment;
	}

	public String getMessage() {
		return this.statusComment;
	}

	/**
	 * Gets the error code.
	 *
	 * @return the error code
	 */
	public String getCode() {
		return this.statusCode;
	}

}
