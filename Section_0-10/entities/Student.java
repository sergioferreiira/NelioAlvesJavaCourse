package entities;

public class Student {
    public String name;
    public double gradeA;
    public double gradeB;
    public double gradeC;

    public String SumOfGrades(){
        double sum = gradeA + gradeB + gradeC;
        if (sum >= 60 ){
            System.out.println("Final Grade: " + sum);
            return "PASS";
        }
        else {
            System.out.println("Final Grade: " + sum);
            System.out.println("Failed");
            double result = 60 - sum;
            System.out.println("Missing " + result + "Points ");
            return "FAILED";
        }

    }
}
