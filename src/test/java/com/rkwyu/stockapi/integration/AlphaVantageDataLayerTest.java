package com.rkwyu.stockapi.integration;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)      // enable Spring support in JUnit5
@DataJpaTest                            // load Spring application context (only data layer)
public class AlphaVantageDataLayerTest {
    // TODO:    
}
