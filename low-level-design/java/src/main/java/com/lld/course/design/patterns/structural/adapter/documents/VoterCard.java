package com.lld.course.design.patterns.structural.adapter.documents;

import com.lld.course.design.patterns.structural.adapter.Document;
import lombok.Getter;

import java.time.LocalDate;


@Getter
public class VoterCard {
    private String name; // space separated name. ex- Sahil Yadav
    private LocalDate dateOfBirth;

    public VoterCard(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
}
