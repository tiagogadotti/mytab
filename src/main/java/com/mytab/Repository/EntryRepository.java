package com.mytab.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mytab.model.Entry;

public interface EntryRepository extends JpaRepository<Entry, Long>{

}
