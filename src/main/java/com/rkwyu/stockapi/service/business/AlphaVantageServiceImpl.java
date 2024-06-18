package com.rkwyu.stockapi.service.business;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

@Service
public class AlphaVantageServiceImpl implements AlphaVantageService {
    @Value("${stockapi.alphavantage.apikey}")
    String apikey;

    @Override
    public String getCompanyOverview(String symbol) {
        RestTemplate restTemplate = new RestTemplate();
        try {
            String url = "https://www.alphavantage.co/query?function=OVERVIEW&symbol=IBM&apikey=demo";
            HttpHeaders headers = new HttpHeaders();
            HttpEntity<?> entity = new HttpEntity<>(headers);
            Map<String, String> params = new HashMap<>();
            params.put("function", "OVERVIEW");
            params.put("symbol", symbol);
            params.put("apikey", this.apikey);
            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class, params);
            String body = response.getBody();

            // TODO:
            ObjectMapper mapper = new JsonMapper();
            JsonNode json = mapper.readTree(body);

            return body;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
