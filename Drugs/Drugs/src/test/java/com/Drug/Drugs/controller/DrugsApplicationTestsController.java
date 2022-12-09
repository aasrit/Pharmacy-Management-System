package com.Drug.Drugs.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
//import static org.mockito.Mockito.when;
import static org.mockito.Mockito.when;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.time.LocalDate;
//import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.Drug.Drugs.models.Drugs;
import com.Drug.Drugs.repository.DrugsRepository;
//import com.Drug.Drugs.repository.DrugsRepository;
import com.Drug.Drugs.service.DrugsService;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class DrugsApplicationTestsController {
	
	/*@MockBean
    private DrugsService service;

    @Autowired
    private MockMvc mockMvc;
    
  @Test
 
  public void testGetDetails() throws Exception {
  	Drugs drugs = new Drugs(12,"abcs", 15.0, 5, "Bia", "healyt","JK", LocalDate.of(2023,9,27));
  	Drugs drugs1 = new Drugs(13,"abcs2", 15.0, 5, "Bias", "healyts","JK", LocalDate.of(2023,12,27));
  	doReturn(Lists.newArrayList(drugs, drugs1)).when(service).getAllDetails();
  	mockMvc.perform(
  			get("/drugs/list")).andExpect(status().isOk()).andExpect(content().contentType(MediaType.APPLICATION_JSON))
  	.andExpect(jsonPath("$", hasSize(2)));
  }
    
  @Test
  public void testSaveDrugsDetails() throws Exception {
      Drugs drugs1 = new Drugs(13, "abcs2", 15.0, 5, "Bias", "healyts","JK", LocalDate.of(2023,9,27));
      doReturn(drugs1).when(service).saveDrugsDetails(any());



      mockMvc.perform(post("/drugs/add") .contentType(MediaType.APPLICATION_JSON)
               .content(asJsonString(drugs1))).andExpect(status().isOk()).andExpect(content().contentType(MediaType.APPLICATION_JSON))
       .andExpect(jsonPath("$.drugsId", is(13)));
  }
    
    @Test
    public void testGetDrugsById() throws Exception{
    	
    	Drugs drugs1 = new Drugs(13,"abcs2", 15.0, 5, "Bias", "healyts","JK", LocalDate.of(2023,9,27));
    	doReturn(Optional.of(drugs1)).when(service).getDrugsById(13);
    	
    	mockMvc.perform(get("/drugs/{id}",13)).andExpect(status().isOk()).andExpect(content().contentType(MediaType.APPLICATION_JSON))
    	.andExpect(jsonPath("$.drugsId", is(13)));
    }
    
    @Test
    public void testUpdateDrugsDetails() throws Exception {
    	Drugs drugs1 = new Drugs(13,"abcs2", 15.0, 5, "Bias", "healyts","JK", null);
    	Drugs updated = new Drugs(13,"abcs2", 16.0, 5, "Bias", "healyts","JK", null);
    	doReturn(Optional.of(drugs1)).when(service).getDrugsByID(13);
    	doReturn(updated).when(service).updateDrugsDetails(13, updated);
    	
    	mockMvc.perform(put("/drugs/{id}",13)
    			.contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(updated))).andExpect(status().isOk()).andExpect(content().contentType(MediaType.APPLICATION_JSON)).andExpect(jsonPath("$.drugsId", is(13))).andExpect(jsonPath("$.drugsCost", is(16.0)));
    }
    
    static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
   
	/*@Autowired
   private DrugsService drugsService;
	
	@MockBean
	private DrugsRepository drugsRepository;
   
	public void getDrugsTest() {
        when(drugsRepository.findAll())
        .thenReturn((List<Drugs>) Stream
                .of(new Drugs("1","cro","2.0","9","pain","do not use without doctors prescription","John","2022-12-24"),
                        new Drugs("2","paracetmol","25.0","23","cold","do not use without doctors prescription","Sam","2022-12-24"))
                .collect(Collectors.toList()));
        
        assertEquals(2, drugsService.getAllDetails().size());
    }*/
	
	@MockBean
    DrugsRepository repo;

    @Autowired
    private DrugsService service;

    @Autowired
    private MockMvc mockMvc;

    @Test
     void getDetails()
         {
          when(repo.findAll()).thenReturn(Stream.of(new Drugs(23,"abcd",50.0, 5, "abc", "healyt", "JK", LocalDate.of(2022, 12, 23)),
                                                    new Drugs(23,"cbau",50.0, 5, "cba", "healyt", "JK", LocalDate.of(2022, 12, 23)))
                              .collect(Collectors.toList()));
          assertEquals(2, service.getAllDetails().size());
          }

         @Test
         void addDrug() {

         Drugs drugs = new Drugs(23,"abcd",50.0, 5, "abc","healyts", "JK", LocalDate.of(2022, 12, 23));
         when(repo.save(drugs)).thenReturn(drugs);
         Drugs res=service.addNewDrug(drugs);
         assertEquals(drugs.getDrugsId(),res.getDrugsId());
         }
	
}
