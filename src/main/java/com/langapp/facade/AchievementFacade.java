package com.langapp.facade;

import com.langapp.domain.achievement.Achievement;
import com.langapp.domain.achievement.dto.AchievementDto;
import com.langapp.exception.AchievementNotFoundException;
import com.langapp.exception.UserNotFoundException;
import com.langapp.mapper.AchievementMapper;
import com.langapp.service.AchievementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Component
public class AchievementFacade {
    private final AchievementService service;
    private final AchievementMapper mapper;

    public AchievementDto create(AchievementDto dto) throws UserNotFoundException {
        Achievement achievement = mapper.mapToAchievement(dto);
        Achievement created = service.createAchievementWithUser(achievement);
        return mapper.mapToAchievementDto(created);
    }

    public AchievementDto getById(UUID id) throws AchievementNotFoundException {
        Achievement achievement = service.getAchievement(id);
        return mapper.mapToAchievementDto(achievement);
    }

    public List<AchievementDto> getAll() {
        return mapper.mapToAchievementDtoList(service.getAchievements());
    }

    public void deleteById(UUID id) throws AchievementNotFoundException {
        service.deleteAchievement(id);
    }
}
