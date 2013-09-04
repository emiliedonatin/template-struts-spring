package fr.treeptik.action;

import java.util.Arrays;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import fr.treeptik.entity.Product;

@Component(value = "productAction")
@Scope("prototype")
@Namespace("/product")
public class ProductAction extends ActionSupport implements
		ModelDriven<Product> {

	private static final long serialVersionUID = 1L;

	private Product product = new Product();
	private List<Product> products;

	@Override
	public Product getModel() {
		return product;
	}
	
	@Action(value = "addAction", results = {
			@Result(name = "success", type = "redirectAction", location = "listAction.action"),
			@Result(name = "input", location = "/product/add.jsp") })
	public String addProduct() throws Exception {
		System.out.println("ADD PRODUCT");

		System.out.println(product);

		return "success";
	}

	@Action(value = "listAction", results = {
			@Result(name = "success", location = "/product/list.jsp")})
	@SkipValidation
	public String listProducts() throws Exception {

		products = Arrays.asList(new Product(1, "REF1", "DESC1"), new Product(2, "REF2", "DESC2"));

		return "success";
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}


}
