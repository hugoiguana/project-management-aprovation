package com.hugo.mota.projectmanagementaprovation.mapper;

import com.hugo.mota.projectmanagementaprovation.domain.UserProjectEntity;
import com.hugo.mota.projectmanagementaprovation.domain.UserSystemEntity;
import com.hugo.mota.projectmanagementaprovation.dto.UserProjectCreateRequestDto;
import com.hugo.mota.projectmanagementaprovation.dto.UserProjectCreateResponseDto;
import org.mapstruct.Mapper;

@Mapper
public interface UserSystemMapper {

    UserSystemEntity toEntity(UserProjectCreateRequestDto userProjectCreateRequestDto);

    UserProjectCreateResponseDto toDto(UserProjectEntity userSystemEntity);
}
