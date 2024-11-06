package com.challenge.sistema_notificacoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.challenge.sistema_notificacoes.entities.NotificationChannel;

public interface NotificationChannelRepository extends JpaRepository<NotificationChannel, Long>{

}
