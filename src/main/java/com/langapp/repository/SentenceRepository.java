package com.langapp.repository;

import com.langapp.domain.sentence.Sentence;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface SentenceRepository extends CrudRepository<Sentence, Long> {
    @Override
    List<Sentence> findAll();

    @Override
    Optional<Sentence> findById(Long id);

    @Override
    Sentence save(Sentence sentence);

    @Override
    void deleteById(Long id);
}
