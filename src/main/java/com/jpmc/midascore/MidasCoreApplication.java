package com.jpmc.midascore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.jpmc.midascore.foundation.Transaction;

@SpringBootApplication
public class MidasCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(MidasCoreApplication.class, args);
    }

    @KafkaListener(id="traderListener", topics="${general.kafka-topic}")
    public void listen(Transaction transaction) {
        System.out.println("Received Transaction: " + transaction);
    }

}
