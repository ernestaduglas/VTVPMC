package lt.vtvpmc.ernestaduglas.invoice;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lt.vtvpmc.ernestaduglas.invoice.model.Good;
import lt.vtvpmc.ernestaduglas.invoice.model.Invoice;
import lt.vtvpmc.ernestaduglas.invoice.service.InvoiceService;

@Component
public class DataInput implements CommandLineRunner {
	private InvoiceService service;

	@Autowired
	public DataInput(InvoiceService service) {
		this.service = service;
	}

	@Override
	public void run(String... args) throws Exception {
		Invoice invoice1 = new Invoice("UAB Maxima", "Danute");
		service.addInvoice(invoice1);
		
		Good bread = new Good("bread", 2.0, new BigDecimal("3"), "units");
		service.addGoodToInvoice(invoice1.getNr(), bread);
		Good meat = new Good("meat", 1.5, new BigDecimal("7"), "kg");
		service.addGoodToInvoice(invoice1.getNr(), meat);
		

		
		
		
	}

}
