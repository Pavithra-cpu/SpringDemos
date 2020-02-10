package com.cts.config;

import org.springframework.stereotype.Component;
@Component
public class WatsAppMessageService implements MessageService {

	@Override
	public void sendMsg() {
		// TODO Auto-generated method stub
		System.out.println("Watsapp message service implements here");
	}

}
