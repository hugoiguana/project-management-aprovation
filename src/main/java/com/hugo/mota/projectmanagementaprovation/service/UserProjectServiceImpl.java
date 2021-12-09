package com.hugo.mota.projectmanagementaprovation.service;

import com.hugo.mota.projectmanagementaprovation.domain.UserProjectEntity;
import com.hugo.mota.projectmanagementaprovation.domain.UserSystemEntity;
import com.hugo.mota.projectmanagementaprovation.repository.UserProjectEntityRepository;
import com.hugo.mota.projectmanagementaprovation.repository.UserSystemEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProjectServiceImpl implements UserProjectService {

    @Autowired
    private UserProjectEntityRepository userProjectEntityRepository;

    @Autowired
    private UserSystemEntityRepository userSystemEntityRepository;

    @Override
    public UserProjectEntity create(UserSystemEntity userSystemEntity) {
        return null;
    }
}
