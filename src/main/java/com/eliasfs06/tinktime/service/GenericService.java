package com.eliasfs06.tinktime.service;

import com.eliasfs06.tinktime.model.BaseEntity;
import com.eliasfs06.tinktime.repository.GenericRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public abstract class GenericService<T extends BaseEntity> {

    private final GenericRepository<T> repository;

    public GenericService(GenericRepository<T> repository) {
        this.repository = repository;
    }

    public Page<T> getPage(Pageable pageable){
        return repository.findAll(pageable);
    }

    public T get(Long id) {
        Optional<T> element = repository.findById(id);
        if(element.isPresent()){
            return element.get();
        }
        throw new RuntimeException("Not Found");
    }

    @Transactional
    public T update(T updated){
        T dbElement = get(updated.getId());
        return repository.save(dbElement);
    }

    @Transactional
    public T save(T newElement){
        return repository.save(newElement);
    }

    @Transactional
    public void delete(Long id){
        get(id);
        repository.deleteById(id);
    }
}