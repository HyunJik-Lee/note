package com.note.note.repository;

import com.note.note.entity.Block;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlockRepository extends MongoRepository<Block, ObjectId> {
}
