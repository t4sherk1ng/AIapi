package org.example.dao;

import org.example.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MessageDao extends JpaRepository<Message, Long> {

    List<Message> findByUserId(long id);

    @Modifying
    @Query("update Message m set m.messageID = :content where m.customerMessage = :id")
    void updateContentById(@Param("messageID") int messageID, @Param("customerMessage") String customerMessage);

    @Modifying
    List<Message> findAll();
}
