package com.platinumChest.objetos;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="fornecedor")
public class Fornecedor implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private int id;
	private String nome;
	private String cnpj;
	private int ie;
	private String endereco;
	private String cidade;
	private String estado;
	private String telefone;
	private String email;
	private int situacao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) { this.cnpj = cnpj; }
	public int getIe() {
		return ie;
	}
	public void setIe(int ie) {
		this.ie = ie;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id){this.id = id;}

	@Override
	public String toString() {
		return getNome();
	}
}
