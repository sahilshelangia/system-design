package com.lld.course.design.patterns.structural.adapter.documents;

import com.lld.course.design.patterns.structural.adapter.Document;

import java.time.LocalDate;
import java.time.Period;

/**
 * VoterCardDocumentAdapter is a document adapter for {@link VoterCard}
 */
public class VoterCardDocumentAdapter implements Document {
    private VoterCard voterCard;

    public VoterCardDocumentAdapter(VoterCard voterCard) {
        this.voterCard = voterCard;
    }

    @Override
    public String getFirstName() {
        return this.voterCard.getName().split(" ")[0];
    }

    @Override
    public String getLastName() {
        return this.voterCard.getName().split(" ")[1];
    }

    @Override
    public int getAge() {
        return Period.between( voterCard.getDateOfBirth(), LocalDate.now()).getYears();
    }
}
