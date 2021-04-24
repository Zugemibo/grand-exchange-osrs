package pl.piatekd.osrsprices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pl.piatekd.osrsprices.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

	@Query("SELECT i FROM Item i WHERE i.name = ?1")
	Item findItemByName(String name);
	
	@Query("SELECT i.id FROM Item i WHERE i.name = ?1")
	int findIdByName(String name);
}