package com.langapp.domain.activity.dto;

import com.langapp.domain.activity.ActivityType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public abstract class ActivityDto {
    private UUID id;
    private ActivityType activityType;
    private int order;
}
