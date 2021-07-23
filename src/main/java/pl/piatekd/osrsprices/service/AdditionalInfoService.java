package pl.piatekd.osrsprices.service;

import pl.piatekd.osrsprices.model.AdditionalInfo;

import java.util.List;

public interface AdditionalInfoService {


    void saveAll(List<AdditionalInfo> additionalInfoList);


    void save(AdditionalInfo additionalInfo);

    AdditionalInfo findByWikiName(String name);

    Long findIdByName(String name);
}
