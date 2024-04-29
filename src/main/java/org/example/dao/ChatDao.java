package org.example.dao;

import org.example.domain.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatDao extends JpaRepository<Chat, Long> {

    Chat findByName(String name);

    List<Chat> getAllByUserId(long userId);

}
