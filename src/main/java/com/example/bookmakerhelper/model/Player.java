package com.example.bookmakerhelper.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * Created by ch on 2020-06-29
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Player extends BaseEntity{

    String FirstName;
    String SecondName;

    Country country;

}
