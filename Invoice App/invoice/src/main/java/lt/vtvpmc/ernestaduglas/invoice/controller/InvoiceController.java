package lt.vtvpmc.ernestaduglas.invoice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiParam;
import lt.vtvpmc.ernestaduglas.invoice.model.Good;
import lt.vtvpmc.ernestaduglas.invoice.model.Invoice;
import lt.vtvpmc.ernestaduglas.invoice.service.InvoiceService;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/invoices")
public class InvoiceController {
	private InvoiceService service;

	@Autowired
	public InvoiceController(InvoiceService service) {
		this.service = service;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Invoice> getAllInvoice(){
		return service.getAllInvoices();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void addInvoice(@ApiParam @RequestBody @Valid Invoice invoice){
		service.addInvoice(invoice);
	}
	
	@RequestMapping(path= "/{nr}", method = RequestMethod.PUT)
	public void updateInvoice(@PathVariable Long nr, @ApiParam @RequestBody @Valid Invoice invoice){
		service.updateInvoice(nr, invoice);
	}
	
	@RequestMapping(path= "/edit/{nr}", method = RequestMethod.PUT)
	public void addGoodToInvoice(@PathVariable Long nr, @ApiParam @RequestBody Good good){
		service.addGoodToInvoice(nr, good);
	}
	
	@RequestMapping(path= "/{nr}/{goodId}", method = RequestMethod.PUT)
	public void deleteGoodFromInvoice(@PathVariable Long nr, @PathVariable Long goodId){
		service.deleteGoodFromInvoice(nr, goodId);
	}
	
	@RequestMapping(path= "/{nr}", method = RequestMethod.DELETE)
	public void deleteInvoice(@PathVariable Long nr){
		service.deleteInvoice(nr);
	}
	
	
	
	
	
	

}
