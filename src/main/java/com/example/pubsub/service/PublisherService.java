
package com.example.pubsub.service;

import com.google.cloud.spring.pubsub.core.PubSubTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 *
 * @author ajuar
 */
@Service
public class PublisherService {
    @Value("${app.publish}")
    private String topicName;
    private final PubSubTemplate pubSubTemplate;

    public PublisherService(PubSubTemplate pubSubTemplate) {
        this.pubSubTemplate = pubSubTemplate;
    }

    public Mono<String> publish(String message) {
        return Mono.fromFuture(pubSubTemplate.publish(topicName, message));
    }
}
