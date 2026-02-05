package com.langapp.service;

import com.langapp.domain.revision.Revision;
import com.langapp.domain.revision.dto.RevisionDto;
import com.langapp.domain.user.User;
import com.langapp.domain.word.Word;
import com.langapp.exception.RevisionNotFoundException;
import com.langapp.exception.UserNotFoundException;
import com.langapp.exception.WordNotFoundException;
import com.langapp.mapper.RevisionMapper;
import com.langapp.repository.UserRepository;
import com.langapp.repository.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class RevisionService {
    private final RevisionDbService dbService;
    private final UserRepository userRepository;
    private final WordRepository wordRepository;

    public Revision createRevisionWithUserAndWord(Revision revision) throws UserNotFoundException, WordNotFoundException {
        User user = userRepository.findById(revision.getUser().getId()).orElseThrow(UserNotFoundException::new);
        Word word = wordRepository.findById(revision.getWord().getId()).orElseThrow(WordNotFoundException::new);

        revision.setUser(user);
        revision.setWord(word);

        return dbService.saveRevision(revision);
    }

    public Revision getRevision(UUID id) throws RevisionNotFoundException {
        return dbService.getRevision(id).orElseThrow(RevisionNotFoundException::new);
    }

    public List<Revision> getRevisions() {
        return dbService.getRevisions();
    }

    public void deleteRevision(UUID id) {
        dbService.deleteRevision(id);
    }
}
