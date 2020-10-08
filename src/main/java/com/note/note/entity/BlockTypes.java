package com.note.note.entity;

public enum BlockTypes {
    TEXT("text", 0),
    TABLE("table",1),
    COLUMN("col", 2),
    ROW("row", 3),
    CALENDER("cal", 4),
    TODO("todo", 5),
    PAGE("page", 6);

    private String name;
    private Integer code;

    public String getName() {
        return name;
    }

    public Integer getCode() {
        return code;
    }

    BlockTypes(String name, Integer code) {
        this.name = name;
        this.code = code;
    }

    BlockTypes(Integer code) {
        this.code = code;
    }

    BlockTypes(String name) {
        this.name = name;
    }
}
