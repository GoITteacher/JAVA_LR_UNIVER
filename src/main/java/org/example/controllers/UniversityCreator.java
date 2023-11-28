package org.example.controllers;

import org.example.models.Human;
import org.example.models.University;

public interface UniversityCreator {
    University createUniversity(String name, Human head);
}
