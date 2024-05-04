package com.csw.proyecto.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.csw.proyecto.demo.Models.UserModel;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long> {

}
