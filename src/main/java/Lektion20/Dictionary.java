package Lektion20;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Dictionary {

    private Map<String, Set<String>> map;

    public Dictionary() {
        map = new HashMap<>();
    }

    public void put(String key, String value) {
        if (!map.containsKey(key)) {
            map.put(key, new HashSet<>());
        }
        map.get(key).add(value);
    }

    public Set<String> get(String key) {
        return map.getOrDefault(key, Collections.emptySet());
    }

    @Test
    public void tests(){
        Dictionary multiMap = new Dictionary();

        multiMap.put("to clean", "reinigen");
        multiMap.put("to clean", "säubern");
        multiMap.put("to clean", "putzen");
        multiMap.put("to expand", "vergrößern");
        multiMap.put("to expand", "wachsen");

        Set<String> cleanMeanings = multiMap.get("to clean");
        Set<String> expandMeanings = multiMap.get("to expand");

        assertEquals(3, cleanMeanings.size());
        assertTrue(cleanMeanings.contains("reinigen"));
        assertTrue(cleanMeanings.contains("säubern"));
        assertTrue(cleanMeanings.contains("putzen"));

        assertEquals(2, expandMeanings.size());
        assertTrue(expandMeanings.contains("vergrößern"));
        assertTrue(expandMeanings.contains("wachsen"));

        Set<String> singleMeaning = multiMap.get("to program");

        assertTrue(singleMeaning.isEmpty());

    }
    }

