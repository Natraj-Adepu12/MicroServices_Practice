package com.natraj.user.service.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "micro_users")
public class User {

    @Id
    @Column(name = "ID")
    private String userId;
    @Column(name = "NAME", length = 20)//this annotation sets column name to NAME & name max length to 20
    private String name;
    @Column(name = "ABOUT")
    private String about;
    @Column(name = "EMAIL")
    private String email;

    @Transient //we use this annotation to not save data in database so jpa will ignore it
    private List<Rating> ratings = new ArrayList<>();
}
