package com.csw.proyecto.demo.Application.UseCases;

import com.csw.proyecto.demo.Domain.Models.UserModel;
import com.csw.proyecto.demo.Domain.Ports.In.RetrieveUserUseCase;
import com.csw.proyecto.demo.Domain.Ports.Out.UserRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveUserUseCaseImpl implements RetrieveUserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    public RetrieveUserUseCaseImpl(UserRepositoryPort userRepositoryPort){
        this.userRepositoryPort=userRepositoryPort;
    }
    @Override
    public Optional<UserModel>getUser(Long id){
        return userRepositoryPort.findById(id);
    }
    @Override
    public List<UserModel> getAllUsers(){
        return userRepositoryPort.findAll();
    }
}
