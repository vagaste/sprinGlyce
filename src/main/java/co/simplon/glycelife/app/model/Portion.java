package co.simplon.glycelife.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "portion")
public class Portion {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id")
	private Long id;

	@Column(name = "quantity")
	private double quantity;

	@ManyToOne
	@JoinColumn(name = "fk_idaliment")
	private Aliment aliment;

	@ManyToOne
	@JoinColumn(name = "fk_idrecette")
	private Recette recette;

	public Portion() {
	}

	public Portion(Long id, double quantity, Aliment aliment, Recette recette) {
		this.id = id;
		this.quantity = quantity;
		this.aliment = aliment;
		this.recette = recette;
	}

	public Portion(double quantity, Aliment aliment, Recette recette) {
		this.quantity = quantity;
		this.aliment = aliment;
		this.recette = recette;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public Aliment getAliment() {
		return aliment;
	}

	public void setAliment(Aliment aliment) {
		this.aliment = aliment;
	}

	public Recette getRecette() {
		return recette;
	}

	public void setRecette(Recette recette) {
		this.recette = recette;
	}

	public Long getId() {
		return id;
	}

}
