package com.platinumChest.objetos;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "patrimonio")
public class Patrimonio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private int id;
	private String nome;
	private String setor;
	private float valor;
	private int nf;
	@Column(name = "id_fornecedor", nullable = false)
	private int fornecedor;
	private int depreciacao;
	private int situacao;
	@Column(name = "id_usuario", nullable = false)
	private int usuario;
	@Temporal(TemporalType.DATE)
	private Date data_geracao;
	@Temporal(TemporalType.DATE)
	private Date data_compra;


	public void setUsuario(int id){
		this.usuario = id;
	}

	public void setData_compra(Date data){
		this.data_compra = data;
	}

	public void setData_geracao(Date data){
		this.data_geracao = data;
	}

	public void setFornecedor(int id){
		this.fornecedor = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	public int getId() { return id; }
	public void setId(int id){this.id = id;}

	public void setNf(int nf){
		this.nf = nf;
	}

	public void setDepreciacao(int depreciacao) {
		this.depreciacao = depreciacao;
	}

	public int getNf() {
		return nf;
	}
	public Date getData_compra() {
		return data_compra;
	}
	public int getFornecedor() {
		return fornecedor;
	}
	public int getDepreciacao() {
		return depreciacao;
	}
	public Date getData_geracao() {
		return data_geracao;
	}
	public int getUsuario() {
		return usuario;
	}
}
