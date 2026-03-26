package com.clubdeportivo3.serviciousuarios.repository;

import com.clubdeportivo3.serviciousuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}