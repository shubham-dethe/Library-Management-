package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.BorrowRequest;

public interface Book_Interface {
	
	public String saveMethod(BorrowRequest b);
	
	public BorrowRequest getById(int id);
	
	public List<BorrowRequest> getAll();

}
