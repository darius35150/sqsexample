package com.example.sqsexample.listener;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class SqsExample {

    @SqsListener(value = "TestQueue")
    public void receiveMessage(String message){
        System.out.println(message);
    }
    
}
