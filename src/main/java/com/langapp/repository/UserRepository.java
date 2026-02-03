package com.langapp.repository;

import com.langapp.domain.user.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Transactional
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}
