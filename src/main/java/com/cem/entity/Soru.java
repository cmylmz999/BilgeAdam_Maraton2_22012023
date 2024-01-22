package com.cem.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Map;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Getter
@Setter
@Table(name = "tbl_soru")
public class Soru {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length=800)
    private String soru;
    Integer sure;

    /**
     * cevaplar.put("A","bu dogru cevap midir?")
     *
     */
    @ElementCollection
    Map<String,String> cevaplar;

    String dogruCevap;
    Integer puan;
    @ManyToOne
    @JoinColumn(name = "sorular")
    Yarisma yarisma;
    @OneToOne
    Unlu unlu;
    @Embedded
    BaseEntity baseEntity;
}
