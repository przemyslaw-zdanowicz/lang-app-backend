package com.langapp.service;

import com.langapp.domain.category.Category;
import com.langapp.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CategoryDbService {
    private final CategoryRepository repository;

    public List<Category> getCategories() {
        return repository.findAll();
    }

    public Optional<Category> getCategory(final Long id) {
        return repository.findById(id);
    }

    public Category saveCategory(final Category category) {
        return repository.save(category);
    }

    public void deleteCategory(final Long id) {
        repository.deleteById(id);
    }
}
