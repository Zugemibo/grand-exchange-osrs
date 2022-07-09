package pl.piatekd.osrsprices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.piatekd.osrsprices.dto.ItemDTO;
import pl.piatekd.osrsprices.model.Item;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.SqlResultSetMapping;
import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

	@Query("SELECT i FROM Item i WHERE i.id = ?1")
    Item findItemById(Long itemId);

	@Query("SELECT item.id FROM Item item")
    List<Long> getAllIds();

    @Query("SELECT item.id FROM Item item")
    ItemDTO getItemById(String itemName);

    @Query(value = "select new pl.piatekd.osrsprices.dto.ItemDTO(ai.name, i.highPrice , i.highPriceTime, i.lowPrice, i.lowPriceTime, i.margin, i.percentageMargin, ai.tradeLimit, ai.members, iv.dailyTraded) from Item i join AdditionalInfo ai on (i.id = ai.id) join ItemVolume iv on (i.id = iv.id) order by i.margin desc")
    List<ItemDTO> getItemsWithLargestMargin();

    @Query("select i.highPrice from Item i WHERE i.id = ?1")
    int getHighPriceById(Long itemId);
}