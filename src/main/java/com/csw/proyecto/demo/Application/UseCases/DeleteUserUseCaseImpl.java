package com.csw.proyecto.demo.Application.UseCases;

import com.csw.proyecto.demo.Domain.Ports.In.DeleteUserUseCase;
import com.csw.proyecto.demo.Domain.Ports.Out.UserRepositoryPort;

public class DeleteUserUseCaseImpl implements DeleteUserUseCase {
    private final UserRepositoryPort userRepositoryPort;

    public DeleteUserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public boolean deleteUser(Long id) {
        return userRepositoryPort.deleteById(id);
    }
}
