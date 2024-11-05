package com.challenge.sistema_notificacoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.challenge.sistema_notificacoes.entities.NotificationService;

public interface NotificationServiceRepository extends JpaRepository<NotificationService, Long>{

}
