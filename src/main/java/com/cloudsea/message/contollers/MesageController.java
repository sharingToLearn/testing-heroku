package com.cloudsea.message.contollers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cloudsea.message.api.service.MessageService;
import com.cloudsea.message.bean.ClsMesage;
import com.cloudsea.message.bean.MessageType;

@RestController
public class MesageController {

	private Map<MessageType, MessageService> messageSenderMap;

	@Autowired
	public MesageController(Map<MessageType, MessageService> messageSenderMap) {
		this.messageSenderMap = messageSenderMap;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/sendmessage")
	public void sendMessage(@RequestBody String payload) {
		System.out.println("From github :::::::: "+payload);
		//messageSenderMap.get(clsMessage.getMessageType()).sendMessage(clsMessage);
	}

}
