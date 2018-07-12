package co.simplon.glycelife.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "aliment")
public class Aliment {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "energy")
	private int energy;

	@Column(name = "ig")
	private int ig;

	@Column(name = "protein")
	private double protein;

	@Column(name = "carb")
	private double carb;

	@Column(name = "sugar")
	private double sugar;

	@Column(name = "lipid")
	private double lipid;

	@Column(name = "fibre")
	private double fibre;

	@Column(name = "salt")
	private double salt;

	@Column(name = "cg")
	private double cg;

	@ManyToOne
	@JoinColumn(name = "fk_idcategory")
	private Category category;

	@OneToMany(mappedBy = "aliment", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Portion> portions = new ArrayList<>();

	public Aliment() {
	}

	public Aliment(String name, Category category, int energy, int ig, double protein, double carb, double sugar,
			double lipid, double fibre, double salt, double cg) {
		this(null, name, category, energy, ig, protein, carb, sugar, lipid, fibre, salt, cg);
	}

	public Aliment(Long id, String name, Category category, int energy, int ig, double protein, double carb,
			double sugar, double lipid, double fibre, double salt, double cg) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.energy = energy;
		this.ig = ig;
		this.protein = protein;
		this.carb = carb;
		this.sugar = sugar;
		this.lipid = lipid;
		this.fibre = fibre;
		this.salt = salt;
		this.cg = cg;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getIg() {
		return ig;
	}

	public void setIg(int ig) {
		this.ig = ig;
	}

	public double getProtein() {
		return protein;
	}

	public void setProtein(double protein) {
		this.protein = protein;
	}

	public double getCarb() {
		return carb;
	}

	public void setCarb(double carb) {
		this.carb = carb;
	}

	public double getSugar() {
		return sugar;
	}

	public void setSugar(double sugar) {
		this.sugar = sugar;
	}

	public double getLipid() {
		return lipid;
	}

	public void setLipid(double lipid) {
		this.lipid = lipid;
	}

	public double getFibre() {
		return fibre;
	}

	public void setFibre(double fibre) {
		this.fibre = fibre;
	}

	public double getSalt() {
		return salt;
	}

	public void setSalt(double salt) {
		this.salt = salt;
	}

	public double getCg() {
		return cg;
	}

	public void setCg(double cg) {
		this.cg = cg;
	}

	@Override
	public String toString() {
		return "Aliment [id=" + id + ", name=" + name + ", energy=" + energy + ", ig=" + ig + ", protein=" + protein
				+ ", carb=" + carb + ", sugar=" + sugar + ", lipid=" + lipid + ", fibre=" + fibre + ", salt=" + salt
				+ ", cg=" + cg + ", Category= " + category.getName() + "]";
	}

}
