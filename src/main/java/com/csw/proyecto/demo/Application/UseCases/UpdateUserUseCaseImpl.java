package com.csw.proyecto.demo.Application.UseCases;

import com.csw.proyecto.demo.Domain.Models.UserModel;
import com.csw.proyecto.demo.Domain.Ports.In.UpdateUserUseCase;
import com.csw.proyecto.demo.Domain.Ports.Out.UserRepositoryPort;

import java.util.Optional;

public class UpdateUserUseCaseImpl implements UpdateUserUseCase {

    private final UserRepositoryPort userRepositoryPort;


    public UpdateUserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public Optional<UserModel> updateUser(Long id, UserModel updateUser) {
        return userRepositoryPort.update(updateUser);
    }
}
