package com.igrek.treydit.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Embeddable
public class Address {
    private String streetnumber;
    private String zipcode;

}
