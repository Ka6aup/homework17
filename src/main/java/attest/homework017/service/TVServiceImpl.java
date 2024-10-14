package attest.homework017.service;

import attest.homework017.model.TV;
import attest.homework017.repository.TVDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TVServiceImpl implements TVService {

    private final TVDao tvDao;

    @Autowired
    public TVServiceImpl(TVDao tvDao) {
        this.tvDao = tvDao;
    }

    @Override
    public TV createTV(TV tv) {
        return tvDao.createTV(tv);
    }

    @Override
    public TV updateTV(TV tv) {
        return tvDao.updateTV(tv);
    }

    @Override
    public void deleteTV(Long id) {
        tvDao.deleteTV(id);
    }

    @Override
    public TV getTVById(Long id) {
        return tvDao.getTVById(id);
    }

    @Override
    public List<TV> getAllTVs() {
        return tvDao.getAllTVs();
    }
}
