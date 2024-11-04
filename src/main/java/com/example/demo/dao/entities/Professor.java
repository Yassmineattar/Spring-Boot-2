package com.example.demo.dao.entities;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;
@Entity//table ds la bdd
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Professor extends Person{
    private Date d_affectation;
}
