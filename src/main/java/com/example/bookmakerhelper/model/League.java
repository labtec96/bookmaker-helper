package com.example.bookmakerhelper.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * Created by ch on 2020-07-01
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class League extends BaseEntity{

    String name;
    String level;
    Country country;
}
