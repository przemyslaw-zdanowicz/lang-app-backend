package com.langapp.facade;

import com.langapp.domain.category.Category;
import com.langapp.domain.category.dto.CategoryDto;
import com.langapp.exception.CategoryNotFoundException;
import com.langapp.mapper.CategoryMapper;
import com.langapp.service.CategoryDbService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Component
public class CategoryFacade {
    private final CategoryDbService dbService;
    private final CategoryMapper mapper;

    public CategoryDto create(CategoryDto dto) {
        Category category = mapper.mapToCategory(dto);
        Category created = dbService.saveCategory(category);

        return mapper.mapToCategoryDto(created);
    }

    public CategoryDto getById(UUID id) throws CategoryNotFoundException {
        Category category = dbService.getCategory(id).orElseThrow(CategoryNotFoundException::new);
        return mapper.mapToCategoryDto(category);
    }

    public List<CategoryDto> getAll() {
        return mapper.mapToCategoryDtoList(dbService.getCategories());
    }

    public void deleteById(UUID id) {
        dbService.deleteCategory(id);
    }
}
