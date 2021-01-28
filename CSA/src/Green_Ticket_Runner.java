public class Green_Ticket_Runner {
    public static void main(String[] args) {
        //Instantiating a new Teacher
        Teacher teacher = new Teacher("Mr.Cool",21,"Computer Science","Yall");
        //Modifying using set methods
        teacher.setName("Joe Cool");
        teacher.setAge(22);
        teacher.setSubject("Math");
        teacher.setThing_that_they_say_in_class_way_too_much("NULL");
        //Using get method to save return values
        String name,subject,thing_said;
        int age;
        name = teacher.getName();
        age = teacher.getAge();
        subject = teacher.getSubject();
        thing_said = teacher.getThing_that_they_say_in_class_way_too_much();
        //Calling speak method that prints returned string
        System.out.println(teacher.speak());
    }
}