package com.payment_api.dto;

import java.util.List;

public class GetServiceResponse {
	private String status;
	private String message;
	private List<Long> processedOrderIds;
	private List<String> acceptedPaymentModes;

	public GetServiceResponse(String status, String message, List<Long> processedOrderIds,
			List<String> acceptedPaymentModes) {
		this.status = status;
		this.message = message;
		this.processedOrderIds = processedOrderIds;
		this.acceptedPaymentModes = acceptedPaymentModes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Long> getProcessedOrderIds() {
		return processedOrderIds;
	}

	public void setProcessedOrderIds(List<Long> processedOrderIds) {
		this.processedOrderIds = processedOrderIds;
	}

	public List<String> getAcceptedPaymentModes() {
		return acceptedPaymentModes;
	}

	public void setAcceptedPaymentModes(List<String> acceptedPaymentModes) {
		this.acceptedPaymentModes = acceptedPaymentModes;
	}
}
