package com.masiblue.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
//@AllArgsConstructor
public class TestCreateDTO {
    private String name;
    private long positionId;
    private long languageId;

    public TestCreateDTO(String name, long positionId, long languageId) {
        this.name = name;
        this.positionId = positionId;
        this.languageId = languageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPositionId() {
        return positionId;
    }

    public void setPositionId(long positionId) {
        this.positionId = positionId;
    }

    public long getLanguageId() {
        return languageId;
    }

    public void setLanguageId(long languageId) {
        this.languageId = languageId;
    }

    public TestCreateDTO(String name, long positionId) {
        this.name = name;
        this.positionId = positionId;
    }
}
