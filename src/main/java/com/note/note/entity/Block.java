package com.note.note.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;


@Document(collection = "block")
@Setter
@Getter
@Builder
public class Block {
    @Id
    private ObjectId ID; //고유한 ID
    private String Name; //이름(UUID)
    private boolean Alive; //삭제 여부
    private boolean IsRoot; // 루트 블락인가요?
    private String Title; // 제목
    private String CreatedBy; // 생성자
    private LocalDate CreatedTime; //생성 시간
    private String LastEditedBy; //수정자
    private LocalDate LastEditedTime; //수정 시간
    private BlockTypes Type; // 블록 타입
    private ObjectId Parent; // 부모 블록 ID
    private String ParentName; // 부모 블럭 이름(UUID)
    private String content;



}
