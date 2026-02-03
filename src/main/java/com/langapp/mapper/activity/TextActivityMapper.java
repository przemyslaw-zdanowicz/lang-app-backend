package com.langapp.mapper.activity;

import com.langapp.domain.activity.Activity;
import com.langapp.domain.activity.ActivityType;
import com.langapp.domain.activity.TextActivity;
import com.langapp.domain.activity.dto.TextActivityDto;
import com.langapp.mapper.TextMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class TextActivityMapper implements SpecificActivityMapper<TextActivityDto> {

    private final TextMapper textMapper;

    @Override
    public ActivityType getActivityType() {
        return ActivityType.TEXT;
    }

    @Override
    public TextActivityDto mapToDto(Activity activity) {
        TextActivity textActivity = activity.getTextActivity();

        return TextActivityDto.builder()
                .id(activity.getId())
                .activityType(ActivityType.TEXT)
                .order(activity.getOrder())
                .text(textMapper.mapToTextDto(textActivity.getText()))
                .build();
    }
}
