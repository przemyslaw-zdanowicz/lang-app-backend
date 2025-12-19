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
public class TextDto {
    private UUID id;
    private String title;
    private String content;
    private String audioUrl;
    private UUID lessonId;
    private List<UUID> wordIds;
}
