package com.note.note.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "content")
@Getter
@Setter
public class Content {
    @Id
    private ObjectId ID;
    private String Content;

    public Content(String content) {
        Content = content;
    }
}
