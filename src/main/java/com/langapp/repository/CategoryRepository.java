package com.langapp.repository;

import com.langapp.domain.category.Category;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    @Override
    List<Category> findAll();

    @Override
    Optional<Category> findById(Long id);

    @Override
    Category save(Category category);

    @Override
    void deleteById(Long id);
}
