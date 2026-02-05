package com.langapp.facade;

import com.langapp.domain.user.User;
import com.langapp.domain.user.dto.UserDto;
import com.langapp.exception.UserNotFoundException;
import com.langapp.mapper.UserMapper;
import com.langapp.service.UserDbService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Component
public class UserFacade {
    private final UserDbService dbService;
    private final UserMapper mapper;

    public UserDto create(UserDto dto) {
        User user = mapper.mapToUser(dto);
        User created = dbService.saveUser(user);

        return mapper.mapToUserDto(created);
    }

    public UserDto getById(UUID id) throws UserNotFoundException {
        User user = dbService.getUser(id).orElseThrow(UserNotFoundException::new);
        return mapper.mapToUserDto(user);
    }

    public List<UserDto> getAll() {
        return mapper.mapToUserDtoList(dbService.getUsers());
    }

    public void deleteById(UUID id) {
        dbService.deleteUser(id);
    }

}
