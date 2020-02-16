package com.masiblue.backend.model;

import com.opencsv.bean.CsvBindByPosition;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CsvQuestionModel {

    @CsvBindByPosition(position = 0)
    private int number;

    @CsvBindByPosition(position = 1)
    private String type;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNumberOfPossibleAnswers() {
        return numberOfPossibleAnswers;
    }

    public void setNumberOfPossibleAnswers(int numberOfPossibleAnswers) {
        this.numberOfPossibleAnswers = numberOfPossibleAnswers;
    }

    public String getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(String possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    @CsvBindByPosition(position = 2)
    private String language;

    @CsvBindByPosition(position = 3)
    private String content;

    @CsvBindByPosition(position = 4)
    private int numberOfPossibleAnswers;

    @CsvBindByPosition(position = 5)
    private String possibleAnswers;

}