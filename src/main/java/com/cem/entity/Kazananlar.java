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
@Table(name="tbl_kazananlar")
public class Kazananlar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    Yarisma yarisma;
    @OneToOne
    Yarismaci yarismaci;

//    Integer siralama;

    String odul;
    @Embedded
    BaseEntity baseEntity;

}
