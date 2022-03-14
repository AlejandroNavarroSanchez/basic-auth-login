package com.example.basicauth.model.repository;

import com.example.basicauth.model.entity.Videojoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoriVideojoc extends JpaRepository<Videojoc, Long> {

}