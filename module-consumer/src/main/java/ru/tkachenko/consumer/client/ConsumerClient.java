package ru.tkachenko.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author d.tkachenko
 */
@FeignClient(name = "consumerClient", url = "http://localhost:8080")
public interface ConsumerClient {

    @RequestMapping(
            method = RequestMethod.PATCH,
            value = "/test",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    ResponseEntity<String> test();

}
