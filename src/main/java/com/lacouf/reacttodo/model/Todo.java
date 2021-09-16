package com.lacouf.reacttodo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Document("todo")
public class Todo {
    @Id
    private String id;

    private String text;
    private String day;
    private boolean reminder;
}
