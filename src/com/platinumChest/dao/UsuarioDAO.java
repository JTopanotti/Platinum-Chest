package com.platinumChest.dao;

import com.platinumChest.objetos.Usuario;
import java.util.ArrayList;

public interface UsuarioDAO {

    ArrayList<Usuario> getUsuarios();

    ArrayList<Usuario> getUsuariosPorNome(String nome);

    boolean salvarUsuario(Usuario usuario);

    String getCredenciais(String username);

}
