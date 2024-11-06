package com.challenge.sistema_notificacoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.challenge.sistema_notificacoes.entities.Notifications;
import com.challenge.sistema_notificacoes.entities.Users;

public interface NotificationsRepository extends JpaRepository<Notifications, Long>{

        List<Notifications> findByUser(Users userId);

}
