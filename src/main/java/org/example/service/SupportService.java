package org.example.service;

import org.example.domain.Support;

import java.util.List;

public interface SupportService {

    Support insert(Support support);

    Support update(int id, int supportChatID, String reportTheme);

    List<Support> findAll();

    Support findById(Integer id);

    void deleteById(Integer id);

    Support findByName(String name);

}
