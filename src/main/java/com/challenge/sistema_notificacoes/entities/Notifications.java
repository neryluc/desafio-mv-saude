package com.challenge.sistema_notificacoes.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity
@Table(name = "t_notifications")

public class Notifications {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int notificationId;
    private String title;
    private String description; //corpo da notificação
    private String type; //tipo de notificação

}
