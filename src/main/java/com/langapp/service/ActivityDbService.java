package com.langapp.service;

import com.langapp.domain.activity.Activity;
import com.langapp.repository.ActivityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ActivityDbService {
    private final ActivityRepository repository;

    public List<Activity> getActivities() {
        return repository.findAll();
    }

    public Optional<Activity> getActivity(Long id) {
        return repository.findById(id);
    }

    public Activity saveActivity(final Activity activity) {
        return repository.save(activity);
    }

    public void deleteActivity(final Long id) {
        repository.deleteById(id);
    }
}
