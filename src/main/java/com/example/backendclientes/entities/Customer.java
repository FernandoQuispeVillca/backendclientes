package com.example.backendclientes.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Customer {
    private String name;
    private String fistName;
    private String lastName;
    private String typeDocument;
    private String numberDocument;
    private String birthDate;
    private String gender;
}
