package org.example.controllers;

import org.example.models.Faculty;
import org.example.models.Human;

public interface FacultyCreator {
    Faculty createFaculty(String name, Human head);
}
