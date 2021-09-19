package pl.piatekd.osrsprices.service;

import pl.piatekd.osrsprices.dto.HighAlchItemDTO;

import java.util.List;

public interface HighAlchService {
    List<HighAlchItemDTO> getHighAlchItems();

    int getNatureRunePrice();
}
