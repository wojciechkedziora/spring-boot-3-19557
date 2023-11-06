package com.example.demo;

import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Data
@Entity
public class QueueItem {
    @Id
    private Long id;
}
