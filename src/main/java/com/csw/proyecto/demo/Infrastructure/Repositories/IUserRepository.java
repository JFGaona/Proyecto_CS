package com.csw.proyecto.demo.Infrastructure.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csw.proyecto.demo.Domain.Models.UserModel;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long> {

}
