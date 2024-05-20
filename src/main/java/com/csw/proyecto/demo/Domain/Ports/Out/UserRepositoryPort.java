package com.csw.proyecto.demo.Domain.Ports.Out;

import com.csw.proyecto.demo.Domain.Models.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserRepositoryPort {

    UserModel save(UserModel user);

    Optional<UserModel> findById(Long id);

    List<UserModel> findAll();

    Optional<UserModel> update(UserModel user);

    boolean deleteById(Long id);
}
