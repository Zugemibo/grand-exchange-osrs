package pl.piatekd.osrsprices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.piatekd.osrsprices.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

	Item findItemByItem

}
