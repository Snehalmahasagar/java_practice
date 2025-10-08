package practice;
public class Schoole {

    public void Display(){
        System.out.println("STUDENT INFO");
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Display();
        s1.setName();
        s1.setRoll_numer();
        s1.setCity();
        s1.setPercentage();
        s1.getName();
        s1.getRoll_numer();
        s1.getCity();
        s1.getPercentage();



    }
}