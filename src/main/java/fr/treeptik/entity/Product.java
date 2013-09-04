package fr.treeptik.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product implements Serializable{
    
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Integer id;
    
    private String ref;
    private String description;
    
    public Product() {
	}

    
	public Product(Integer id, String ref, String description) {
		super();
		this.id = id;
		this.ref = ref;
		this.description = description;
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


	@Override
	public String toString() {
		return "Product [id=" + id + ", ref=" + ref + ", description="
				+ description + "]";
	}

    
}
