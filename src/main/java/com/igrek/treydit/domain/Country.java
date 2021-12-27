package com.igrek.treydit.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Table(name = "country")
public class Country extends AbstractPersistable<Long> {
    private String name;
    private String iso2Code;
    private Integer countryNumber;

    @OneToMany
    @JsonManagedReference // solves infinit recusion
    List<City> city = new ArrayList<>();

}
