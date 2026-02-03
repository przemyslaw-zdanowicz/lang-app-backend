package com.langapp.mapper.activity;

import com.langapp.domain.activity.Activity;
import com.langapp.domain.activity.ActivityType;
import com.langapp.domain.activity.QuizWordsActivity;
import com.langapp.domain.activity.dto.QuizWordsActivityDto;
import com.langapp.mapper.WordMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class QuizWordsActivityMapper implements SpecificActivityMapper<QuizWordsActivityDto> {

    private final WordMapper wordMapper;

    @Override
    public ActivityType getActivityType() {
        return ActivityType.QUIZ_WORDS;
    }

    @Override
    public QuizWordsActivityDto mapToDto(Activity activity) {
        QuizWordsActivity quizWordsActivity = activity.getQuizWordsActivity();

        return QuizWordsActivityDto.builder()
                .id(activity.getId())
                .activityType(ActivityType.QUIZ_WORDS)
                .order(activity.getOrder())
                .words(wordMapper.mapToWordDtoList(quizWordsActivity.getWords()))
                .build();
    }
}
