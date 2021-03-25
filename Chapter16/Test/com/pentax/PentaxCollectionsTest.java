package com.pentax;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PentaxCollectionsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void autoBoxing(){
        int theAge =7;
        Integer age = theAge; // AutoBoxing
    }

    @Test
    void autoUnboxing( ){
        Double theBalance = Double.valueOf(98.57);
        double balance = theBalance;
    }

    @Test
    void pentaxList(){
        List<String> pentax = new ArrayList<>();
        pentax.add("Starboy");
        pentax.add("Priest");
        pentax.add("Ibk");
        pentax.add("Lanre");
        pentax.add("Billy");
        pentax.add("Tiddies");
        pentax.add("Onyie");

        Iterator<String> names = pentax.iterator();
        while(names.hasNext()){
            System.out.println(names.next());
        }

        assertTrue(pentax.size() == 7);
        pentax.remove("Onyie");
        System.out.println(pentax);

        assertTrue(pentax.contains("Tiddies"));

        String gbenga = pentax.get(4);
        assertTrue(gbenga.equals("Billy"));

        pentax.clear();
        assertTrue(pentax.isEmpty());
        System.out.println(pentax);
    }

    @Test
    void pentaxSet(){
        Set<String> lasuites = new HashSet<>();
        lasuites.add("Mr 10%");
        lasuites.add("Dimeji");
        lasuites.add("Chijioke");

        assertTrue(lasuites.size() == 3 );
        lasuites.add("Chijioke"); // It won't add, it'll just discard it because it is now repeated
        Iterator<String> wimps = lasuites.iterator();
        while(wimps.hasNext()){
            System.out.println(wimps.next());
        }

    }

    @Test
    void pentaxMap(){
        Map<String, String> pentaxWimps = new HashMap<>();
        pentaxWimps.put("SCV5001", "Dami");
        pentaxWimps.put("SCV5010", "Kenny");
        pentaxWimps.put("SCV5020", "Peter");
        pentaxWimps.put("SCV5001", "Badmus");
        pentaxWimps.put("SCV5012", "Sunkanmi");
        pentaxWimps.put("Sk", "Sunkanmi");
        pentaxWimps.put("SCV5006", "Daniel");

        Set<String> pentaxIds = pentaxWimps.keySet();
        assertTrue(pentaxIds.size() == 6);
        Iterator<String>  keys = pentaxIds.iterator();

        while (keys.hasNext()) {
            String key = keys.next();
            String value = pentaxWimps.get(key);
            System.out.println(key + "  is mapped to "+ value);
        }
        Collection<String> values = pentaxWimps.values();
        for(String value:values){
            System.out.println(value);
        }
        pentaxWimps.clear();
        assertTrue(pentaxWimps.isEmpty());

        String[]idArray = pentaxWimps.values().toArray(new String[0]);
        Set<String> isId = Set.of(idArray);
        List<String> isList = List.of(idArray);
    }


    /*16.13 (Duplicate Elimination) Write a program that reads in a series of first names and eliminates
//         duplicates by storing them in a Set. Allow the user to search for a first name.*/
//    @Test
//    void {
//            String []  names = new String[10];

   @Test
    void testForNameElimination(){
       Set<String> firstName = new HashSet<>();
       firstName.add("Ola");
       firstName.add("Michael");
       firstName.add("sandra");
   }
}



