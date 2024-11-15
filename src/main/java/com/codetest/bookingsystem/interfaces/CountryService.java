package com.codetest.bookingsystem.interfaces;

import com.codetest.bookingsystem.dto.CountryDTO;

import java.util.List;

public interface CountryService {

    CountryDTO createCountry(CountryDTO countryDTO) throws Exception;

    CountryDTO getCountryById(Long countryId) throws Exception;

    List<CountryDTO> getAllCountries() throws Exception;

    public CountryDTO updateCountry(CountryDTO countryDTO, Long countryId) throws Exception;
}
