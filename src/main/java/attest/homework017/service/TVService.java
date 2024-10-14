package attest.homework017.service;

import attest.homework017.model.TV;

import java.util.List;

public interface TVService {
    TV createTV(TV tv);
    TV updateTV(TV tv);
    void deleteTV(Long id);
    TV getTVById(Long id);
    List<TV> getAllTVs();
}
