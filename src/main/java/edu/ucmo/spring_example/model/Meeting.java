package edu.ucmo.spring_example.model;

import javax.persistence.*;

@Entity
@Table(name = "meetings")
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "meeting_id")
    private int id;
    @Column(name = "meeting_name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
