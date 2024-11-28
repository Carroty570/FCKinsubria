package Murilo.CursoDIO.GettersSetters;

public class School {
    
    public static void main(String[] args) {
        
        Student matteo = new Student();
        
        matteo.setName("Matteo Digosciu");
        matteo.setAge(19);

        System.out.println("The student " + matteo.getName() + "at his " + matteo.getAge() + "is by my side");
    
    }


}
