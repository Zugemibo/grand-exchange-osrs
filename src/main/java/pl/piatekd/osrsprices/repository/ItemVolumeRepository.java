package pl.piatekd.osrsprices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.piatekd.osrsprices.model.ItemVolume;

@Repository
public interface ItemVolumeRepository extends JpaRepository<ItemVolume, Long> {
}
