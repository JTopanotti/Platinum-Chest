package com.platinumChest.runnables;

import com.platinumChest.persistence.FornecedorPersister;
import com.platinumChest.persistence.UsuarioPersister;

import javax.swing.*;
import java.util.ArrayList;

public class ListagemBackground<T> implements Runnable {

    public static final int TIPO_FORNECEDOR = 0;
    public static final int TIPO_USUARIO = 1;

    private ArrayList<T> lista;
    private int tipo;
    private JComboBox comboBox;

    public ListagemBackground(int tipo, JComboBox comboBox){
        this.tipo = tipo;
        this.comboBox = comboBox;
    }

    @Override
    public void run() {
        switch(tipo){
            case TIPO_FORNECEDOR:
                lista = (ArrayList<T>) new FornecedorPersister().getFornecedores();
                comboBox.setModel(new DefaultComboBoxModel(lista.toArray()));
                break;
            case TIPO_USUARIO:
                lista = (ArrayList<T>) new UsuarioPersister().getUsuarios();
                comboBox.setModel(new DefaultComboBoxModel(lista.toArray()));
                break;
        }
    }
}
