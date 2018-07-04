package com.platinumChest.dao;

import com.platinumChest.objetos.Fornecedor;
import java.util.ArrayList;

public interface FornecedorDAO {

    ArrayList<Fornecedor> getFornecedores();

    ArrayList<Fornecedor> getFornecedoresPorNome(String nome);

    boolean salvarFornecedor(Fornecedor forn);

}
