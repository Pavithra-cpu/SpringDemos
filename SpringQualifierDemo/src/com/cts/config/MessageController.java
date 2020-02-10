package com.cts.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class MessageController {
	
	
	MessageService messageService;
	@Autowired
	public MessageController(@Qualifier("watsAppMessageService") com.cts.config.MessageService messageService) {
		super();
		this.messageService = messageService;
	}

	public MessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
	public void sendMessage()
	{
		this.messageService.sendMsg();
	}
	
}
