package br.com.javaparaweb.concessionaria.web;

//import javax.faces.application.FacesMessage;
//import javax.faces.context.FacesContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "subcategoriaBean")
@RequestScoped
public class SubcategoriaBean {
	private int subcategoriaId;
	private String nome;
	private int categoriaId;
	
	public int getSubcategoriaId() {
		return subcategoriaId;
	}
	public void setSubcategoriaId(int subcategoriaId) {
		this.subcategoriaId = subcategoriaId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCategoriaId() {
		return categoriaId;
	}
	public void setCategoriaId(int categoriaId) {
		this.categoriaId = categoriaId;
	}
}
