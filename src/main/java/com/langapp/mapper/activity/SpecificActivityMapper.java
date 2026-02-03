package com.langapp.mapper.activity;

import com.langapp.domain.activity.Activity;
import com.langapp.domain.activity.ActivityType;
import com.langapp.domain.activity.dto.ActivityDto;

public interface SpecificActivityMapper <T extends ActivityDto> {
    ActivityType getActivityType();
    T mapToDto(Activity activity);
}
