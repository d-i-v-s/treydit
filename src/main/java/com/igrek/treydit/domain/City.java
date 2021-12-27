package com.igrek.treydit.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "city")
public class City extends AbstractPersistable<Long> {

    private String name;
   // @OneToMany
    //List<Treyder> treyders = new ArrayList<>();
    @ManyToOne
    @JsonBackReference // solves infinit recusion
    private Country country;
}
