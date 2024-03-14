package com.myproject.crm.demo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    public void setUp() {
        user = new User();
    }

    @Test
    public void testFirstName() {
        String firstName = "Test";
        user.setFirstName(firstName);
        assertEquals(firstName, user.getFirstName());
    }

    @Test
    public void testLastName() {
        String lastName = "User";
        user.setLastName(lastName);
        assertEquals(lastName, user.getLastName());
    }
}
