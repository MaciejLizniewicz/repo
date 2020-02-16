package com.masiblue.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;


//@AllArgsConstructor
@Data
public class QuestionCreateDTO {
    private Type type;
    private long testId;

    public QuestionCreateDTO(Type type, long testId, String content, Set<String> possibleAnswers) {
        this.type = type;
        this.testId = testId;
        this.content = content;
        this.possibleAnswers = possibleAnswers;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public long getTestId() {
        return testId;
    }

    public void setTestId(long testId) {
        this.testId = testId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(Set<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    private String content;
    private Set<String> possibleAnswers;
}
