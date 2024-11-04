package com.challenge.sistema_notificacoes.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int userId;
    private String userName;


}
