package dao;

import db.Conexao;
import objetos.Fornecedor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class FornecedorDAO {

    //Teste Hibernate
    public Fornecedor getFornecedorPorIdHibernate(int id){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Platinum-Chest");
        EntityManager em = factory.createEntityManager();

        Fornecedor forn = em.find(Fornecedor.class, id);
        System.out.println(forn.getNome());
        factory.close();
        em.close();
        return forn;
    }

    //Inutilizado
    /*public Fornecedor getFornecedorPorId(int id){
        Connection conexao = null;
        PreparedStatement ps = null;
        try{
            conexao = Conexao.getConexao();
            ps = conexao.prepareStatement("select * from fornecedor where id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                Fornecedor forn = new Fornecedor();
                forn.setCod(rs.getInt("id"));
                forn.setNome(rs.getString("nome"));
                forn.setCnpj(rs.getString("cnpj"));
                forn.setIe(rs.getString("ie"));
                forn.setEndereco(rs.getString("endereco"));
                forn.setCidade(rs.getString("cidade"));
                forn.setEstado(rs.getString("estado"));
                forn.setTelefone(rs.getString("telefone"));
                forn.setEmail(rs.getString("email"));
                forn.setSituacao(rs.getInt("situacao"));
                return forn;
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (conexao != null){
                try {
                    conexao.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

    }*/

    //Inutilizado
    /*public void salvarFornecedor(Fornecedor forn){
        Connection conexao = Conexao.getConexao();
        if(forn.getCod() > 0){
            String statement = "update fornecedor set ";
        } else {
            String statement = String.format("insert into fornecedor values(" +
                    "nome = ?, " + ""
        }
    }*/

}
