package com.hugo.mota.projectmanagementaprovation.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "pma_project")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class ProjectEntity extends PersistEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "dt_start")
    private LocalDate dateStart;

    @Column(name = "dt_end")
    private LocalDate dateEnd;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserProjectEntity manager;

}
