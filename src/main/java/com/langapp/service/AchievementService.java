package com.langapp.service;

import com.langapp.domain.achievement.Achievement;
import com.langapp.domain.user.User;
import com.langapp.exception.AchievementNotFoundException;
import com.langapp.exception.UserNotFoundException;
import com.langapp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class AchievementService {

    private final AchievementDbService dbService;
    private final UserRepository userRepository;

    public Achievement createAchievementWithUser(Achievement achievement) throws UserNotFoundException {
        User user = userRepository.findById(achievement.getUser().getId())
                .orElseThrow(UserNotFoundException::new);

        achievement.setUser(user);

        return dbService.saveAchievement(achievement);
    }

    public Achievement getAchievement(UUID id) throws AchievementNotFoundException {
        return dbService.getAchievement(id).orElseThrow(AchievementNotFoundException::new);
    }

    public List<Achievement> getAchievements() {
        return dbService.getAchievements();
    }

    public void deleteAchievement(UUID id) {
        dbService.deleteAchievement(id);
    }
}
