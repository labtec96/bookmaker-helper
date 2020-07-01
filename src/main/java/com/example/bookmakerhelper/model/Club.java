package com.example.bookmakerhelper.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Lob;

/**
 * Created by ch on 2020-06-29
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Club extends BaseEntity{

    String name;
    Country country;

    @Lob
    private Byte[] icon;
}
