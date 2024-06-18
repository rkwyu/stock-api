package com.rkwyu.stockapi.service.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rkwyu.stockapi.exception.ResourceNotFoundException;
import com.rkwyu.stockapi.model.Source;
import com.rkwyu.stockapi.repository.SourceRepo;

@Service
public class SourceServiceImpl implements SourceService {
    @Autowired
    SourceRepo sourceRepo;

    @Override
    public Source createSource(Source source) {
        return sourceRepo.save(source);
    }

    @Override
    public List<Source> getAllSources() {
        return sourceRepo.findAll();
    }

    @Override
    public Source getSourceById(Long id) {
        return sourceRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Source not found with id: " + id));
    }

    @Override
    public Source getSourceByName(String name) {
        return sourceRepo.findByName(name)
                .orElseThrow(() -> new ResourceNotFoundException("Source not found with name: " + name));
    }

    @Override
    public Source updateSource(Source source) {
        if (!sourceRepo.findById(source.getId()).isPresent()) {
            throw new ResourceNotFoundException("Stock not found with id: " + source.getId());
        }
        return sourceRepo.save(source);
    }

    @Override
    public void deleteSourceById(Long id) {
        if (!sourceRepo.findById(id).isPresent()) {
            throw new ResourceNotFoundException("Stock not found with id: " + id);
        }
        sourceRepo.deleteById(id);
    }

}
