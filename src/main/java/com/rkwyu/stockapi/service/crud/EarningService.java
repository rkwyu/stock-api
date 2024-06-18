package com.rkwyu.stockapi.service.crud;

import java.util.List;

import com.rkwyu.stockapi.model.Earning;
import com.rkwyu.stockapi.model.Stock;

public interface EarningService {

    public Earning createEarning(Earning earning);

    public List<Earning> getAllEarnings();

    public Earning getEarningById(Long id);

    public List<Earning> getEarningByStock(Stock stock);

    public Earning updateEarning(Earning earning);

    public void deleteEarningById(Long id);

}
