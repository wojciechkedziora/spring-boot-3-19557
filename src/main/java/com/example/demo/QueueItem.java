package com.example.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class QueueItem {
    @Id
    private Long id;
}
