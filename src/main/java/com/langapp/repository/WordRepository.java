package com.langapp.repository;

import com.langapp.domain.word.Word;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface WordRepository extends CrudRepository<Word, Long> {
    @Override
    List<Word> findAll();

    @Override
    Optional<Word> findById(Long id);

    @Override
    Word save(Word word);

    @Override
    void deleteById(Long id);
}
