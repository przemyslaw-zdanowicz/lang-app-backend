package com.langapp.repository;

import com.langapp.domain.activity.Activity;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface ActivityRepository extends CrudRepository<Activity, Long> {

    @Override
    List<Activity> findAll();

    @Override
    Optional<Activity> findById(Long id);

    @Override
    Activity save(Activity activity);

    @Override
    void deleteById(Long id);
}
