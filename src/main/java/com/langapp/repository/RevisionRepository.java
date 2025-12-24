package com.langapp.repository;

import com.langapp.domain.revision.Revision;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface RevisionRepository extends CrudRepository<Revision, Long> {
    @Override
    List<Revision> findAll();

    @Override
    Optional<Revision> findById(Long id);

    @Override
    Revision save(Revision revision);

    @Override
    void deleteById(Long id);
}
