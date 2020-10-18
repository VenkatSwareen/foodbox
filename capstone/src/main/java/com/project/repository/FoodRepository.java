package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Items;

@Repository
public interface FoodRepository extends JpaRepository<Items,Integer> {


}