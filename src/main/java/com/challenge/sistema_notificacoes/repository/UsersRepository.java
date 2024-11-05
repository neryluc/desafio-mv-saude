package com.challenge.sistema_notificacoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.challenge.sistema_notificacoes.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{

}
