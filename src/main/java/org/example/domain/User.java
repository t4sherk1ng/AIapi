package org.example.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserID")
    private int userID;

    @Column(name = "Username")
    private String username;

    @Column(name = "Password")
    private String password;

    @Column(name = "DateRegister")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date dateRegister;

    @Column(name = "LastLogin")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date lastLogin;

    @Column(name = "DateBirth")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date dateBirth;
}
