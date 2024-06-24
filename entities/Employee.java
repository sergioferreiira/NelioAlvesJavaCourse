package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary(){
        return grossSalary - tax;
    }
    public void IncreaseSalary(double percent){
        grossSalary = grossSalary - tax + (grossSalary * (percent / 100));
    }
}
