package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BorrowRequest;
import com.example.demo.service.Book_Interface;

@RestController
public class LibraryController {

	@Autowired
	@Qualifier(value = "bookServiceImpl")
	Book_Interface bobj;

	@Autowired
	@Qualifier(value = "magzineServiceImpl")
	Book_Interface bobj1;

	@PostMapping("library")
	String addItem(@RequestBody BorrowRequest b) {

		if (b.getItemType().equalsIgnoreCase("Book")) {
			return bobj.saveMethod(b);
		}

		if (b.getItemType().equalsIgnoreCase("Magzine")) {
			return bobj1.saveMethod(b);
		}

		return "Added Data in DataBase";

	}

	@GetMapping("library/{id}/{itemType}")
	public BorrowRequest getItemById(@PathVariable int id, @PathVariable String itemType) {
		if (itemType.equalsIgnoreCase("Book")) {
			return bobj.getById(id);
		}

		if (itemType.equalsIgnoreCase("Magzine")) {
			return bobj1.getById(id);
		}

		return null;
	}
	
	@GetMapping("library/all/{itemType}")
	
	public List<BorrowRequest> getAll(@PathVariable String itemType){
		if(itemType.equalsIgnoreCase("book")) {
			return bobj.getAll();
		}
		
		if (itemType.equals("Magzine")) {
			return bobj1.getAll();
			
		}

		return null;
		
	}

}
