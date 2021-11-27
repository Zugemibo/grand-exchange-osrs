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


    public List<ItemDTO> getItemsWithLargestMargin(boolean includeMemberItems) {
        String query = "select new pl.piatekd.osrsprices.dto.ItemDTO(ai.name, i.highPrice, i.highPriceTime, i.lowPrice, i.lowPriceTime, i.margin, i.percentageMargin, ai.buyLimit) from Item i join AdditionalInfo ai on (i.id = ai.id) order by i.margin desc";
        if (!includeMemberItems) {
            query = "select new pl.piatekd.osrsprices.dto.ItemDTO(ai.name, i.highPrice, i.highPriceTime, i.lowPrice, i.lowPriceTime, i.margin, i.percentageMargin, ai.buyLimit) from Item i join AdditionalInfo ai on (i.id = ai.id) where ai.members = '0' order by i.margin desc";
        }
        return entityManager.createQuery(query, ItemDTO.class).setMaxResults(1000).getResultList();
    }

    public List<ItemDTO> getItemsWithLargestPercentageMargin(boolean includeMemberItems) {
        String query = "select new pl.piatekd.osrsprices.dto.ItemDTO(ai.name, i.highPrice, i.highPriceTime, i.lowPrice, i.lowPriceTime, i.margin, i.percentageMargin, ai.buyLimit) from Item i join AdditionalInfo ai on (i.id = ai.id) where i.percentageMargin between 50 and 65 order by i.percentageMargin desc";
        if (!includeMemberItems) {
            query = "select new pl.piatekd.osrsprices.dto.ItemDTO(ai.name, i.highPrice, i.highPriceTime, i.lowPrice, i.lowPriceTime, i.margin, i.percentageMargin, ai.buyLimit) from Item i join AdditionalInfo ai on (i.id = ai.id) where i.percentageMargin between 50 and 65 and ai.members = '0' order by i.percentageMargin desc";
        }
        return entityManager.createQuery(query, ItemDTO.class).setMaxResults(1000).getResultList();
    }

    public List<ItemDTO> getBestHighAlchItems() {
        String query = "select new pl.piatekd.osrsprices.dto.ItemDTO(ai.name, i.highPrice, i.highPriceTime, i.lowPrice, i.lowPriceTime, i.margin, i.percentageMargin, ai.buyLimit) from Item i join AdditionalInfo ai on (i.id = ai.id) order by i.percentageMargin desc";
        return entityManager.createQuery(query, ItemDTO.class).setMaxResults(1000).getResultList();
    }

    public List<ItemDTO> getHighVolumeItems() {
        String query = "select new pl.piatekd.osrsprices.dto.ItemDTO(ai.name, i.highPrice, i.highPriceTime, i.lowPrice, i.lowPriceTime, i.margin, i.percentageMargin, ai.buyLimit) from Item i join AdditionalInfo ai on (i.id = ai.id) order by ai.buyLimit desc";
        return entityManager.createQuery(query, ItemDTO.class).setMaxResults(1000).getResultList();
    }

    public List<ItemDTO> getSuggestedItems(boolean includeMemberItems) {
        String query = "select new pl.piatekd.osrsprices.dto.ItemDTO(ai.name, i.highPrice, i.highPriceTime, i.lowPrice, i.lowPriceTime, i.margin, i.percentageMargin, ai.buyLimit) from Item i join AdditionalInfo ai on(i.id = ai.id) join ItemVolume iv on (i.id = iv.id) where (i.margin * ai.buyLimit) > 50000 and iv.volume > (ai.buyLimit * 5)";
        if (!includeMemberItems) {
            query = "select new pl.piatekd.osrsprices.dto.ItemDTO(ai.name, i.highPrice, i.highPriceTime, i.lowPrice, i.lowPriceTime, i.margin, i.percentageMargin, ai.buyLimit) from Item i join AdditionalInfo ai on(i.id = ai.id) join ItemVolume iv on (i.id = iv.id) where (i.margin * ai.buyLimit) > 50000 and iv.volume > (ai.buyLimit * 5) and ai.members = '0'";
        }
        return entityManager.createQuery(query, ItemDTO.class).setMaxResults(1000).getResultList();
    }
}
