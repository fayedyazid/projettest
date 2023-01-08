package com.example.projetgithub;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
private String name;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
