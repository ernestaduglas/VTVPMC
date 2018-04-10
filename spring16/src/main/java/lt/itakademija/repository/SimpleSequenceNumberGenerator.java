package lt.itakademija.repository;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Component;

/**
 * Created by mariusg on 2016.12.19.
 */
@Component
public final class SimpleSequenceNumberGenerator implements SequenceNumberGenerator {
	public AtomicLong sequenceNumber = new AtomicLong(0L);

    @Override
    public Long getNext() {
    return sequenceNumber.incrementAndGet();
    }

}
