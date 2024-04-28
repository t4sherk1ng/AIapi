package org.example.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "Message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MessageID")
    private int messageID;

    @Column(name = "ChatID")
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Chat.class)
    private int chatID;

    @Column(name = "CustomerMessage")
    private String customerMessage;

    @Column(name = "AiResponse")
    private String aiResponse;

    @Column(name = "date_sent")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date dateSent;
}
