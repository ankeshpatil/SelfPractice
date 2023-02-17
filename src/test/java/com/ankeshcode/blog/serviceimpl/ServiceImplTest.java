package com.ankeshcode.blog.serviceimpl;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.ankeshcode.blog.entities.User;
import com.ankeshcode.blog.repositories.UserRepo;
import com.ankeshcode.blog.serviceImpl.UserServiceImpl;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServiceImplTest {
	
    @Mock
	private UserRepo userRepo;
	@InjectMocks
	private UserServiceImpl userServiceImpl; 
	@Test
	public void test_getAllUserRestursUserList() {
		
//  Example code for test case
//        List<Product> productlist= new ArrayList<>();
//        productlist.add(new Product(1L,"pen", 30));
//        productlist.add(new Product(2L,"pencil", 20));
//        productlist.add(new Product(3L,"notebook", 60));
//
//        Mockito.when(productdao.findAll()).thenReturn(productlist);
//        assertEquals(productlist ,productserviceimpl.getDetails());
//		
	}
	
	
	}

