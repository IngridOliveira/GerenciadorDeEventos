package ge.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

import sun.util.calendar.LocalGregorianCalendar.Date;

@Entity
public class Evento {
	@Id
	@Column(name="id_evento")
	private long id;
	private String titulo;
	private Date data;
	
	@ManyToMany
	@JoinTable(
		name="presenca_evento",
		joinColumns= {@JoinColumn(name="id_evento")},
		inverseJoinColumns= {@JoinColumn(name="id_pessoa")}
	)
	private ArrayList<Pessoa> listaPessoas;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public ArrayList<Pessoa> getListaPessoas() {
		return listaPessoas;
	}

	public void setListaPessoas(ArrayList<Pessoa> listaPessoas) {
		this.listaPessoas = listaPessoas;
	}
	
}
