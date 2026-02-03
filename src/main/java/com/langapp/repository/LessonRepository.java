package com.langapp.repository;

import com.langapp.domain.lesson.Lesson;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Transactional
@Repository
public interface LessonRepository extends JpaRepository<Lesson, UUID> {

}
