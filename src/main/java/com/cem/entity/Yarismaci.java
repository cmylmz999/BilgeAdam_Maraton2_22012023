package com.cem.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="tbl_yarismaci")
public class Yarismaci {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ad;
    private String username;
    String avatar;
    String email;
    @ManyToOne
    Yarisma yarisma;
    @Embedded
    BaseEntity baseEntity;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "yarismaci")
    Kazananlar kazananlar;

}
