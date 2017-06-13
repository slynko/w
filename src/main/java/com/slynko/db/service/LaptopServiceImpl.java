package com.slynko.db.service;

import com.slynko.db.entity.Laptop;
import com.slynko.db.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopServiceImpl implements LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    @Override
    public Laptop save(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    @Override
    public void delete(Laptop laptop) {
        laptopRepository.delete(laptop);
    }

    @Override
    public Laptop findOne(Long id) {
        return laptopRepository.findOne(id);
    }
}
