package com.langapp.facade;

import com.langapp.domain.revision.Revision;
import com.langapp.domain.revision.dto.RevisionDto;
import com.langapp.exception.RevisionNotFoundException;
import com.langapp.exception.UserNotFoundException;
import com.langapp.exception.WordNotFoundException;
import com.langapp.mapper.RevisionMapper;
import com.langapp.service.RevisionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Component
public class RevisionFacade {
    private final RevisionService service;
    private final RevisionMapper mapper;

    public RevisionDto create(RevisionDto dto) throws UserNotFoundException, WordNotFoundException {
        Revision revision = mapper.mapToRevision(dto);
        Revision created = service.createRevisionWithUserAndWord(revision);
        return mapper.mapToRevisionDto(created);
    }

    public RevisionDto getById(UUID id) throws RevisionNotFoundException {
        Revision revision = service.getRevision(id);
        return mapper.mapToRevisionDto(revision);
    }

    public List<RevisionDto> getAll() {
        return mapper.mapToRevisionDtoList(service.getRevisions());
    }

    public void deleteById(UUID id) throws RevisionNotFoundException {
        service.deleteRevision(id);
    }
}
