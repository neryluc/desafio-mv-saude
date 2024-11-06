package com.challenge.sistema_notificacoes.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.challenge.sistema_notificacoes.entities.NotificationChannel;
import com.challenge.sistema_notificacoes.repository.NotificationChannelRepository;

@Configuration
public class BdLoader implements CommandLineRunner{

    private final NotificationChannelRepository NotificationServiceRepository;

    public BdLoader(NotificationChannelRepository notificationServiceRepository){
        NotificationServiceRepository = notificationServiceRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Arrays.stream(NotificationChannel.notificationServices.values())
            .map(NotificationChannel.notificationServices::toNotificationService)
            .forEach(NotificationServiceRepository::save);
    }

}
