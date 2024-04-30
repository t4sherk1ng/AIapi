package org.example.service;

import org.example.domain.Message;

import java.util.List;

public interface MessageService {

    Message insertMessage(Message message);

    Message updateMessage(Message message);

    List<Message> getMessages();

    Message getMessageByContent(String content);

    Message getMessageByUserName(String userName);

    void deleteById(int id);

}
