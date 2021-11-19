package com.igrek.treydit.persistence;

import com.igrek.treydit.domain.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@DataJpaTest
public class TreyderRepositoryTest {
@Autowired
    private TreyderRepository repository;

@Test
    void ensureSavingWorksProperly(){
    //given
    Country at = Country.builder().name("Austria")
                                  .iso2Code("at")
                                  .countryNumber(43).build();

    Phonenumber phonenumber = Phonenumber.builder()
                                         .country_code(at.getCountryNumber())
                                         .area_code(664)
                                         .serialnumber("1840791").build();

    Address address = Address.builder().city("Vienna")
                                       .country(at)
                                       .streetnumber("Pernerstorfergase 60/3/18")
                                       .zipcode("1100").build();

    Name name = Name.builder().firstname("Cemil").subname("").lastname("Aslan").build();

    Treyder cemil = Treyder.builder().name(name)
            .address(address)
            .email("aslancemil09@gmail.com")
            .GBDate(LocalDate.of(2002,3,20))
            .password("Password")
            .phonenumber(phonenumber)
            .role(Role.TREYDER).username("Turkikaze")
            .reputation(Reputation.A).build();


    Item handy = Item.builder().name("Iphone 11")
                               .cost(499.99)
                               .description("Iphone 11 vor einem Jahr gekauft. Aufgrund neues Handy verkauft ich es")
                               .condition(Condition.GOD)
                               .treyder(cemil).build();

    Inventory inventory = Inventory.builder().name("First Inventory").items(List.of(handy)).build();

    //when
    var saved = repository.save(cemil);

    //then
    Assertions.assertThat(saved).isSameAs(cemil);


}

}
