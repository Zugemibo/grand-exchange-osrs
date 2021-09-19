package pl.piatekd.osrsprices.service;

import pl.piatekd.osrsprices.model.Item;
import pl.piatekd.osrsprices.model.ItemVolume;

import java.util.List;

public interface ItemVolumeService {

    void saveAll(List<ItemVolume> itemList);
}
