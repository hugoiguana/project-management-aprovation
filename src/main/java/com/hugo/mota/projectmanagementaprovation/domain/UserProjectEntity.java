package com.hugo.mota.projectmanagementaprovation.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "pma_user_project")
@AttributeOverride(name = "id", column = @Column(name = "user_project_id"))
public class UserProjectEntity extends PersistEntity {

    @Column(name = "user_name", nullable = false)
    private String name;

    @Column(name = "user_email", nullable = false)
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserSystemEntity user;

}
