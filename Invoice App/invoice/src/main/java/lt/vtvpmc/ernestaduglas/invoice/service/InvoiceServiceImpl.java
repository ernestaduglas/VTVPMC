package lt.vtvpmc.ernestaduglas.invoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ernestaduglas.invoice.model.Good;
import lt.vtvpmc.ernestaduglas.invoice.model.Invoice;
import lt.vtvpmc.ernestaduglas.invoice.repository.GoodRepository;
import lt.vtvpmc.ernestaduglas.invoice.repository.InvoiceRepository;

@Service
public class InvoiceServiceImpl implements InvoiceService {
	private InvoiceRepository invoiceRepo;
	private GoodRepository goodRepo;
	
	
	@Autowired
	public InvoiceServiceImpl(InvoiceRepository invoiceRepo, GoodRepository goodRepo) {
		this.invoiceRepo = invoiceRepo;
		this.goodRepo = goodRepo;
	}
	
	@Transactional
	@Override
	public List<Invoice> getAllInvoices() {
		return invoiceRepo.findAll();
	}

	@Transactional
	@Override
	public void addInvoice(Invoice invoice) {
		invoiceRepo.save(invoice);
	}

	@Transactional
	@Override
	public void deleteInvoice(Long nr) {
		invoiceRepo.deleteById(nr);

	}

	@Transactional
	@Override
	public void addGoodToInvoice(Long nr, Good good) {
		Invoice invoice = invoiceRepo.findById(nr).get();
		good.setInvoice(invoice);
		invoice.getGoods().add(good);

	}
	@Transactional
	@Override
	public void deleteGoodFromInvoice(Long nr, Long goodId) {
		Good good = goodRepo.findById(goodId).get();
		invoiceRepo.findById(nr).get().getGoods().remove(good);
	}

}
