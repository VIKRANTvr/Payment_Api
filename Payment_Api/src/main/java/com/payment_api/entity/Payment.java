package com.payment_api.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String payerName;

	@Column(nullable = false)
	private String receiverName;

	@Column(nullable = false)
	private BigDecimal amount;

	@Column(nullable = false)
	private String status;

	@Column(nullable = false)
	private LocalDateTime timestamp = LocalDateTime.now();

	public Payment() {
	}

	public Payment(String payerName, String receiverName, BigDecimal amount, String status) {
		this.payerName = payerName;
		this.receiverName = receiverName;
		this.amount = amount;
		this.status = status;
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

	public void setId(Long id) {
		this.id = id;
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
