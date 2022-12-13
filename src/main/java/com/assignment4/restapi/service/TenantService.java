package com.assignment4.restapi.service;

import com.assignment4.restapi.persistence.TenantRepository;
import com.assignment4.restapi.persistence.Tenant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TenantService {

    TenantRepository repository;

    public TenantService(TenantRepository repository) {
        this.repository = repository;
    }

    public List<Tenant> getAll(){
        return this.repository.findAll();
    }

    public Tenant getById(Long id){
        return this.repository.findById(id).get();
    }

    public Tenant add (Tenant tenant){
        return this.repository.save(tenant);
    }

    public Tenant update(Long id, Tenant tenant){
        Optional<Tenant> ten = this.repository.findById(id);
        if(ten.isPresent()){
            ten.get().setName(tenant.getName());
            return this.repository.save(ten.get());
        }
        throw new RuntimeException();
    }

    public Tenant delete(Long id){
        this.repository.deleteById(id);
        return null;
    }
}
