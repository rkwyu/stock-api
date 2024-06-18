package com.rkwyu.stockapi.service.crud;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.rkwyu.stockapi.model.Country;
import com.rkwyu.stockapi.model.Stock;
import com.rkwyu.stockapi.repository.CountryRepo;

@ExtendWith(MockitoExtension.class)
public class CountryServiceImplTest {
    // create mock bean(s)
    @Mock
    private CountryRepo countryRepo;

    // inject @Mock to an instance
    @InjectMocks
    private CountryServiceImpl countryService;

    @Test
    public void testGetCountryById() {
        Long id = 123L;
        Country expectCountry = new Country(id, "Hong Kong", new ArrayList<Stock>());
        when(countryRepo.findById(id)).thenReturn(Optional.of(expectCountry));

        Country actualCountry = countryService.getCountryById(id);

        assertNotNull(actualCountry);
        assertNotNull(actualCountry.getStocks());
        assertEquals(0, actualCountry.getStocks().size());
        assertEquals(expectCountry, actualCountry);
        verify(countryRepo, times(1)).findById(id);
    }

}
