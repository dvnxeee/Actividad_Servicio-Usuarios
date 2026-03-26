package com.clubdeportivo3.serviciousuarios.service;

import com.clubdeportivo3.serviciousuarios.model.Usuario;
import java.util.List;

public interface UsuarioService {
    List<Usuario> listarUsuarios();
    Usuario obtenerPorId(Long id);
    Usuario crear(Usuario usuario);
    void eliminar(Long id);
}