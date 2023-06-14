package stream;

import javax.swing.*;
import java.security.KeyStore;
import java.util.*;
import java.util.stream.Collectors;


public class Samples {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Selena", "Anna", "Crystal", "Bob", "Spencer", "Jasmine");

        List<Integer> numbers = Arrays.asList(7,5,9,2,8,1);

        /* sorted by length ASC
        names.stream()
                .sorted(Comparator.comparingInt(String::length));
         */


        /* counts summary
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);
         */

        /*
        long numOfNames = names.stream()
                .filter(name -> name.length() > 5)
                .count();
        System.out.println(numOfNames);
         */

        /* convert to Array and output on screen
        Object[] arrayNames = names.stream()
                .limit(5)
                .toArray();
        System.out.println(Arrays.toString(arrayNames));
         */

        Map<String, Integer> students = new HashMap<>();
        students.put("John", 92);
        students.put("Bob", 90);
        students.put("Crystal", 93);
        students.put("Kevin", 88);
        students.put("Robert", 85);

        /* sorted by adding map to TreeMap and reverseOrder
        Map<String, Integer> studentSorted = new TreeMap<>(Collections.reverseOrder());
        studentSorted.putAll(students);
        System.out.println(studentSorted);
         */

        /* sorted by String length by reverse Order
        Map<String, Integer> studentSorted = new TreeMap<>(Collections.reverseOrder(Comparator.comparingInt(String::length)));
        studentSorted.putAll(students);
        System.out.println(studentSorted);
         */

        /* sorted in natural reverse order of KEYS
        Map<String, Integer> sortedStudents = students.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println(students);
        System.out.println(sortedStudents);
         */

        /* sorted by String length by reverse Order by KEYS
        Map<String, Integer> sortedStudents = students.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey(Comparator.comparingInt(String::length))))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println(students);
        System.out.println(sortedStudents);
         */

        Map<Integer, String> idMap = new HashMap<>();
        idMap.put(111, "Lisa");
        idMap.put(222, "Narayan");
        idMap.put(333, "Xiangh");
        idMap.put(444, "Arunkumar");
        idMap.put(555, "Jyous");
        idMap.put(666, "Klusener");


        /* sorted by VALUES in natural order
        List<Map.Entry<Integer, String>> listOfEntry = new LinkedList<>(idMap.entrySet());

        listOfEntry.sort(Map.Entry.comparingByValue());
        //System.out.println(idMap);
        //System.out.println(listOfEntry);

        Map<Integer, String> sortedIdMap = new LinkedHashMap<>();

        for (Map.Entry<Integer, String> entry : listOfEntry) {
            sortedIdMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println(idMap);
        System.out.println(listOfEntry);
        System.out.println(sortedIdMap);
         */

        /* sorted in natural order by comparingByValue
        Map<Integer, String> sortedMap = idMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(idMap);
        System.out.println(sortedMap);
         */

        Map<Integer,String> sortedMap = idMap.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue(Comparator.comparingInt(String::length))))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(idMap);
        System.out.println(sortedMap);
    }
}
