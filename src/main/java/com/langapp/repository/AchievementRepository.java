package com.langapp.repository;

import com.langapp.domain.achievement.Achievement;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Transactional
@Repository
public interface AchievementRepository extends JpaRepository<Achievement, UUID> {

}
