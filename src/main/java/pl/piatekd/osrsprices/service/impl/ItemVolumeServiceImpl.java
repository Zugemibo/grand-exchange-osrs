package pl.piatekd.osrsprices.service.impl;

import org.springframework.stereotype.Service;
import pl.piatekd.osrsprices.model.ItemVolume;
import pl.piatekd.osrsprices.repository.ItemVolumeRepository;
import pl.piatekd.osrsprices.service.ItemVolumeService;

import java.util.List;

@Service
public class ItemVolumeServiceImpl implements ItemVolumeService {

    private final ItemVolumeRepository itemVolumeRepository;

    public ItemVolumeServiceImpl(ItemVolumeRepository itemVolumeRepository) {
        this.itemVolumeRepository = itemVolumeRepository;
    }

    @Override
    public void saveAll(List<ItemVolume> itemList) {
        itemVolumeRepository.saveAll(itemList);
    }
}
