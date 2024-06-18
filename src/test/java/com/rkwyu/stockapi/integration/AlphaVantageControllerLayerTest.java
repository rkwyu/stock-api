package com.rkwyu.stockapi.integration;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rkwyu.stockapi.controller.business.AlphaVantageController;
import com.rkwyu.stockapi.model.Country;
import com.rkwyu.stockapi.model.Stock;
import com.rkwyu.stockapi.repository.StockRepo;
import com.rkwyu.stockapi.service.crud.StockService;

@ExtendWith(SpringExtension.class)      // enable Spring support in JUnit5
@WebMvcTest(AlphaVantageController.class)     // load Spring application context (only controller layer)
public class AlphaVantageControllerLayerTest {
    @Autowired
    private MockMvc mockMvc;

    // replace bean(s) with Mockito mock(s) in Spring application context
    @MockBean
    private StockService stockService;
    @MockBean
    private StockRepo stockRepo;

    // @Test
    // public void testCreateStock() throws Exception {
    //     Long countryId = 122L;
    //     Country country = new Country(countryId, "US", null);

    //     Long stockId = 123L;
    //     Stock stock = new Stock(stockId, "ORCL-US", "ORCL Oracle", true, country, null, null);

    //     country.setStocks(List.of(stock));

    //     given(stockService.createStock(stock)).willReturn(stock);

    //     mockMvc.perform(post("/api/user")
    //             .contentType(MediaType.APPLICATION_JSON)
    //             .content(new ObjectMapper().writeValueAsString(stock)))
    //             .andExpect(status().isOk())
    //             .andExpect(jsonPath("$.id").value(stockId))
    //             .andExpect(jsonPath("$.symbol").value("ORCL-US"))
    //             .andExpect(jsonPath("$.name").value("ORCL Oracle"))
    //             .andExpect(jsonPath("$.active").value(true));

    // }

    // @Test
    // public void testGetUserById() throws Exception {
    //     User user = new User();
    //     user.setId(1L);
    //     user.setName("John Doe");
    //     user.setEmail("john@example.com");

    //     given(userService.getUserById(1L)).willReturn(user);

    //     mockMvc.perform(get("/api/users/1")
    //             .accept(MediaType.APPLICATION_JSON))
    //             .andExpect(status().isOk())
    //             .andExpect(jsonPath("$.id").value(1L))
    //             .andExpect(jsonPath("$.name").value("John Doe"))
    //             .andExpect(jsonPath("$.email").value("john@example.com"));
    // }

    // @Test
    // public void testGetAllUsers() throws Exception {
    //     User user = new User();
    //     user.setId(1L);
    //     user.setName("John Doe");
    //     user.setEmail("john@example.com");

    //     List<User> users = Collections.singletonList(user);

    //     given(userService.getAllUsers()).willReturn(users);

    //     mockMvc.perform(get("/api/users")
    //             .accept(MediaType.APPLICATION_JSON))
    //             .andExpect(status().isOk())
    //             .andExpect(jsonPath("$[0].id").value(1L))
    //             .andExpect(jsonPath("$[0].name").value("John Doe"))
    //             .andExpect(jsonPath("$[0].email").value("john@example.com"));
    // }

    // @Test
    // public void testDeleteUser() throws Exception {
    //     willDoNothing().given(userService).deleteUser(anyLong());

    //     mockMvc.perform(delete("/api/users/1"))
    //             .andExpect(status().isNoContent());
    // }
    
}
