package com.cloudsea.message.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudsea.message.api.service.MessageService;
import com.cloudsea.message.api.service.impl.EmailServiceImpl;
import com.cloudsea.message.api.service.impl.SMSServiceImpl;
import com.cloudsea.message.bean.MessageType;

@Configuration
public class GeneralConfig {

	@Autowired
	public EmailServiceImpl emailServiceImpl;

	@Autowired
	public SMSServiceImpl smsServiceImpl;

	@Bean("messageSenderConfig")
	Map<MessageType, MessageService> getMessageSenderConfig() {
		Map<MessageType, MessageService> map = new HashMap<>();
		map.put(MessageType.EMAIL, emailServiceImpl);
		map.put(MessageType.SMS, smsServiceImpl);
		return map;
	}

}
