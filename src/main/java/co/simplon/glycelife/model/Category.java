package co.simplon.glycelife.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "category")
@NamedQueries({
	@NamedQuery(name = "Category.findAll", query = " SELECT c FROM Category ORDER BY c.name "),
	@NamedQuery(name = "Category.findById", query = " SELECT c FROM Category WHERE c.id = :id") })
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "NAME")
	private String name;
	
	public Category() {
		
	}
	public Category(long id) {
		this.id= id;
	}

	public Category(String name) {
		this.name= name;
	}
	public Category(long id, String name) {
		this.id= id;
		this.name= name;
	}
	
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}
	public void setId(Long id) {
		this.id= id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
}