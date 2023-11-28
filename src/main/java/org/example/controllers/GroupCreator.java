package org.example.controllers;


import org.example.models.Group;
import org.example.models.Human;

public interface GroupCreator {
    Group createGroup(String name, Human head);
}
