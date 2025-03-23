package com.payment_api.controller;

import com.payment_api.dto.GetServiceRequest;
import com.payment_api.dto.GetServiceResponse;
import com.payment_api.service.PaymentService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/get_service")
    public ResponseEntity<String> getService(@RequestBody GetServiceRequest request) {
        GetServiceResponse response = paymentService.processServiceRequest(request);
        return ResponseEntity.ok("Payment Service Request Processed Successfully!");
    }
}

