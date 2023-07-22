package com.hustmedia.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hustmedia.models.Major;

@Repository
public interface MajorRepository extends CrudRepository<Major, Integer>{
    
}
