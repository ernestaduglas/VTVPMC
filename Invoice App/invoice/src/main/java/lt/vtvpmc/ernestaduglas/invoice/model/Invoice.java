package lt.vtvpmc.ernestaduglas.invoice.model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long nr;
	@Transient
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private String date = sdf.format(new Date());
	@NotNull
	@Length(min = 2, max = 100)
	private String companyName;
	@NotNull
	@Length(min = 2, max = 100)
	private String customerName;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "invoice")
	private Set<Good> goods = new HashSet<Good>();
	@Transient
	private BigDecimal invoiceAmount;

	public Invoice() {

	}

	public Invoice(String companyName, String customerName) {
		this.companyName = companyName;
		this.customerName = customerName;
	}

	public Long getNr() {
		return nr;
	}

	public void setNr(Long nr) {
		this.nr = nr;
	}

	public String getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = sdf.format(date);
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Set<Good> getGoods() {
		return goods;
	}

	public void setGoods(Set<Good> goods) {
		this.goods = goods;
	}

	public BigDecimal getInvoiceAmount() {
		BigDecimal invoiceAmount = new BigDecimal("0");
		for(Good g: goods) {
			invoiceAmount = invoiceAmount.add(g.getTotalPrice());
		}
		return invoiceAmount;
	}

	public void setInvoiceAmount(BigDecimal invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	
	

}
