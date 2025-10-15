package tn.romdhani.managementsystem.service;

import tn.romdhani.managementsystem.dto.LoginRequest;
import tn.romdhani.managementsystem.dto.RegisterRequest;
import tn.romdhani.managementsystem.dto.Response;
import tn.romdhani.managementsystem.dto.UserDTO;
import tn.romdhani.managementsystem.entity.User;

public interface UserService {

    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedUser();

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);

}
