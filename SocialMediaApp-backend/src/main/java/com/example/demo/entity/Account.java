package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity(name = "AccountTable")    //name of my table

@Getter //getters
@Setter //setters
@NoArgsConstructor
@AllArgsConstructor //constructors
@ToString   //toString lombok
@EqualsAndHashCode  //equals and hashcode lombok
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountId;     //long object "accountId" unique identifier

    @Column
    private String firstName;   //object string 'firstName'

    @Column
    private String lastName;    //object string 'lastName'

    @Column
    private String accountName; //object string 'accountName'

    @Column
    private String password;    //object string 'password'

    @Column
    private String email;       //object string 'email'

    @Column
    private String phoneNumber; //object string 'phoneNumber'

    //depending on what the user selects it will establish functionality of the different accounts
    private boolean admin, business, creator, personal, isDisabled;
}
