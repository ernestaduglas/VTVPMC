package lt.vtvpmc.ernestaduglas.invoice.service;

import java.util.List;

import lt.vtvpmc.ernestaduglas.invoice.model.Good;
import lt.vtvpmc.ernestaduglas.invoice.model.Invoice;

public interface InvoiceService {
	
	List<Invoice> getAllInvoices();
	void addInvoice(Invoice invoice);
	void deleteInvoice(Long nr);
	void addGoodToInvoice(Long nr, Good good);
	void deleteGoodFromInvoice(Long nr, Long goodId);

}
