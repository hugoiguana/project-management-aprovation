package com.hugo.mota.projectmanagementaprovation.repository;

import com.hugo.mota.projectmanagementaprovation.domain.UserSystemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserSystemEntityRepository extends JpaRepository<UserSystemEntity, Long> {

    Optional<UserSystemEntity> findByEmail(String email);

}