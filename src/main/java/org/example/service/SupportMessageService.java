package org.example.service;

import org.example.domain.SupportMessage;

import java.util.List;

public interface SupportMessageService {

    SupportMessage insert(SupportMessage supportMessage);

    SupportMessage update(SupportMessage supportMessage);

    List<SupportMessage> findAll();

    SupportMessage findById(Integer id);

    void deleteById(Integer id);

    SupportMessage findByContent(String title);

    List<SupportMessage> findBySupportName(String supportName);

}
