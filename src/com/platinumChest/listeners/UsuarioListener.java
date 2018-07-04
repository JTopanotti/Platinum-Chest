package com.platinumChest.listeners;

import com.platinumChest.objetos.Usuario;
import com.platinumChest.persistence.UsuarioPersister;
import com.platinumChest.telas.CadastroUsuarios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsuarioListener implements ActionListener {

    private CadastroUsuarios cadastro;

    public UsuarioListener(CadastroUsuarios cadastro){
        this.cadastro = cadastro;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Usuario usuario = cadastro.salvarUsuario();
        new UsuarioPersister().salvarUsuario(usuario);
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }
}
