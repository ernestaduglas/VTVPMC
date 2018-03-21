package lt.vtvpmc.ernestaduglas.trains.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Train {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long nr;
	private String year;
	private String company;
	private String city;
	@OneToMany(mappedBy = "train", cascade = CascadeType.ALL)
	private List<Vagon> vagons = new ArrayList<Vagon>();
	@Transient
	private BigDecimal totalPrice;

	public Train() {

	}

	public Train(String year, String company, String city) {
		this.year = year;
		this.company = company;
		this.city = city;
	}

	public Long getNr() {
		return nr;
	}

	public void setNr(Long nr) {
		this.nr = nr;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Vagon> getVagons() {
		return vagons;
	}

	public void setVagons(List<Vagon> vagons) {
		this.vagons = vagons;
	}

	public BigDecimal getTotalPrice() {
		BigDecimal totalPrice = new BigDecimal("0");
		for(Vagon v: this.getVagons()) {
			totalPrice = totalPrice.add(v.getTotalprice());
		}
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	

}
