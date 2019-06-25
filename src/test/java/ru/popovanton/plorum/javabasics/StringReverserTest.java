package ru.popovanton.plorum.javabasics;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverserTest {

    String str;

    @Before
    public void setUp() throws Exception {
        str = "This string is for testing purpose only";
    }

    @Test
    public void stringReverser() {
        str = StringReverser.stringReverser(str);
        System.out.println(str);
    }
}