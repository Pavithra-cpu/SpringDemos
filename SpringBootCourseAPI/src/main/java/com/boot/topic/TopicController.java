package com.boot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return Arrays.asList(
				new Topic("Spring","Spring Core","Spring core Description"),
				new Topic("Java","Core Java","Core Java Description"),
				new Topic("Javascript","Angular JavaScript","JavaScript Description")
				);
		}
}
