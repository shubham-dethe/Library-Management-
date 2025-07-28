package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BorrowRequest;

public interface BookRepo extends JpaRepository<BorrowRequest, Integer> {

}
