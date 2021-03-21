package dev.gabrielcunha.hrpayroll.services;

import org.springframework.stereotype.Service;

import dev.gabrielcunha.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workerId, Integer days) {
		return new Payment("Bod", 200.0, days);
	}
	
}
