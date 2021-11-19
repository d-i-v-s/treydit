package com.igrek.treydit.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "item")
public class Item extends AbstractPersistable<Long> {

    private  String name;
    private  double cost;
    private  String description;
    @Enumerated(EnumType.STRING)
    private Condition condition;
    @ManyToOne
    private Treyder treyder;


}
