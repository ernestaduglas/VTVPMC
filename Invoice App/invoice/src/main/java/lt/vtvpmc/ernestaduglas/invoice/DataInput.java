package lt.vtvpmc.ernestaduglas.invoice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lt.vtvpmc.ernestaduglas.invoice.model.Good;
import lt.vtvpmc.ernestaduglas.invoice.model.Invoice;
import lt.vtvpmc.ernestaduglas.invoice.model.Role;
import lt.vtvpmc.ernestaduglas.invoice.model.User;
import lt.vtvpmc.ernestaduglas.invoice.repository.UserRepository;
import lt.vtvpmc.ernestaduglas.invoice.service.InvoiceService;

@Component
public class DataInput implements CommandLineRunner {
	@Autowired
	private InvoiceService service;
	@Autowired
	private UserRepository userRepo;

	@Override
	public void run(String... args) throws Exception {
		// creating admin
		User admin = new User("admin", "admin", Role.ADMIN);
		userRepo.save(admin);

		// some example data
		Invoice invoice1 = new Invoice("UAB Maxima", "Danute");
		service.addInvoice(invoice1);

		Good bread = new Good("bread", 2.0, new BigDecimal("3"), "units");
		service.addGoodToInvoice(invoice1.getNr(), bread);
		Good meat = new Good("meat", 1.5, new BigDecimal("7"), "kg");
		service.addGoodToInvoice(invoice1.getNr(), meat);

	}

}
