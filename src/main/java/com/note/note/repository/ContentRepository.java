package com.note.note.repository;

import com.note.note.entity.Content;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContentRepository  extends MongoRepository<Content, ObjectId> {
}
