package com.khanh.kafka.kafkaconsumerexample.listener;

import com.khanh.kafka.kafkaconsumerexample.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

//    @KafkaListener(topics = "Kafka_Example", groupId = "group_id")
//    public void consumer(String message) {
//        System.out.println("Consumed message: " + message);
//    }

    @KafkaListener(topics = "Kafka_Example", groupId = "group_json", containerFactory = "userKafkaListenerFactory")
    public void consumerJson(User user) {
        System.out.println("Consumed message" + user);
    }
}
