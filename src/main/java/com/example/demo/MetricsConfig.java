package com.example.demo;

import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MetricsConfig {
    @Bean
    public Gauge queueSize(MeterRegistry registry, QueueItemRepository repository) {

        return Gauge.builder("queueSize", repository::count).register(registry);
    }

}
