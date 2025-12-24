package com.langapp.repository;

import com.langapp.domain.achievement.Achievement;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface AchievementRepository extends CrudRepository<Achievement, Long> {

    @Override
    List<Achievement> findAll();

    @Override
    Optional<Achievement> findById(Long id);

    @Override
    Achievement save(Achievement achievement);

    @Override
    void deleteById(Long id);
}
