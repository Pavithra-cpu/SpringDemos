package com.cts.config;

import org.springframework.stereotype.Component;
@Component
public class FacebookMessageService implements MessageService  {

	@Override
	public void sendMsg() {
		// TODO Auto-generated method stub
		System.out.println("Facebook message service implements here");
		
	}

}
