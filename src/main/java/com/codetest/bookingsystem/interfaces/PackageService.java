package com.codetest.bookingsystem.interfaces;

import com.codetest.bookingsystem.dto.PackageDTO;
import com.codetest.bookingsystem.enums.Status;

import java.util.List;

public interface PackageService {

    PackageDTO createPackage(PackageDTO packageDTO);

    PackageDTO getPackageById(Long id);

    PackageDTO updatePackage(Long id, PackageDTO packageDTO);

    void deletePackage(Long id);

    List<PackageDTO> getPackagesByCountryAndStatus(Long countryId, Status status);

    List<PackageDTO> getPackagesByStatus(Status status);
}
