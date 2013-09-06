package fr.treeptik.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

import fr.treeptik.entity.Commande;
import fr.treeptik.entity.Product;
import fr.treeptik.service.EmployeeService;
import fr.treeptik.service.ProductService;

@Component(value="commandeAction")
@Scope("prototype")
@Namespace("/commande")
public class CommandeAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private Commande commande = new Commande();
	private Product product = new Product();
	private List<Commande> commandes;
	private Map<Integer, String> products;
	
	
	
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private EmployeeService employeeService;

	
	@Action(value="addAction", results = {
			@Result(name = "success", type = "redirectAction", location = "listAction.action"),
			@Result(name = "input", location = "/commande/add.jsp") })
	public String addCommande() throws Exception{
		
		System.out.println("Add Commande");
		
		System.out.println("Add Product ID + " + product.getId());
		
		commande.setProducts(new ArrayList<Product>());
		commande.getProducts().add(product);
		
		
		return "success";
	}

	@Action(value="init", results = {
			@Result(name = "success", location = "/commande/add.jsp") })
	public String init() throws Exception{
		
		
		setProducts(new HashMap<Integer, String>());
		
		List<Product> allProduct = productService.getAll();
		for (Product product : allProduct) {
			getProducts().put(product.getId(), product.getRef() +" - "+ product.getDescription());
		}
		
//		System.out.println("Init Add Commande size : " + products.size());
		
		
		return "success";
	}
	
	
	
	@Action(value = "listAction", results = {
			@Result(name = "success", location = "/commande/list.jsp")})
	@SkipValidation
	public String listCommandes() throws Exception {
		
		//setCommandes(Arrays.asList(new Commande(1, new Date(), new Date(), products, employee), new Commande(2, new Date(), new Date(), products, employee)));
		
		return "success";
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	
	public Map<Integer, String> getProducts() {
		return products;
	}

	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	
}
