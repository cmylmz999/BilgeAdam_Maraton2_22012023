package com.cem.entity;

import jakarta.persistence.*;
import lombok.*;

import com.cem.entity.enums.State;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class BaseEntity {

    State state;
    Long createAt;
    Long updateAt;


}
