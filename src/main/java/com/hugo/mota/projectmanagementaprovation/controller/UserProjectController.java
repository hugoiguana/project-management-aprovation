package com.hugo.mota.projectmanagementaprovation.controller;

import com.hugo.mota.projectmanagementaprovation.domain.UserProjectEntity;
import com.hugo.mota.projectmanagementaprovation.domain.UserSystemEntity;
import com.hugo.mota.projectmanagementaprovation.dto.UserProjectCreateRequestDto;
import com.hugo.mota.projectmanagementaprovation.dto.UserProjectCreateResponseDto;
import com.hugo.mota.projectmanagementaprovation.mapper.UserSystemMapper;
import com.hugo.mota.projectmanagementaprovation.service.UserProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users/project")
public class UserProjectController {

    @Autowired
    private UserProjectService userProjectService;

    @Autowired
    private UserSystemMapper userSystemMapper;


    @PostMapping
    public ResponseEntity<UserProjectCreateResponseDto> create(@RequestBody UserProjectCreateRequestDto userProjectCreateRequestDto) {
        UserSystemEntity userSystemEntity = userSystemMapper.toEntity(userProjectCreateRequestDto);
        UserProjectEntity userProjectEntity = userProjectService.create(userSystemEntity);
        UserProjectCreateResponseDto userProjectCreateResponseDto = userSystemMapper.toDto(userProjectEntity);
        return ResponseEntity.ok().body(userProjectCreateResponseDto);
    }

}
