package com.rkwyu.stockapi.service.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rkwyu.stockapi.exception.ResourceNotFoundException;
import com.rkwyu.stockapi.model.Analyst;
import com.rkwyu.stockapi.model.Stock;
import com.rkwyu.stockapi.repository.AnalystRepo;

@Service
public class AnalystServiceImpl implements AnalystService {
    @Autowired
    AnalystRepo analystRepo;

    @Override
    public Analyst createAnalyst(Analyst analyst) {
        return analystRepo.save(analyst);
    }

    @Override
    public List<Analyst> getAllAnalysts() {
        return analystRepo.findAll();
    }

    @Override
    public Analyst getAnalystById(Long id) {
        return analystRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Analyst not found with id: " + id));
    }

    @Override
    public List<Analyst> getAnalystsByStock(Stock stock) {
        return analystRepo.findByStock(stock);
    }

    @Override
    public Analyst updateAnalyst(Analyst analyst) {
        if (!analystRepo.findById(analyst.getId()).isPresent()) {
            throw new ResourceNotFoundException("Stock not found with id: " + analyst.getId());
        }
        return analystRepo.save(analyst);
    }

    @Override
    public void deleteAnalystById(Long id) {
        if (!analystRepo.findById(id).isPresent()) {
            throw new ResourceNotFoundException("Stock not found with id: " + id);
        }
        analystRepo.deleteById(id);
    }

}
