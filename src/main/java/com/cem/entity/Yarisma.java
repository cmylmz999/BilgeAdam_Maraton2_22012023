package com.cem.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Map;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="tbl_yarisma")
public class Yarisma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    Long baslangicTarihi;
    Long sure;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "yarisma")
    @Column(name= "sorular")
    List<Soru> sorular;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "yarisma")
    @Column(name="yarismacilar")
    List<Yarismaci> yarismacilar;

    @ElementCollection
    Map<Integer,String> oduller;

    @OneToMany
    List<Kazananlar> kazananlar;

    @OneToOne
    Puan puan;

    @Embedded
    BaseEntity baseEntity;

}
