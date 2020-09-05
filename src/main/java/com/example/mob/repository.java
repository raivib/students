package com.example.mob;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface repository extends JpaRepository<Students,Integer> {
}
