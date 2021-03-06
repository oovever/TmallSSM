package com.tmall.service;

import com.tmall.pojo.Category;
import com.tmall.util.Page;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by OovEver on 2017/11/9.
 */
@Service
public interface CategoryService {
    List<Category> list();

    void add(Category category);

    void delete(int id);
    Category get(int id);
    void update(Category category);
}
