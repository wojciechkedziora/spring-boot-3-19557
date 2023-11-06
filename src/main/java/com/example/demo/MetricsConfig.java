package com.example.demo;

import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.binder.MeterBinder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MetricsConfig {

    @Bean
    public MeterBinder queueMeterBinder(QueueItemRepository repository) {
        return (registry) -> {
            Gauge.builder("queueSize", repository::count).register(registry);
        };
    }
}
