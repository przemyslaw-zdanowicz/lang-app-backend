package com.langapp.repository;

import com.langapp.domain.revision.Revision;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Transactional
@Repository
public interface RevisionRepository extends JpaRepository<Revision, UUID> {

}
