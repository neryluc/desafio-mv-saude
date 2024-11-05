package com.challenge.sistema_notificacoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.challenge.sistema_notificacoes.entities.Notifications;

public interface NotificationsRepository extends JpaRepository<Notifications, Long>{

}
