package com.josiashenrique.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.josiashenrique.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
