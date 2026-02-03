package com.langapp.domain.activity.dto;

import com.langapp.domain.sentence.dto.SentenceDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class QuizSentencesActivityDto extends ActivityDto {
    private List<SentenceDto> sentences;
}
