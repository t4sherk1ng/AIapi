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
@Table(name = "Support")
public class Support {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SupportID")
    private Integer id;

    @Column(name = "UserID")
    @OneToOne(fetch = FetchType.LAZY, targetEntity = User.class)
    private Integer userId;

    @Column(name = "SupportChatID")
    private Integer supportChatId;

    @Column(name = "ReportTheme")
    private String reportTheme;

    @Column(name = "Completed")
    private Boolean completed;

    @Column(name = "DateStart")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date dateStart;

    @Column(name = "DateEnd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date dateEnd;
}
