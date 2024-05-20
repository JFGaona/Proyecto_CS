package com.csw.proyecto.demo.Domain.Ports.In;

import com.csw.proyecto.demo.Domain.Models.UserModel;

import java.util.Optional;

public interface UpdateUserUseCase {
    Optional<UserModel> updateUser(Long id, UserModel updateUser);
}
