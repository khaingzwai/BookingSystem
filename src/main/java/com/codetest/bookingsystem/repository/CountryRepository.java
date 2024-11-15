package com.codetest.bookingsystem.repository;

import com.codetest.bookingsystem.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
