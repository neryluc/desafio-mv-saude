package com.challenge.sistema_notificacoes.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "t_users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long    userId;
    private String  userName; //nome do usuário
    private String  userEmail; //email do usuário
    private Long    notificationServiceId; //canal escolhido para receber as notificações 

    public Users() {
    }

    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Long getNotificationService() {
        return notificationServiceId;
    }
    public void setNotificationService(Long notificationService) {
        this.notificationServiceId = notificationService;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    } 
    

}
