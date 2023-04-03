package fr.diginamic.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {


    @Test
    void levenshteinDistance_SizeLetter() {
        assertEquals(3,StringUtils.levenshteinDistance("pouvoir","pourvoir"));
    }

    @Test
    void levenshteinDistance_NullAll() {
        assertNull(StringUtils.levenshteinDistance(null, null));
    }
}