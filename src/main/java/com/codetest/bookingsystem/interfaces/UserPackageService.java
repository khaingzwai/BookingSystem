package com.codetest.bookingsystem.interfaces;

import com.codetest.bookingsystem.dto.PurchaseResponseDTO;
import com.codetest.bookingsystem.dto.PurchaseUserPackageDTO;
import com.codetest.bookingsystem.dto.UserPackageDTO;

import java.util.List;

public interface UserPackageService {
    UserPackageDTO getUserPackageById(Long id);

    PurchaseResponseDTO purchaseUserPackage(Long userId, PurchaseUserPackageDTO purchaseUserPackageDTO);

    List<UserPackageDTO> getAllUserPackagesByUserId(Long userId);

    UserPackageDTO updateUserPackageClass(Long id, UserPackageDTO userPackageDTO);

    List<UserPackageDTO> getAllUserPackages();
}
