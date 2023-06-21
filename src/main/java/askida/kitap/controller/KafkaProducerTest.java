package askida.kitap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerTest {
    @Autowired
    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducerTest(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    @RequestMapping("/hello-kafka")
    public void sendMessage() {
//        return "test123";
        kafkaTemplate.send("topicName", "123456789");
    }


    @KafkaListener(topics = "topicName", groupId = "your-consumer-group")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group foo: " + message);
    }
}
