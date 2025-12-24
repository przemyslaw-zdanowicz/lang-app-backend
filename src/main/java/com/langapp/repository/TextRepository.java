package com.langapp.repository;

import com.langapp.domain.text.Text;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface TextRepository extends CrudRepository<Text, Long> {
    @Override
    List<Text> findAll();

    @Override
    Optional<Text> findById(Long id);

    @Override
    Text save(Text text);

    @Override
    void deleteById(Long id);

}
