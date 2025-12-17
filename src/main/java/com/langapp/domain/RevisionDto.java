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
public class RevisionDto {
    private UUID id;
    private UUID wordId;
    private UUID userId;
    private int correctCount;
    private int incorrectCount;
    private LocalDateTime created;
    private LocalDateTime lastReviewed;
    private LocalDateTime nextReview;
}
