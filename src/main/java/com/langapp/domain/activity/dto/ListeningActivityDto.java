package com.langapp.domain.activity.dto;

import com.langapp.domain.text.dto.TextDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class ListeningActivityDto extends ActivityDto {
    private TextDto text;
    private String audioUrl; //TODO it is available in TextDto
}
