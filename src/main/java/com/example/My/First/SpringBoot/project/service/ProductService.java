package com.example.My.First.SpringBoot.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.function.ServerRequest.Headers;

import com.example.My.First.SpringBoot.project.model.Product;
import com.example.My.First.SpringBoot.project.repo.productrepo;

@Service
public class ProductService {
	
	
	@Autowired
	productrepo repo;
	
	public List<Product> getProducts() {
		
		List<Product> product = repo.findAll();
		
		return product;
		
	}

	public String getJsondetails(long id) throws Exception {
		
	     RestTemplate rest = new RestTemplate();
		
		 String url = "https://jsonplaceholder.typicode.com/posts/"+id;
		 
		 String response = null;
		 try {
	      response = rest.getForObject(url, String.class);
	      if (response.isEmpty() || response.isBlank()) {
	    	  throw new Exception ("Error occured in service layer ");
	      }
		 } catch (Exception e) {
			 
			 throw new Exception ("Error occured in service layer ");
		 }
		
		return response;
	}

	}



@Service
public class ProductService {

    // POST - Create
    public String createPost(Object requestBody) throws Exception {
        RestTemplate rest = new RestTemplate();

        String url = "https://jsonplaceholder.typicode.com/posts";

        String response;
        try {
            response = rest.postForObject(url, requestBody, String.class);

            if (response == null || response.isBlank()) {
                throw new Exception("Error in POST service");
            }
        } catch (Exception e) {
            throw new Exception("Error occurred in POST service");
        }

        return response;
    }

    
    
 // PUT - Update
  //  public String updatePost(long id, Object requestBody) throws Exception {
//        RestTemplate rest = new RestTemplate();
//
  //      String url = "https://jsonplaceholder.typicode.com/posts/" + id;
//
  //      try {
    //        rest.put(url, requestBody);
      //  } catch (Exception e) {
        //    throw new Exception("Error occurred in PUT service");
        // }

        //return "Updated successfully";
    //}
//
    

}
