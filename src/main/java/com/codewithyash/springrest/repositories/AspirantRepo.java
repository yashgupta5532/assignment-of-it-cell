package com.codewithyash.springrest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithyash.springrest.entities.Aspirant;

public interface AspirantRepo extends JpaRepository<Aspirant,Integer>{
    
}
