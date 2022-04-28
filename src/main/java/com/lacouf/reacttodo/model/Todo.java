package com.lacouf.reacttodo.model;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;
    private String zedate;
    private boolean reminder;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
