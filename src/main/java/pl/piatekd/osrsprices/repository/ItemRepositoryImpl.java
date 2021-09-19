package pl.piatekd.osrsprices.repository;

import org.springframework.stereotype.Repository;
import pl.piatekd.osrsprices.dto.ItemDTO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigDecimal;
import java.util.List;

@Repository
public class ItemRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;


    public List<ItemDTO> getItemsWithLargestMargin() {
        String query = "select new pl.piatekd.osrsprices.dto.ItemDTO(ai.name, i.highPrice, i.highPriceTime, i.lowPrice, i.lowPriceTime, i.margin, i.percentageMargin) from Item i join AdditionalInfo ai on (i.id = ai.id) order by i.margin desc";
        return entityManager.createQuery(query, ItemDTO.class).setMaxResults(10).getResultList();
    }

    public List<ItemDTO> getItemsWithLargestPercentageMargin() {
        String query = "select new pl.piatekd.osrsprices.dto.ItemDTO(ai.name, i.highPrice, i.highPriceTime, i.lowPrice, i.lowPriceTime, i.margin, i.percentageMargin) from Item i join AdditionalInfo ai on (i.id = ai.id) where i.percentageMargin between 50 and 65 order by i.percentageMargin desc";
        return entityManager.createQuery(query, ItemDTO.class).setMaxResults(10).getResultList();
    }

    public List<ItemDTO> getBestHighAlchItems() {
        String query = "select new pl.piatekd.osrsprices.dto.ItemDTO(ai.name, i.highPrice, i.highPriceTime, i.lowPrice, i.lowPriceTime, i.margin, i.percentageMargin) from Item i join AdditionalInfo ai on (i.id = ai.id) order by i.percentageMargin desc";
        return entityManager.createQuery(query, ItemDTO.class).setMaxResults(10).getResultList();
    }

    public ItemDTO getSingleItemByName(String itemName) {
        String query = "select new pl.piatekd.osrsprices.dto.ItemDTO(ai.name, i.highPrice, i.highPriceTime, i.lowPrice, i.lowPriceTime, i.margin, i.percentageMargin) from Item i join AdditionalInfo ai on (i.id = ai.id) where ai.name like :itemName";
        List<ItemDTO> singleItemList = entityManager.createQuery(query, ItemDTO.class).setParameter("itemName", itemName).setMaxResults(1).getResultList();
        ItemDTO item = singleItemList.get(0);
        return item;

    }
}
