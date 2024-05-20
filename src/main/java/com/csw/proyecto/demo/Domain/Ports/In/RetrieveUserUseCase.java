package com.csw.proyecto.demo.Domain.Ports.In;

import com.csw.proyecto.demo.Domain.Models.UserModel;

import java.util.List;
import java.util.Optional;

public interface RetrieveUserUseCase {

    Optional<UserModel>getUser(Long id);
    List<UserModel> getAllUsers();
}
