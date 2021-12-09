package com.hugo.mota.projectmanagementaprovation.repository;

import com.hugo.mota.projectmanagementaprovation.domain.ProjectEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProjectEntityRepository extends CrudRepository<ProjectEntity, Long> {
}