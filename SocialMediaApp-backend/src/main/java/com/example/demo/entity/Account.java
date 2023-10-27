package com.example.demo.Entity;

import lombok.*;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "account")    //name of my table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
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
    @Column
    private Role role;

    @Column
    private boolean disabled; //object boolean 'disabled' true/false

    @OneToMany  //one-to-many relationship with the 'Post' entity.
    @JsonIgnore //commands JSON serialization to ignore the field when converting to JSON
    private List<Post> posts;

    @OneToMany  //one-to-many relationship with the 'Comment' entity.
    @JsonIgnore //commands JSON serialization to ignore the field when converting to JSON
    private List<Comment> comments;
}
