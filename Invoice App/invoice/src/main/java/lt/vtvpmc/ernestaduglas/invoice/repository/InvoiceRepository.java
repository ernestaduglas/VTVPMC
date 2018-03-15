package lt.vtvpmc.ernestaduglas.invoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.vtvpmc.ernestaduglas.invoice.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
