package org.example.springdatademo.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    String description;
    double price;

}
