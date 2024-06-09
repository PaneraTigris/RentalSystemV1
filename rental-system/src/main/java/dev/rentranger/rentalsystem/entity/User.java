package dev.rentranger.rentalsystem.entity;

import javax.persistence.*;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "role")
    private Set<String> roles;

    //Constructors, getters, and setters
    public String getPassword() {return this.password;}
    public void setPassword(String password) {this.password = password;}

    public String getUsername() {return this.username;}
    public void setUsername(String username) {this.username = username;}

    public Set<String> getRoles() {return roles;}

    public void setRoles(Set<String> roles) {this.roles = roles;}
}