package com.assignment4.restapi.resource;

import com.assignment4.restapi.persistence.Tenant;
import com.assignment4.restapi.service.TenantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TenantResource {

    TenantService service;

    public TenantResource(TenantService service) {
        this.service = service;
    }

    @GetMapping(value = "/tenants")
    public List<Tenant> getAll(){
        return this.service.getAll();
    }

    @GetMapping(value = "/tenants/{id}")
    public Tenant getById(@PathVariable Long id){
        return this.service.getById(id);
    }

    @PostMapping(value = "/tenants")
    public Tenant add(Tenant tenant){
        return this.service.add(tenant);
    }

    @PutMapping(value = "/tenants/{id}", consumes = "application/json")
    public Tenant update(@PathVariable Long id, @RequestBody Tenant tenant){
        return this.service.update(id, tenant);
    }

    @DeleteMapping(value = "/tenants/{id}")
    public Tenant delete(@PathVariable Long id){
       return this.service.delete(id);
    }

}
