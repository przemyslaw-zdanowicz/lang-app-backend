package com.langapp.service;

import com.langapp.domain.category.Category;
import com.langapp.domain.word.Word;
import com.langapp.exception.CategoryNotFoundException;
import com.langapp.exception.WordNotFoundException;
import com.langapp.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class WordService {

    private final WordDbService dbService;
    private final CategoryRepository categoryRepository;

    public Word createWordWithCategory(Word word) throws CategoryNotFoundException {
        Category category = categoryRepository.findById(word.getCategory().getId())
                .orElseThrow(CategoryNotFoundException::new);

        word.setCategory(category);

        return dbService.saveWord(word);
    }

    public Word getWord(UUID id) throws WordNotFoundException {
        return dbService.getWord(id).orElseThrow(WordNotFoundException::new);
    }

    public List<Word> getWords() {
        return dbService.getWords();
    }

    public void deleteWord(UUID id) {
        dbService.deleteWord(id);
    }
}
