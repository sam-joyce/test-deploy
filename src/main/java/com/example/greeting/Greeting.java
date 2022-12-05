//package com.example.greeting;
//
//import javax.persistence.*;
//import java.sql.Timestamp;
//import java.util.Date;
//
//// represents a table in the database (i.e. a Greeting table)
//// every instance of the entity represents a row in the table
//@Entity
//public class Greeting {
//
//    // annotation to specify this is our unique identifier, and should be auto incremented
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String createdBy;
//    private String greeting;
//    private String originCountry;
//    private Timestamp dateCreated;
//
//
//    public Greeting() {
//        this.dateCreated = new Timestamp(new Date().getTime());
//    }
//
//    public Greeting(String createdBy, String greeting, String originCountry) {
//        this.createdBy = createdBy;
//        this.greeting = greeting;
//        this.originCountry = originCountry;
//        this.dateCreated = new Timestamp(new Date().getTime());
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getCreatedBy() {
//        return createdBy;
//    }
//
//    public String getGreeting() {
//        return greeting;
//    }
//
//    public String getOriginCountry() {
//        return originCountry;
//    }
//
//    public Timestamp getDateCreated() {
//        return dateCreated;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Greeting{" +
//                "createdBy='" + createdBy + '\'' +
//                ", greeting='" + greeting + '\'' +
//                ", originCountry='" + originCountry + '\'' +
//                ", dateCreated=" + dateCreated +
//                '}';
//    }
//}
