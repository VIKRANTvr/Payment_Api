package com.payment_api.service;

import com.payment_api.dto.GetServiceRequest;
import com.payment_api.dto.GetServiceResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaymentService {
	public GetServiceResponse processServiceRequest(GetServiceRequest request) {
		// Validate request data
		if (request.getData() == null || request.getData().getDetails() == null) {
			throw new IllegalArgumentException("Invalid request: Missing required data fields");
		}

		String userId = request.getData().getDetails().getUser();
		List<Long> orderIds = request.getData().getOrder_ids();
		List<String> paymentModes = request.getData().getPayment_mode();
		String requestMethod = request.getData().getRequest_method();

		System.out.println("User ID: " + userId);
		System.out.println("Order IDs: " + orderIds);
		System.out.println("Payment Modes: " + paymentModes);
		System.out.println("Request Method: " + requestMethod);

		// Business logic validation
		if (userId == null || userId.isEmpty()) {
			return new GetServiceResponse("failed", "User ID is required", null, null);
		}
		if (orderIds == null || orderIds.isEmpty()) {
			return new GetServiceResponse("failed", "At least one order ID is required", null, null);
		}
		if (paymentModes == null || paymentModes.isEmpty()) {
			return new GetServiceResponse("failed", "At least one payment mode must be provided", null, null);
		}

		// Process request
		boolean ordersValid = orderIds.stream().allMatch(id -> id > 50000000);
		boolean validPayment = paymentModes.contains("upi") || paymentModes.contains("net_banking");

		// Generate response based on validation
		String status = (ordersValid && validPayment) ? "success" : "failed";
		String message = status.equals("success") ? "Processed successfully" : "Invalid order or payment mode";

		return new GetServiceResponse(status, message, orderIds, paymentModes);
	}
}
