package com.rkwyu.stockapi.service.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rkwyu.stockapi.exception.ResourceNotFoundException;
import com.rkwyu.stockapi.model.Earning;
import com.rkwyu.stockapi.model.Stock;
import com.rkwyu.stockapi.repository.EarningRepo;

@Service
public class EarningServiceImpl implements EarningService {
    @Autowired
    EarningRepo earningRepo;

    @Override
    public Earning createEarning(Earning earning) {
        return earningRepo.save(earning);
    }

    @Override
    public List<Earning> getAllEarnings() {
        return earningRepo.findAll();
    }

    @Override
    public Earning getEarningById(Long id) {
        return earningRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Earning not found with id: " + id));
    }

    @Override
    public List<Earning> getEarningByStock(Stock stock) {
        return earningRepo.findByStock(stock);
    }

    @Override
    public Earning updateEarning(Earning earning) {
        if (!earningRepo.findById(earning.getId()).isPresent()) {
            throw new ResourceNotFoundException("Stock not found with id: " + earning.getId());
        }
        return earningRepo.save(earning);
    }

    @Override
    public void deleteEarningById(Long id) {
        if (!earningRepo.findById(id).isPresent()) {
            throw new ResourceNotFoundException("Stock not found with id: " + id);
        }
        earningRepo.deleteById(id);
    }

}
