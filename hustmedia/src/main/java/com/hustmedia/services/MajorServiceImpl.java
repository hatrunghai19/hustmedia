package com.hustmedia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hustmedia.models.Major;
import com.hustmedia.repositories.MajorRepository;

@Service
public class MajorServiceImpl implements MajorService{
    @Autowired
    private MajorRepository majorRepository;

    public Major save(Major entity) {
        return majorRepository.save(entity);
    }

    public List<Major> saveAll(List<Major> entities) {
        return (List<Major>) majorRepository.saveAll(entities);
    }

    public Optional<Major> findById(Integer id) {
        return majorRepository.findById(id);
    }

    public boolean existsById(Integer id) {
        return majorRepository.existsById(id);
    }

    public List<Major> findAll() {
        return (List<Major>) majorRepository.findAll();
    }

    public List<Major> findAllById(List<Integer> ids) {
        return (List<Major>) majorRepository.findAllById(ids);
    }

    public long count() {
        return majorRepository.count();
    }

    public void deleteById(Integer id) {
        majorRepository.deleteById(id);
    }

    public void delete(Major entity) {
        majorRepository.delete(entity);
    }

    public void deleteAllById(List<Integer> ids) {
        majorRepository.deleteAllById(ids);
    }

    public void deleteAll(List<Major> entities) {
        majorRepository.deleteAll(entities);
    }

    public void deleteAll() {
        majorRepository.deleteAll();
    }

    
}
