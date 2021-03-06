package lt.vtvpmc.ernestaduglas.trains.model;

import java.math.BigDecimal;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="vagon_type", 
discriminatorType = DiscriminatorType.STRING)
public abstract class Vagon {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long nr;
	private String company;
	private int count;
	private BigDecimal price;
	private double capacity;
	@ManyToOne
	private Train train;
	@Transient
	private BigDecimal totalprice;

	

	public Long getNr() {
		return nr;
	}

	public void setNr(Long nr) {
		this.nr = nr;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	@JsonIgnore
	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public BigDecimal getTotalprice() {
		return this.price.multiply(new BigDecimal(this.count));
	}

	public void setTotalprice(BigDecimal totalprice) {
		this.totalprice = totalprice;
	}
	
	

}
