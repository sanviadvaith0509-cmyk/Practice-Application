package com.example.My.First.SpringBoot.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.My.First.SpringBoot.project.model.Product;
import com.example.My.First.SpringBoot.project.service.ProductService;

@RestController
	@RequestMapping("/product/")
	public class PracticeController 
	
	{
	
	
	
	@Autowired
	ProductService service;
	 
	 @GetMapping ("/getproducts")
	 public List<Product> getProductsdetails(){
		 Product product = new Product();
		 
		 List<Product> productlist=  service.getProducts();
		 
		 return productlist; 
		 
	 }
	 
	 
	 @GetMapping ("getJson/{userid}")
	 public String getjson(@PathVariable("userid") 
	                        long userid) throws Exception
	 {
		 try {
		 String response = service.getJsondetails(userid);
		 
				 return response; 
		 } catch (Exception e) {
			 throw new Exception("Error occured for user : "+ userid +"," +e.getMessage());
		 }
				 
	 }	 
	 
}


//   https://jsonplaceholder.typicode.com/posts
// public class jsonResponse {

//String  userid;
// int id;
// String title;
// String body ;

//}///product/getJson/2




@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    // POST API
    @PostMapping("/posts")
    public String create(@RequestBody Object body) throws Exception {
    	
    
        return service.createPost(body);
    }

    
    
 // PUT API
  //  @PutMapping("/posts/{id}")
    //public String update(@PathVariable long id, @RequestBody Object body) throws Exception {
      //  return service.updatePost(id, body);
    //}
//}
    
    
    
    /**
     
     if (condition) {
     
     } else {
     
     }
     
     
     if (india ){
     
    } else if( us ) {
    
    }
    
    
    List = [1,2,3,5]
    int i = 0;
    
    for (initial,condition, in/dec){
    
    }
    
   class = 8 - 10 
    
    for (class = 8, class == 10; class++){
    
    
    
    }
    
    
    while (){
    
    }
    
    
    
     {
    
    
    } do while()
    
    
    
    
    switch (input )
    
     case depbit:
           debit code
     
     case credit:
          creddit
     
     case check balance: 
          balance check
      
      case default :
          
          
        
    
     
     
     * */
