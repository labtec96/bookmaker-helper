package com.example.bookmakerhelper.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Lob;

/**
 * Created by ch on 2020-07-01
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Country extends BaseEntity{

    String name;
    int population;

    @Lob
    private Byte[] icon;
}
