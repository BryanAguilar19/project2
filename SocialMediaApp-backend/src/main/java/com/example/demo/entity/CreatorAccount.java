package com.example.demo.Entity;

import lombok.*;

import javax.persistence.*;

@Entity(name = "creatorAccount")    //name of my table

@Getter //getters
@Setter //setters
@NoArgsConstructor
@AllArgsConstructor //constructors
@ToString   //toString lombok
@EqualsAndHashCode  //equals and hashcode lombok
public class CreatorAccount {

}
