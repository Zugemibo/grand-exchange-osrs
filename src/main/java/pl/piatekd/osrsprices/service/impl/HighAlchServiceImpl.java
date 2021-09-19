package pl.piatekd.osrsprices.service.impl;

import org.springframework.stereotype.Service;
import pl.piatekd.osrsprices.dto.HighAlchItemDTO;
import pl.piatekd.osrsprices.model.Item;
import pl.piatekd.osrsprices.repository.HighAlchRepositoryImpl;
import pl.piatekd.osrsprices.repository.ItemRepository;
import pl.piatekd.osrsprices.service.HighAlchService;

import java.util.List;

@Service
public class HighAlchServiceImpl implements HighAlchService {

    private final HighAlchRepositoryImpl highAlchRepositoryImpl;
    private final ItemRepository itemRepository;

    public HighAlchServiceImpl(HighAlchRepositoryImpl highAlchRepositoryImpl, ItemRepository itemRepository) {
        this.highAlchRepositoryImpl = highAlchRepositoryImpl;
        this.itemRepository = itemRepository;
    }

    @Override
    public List<HighAlchItemDTO> getHighAlchItems() {
        return highAlchRepositoryImpl.getBestHighAlchItems();
    }

    @Override
    public int getNatureRunePrice() {
        return itemRepository.getHighPriceById(561L);
    }
}
