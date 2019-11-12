package map.treemap;

public class AverageStudentGrade implements Comparable<AverageStudentGrade>{

    private final String name;
    private final float averageGrade;

    public AverageStudentGrade(String name, float averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(AverageStudentGrade grade) {
        if(this.averageGrade < grade.getAverageGrade()) return -1;
        if(this.averageGrade > grade.getAverageGrade()) return 1;
        return this.name.compareTo(grade.getName());
    }

    @Override
    public String toString() {
        return "Students name: '" + name + " AverageGrade: " + averageGrade ;
    }
}
