package com.igrek.treydit.persistence;

import com.igrek.treydit.domain.Inventory;
import com.igrek.treydit.domain.Treyder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Long> {

}
