package com.langapp.service;

import com.langapp.domain.revision.Revision;
import com.langapp.repository.RevisionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class RevisionDbService {
    private final RevisionRepository repository;

    public List<Revision> getRevisions() {
        return repository.findAll();
    }

    public Optional<Revision> getRevision(final Long id) {
        return repository.findById(id);
    }

    public Revision saveRevision(final Revision revision) {
        return repository.save(revision);
    }

    public void deleteRevision(final Long id) {
        repository.deleteById(id);
    }
}
