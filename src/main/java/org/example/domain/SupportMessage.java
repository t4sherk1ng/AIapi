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
@Builder
@Entity
@Table(name = "SupportMessage")
public class SupportMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SupportMessageID")
    private Integer supportMessageID;

    @Column(name = "SupportID")
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Support.class)
    private Integer supportID;

    @Column(name = "SupportName")
    private String supportName;

    @Column(name = "UserMessage")
    private String userMessage;

    @Column(name = "SupportResponse")
    private String supportResponse;

    @Column(name = "DateUserMessage")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date dateUserMessage;

    @Column(name = "DateSupportMessage")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date dateSupportMessage;

}
