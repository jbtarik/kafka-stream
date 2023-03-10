package tr.courses.kafkaconsumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import tr.courses.kafkaconsumer.bindings.StreamBindings;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import tr.courses.kafkaconsumer.model.Order;


@Service
@EnableBinding(StreamBindings.class)
public class StreamService {
    private final static Logger LOGGER= LoggerFactory.getLogger(StreamService.class);
    @StreamListener("order-input-channel")
    @SendTo("order-takeaway-output-channel")
    public KStream<String, Order> takeAway(KStream<String, Order> order) {
        return order.filter((k, v) -> "takeaway".equalsIgnoreCase(v.getDeliveryType()));
    }

    @StreamListener("order-input-channel")
    @SendTo("order-homedelivery-output-channel")

    public KStream<String, Order> homeDelivery(KStream<String, Order> order) {
        return order.filter((k, v) -> "homedelivery".equalsIgnoreCase(v.getDeliveryType()));

    }

}

