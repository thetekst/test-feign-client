package ru.tkachenko.producer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author d.tkachenko
 */
@Slf4j
@RestController
public class ProducerController {

    @RequestMapping(
            method = RequestMethod.PATCH,
            value = "/test",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    ResponseEntity<String> test() {
        log.info("---- producer log");
        return ResponseEntity.ok("ok req");
    }

}
