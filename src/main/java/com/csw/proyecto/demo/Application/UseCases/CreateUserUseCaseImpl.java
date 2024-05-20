package com.csw.proyecto.demo.Application.UseCases;

import com.csw.proyecto.demo.Domain.Models.UserModel;
import com.csw.proyecto.demo.Domain.Ports.In.CreateUserUseCase;
import com.csw.proyecto.demo.Domain.Ports.Out.UserRepositoryPort;

public class CreateUserUseCaseImpl implements CreateUserUseCase {
    private final UserRepositoryPort userRepositoryPort;

    public CreateUserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }
    @Override
    public UserModel createUser(UserModel user) {
        return userRepositoryPort.save(user);
    }
}
