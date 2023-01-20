package tr.courses.kafkaproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tr.courses.kafkaproducer.model.Order;
import tr.courses.kafkaproducer.service.KafkaProducerService;

@RestController
public class OrderController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping("/post")
    public void order(@RequestBody Order order){
        kafkaProducerService.send(order);
    }
}
