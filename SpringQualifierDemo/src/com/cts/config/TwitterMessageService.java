package com.cts.config;

import org.springframework.stereotype.Component;
@Component
public class TwitterMessageService implements MessageService {

	@Override
	public void sendMsg() {
		// TODO Auto-generated method stub
		System.out.println("Twitter message service implments here");
	}

}
