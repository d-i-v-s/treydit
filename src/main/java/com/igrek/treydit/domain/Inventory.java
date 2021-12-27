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
@Table(name = "invetory")
public class Inventory extends AbstractPersistable<Long> {

    @OneToOne
    private Treyder User;
    @OneToMany
    List<Item> items = new ArrayList<Item>();
}
