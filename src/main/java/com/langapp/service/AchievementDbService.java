package com.langapp.service;

import com.langapp.domain.achievement.Achievement;
import com.langapp.repository.AchievementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class AchievementDbService {
    private final AchievementRepository repository;

    public List<Achievement> getAchievements() {
        return repository.findAll();
    }

    public Optional<Achievement> getAchievement(final Long id) {
        return repository.findById(id);
    }

    public Achievement saveAchievement(final Achievement achievement) {
        return repository.save(achievement);
    }

    public void deleteAchievement(final Long id) {
        repository.deleteById(id);
    }
}
