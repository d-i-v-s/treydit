package com.igrek.treydit.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table
public class Country extends AbstractPersistable<Long> {
    private String name;
    private String iso2Code;
    private Integer countryNumber;

    @OneToMany
    List<City> city = new ArrayList<>();

}
