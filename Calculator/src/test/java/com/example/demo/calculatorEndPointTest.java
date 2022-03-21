package com.example.demo;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class calculatorEndPointTest {

	private String sut;

	@Before
	public void setUp() throws Exception {
		sut = "http://localhost:8080";
	}

	@Test
    public void testAddService() throws IOException {
        String testData1 = "10.0";
        String testData2 = "10.0";
        String expected = "20.0";
        String notExpected = expected + " not match";

        String url = sut + "/add";
        String params = "?Tal1=" + testData1 + "&" + "Tal2=" + testData2;
        String query = url + params;
        String actual = httpHelper.UrlResponse(query, "get", null);

        assertEquals(actual, expected);
        assertNotEquals(actual, notExpected);
    }
	@Test
    public void testMinusService() throws IOException {
        String testData1 = "10.0";
        String testData2 = "10.0";
        String expected = "0.0";
        String notExpected = expected + " not match";

        String url = sut + "/minus";
        String params = "?Tal1=" + testData1 + "&" + "Tal2=" + testData2;
        String query = url + params;
        String actual = httpHelper.UrlResponse(query, "get", null);

        assertEquals(actual, expected);
        assertNotEquals(actual, notExpected);
    }
	@Test
    public void testMultiService() throws IOException {
        String testData1 = "10.0";
        String testData2 = "10.0";
        String expected = "100.0";
        String notExpected = expected + " not match";

        String url = sut + "/multi";
        String params = "?Tal1=" + testData1 + "&" + "Tal2=" + testData2;
        String query = url + params;
        String actual = httpHelper.UrlResponse(query, "get", null);

        assertEquals(actual, expected);
        assertNotEquals(actual, notExpected);
    }
	@Test
    public void testDivService() throws IOException {
        String testData1 = "10.0";
        String testData2 = "10.0";
        String expected = "1.0";
        String notExpected = expected + " not match";

        String url = sut + "/div";
        String params = "?Tal1=" + testData1 + "&" + "Tal2=" + testData2;
        String query = url + params;
        String actual = httpHelper.UrlResponse(query, "get", null);

        assertEquals(actual, expected);
        assertNotEquals(actual, notExpected);
    }
}