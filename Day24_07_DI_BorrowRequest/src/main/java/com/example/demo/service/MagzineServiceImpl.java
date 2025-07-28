package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BorrowRequest;
import com.example.demo.repository.BookRepo;

@Service
public class MagzineServiceImpl implements Book_Interface {

	@Autowired
	BookRepo bRepo;
	
	
	@Override
	public String saveMethod(BorrowRequest b) {
		
		b.setReturnDeadline(b.getBorrowDate().plusDays(14));
		b.setFinePerDay(8);
		b.setReturned(true);
		b.setMaxRenewalsAllowed(3);
		b.setLateFineCap(200);
		b.setReminderDaysBeforeDue(1);
		b.setCanBeRenewed(true);
		b.setRequiresDeposit(true);
		b.setDepositAmount(80);
		
		bRepo.save(b);
		System.out.println("Magzine data added for: "+b.getItemName());
		return "Magzine added in DB";
	}


	@Override
	public BorrowRequest getById(int id) {
		
		return bRepo.findById(id).get();
	}


	@Override
	public List<BorrowRequest> getAll() {
		
		return bRepo.findAll();
	}


	@Override
	public List<BorrowRequest> getAllByType() {
		// TODO Auto-generated method stub
		return bRepo.findByItemType("Magzine");
	}

}

