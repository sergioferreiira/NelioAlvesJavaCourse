package Exercises;

public class ListClasses {
    private Integer id;
    private String name;
    private double wage;

    public ListClasses() {
    }

    public ListClasses(Integer id, String name, double wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return wage;
    }


    public int increase(int x){
        return (int) getWage() + (x / 100);
    }



    public String toString(){
        return getId()
                + ", "
                + getName()
                + ", "
                + getWage();
    }
}
