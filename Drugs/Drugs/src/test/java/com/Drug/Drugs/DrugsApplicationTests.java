package com.Drug.Drugs;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.Drug.Drugs.models.Drugs;
import com.Drug.Drugs.repository.DrugsRepository;
import com.Drug.Drugs.service.DrugsService;

@SpringBootTest
class DrugsApplicationTests {

	@Test
	void contextLoads() {
	}
	/*@Autowired
	private DrugsService drugsService;
	
	@MockBean
	private DrugsRepository drugsRepository;
	
	public void getDrugsTest() {
		when(drugsRepository.findAll())
		         .thenReturn(Stream
		        		 .of(new Drugs("1","cro","2.0","9","pain","do not use without doctors prescription","John","2022-12-24"),
		        				 new Drugs("2","paracetmol","25.0","23","cold","do not use without doctors prescription","Sam","2022-12-24"),
		        				 new Drugs("3","pantof","2.0","10","gatric","do not use without doctors prescription","Hitha","2022-12-31"),
		        				 new Drugs("4","Dolo","10.0","20","body pains","use for heavy fever","Jimmy","2022-12-07"))
		        		 .collect(Collectors.toList()));
		assertEquals();
	}*/
}
