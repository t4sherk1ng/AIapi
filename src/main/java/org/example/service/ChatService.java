package org.example.service;

import org.example.domain.Chat;

import java.util.Date;
import java.util.List;

public interface ChatService {

    Chat insertChat(Chat chat);

    Chat updateChat(int chatID, int userID, String nameTheme, String aiPreference, String nameAiAssistant);

    List<Chat> getChats();

    Chat getChatById(int id);

    void deleteChat(int id);

    Chat getChatByName(String name);
}
