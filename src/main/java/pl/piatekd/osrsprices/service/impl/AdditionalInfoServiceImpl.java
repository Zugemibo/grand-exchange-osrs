package pl.piatekd.osrsprices.service.impl;

import org.springframework.stereotype.Service;
import pl.piatekd.osrsprices.model.AdditionalInfo;
import pl.piatekd.osrsprices.repository.AdditionalInfoRepository;
import pl.piatekd.osrsprices.service.AdditionalInfoService;

import java.util.List;

@Service
public class AdditionalInfoServiceImpl implements AdditionalInfoService {

    private final AdditionalInfoRepository additionalInfoRepository;

    public AdditionalInfoServiceImpl(AdditionalInfoRepository additionalInfoRepository) {
        this.additionalInfoRepository = additionalInfoRepository;
    }

    @Override
    public void saveAll(List<AdditionalInfo> additionalInfoList) {
        additionalInfoRepository.saveAll(additionalInfoList);
    }

    @Override
    public void save(AdditionalInfo additionalInfo) {
        additionalInfoRepository.save(additionalInfo);
    }

    @Override
    public AdditionalInfo findByWikiName(String name) {
        return additionalInfoRepository.findAdditionalInfoByWikiName(name);
    }

    @Override
    public Long findIdByName(String name) {
        return additionalInfoRepository.findAdditionalInfoIdByWikiName(name);
    }
}
