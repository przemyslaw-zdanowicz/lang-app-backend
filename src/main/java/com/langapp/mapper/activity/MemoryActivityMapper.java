package com.langapp.mapper.activity;

import com.langapp.domain.activity.Activity;
import com.langapp.domain.activity.ActivityType;
import com.langapp.domain.activity.MemoryActivity;
import com.langapp.domain.activity.dto.MemoryActivityDto;
import com.langapp.mapper.WordMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MemoryActivityMapper implements SpecificActivityMapper<MemoryActivityDto> {

    private final WordMapper wordMapper;


    @Override
    public ActivityType getActivityType() {
        return ActivityType.MEMORY;
    }

    @Override
    public MemoryActivityDto mapToDto(Activity activity) {
        MemoryActivity memoryActivity = activity.getMemoryActivity();

        return MemoryActivityDto.builder()
                .id(activity.getId())
                .activityType(ActivityType.MEMORY)
                .order(activity.getOrder())
                .words(wordMapper.mapToWordDtoList(memoryActivity.getWords()))
                .build();
    }
}
