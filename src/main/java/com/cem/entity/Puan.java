package com.cem.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="tbl_puan")
public class Puan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ElementCollection
    @CollectionTable(name = "Yarismaci_Puanlari")
    @MapKeyJoinColumn(name = "yarismaci_id")
    @Column(name = "puan")
    @Builder.Default
    public Map<Yarismaci, Integer> puanList = new HashMap<>();

    @OneToOne(mappedBy = "puan", cascade = CascadeType.ALL)
    private Yarisma yarisma;


    @Embedded
    BaseEntity baseEntity;

}
