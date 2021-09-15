package com.lacouf.reacttodo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("todo")
@Builder
public class Todo {
    @Id
    private String id;

    private String text;
    private String date;
    private boolean reminder;
}
