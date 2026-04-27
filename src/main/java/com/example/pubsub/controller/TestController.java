package com.example.pubsub.controller;

import com.example.pubsub.service.PublisherService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
@RestController
@RequestMapping("/test")
public class TestController {

    private final PublisherService publisherService;

    public TestController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @PostMapping
    public Mono<String> send(@RequestParam String message) {
        return publisherService.publish(message);
    }
}
