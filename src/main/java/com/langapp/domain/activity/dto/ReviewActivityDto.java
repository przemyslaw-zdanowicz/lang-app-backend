package com.langapp.domain.activity.dto;

import com.langapp.domain.word.dto.WordDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class ReviewActivityDto extends ActivityDto {
    private List<WordDto> words;
}
