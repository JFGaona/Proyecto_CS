package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerateValue;
import jakarta.persistence.GenerateType;
import jakarta.persistence.Id;

import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

// la clase UserState que representa el estado de un usuario en el sistema
public class UserState {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_state_id")

    private Long user_state_id;

    @Column(name = "state")
    private String state;

}
