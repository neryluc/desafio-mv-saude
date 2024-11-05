package com.challenge.sistema_notificacoes.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.challenge.sistema_notificacoes.entities.NotificationService;
import com.challenge.sistema_notificacoes.repository.NotificationServiceRepository;

@Configuration
public class BdLoader implements CommandLineRunner{

    private final NotificationServiceRepository NotificationServiceRepository;

    public BdLoader(NotificationServiceRepository notificationServiceRepository){
        NotificationServiceRepository = notificationServiceRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Arrays.stream(NotificationService.notificationServices.values())
            .map(NotificationService.notificationServices::toNotificationService)
            .forEach(NotificationServiceRepository::save);
    }

}
