package com.example.demo.dao.entities;
import jakarta.persistence.*;
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
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique=true)
    private Date date;
    private  Date h_debut;
    private  Date h_fin;
    @ManyToOne
    private Course course;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Student> students= new ArrayList<>();
}
