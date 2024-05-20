package com.csw.proyecto.demo.Domain.Ports.In;

import com.csw.proyecto.demo.Domain.Models.UserModel;

public interface CreateUserUseCase {
    UserModel createUser(UserModel userModel);
}
