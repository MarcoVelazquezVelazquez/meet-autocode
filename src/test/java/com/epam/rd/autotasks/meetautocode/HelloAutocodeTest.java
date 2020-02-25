package com.epam.rd.autotasks.meetautocode;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class HelloAutocodeTest {

    @Test
    public void test() {

        final ByteArrayOutputStream sink = new ByteArrayOutputStream();
        PrintStream controlledOut = new PrintStream(sink);
        PrintStream defaultOut = System.out;

        System.setOut(controlledOut);

        HelloAutocode.main(new String[]{});

        controlledOut.flush();
        assertEquals("Hello, Autocode!", sink.toString().trim());

        System.setOut(defaultOut);
    }
}