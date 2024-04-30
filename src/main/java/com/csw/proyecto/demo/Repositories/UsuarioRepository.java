package com.csw.proyecto.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csw.proyecto.demo.Models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
