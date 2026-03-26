package com.example.My.First.SpringBoot.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.My.First.SpringBoot.project.model.Product;

@Repository
public interface productrepo extends JpaRepository<Product,Integer>{
	
}
