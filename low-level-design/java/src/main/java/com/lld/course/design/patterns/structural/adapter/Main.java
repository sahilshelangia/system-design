package com.lld.course.design.patterns.structural.adapter;

import com.lld.course.design.patterns.structural.adapter.documents.DrivingLicence;
import com.lld.course.design.patterns.structural.adapter.documents.VoterCard;
import com.lld.course.design.patterns.structural.adapter.documents.VoterCardDocumentAdapter;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Document drivingLicence = new DrivingLicence("Sahil", "Yadav", 24);
        VoterCard voterCard = new VoterCard("Sahil Yadav", LocalDate.of(1999, Month.AUGUST, 15));

        // we can easily get the driving licence, as it implements Document interface.
        printDocument(drivingLicence);

        // to get the voter card data, we need an adapter.
        Document voterCardDocumentAdapter = new VoterCardDocumentAdapter(voterCard);
        printDocument(voterCardDocumentAdapter);
    }

    private static void printDocument(Document document){
        System.out.printf("First name: %s%n", document.getFirstName());
        System.out.printf("Last name: %s%n", document.getLastName());
        System.out.printf("Age: %d%n", document.getAge());
        System.out.println("=".repeat(20));
    }
}
