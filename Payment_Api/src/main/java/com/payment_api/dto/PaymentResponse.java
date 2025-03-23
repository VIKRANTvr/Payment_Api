package com.payment_api.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentResponse {
	private Long id;
	private String payerName;
	private String receiverName;
	private BigDecimal amount;
	private String status;
	private LocalDateTime timestamp;

	public PaymentResponse(Long id, String payerName, String receiverName, BigDecimal amount, String status,
			LocalDateTime timestamp) {
		this.id = id;
		this.payerName = payerName;
		this.receiverName = receiverName;
		this.amount = amount;
		this.status = status;
		this.timestamp = timestamp;
	}

	public Long getId() {
		return id;
	}

	public String getPayerName() {
		return payerName;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public String getStatus() {
		return status;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}
}
