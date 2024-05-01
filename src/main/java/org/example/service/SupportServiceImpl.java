package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dao.SupportDao;
import org.example.domain.Support;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SupportServiceImpl implements SupportService {
    private final SupportDao supportDao;

    @Override
    @Transactional
    public Support insert(Support support) {
        return supportDao.save(support);
    }

    @Override
    public Support update(int id, int supportChatID, String reportTheme) {
        return null;
    }

    @Override
    public List<Support> findAll() {
        return List.of();
    }

    @Override
    public Support findById(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Support findByName(String name) {
        return null;
    }
}
