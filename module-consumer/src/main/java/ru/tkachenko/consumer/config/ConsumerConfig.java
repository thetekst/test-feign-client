package ru.tkachenko.consumer.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import ru.tkachenko.consumer.Consumer;

/**
 * @author d.tkachenko
 */
@Configuration
@EnableFeignClients(basePackageClasses = Consumer.class)
public class ConsumerConfig {
}
