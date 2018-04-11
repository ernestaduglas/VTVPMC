package lt.akademija.jpaexam.ex01simple;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;



@Repository
public class CarRepository{
	
	@PersistenceContext
	private EntityManager manager;
	
    /**
     * Searches database for all cars and returns list of them
     * @return
     */

    public List<CarEntity> findAll() {
    	return manager.createQuery("SELECT c from CarEntity c", CarEntity.class).getResultList();
    }

    /**
     * Given particular ID of a car searches database and retrieves car information.
     * If car is not present `null` is returned.
     */
    public CarEntity find(Long id) {
    	System.out.println(manager);
    	CarEntity car = manager.find(CarEntity.class, id);
    			
    	return car;
    }

    /**
     * Saves or updates car information. When car with existing ID is passed then update operation is performed.
     * When id is not present new car is saved to database
     */
    public CarEntity saveOrUpdate(CarEntity e) {
        CarEntity car = this.find(e.getId());
        
        if(car ==null){
        	car =e;
        	manager.persist(car);
        }else {
        	car.setManufactureDate(e.getManufactureDate());
        	car.setModel(e.getModel());
        	manager.merge(car);
        	
        }
        return car;
        
    }
    
}
