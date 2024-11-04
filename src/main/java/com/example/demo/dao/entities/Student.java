package com.example.demo.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
@Entity//table ds la bdd
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student extends Person{
    private String matricule;
    @ManyToMany(mappedBy = "utilisateurs", fetch = FetchType.EAGER)
    private Collection<Course> courses = new ArrayList<>();
}
