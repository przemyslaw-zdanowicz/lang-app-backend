package com.langapp.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AchievementDto {
    private UUID id;
    private String name;
    private String description;
    private String imageUrl;
    private LocalDateTime unlockedAt;
    private UUID userId;
}
