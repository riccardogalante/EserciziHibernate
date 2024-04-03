package com.esercizi.esercizi.aggiungiamoHibernateAllaAppSpringBoot.entityes;

import jakarta.persistence.*;

@Table
@Entity
public class Enrollments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "students_id", nullable = false)
    private Students students;
    @ManyToOne
    @JoinColumn(name = "classes_id", nullable = false)
    private Classes classes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }
}
