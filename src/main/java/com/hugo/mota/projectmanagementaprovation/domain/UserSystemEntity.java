package com.hugo.mota.projectmanagementaprovation.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "pma_user_system")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class UserSystemEntity extends PersistEntity {

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "profile", nullable = false)
    private Integer profile;

    @PrePersist
    public void prePersiste() {
        if (profile == null) {
            profile = ProfileEnum.USER_VIEWER.getCode();
        }
    }
}
