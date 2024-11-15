package com.codetest.bookingsystem.interfaces;

import com.codetest.bookingsystem.dto.CommonResponse;
import com.codetest.bookingsystem.dto.PWChangeRequest;
import com.codetest.bookingsystem.dto.UserDTO;
import com.codetest.bookingsystem.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);

    UserDTO getUserById(Long id);

    List<UserDTO> getAllUsers();

    UserDTO updateUser(UserDTO userDTO);

    UserDTO deleteUser(Long id);

    UserDetailsService userDetailsService();

    CommonResponse changePassword(Long userId, PWChangeRequest pwChangeRequest);
}
