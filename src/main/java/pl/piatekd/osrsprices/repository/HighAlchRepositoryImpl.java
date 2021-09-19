package pl.piatekd.osrsprices.repository;

import org.springframework.stereotype.Repository;
import pl.piatekd.osrsprices.dto.HighAlchItemDTO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class HighAlchRepositoryImpl {


    @PersistenceContext
    private EntityManager entityManager;


    public List<HighAlchItemDTO> getBestHighAlchItems() {
        String query = "select new pl.piatekd.osrsprices.dto.HighAlchItemDTO(ai.name,i.highPrice,i.highPriceTime ,i.lowPrice,i.lowPriceTime,ai.highAlch as highAlchValue,(ai.highAlch - (case when i.highPrice>i.lowPrice then i.highPrice else i.lowPrice end)) as highAlchDifference, ai.members, ai.buyLimit) from Item i join AdditionalInfo ai on(i.id = ai.id) where ai.buyLimit > 0 order by ai.highAlch - (case when i.highPrice>i.lowPrice then i.highPrice else i.lowPrice end) desc";
        return entityManager.createQuery(query, HighAlchItemDTO.class).setMaxResults(500).getResultList();
    }
}
