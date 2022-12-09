package com.cartService.CartService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

//import com.Drug.Drugs.models.Drugs;
import com.cartService.CartService.Repository.CartRepository;
import com.cartService.CartService.model.Cart;
import com.cartService.CartService.service.CartService;

@SpringBootTest
@AutoConfigureMockMvc
class CartServiceApplicationTests {

	/*@Test
	void contextLoads() {
	}*/

   @MockBean
	     CartRepository cartRepository;

    @Autowired
	    private CartService service;

    @Autowired
	    private MockMvc mockMvc;

       @Test
	         void getAllCartDetails()
	     {
	         when(cartRepository.findAll()).
	         thenReturn(Stream.of(new Cart(23,"abcd", 1, "abc", 70.0, 7, 9, "hjk", 70.0),
	                              new Cart(23,"cbau", 2, "cba", 60.0, 7, 9, "kik", 60.0))
	                             .collect(Collectors.toList()));
	         assertEquals(2, service.getAllUsers().size());
	         }
       
      /* @Test
       void addDrugToCart() {
    	   Cart cart = new Cart(23,"abcd", 1, "abc", 70.0, 7, 9, "hjk", 70.0);
           when(cartRepository.save(cart)).thenReturn(cart);
           Cart result=service.addNewCart(cart);
           assertEquals(cart.getId(),result.getId());
       }*/
}
