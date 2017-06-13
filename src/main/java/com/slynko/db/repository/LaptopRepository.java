package com.slynko.db.repository;

import com.slynko.db.entity.Laptop;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface LaptopRepository extends ElasticsearchRepository<Laptop, Long> {
}
