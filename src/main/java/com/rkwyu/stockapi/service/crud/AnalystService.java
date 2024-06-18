package com.rkwyu.stockapi.service.crud;

import java.util.List;

import com.rkwyu.stockapi.model.Analyst;
import com.rkwyu.stockapi.model.Stock;

public interface AnalystService {

    public Analyst createAnalyst(Analyst analyst);

    public List<Analyst> getAllAnalysts();

    public Analyst getAnalystById(Long id);

    public List<Analyst> getAnalystsByStock(Stock stock);

    public Analyst updateAnalyst(Analyst analyst);

    public void deleteAnalystById(Long id);
}
