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
@Table(name="tbl_unlu")
public class Unlu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name="ad_soyad",length=20)
    String adSoyad;
    String resimUrl;
    String ipucu;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "unlu")
    Soru soru;

}
