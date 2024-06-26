package org.example.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Chat")
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ChatID")
    private int chatID;

    @Column(name = "UserID")
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = User.class)
    private int userID;

    @Column(name = "NameTheme")
    private String nameTheme;

    @Column(name = "AiPreference")
    private String aiPreference;

    @Column(name = "NameAiAssistant")

    private String nameAiAssistant;

    @Column(name = "DateCreated")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date dateCreated;
}
