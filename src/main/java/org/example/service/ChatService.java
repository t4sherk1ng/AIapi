package org.example.service;

import org.example.domain.Chat;

import java.util.List;

public interface ChatService {

    Chat insertChat(Chat chat);

    Chat updateChat(Chat chat);

    List<Chat> getChats();

    Chat getChatById(int id);

    void deleteChat(int id);

    Chat getChatByName(String name);
}
