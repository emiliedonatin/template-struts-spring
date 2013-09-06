package fr.treeptik.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product implements Serializable{
    
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    
    private String ref;
    
    private String description;
    
    @ManyToOne
    @JoinColumn(name="idCommande")
    private Commande commande;
    
    public Product() {
	}

	public Product(Integer id, String ref, String description, Commande commande) {
		super();
		this.id = id;
		this.ref = ref;
		this.description = description;
		this.commande = commande;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", ref=" + ref + ", description=" + description + ", commande=" + commande + "]";
	}

    
	
    
}
