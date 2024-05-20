package com.csw.proyecto.demo.Application.Services;

import com.csw.proyecto.demo.Domain.Models.UserModel;
import com.csw.proyecto.demo.Domain.Ports.In.CreateUserUseCase;
import com.csw.proyecto.demo.Domain.Ports.In.DeleteUserUseCase;
import com.csw.proyecto.demo.Domain.Ports.In.RetrieveUserUseCase;
import com.csw.proyecto.demo.Domain.Ports.In.UpdateUserUseCase;

import java.util.List;
import java.util.Optional;

public class UserService implements CreateUserUseCase, DeleteUserUseCase, RetrieveUserUseCase, UpdateUserUseCase {

    private final CreateUserUseCase createUserUseCase;
    private final DeleteUserUseCase deleteUserUseCase;
    private final RetrieveUserUseCase retrieveUserUseCase;
    private final UpdateUserUseCase updateUserUseCase;

    public UserService(CreateUserUseCase createUserUseCase,RetrieveUserUseCase retrieveUserUseCase, DeleteUserUseCase deleteUserUseCase, UpdateUserUseCase updateUserUseCase){
        this.createUserUseCase = createUserUseCase;
        this.retrieveUserUseCase = retrieveUserUseCase;
        this.deleteUserUseCase = deleteUserUseCase;
        this.updateUserUseCase = updateUserUseCase;
    }
    @Override
    public UserModel createUser(UserModel userModel) {
        return createUserUseCase.createUser(userModel);
    }

    @Override
    public boolean deleteUser(Long id) {
        return deleteUserUseCase.deleteUser(id);
    }

    @Override
    public Optional<UserModel> getUser(Long id) {
        return retrieveUserUseCase.getUser(id);
    }

    @Override
    public List<UserModel> getAllUsers() {
        return retrieveUserUseCase.getAllUsers();
    }

    @Override
    public Optional<UserModel> updateUser(Long id, UserModel updateUser) {
        return updateUserUseCase.updateUser(id, updateUser);
    }
}