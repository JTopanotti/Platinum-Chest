package runnables;

import dao.FornecedorDAO;
import dao.UsuarioDAO;

import javax.swing.*;
import java.util.List;

public class RunnableCadastro<T> implements Runnable {

    private List<T> lista;
    private String tipo;
    private JComboBox comboBox;

    public RunnableCadastro(List<T> list, String tipo, JComboBox comboBox){
        this.lista = list;
        this.tipo = tipo;
        this.comboBox = comboBox;
    }

    @Override
    public void run() {
        if(tipo.equals("fornecedor")){
            lista = (List<T>) new FornecedorDAO().getFornecedores();
            comboBox.setModel(new DefaultComboBoxModel(lista.toArray()));
            System.out.println(lista.get(0));
        } else if(tipo.equals("usuario")){
            lista = (List<T>) new UsuarioDAO().getUsuarios();
            comboBox.setModel(new DefaultComboBoxModel(lista.toArray()));
            System.out.println(lista.get(0));
        }
    }
}
