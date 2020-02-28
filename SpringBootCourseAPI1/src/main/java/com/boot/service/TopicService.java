package com.boot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.boot.model.Topics;

@Service
public class TopicService {

	private List<Topics> topics=new ArrayList<>(Arrays.asList(
			
			new Topics("Spring","Spring core","Spring core description"),
			new Topics("Java","Core Java","Core Java description"),
			new Topics("JavaScript","Angular JS","Angular JS description") 
			));
	
	public List<Topics> getAllTopics()
	{
		return topics;
	}
	
	

	public Topics getTopics(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}



	public void addTopics(Topics topics2) {
		// TODO Auto-generated method stub
		 topics.add(topics2);
	}



	public void updateTopics(String id,Topics topics2) {
		// TODO Auto-generated method stub
		for(int i=0;i<topics.size();i++)
		{
			Topics t=topics.get(i);
			if(t.getId().contentEquals(id))
			{
				topics.set(i, topics2);
				return;
			}
		}
		
	}



	public void deleteTopics(String id) {
		topics.removeIf(t->t.getId().equals(id));
		
	}
	
	
}
