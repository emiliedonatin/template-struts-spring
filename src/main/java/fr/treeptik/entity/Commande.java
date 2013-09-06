package fr.treeptik.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Commande implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private Date dateCommande;
	
	private Date dateLivraison;
	
	@OneToMany(mappedBy="commande")
	private List<Product> products;
	
	@ManyToOne
	@JoinColumn(name="idEmployee")
	private Employee employee;
	
	public Commande() {
	
	}

	public Commande(Integer id, Date dateCommande, Date dateLivraison, List<Product> products, Employee employee) {
		super();
		this.id = id;
		this.dateCommande = dateCommande;
		this.dateLivraison = dateLivraison;
		this.products = products;
		this.employee = employee;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Date getDateLivraison() {
		return dateLivraison;
	}

	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", dateCommande=" + dateCommande + ", dateLivraison=" + dateLivraison + ", products=" + products + ", employee=" + employee + "]";
	}
	
	
	

}
