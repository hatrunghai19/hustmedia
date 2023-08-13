package com.hustmedia.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hustmedia.models.Major;


@Repository
public interface MajorRepository extends JpaRepository<Major, Integer>{
    Optional<Major> findByName(String name);
}
