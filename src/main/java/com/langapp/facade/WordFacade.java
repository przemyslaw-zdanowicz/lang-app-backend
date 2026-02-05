package com.langapp.facade;

import com.langapp.domain.word.Word;
import com.langapp.domain.word.dto.WordDto;
import com.langapp.exception.CategoryNotFoundException;
import com.langapp.exception.WordNotFoundException;
import com.langapp.mapper.WordMapper;
import com.langapp.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Component
public class WordFacade {
    private final WordService service;
    private final WordMapper mapper;

    public WordDto create(WordDto dto) throws CategoryNotFoundException {
        Word word = mapper.mapToWord(dto);
        Word created = service.createWordWithCategory(word);
        return mapper.mapToWordDto(created);
    }

    public WordDto getById(UUID id) throws WordNotFoundException {
        Word word = service.getWord(id);
        return mapper.mapToWordDto(word);
    }

    public List<WordDto> getAll() {
        return mapper.mapToWordDtoList(service.getWords());
    }

    public void deleteById(UUID id) throws WordNotFoundException {
        service.deleteWord(id);
    }
}
