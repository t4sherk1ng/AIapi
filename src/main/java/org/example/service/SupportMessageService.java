package org.example.service;

import org.example.domain.SupportMessage;

import java.util.List;

public interface SupportMessageService {

    SupportMessage insert(SupportMessage supportMessage);

    SupportMessage update(int supportMessageID, int supportID, String supportName, String userMessage, String supportResponse);

    List<SupportMessage> findAll();

    SupportMessage findById(Integer id);

    void deleteById(Integer id);

    SupportMessage findByContent(String title);

    List<SupportMessage> findBySupportName(String supportName);

}
