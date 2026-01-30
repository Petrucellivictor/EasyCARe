package com.easycare.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "service_records")
@Data
public class ServiceRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
}
