package com.langapp.mapper.activity;

import com.langapp.domain.activity.Activity;
import com.langapp.domain.activity.ActivityType;
import com.langapp.domain.activity.QuizSentencesActivity;
import com.langapp.domain.activity.dto.QuizSentencesActivityDto;
import com.langapp.mapper.SentenceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class QuizSentencesActivityMapper implements SpecificActivityMapper<QuizSentencesActivityDto> {

    private final SentenceMapper sentenceMapper;


    @Override
    public ActivityType getActivityType() {
        return ActivityType.QUIZ_SENTENCES;
    }

    @Override
    public QuizSentencesActivityDto mapToDto(Activity activity) {
        QuizSentencesActivity quizSentencesActivity = activity.getQuizSentencesActivity();

        return QuizSentencesActivityDto.builder()
                .id(activity.getId())
                .activityType(ActivityType.QUIZ_SENTENCES)
                .order(activity.getOrder())
                .sentences(sentenceMapper.mapToSentenceDtoList(quizSentencesActivity.getSentences()))
                .build();
    }
}
