package co.simplon.glycelife.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ALIMENT")
public class Aliment {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private Long id;

	@Column(name = "NAME")
	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_idcategory")
	private Category category;

	@Column(name = "ENERGY")
	private int energy;

	@Column(name = "IG")
	private int ig;

	@Column(name = "PROTEIN")
	private double protein;

	@Column(name = "CARB")
	private double carb;

	@Column(name = "SUGAR")
	private double sugar;

	@Column(name = "LIPID")
	private double lipid;

	@Column(name = "FIBRE")
	private double fibre;

	@Column(name = "SALT")
	private double salt;

	@Column(name = "CG")
	private double cg;

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
