package com.hugo.mota.projectmanagementaprovation.service;

import com.hugo.mota.projectmanagementaprovation.domain.UserProjectEntity;
import com.hugo.mota.projectmanagementaprovation.domain.UserSystemEntity;

public interface UserProjectService {
    UserProjectEntity create(UserSystemEntity userSystemEntity);
}
