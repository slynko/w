package com.slynko.db.service;

import com.slynko.db.entity.Laptop;

public interface LaptopService {
    Laptop save(Laptop laptop);

    void delete(Laptop laptop);

    Laptop findOne(Long id);
}
