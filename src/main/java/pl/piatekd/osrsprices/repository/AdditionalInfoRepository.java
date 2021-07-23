package pl.piatekd.osrsprices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.piatekd.osrsprices.model.AdditionalInfo;

import java.util.List;

@Repository
public interface AdditionalInfoRepository extends JpaRepository<AdditionalInfo, Long> {

    @Query(value = "select * from additional_info ai where ai.wiki_name like %:name% limit 1", nativeQuery = true)
    AdditionalInfo findAdditionalInfoByWikiName(String name);

    @Query(value = "select ai.id from additional_info ai where ai.wiki_name like %?1% limit 1", nativeQuery = true)
    Long findAdditionalInfoIdByWikiName(String name);
}
