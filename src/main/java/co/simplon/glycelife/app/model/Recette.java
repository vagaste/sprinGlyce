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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "recette")
public class Recette {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "comment")
	private String comment;

	@Column(name = "energy")
	private double energy;

	@Column(name = "cg")
	private double cg;

	@Column(name = "protein")
	private double protein;

	@Column(name = "carb")
	private double carb;

	@Column(name = "lipid")
	private double lipid;

	@Column(name = "fibre")
	private double fibre;

	@Column(name = "sugar")
	private double sugar;

	@Column(name = "salt")
	private double salt;

	@OneToMany(mappedBy = "recette", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Portion> portions = new ArrayList<>();

	public Recette() {
	}

	public Recette(String name, String comment, double energy, double cg, double protein, double carb, double lipid,
			double fibre, double sugar, double salt, List<Portion> portions) {
		this.name = name;
		this.comment = comment;
		this.energy = energy;
		this.cg = cg;
		this.protein = protein;
		this.carb = carb;
		this.lipid = lipid;
		this.fibre = fibre;
		this.sugar = sugar;
		this.salt = salt;
		this.portions = portions;
	}

	public Recette(Long id, String name, String comment, double energy, double cg, double protein, double carb,
			double lipid, double fibre, double sugar, double salt, List<Portion> portions) {
		this.id = id;
		this.name = name;
		this.comment = comment;
		this.energy = energy;
		this.cg = cg;
		this.protein = protein;
		this.carb = carb;
		this.lipid = lipid;
		this.fibre = fibre;
		this.sugar = sugar;
		this.salt = salt;
		this.portions = portions;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment
	 *            the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the energy
	 */
	public double getEnergy() {
		return energy;
	}

	/**
	 * @param energy
	 *            the energy to set
	 */
	public void setEnergy(double energy) {
		this.energy = energy;
	}

	/**
	 * @return the cg
	 */
	public double getCg() {
		return cg;
	}

	/**
	 * @param cg
	 *            the cg to set
	 */
	public void setCg(double cg) {
		this.cg = cg;
	}

	/**
	 * @return the protein
	 */
	public double getProtein() {
		return protein;
	}

	/**
	 * @param protein
	 *            the protein to set
	 */
	public void setProtein(double protein) {
		this.protein = protein;
	}

	/**
	 * @return the carb
	 */
	public double getCarb() {
		return carb;
	}

	/**
	 * @param carb
	 *            the carb to set
	 */
	public void setCarb(double carb) {
		this.carb = carb;
	}

	/**
	 * @return the lipid
	 */
	public double getLipid() {
		return lipid;
	}

	/**
	 * @param lipid
	 *            the lipid to set
	 */
	public void setLipid(double lipid) {
		this.lipid = lipid;
	}

	/**
	 * @return the fibre
	 */
	public double getFibre() {
		return fibre;
	}

	/**
	 * @param fibre
	 *            the fibre to set
	 */
	public void setFibre(double fibre) {
		this.fibre = fibre;
	}

	/**
	 * @return the sugar
	 */
	public double getSugar() {
		return sugar;
	}

	/**
	 * @param sugar
	 *            the sugar to set
	 */
	public void setSugar(double sugar) {
		this.sugar = sugar;
	}

	/**
	 * @return the salt
	 */
	public double getSalt() {
		return salt;
	}

	/**
	 * @param salt
	 *            the salt to set
	 */
	public void setSalt(double salt) {
		this.salt = salt;
	}

	/**
	 * @return the portions
	 */
	public List<Portion> getPortions() {
		return portions;
	}

	/**
	 * @param portions
	 *            the portions to set
	 */
	public void setPortions(List<Portion> portions) {
		this.portions = portions;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

}
