package studyHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product{
	 
	@Id
	@Column(name="pid", insertable=true, updatable=true, unique=true, nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productId;
	
	@Column(name="pname")
	private String proName;
	
	@Column(name="price")
	private double price;
 
	
	public void setProductId(int productId)
	{
	    this.productId = productId;
	}
	public int getProductId()
	{
	    return productId;
	}
 
	public void setProName(String proName)
	{
	    this.proName = proName;
	}
	public String getProName()
	{
	    return proName;
	}
 
	public void setPrice(double price)
	{
	    this.price = price;
	}
	public double getPrice()
	{
	    return price;
	}
}