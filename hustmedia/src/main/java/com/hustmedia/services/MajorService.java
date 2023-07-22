package com.hustmedia.services;

import java.util.List;
import java.util.Optional;

import com.hustmedia.models.Major;

public interface MajorService  {
    Major save(Major entity);
    List<Major> saveAll(List<Major> entities);
    Optional<Major> findById(Integer id);
    boolean existsById(Integer id);
    List<Major> findAll();
    List<Major> findAllById(List<Integer> ids);
    long count();
    void deleteById(Integer id);
    void delete(Major entity);
    void deleteAllById(List<Integer> ids);
    void deleteAll(List<Major> entities);
    void deleteAll();
}
