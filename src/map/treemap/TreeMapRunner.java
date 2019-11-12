package map.treemap;

import java.util.*;

public class TreeMapRunner {

    public static void main(String[] args) {

        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades = createGrade();

        printGrades(grades.descendingMap(),false);
        AverageStudentGrade border = grades.ceilingKey(new AverageStudentGrade("", 80));
        System.out.println("==== Border grade upper ======================");
        System.out.println(border);
        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> scholarshipStudens = (NavigableMap<AverageStudentGrade, Set<SubjectGrade>>) grades.tailMap(border);
        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> scholarshipStudensReversed = scholarshipStudens.descendingMap();
        printGrades(scholarshipStudens,false);
        printGrades(scholarshipStudensReversed,false);

        AverageStudentGrade attender = grades.lowerKey(border);

        System.out.println("==== Border grade lower ======================");
        System.out.println(attender);
        System.out.println("==== Highest grade student ======================");
        System.out.println(scholarshipStudens.lastEntry());
        System.out.println(scholarshipStudensReversed.firstEntry());


    }

    private static void printGrades(Map<AverageStudentGrade,Set<SubjectGrade>> grades, boolean printValue){
        Set<AverageStudentGrade> averageStudentGrades = grades.keySet();
        System.out.println("========================================");
        for (AverageStudentGrade gr: averageStudentGrades){
            System.out.println(gr);
            if(printValue) System.out.println(grades.get(gr));
        }
    }

    private static NavigableMap<AverageStudentGrade,Set<SubjectGrade>> createGrade(){
        Set<SubjectGrade> alexGrades = new HashSet<>();
        alexGrades.add(new SubjectGrade("Mathematics", 89));
        alexGrades.add(new SubjectGrade("Physics", 65));
        alexGrades.add(new SubjectGrade("History", 95));
        alexGrades.add(new SubjectGrade("Literature", 90));
        alexGrades.add(new SubjectGrade("Chemistry", 75));


        Set<SubjectGrade> jamesGrades = new HashSet<>();
        jamesGrades.add(new SubjectGrade("Mathematics", 75));
        jamesGrades.add(new SubjectGrade("Physics", 80));
        jamesGrades.add(new SubjectGrade("History", 55));
        jamesGrades.add(new SubjectGrade("Literature", 70));
        jamesGrades.add(new SubjectGrade("Chemistry", 80));


        Set<SubjectGrade> antonyGrades = new HashSet<>();
        antonyGrades.add(new SubjectGrade("Mathematics", 93));
        antonyGrades.add(new SubjectGrade("Physics", 91));
        antonyGrades.add(new SubjectGrade("History", 82));
        antonyGrades.add(new SubjectGrade("Literature", 78));
        antonyGrades.add(new SubjectGrade("Chemistry", 88));

        Set<SubjectGrade> victoriaGrades = new HashSet<>();
        victoriaGrades.add(new SubjectGrade("Mathematics", 73));
        victoriaGrades.add(new SubjectGrade("Physics", 65));
        victoriaGrades.add(new SubjectGrade("History", 75));
        victoriaGrades.add(new SubjectGrade("Literature", 66));
        victoriaGrades.add(new SubjectGrade("Chemistry", 50));


        Set<SubjectGrade> alinaGrades = new HashSet<>();
        alinaGrades.add(new SubjectGrade("Mathematics", 90));
        alinaGrades.add(new SubjectGrade("Physics", 70));
        alinaGrades.add(new SubjectGrade("History", 78));
        alinaGrades.add(new SubjectGrade("Literature", 88));
        alinaGrades.add(new SubjectGrade("Chemistry", 89));


        NavigableMap<AverageStudentGrade,Set<SubjectGrade>> map = new TreeMap<>();
        map.put(new AverageStudentGrade("Alex",calcAverage(alexGrades)),alexGrades);
        map.put(new AverageStudentGrade("James",calcAverage(jamesGrades)),jamesGrades);
        map.put(new AverageStudentGrade("Antony",calcAverage(antonyGrades)),antonyGrades);
        map.put(new AverageStudentGrade("Victoria",calcAverage(victoriaGrades)),victoriaGrades);
        map.put(new AverageStudentGrade("Alina",calcAverage(alinaGrades)),alinaGrades);

        return map;
    }

    private static float calcAverage(Set<SubjectGrade> grades){
        float sum = 0 ;
        for (SubjectGrade subj: grades){
            sum+=subj.getGrade();
        }
        return sum/grades.size();
    }

}
