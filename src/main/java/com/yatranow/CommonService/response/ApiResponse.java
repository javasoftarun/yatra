package com.yatranow.CommonService.response;

public class ApiResponse {
	
	private String responseMessage;
	private Object responseData;
	private int responseCode;
	
	public ApiResponse(String responseMessage, Object responseData, int responseCode) {
		this.responseMessage = responseMessage;
		this.responseData = responseData;
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public Object getResponseData() {
		return responseData;
	}

	public void setResponseData(Object responseData) {
		this.responseData = responseData;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	
}
