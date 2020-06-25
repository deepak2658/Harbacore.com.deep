package mainApp.Topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicServices {
    private List<getTopicObject.Topic> topics =  new ArrayList<>(Arrays.asList(
                new getTopicObject.Topic("thext1","text2","this is the description"),
                new getTopicObject.Topic("thext2","text2","this is the description"),
                new getTopicObject.Topic("thext3","text2","this is the description")

        ));
    public List<getTopicObject.Topic> getALlTopic(){
        return topics;
    }

    public getTopicObject.Topic getTopic(String id){
        return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(getTopicObject.Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, getTopicObject.Topic topic) {
        for (int i = 0; i <topics.size() ; i++) {
            getTopicObject.Topic t = topics.get(i);
            if (t.getId().equals(topic)){
                topics.set(i, topic);
                return;
            }

        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t->t.getId().equals(id));
    }
}
