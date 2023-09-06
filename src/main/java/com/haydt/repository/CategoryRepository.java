package com.haydt.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.haydt.bean.Category;

public interface  CategoryRepository extends JpaRepository<Category, String> {
	@Query("SELECT c FROM Category c")
	Page<Category> findAll1(Pageable pageable);
}
