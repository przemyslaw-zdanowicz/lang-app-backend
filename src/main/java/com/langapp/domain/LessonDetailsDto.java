package com.langapp.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class LessonDetailsDto {
    private UUID id;
    private String title;
    private String description;
    private Level level;

    private List<WordDto> words;
    private TextDto text;

    private List<RevisionDto> revisionsToReview;
}


