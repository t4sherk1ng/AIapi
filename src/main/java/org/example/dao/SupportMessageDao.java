package org.example.dao;

import org.example.domain.SupportMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupportMessageDao extends JpaRepository<SupportMessage, Integer> {

    SupportMessage findById(int id);

}
