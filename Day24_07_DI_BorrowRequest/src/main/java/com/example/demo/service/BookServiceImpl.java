package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BorrowRequest;
import com.example.demo.repository.BookRepo;

@Service
public class BookServiceImpl implements Book_Interface {

	@Autowired
	BookRepo br;
	
	@Override
	public String saveMethod(BorrowRequest b) {
		
		
		b.setReturnDeadline(b.getBorrowDate().plusDays(14));
		b.setFinePerDay(5);
		b.setReturned(false);
		b.setMaxRenewalsAllowed(2);
		b.setLateFineCap(150);
		b.setReminderDaysBeforeDue(2);
		b.setCanBeRenewed(true);
		b.setRequiresDeposit(true);
		b.setDepositAmount(50);
	
		br.save(b);
		System.out.println("Book data added for:"+b.getItemName());
		return "Book added in DB";
	}

	@Override
	public BorrowRequest getById(int id) {
		
		
		return br.findById(id).get();
	}

	@Override
	public List<BorrowRequest> getAll() {
		// TODO Auto-generated method stub
		return br.findAll();
	}

}



