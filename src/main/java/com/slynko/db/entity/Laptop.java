package com.slynko.db.entity;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "shop", type = "books")
public class Laptop extends Product {
}
