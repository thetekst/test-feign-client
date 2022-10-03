package ru.tkachenko.consumer.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.tkachenko.consumer.client.ConsumerClient;

import javax.annotation.PostConstruct;

/**
 * @author d.tkachenko
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class ConsumerService {

    private final ConsumerClient consumerClient;

    @PostConstruct
    void init() {
        log.info("-----------consumer before");
        consumerClient.test();
        log.info("-----------consumer after");
    }

}
