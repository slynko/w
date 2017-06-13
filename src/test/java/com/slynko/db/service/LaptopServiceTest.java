package com.slynko.db.service;

import com.slynko.Application;
import com.slynko.db.entity.Laptop;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class LaptopServiceTest {
    @Autowired
    private LaptopService laptopService;

    @Autowired
    private ElasticsearchTemplate esTemplate;

    @Before
    public void before() {
        esTemplate.deleteIndex(Laptop.class);
        esTemplate.createIndex(Laptop.class);
        esTemplate.putMapping(Laptop.class);
        esTemplate.refresh(Laptop.class);
    }

    @Test
    public void testSave() {
        Laptop laptop = new Laptop();
        laptop.setPrice(500);
        laptop.setAmount(7);
        laptop.setTitle("Test title");

        Laptop testLaptop = laptopService.save(laptop);

        assertNotNull(testLaptop.getId());
        assertEquals(testLaptop.getTitle(), laptop.getTitle());
        assertEquals(testLaptop.getAmount(), laptop.getAmount());
        assertEquals(testLaptop.getPrice(), laptop.getPrice());
    }
}
