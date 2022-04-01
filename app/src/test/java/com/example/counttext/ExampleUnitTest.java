package com.example.counttext;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import utils.TextUtils;

public class ExampleUnitTest {

    @Test
    public void getCharsCount_Given_SymbolString_Result_Six() {
        String givenString = "??????";
        int expectedValue = 6;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getCharsCount_Given_SpacesString_Result_Three() {
        String givenString = "   ";
        int expectedValue = 3;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getCharsCount_Given_EmptyString_Result_Zero() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getCharsCount_Given_NumberString_Result_Five() {
        String givenString = "02468";
        int expectedValue = 5;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getCharsCount_Given_NormalString_Result_Sixteen() {
        String givenString = "Testing the code";
        int expectedValue = 16;
        int actualValue = TextUtils.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }


    @Test (expected = NullPointerException.class)
    public void getCharsCount_Given_NullString_Result_Exception() {
        String givenString = null;
        int actualValue = TextUtils.getCharsCount(givenString);
    }

    @Test
    public void getWordsCount_Given_EmptyString_Result_Zero() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = TextUtils.getWordsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_Given_SpacesString_Result_Eight() {
        String givenString = "        ";
        int expectedValue = 0;
        int actualValue = TextUtils.getWordsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getWordsCount_Given_NumberString_Result_one() {
        String givenString = "999777";
        int expectedValue = 1;
        int actualValue = TextUtils.getWordsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getWordsCount_Given_NormalString_Result_Sixteen() {
        String givenString = "Testing the code";
        int expectedValue = 2;
        int actualValue = TextUtils.getWordsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }




}