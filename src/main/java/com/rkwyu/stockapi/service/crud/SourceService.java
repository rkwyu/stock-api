package com.rkwyu.stockapi.service.crud;

import java.util.List;

import com.rkwyu.stockapi.model.Source;

public interface SourceService {

    public Source createSource(Source source);

    public List<Source> getAllSources();

    public Source getSourceById(Long id);

    public Source getSourceByName(String name);

    public Source updateSource(Source source);

    public void deleteSourceById(Long id);

}
