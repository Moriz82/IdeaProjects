public class Teacher {
    //Initiating instance variables
    private String Name;
    private int Age;
    private String Subject;
    private String Thing_that_they_say_in_class_way_too_much;
    //Constructor
    public Teacher(String n, int a, String sub, String thing){
        Name = n;
        Age = a;
        Subject = sub;
        Thing_that_they_say_in_class_way_too_much = thing;
    }
    //Creating Gets
    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }
    public String getSubject(){
        return Subject;
    }
    public String getThing_that_they_say_in_class_way_too_much(){
        return Thing_that_they_say_in_class_way_too_much;
    }
    //Creating Sets
    public void setName(String n){
        Name = n;
    }
    public void setAge(int a){
        Age = a;
    }
    public void setSubject(String s){
        Subject = s;
    }
    public void setThing_that_they_say_in_class_way_too_much(String t){
        Thing_that_they_say_in_class_way_too_much = t;
    }
    //Creating Speak method
    public String speak(){
        return Thing_that_they_say_in_class_way_too_much;
    }
}
