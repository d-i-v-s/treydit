package com.igrek.treydit.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "treyder")
public class Treyder extends AbstractPersistable<Long> {
    //model for treyder
    @Embedded
    private Name name;
    private String username;
    private String email;
    private LocalDate GBDate;
    @Enumerated(EnumType.STRING)
    private Role role;
    @Enumerated(EnumType.STRING)
    private Reputation reputation;
    @Embedded
    private Address address;
    @Embedded
    private Phonenumber phonenumber;
    private String password;




}
