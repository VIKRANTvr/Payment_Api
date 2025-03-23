package com.payment_api.dto;

import java.math.BigDecimal;

public class PaymentRequest {
	private String payerName;
	private String receiverName;
	private BigDecimal amount;
	private String status;

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

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
