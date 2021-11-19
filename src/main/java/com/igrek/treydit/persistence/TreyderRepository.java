package com.igrek.treydit.persistence;

import com.igrek.treydit.domain.Address;
import com.igrek.treydit.domain.Reputation;
import com.igrek.treydit.domain.Role;
import com.igrek.treydit.domain.Treyder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TreyderRepository  extends JpaRepository<Treyder, Long> {

    Optional<Treyder> findByName(String name);
   // List<Treyder> findbyUsername(String name);
    List<Treyder> findByReputation(Reputation reputation);
    //List<Treyder> findByAddress(Address address);
    List<Treyder> findByRole(Role role);

}
