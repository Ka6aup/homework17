package attest.homework017.repository;

import attest.homework017.model.TV;

import java.util.List;

public interface TVDao {
    TV createTV(TV tv);
    TV updateTV(TV tv);
    void deleteTV(Long id);
    TV getTVById(Long id);
    List<TV> getAllTVs();
}
