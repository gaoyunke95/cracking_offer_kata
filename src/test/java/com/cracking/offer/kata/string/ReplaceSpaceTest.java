package com.cracking.offer.kata.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Henry Gao
 * @date 10/22/21 - 10:03 PM
 *
 * These are the unit test cases for ReplaceSpace Jianzhi4
 *
 * 1.basic functionality test
 *      a. contains spaces in the string
 *          - one space in the front of the string
 *          - one space at the end of the string
 *          - one space in between the string
 *          - combination of space in the front , at the end and in between.
 *          - multiple  continuous spaces
 *
 *      b. doesn't contain spaces in the string
 *
 *  2. special cases
 *      a. empty string
 *      b. string only with one space
 *      c. string with only spaces
 *      d. null
 */
class ReplaceSpaceTest {


    @Test
    void basicFunctionalityTest(){
        String frontSpaceString = " westring";
        String endSpaceString = "westring ";
        String inBetweenSpaceString = "we string";
        String frontSpacesString = "   westring";
        String endSpacesString = "westring   ";
        String inBetweenSpacesString = "we   string";

        String combineSpaceString = " we string ";
        String combineSpacesString = "  we  string  ";

        String noSpaceString = "westring";

        assertEquals("%20westring", ReplaceSpace.replaceSpace(frontSpaceString));
        assertEquals("westring%20", ReplaceSpace.replaceSpace(endSpaceString));
        assertEquals("we%20string", ReplaceSpace.replaceSpace(inBetweenSpaceString));
        assertEquals("%20%20%20westring", ReplaceSpace.replaceSpace(frontSpacesString));
        assertEquals("westring%20%20%20", ReplaceSpace.replaceSpace(endSpacesString));
        assertEquals("we%20%20%20string", ReplaceSpace.replaceSpace(inBetweenSpacesString));
        assertEquals("%20we%20string%20", ReplaceSpace.replaceSpace(combineSpaceString));
        assertEquals("%20%20we%20%20string%20%20", ReplaceSpace.replaceSpace(combineSpacesString));
        assertEquals("westring", ReplaceSpace.replaceSpace(noSpaceString));

    }

    @Test
    void specialCasesTest(){
        String emptyString = "";
        String spaceString = " ";
        String spacesString = "   ";
        String nullString = null;
        assertEquals("", ReplaceSpace.replaceSpace(emptyString));
        assertEquals("%20", ReplaceSpace.replaceSpace(spaceString));
        assertEquals("%20%20%20", ReplaceSpace.replaceSpace(spacesString));
        assertEquals("", ReplaceSpace.replaceSpace(nullString));
    }




}