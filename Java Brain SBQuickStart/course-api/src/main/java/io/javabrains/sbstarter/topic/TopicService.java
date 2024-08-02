package io.javabrains.sbstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
 		private List<Topic> topicList = new ArrayList<>(Arrays.asList(
			new Topic("java", "Core Java", "About Java"),
			new Topic("spring", "spring boot", "About spring boot")
		 ));
 		
 		public List<Topic> getAllTopics(){
 			return topicList;
 		}
 		
 		public Topic getTopic(String id) {
 			return topicList.stream().filter((t) -> t.getId().equals(id)).findAny().get();
 		}

 		public void addTopicService(Topic topic) {
 			topicList.add(topic);
 		}
 		
 		public void updateTopic(String id, Topic topic) {
			int index = 0;

 			for(Topic t: topicList) {
 				if(t.getId().equals(id)){
 					topicList.set(index, topic);
 					return;
 				}
 				index++;
 			}
 		}
 		
 		public void deleteTopic(String id) {
			int index = 0;

			for(Topic t : topicList) {
				if(t.getId().equals(id)) {
					topicList.remove(index);
					return;
				}
				index++;
			}
 		}
}
