package com.cloudsea.message.api.service.impl;

import org.springframework.stereotype.Component;

import com.cloudsea.message.api.service.MessageService;
import com.cloudsea.message.bean.ClsMesage;
import com.cloudsea.message.bean.EmailMessage;

@Component
public class EmailServiceImpl implements MessageService {

	@Override
	public void sendMessage(ClsMesage messageResuest) {
		System.out.println("Sending Email ... ");
		System.out.println(messageResuest);

		EmailMessage emailMessage = messageResuest.getEmailMessage();
		System.out.println(emailMessage);

	}

}
