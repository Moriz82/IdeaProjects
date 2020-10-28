public class Monster {
    //Initiate name and howBig
    private String name;
    private int howBig;

    public Monster(String n, int size) {
        //declare name with n variable and howBig with size variable
        name = n;
        howBig = size;
    }

    public String getName() {
        //return name
        return name;
    }

    public int getHowBig() {
        //return howBig
        return howBig;
    }

    public boolean isBigger(Monster other) {
        //first check if other monster is smaller
        if (other.howBig<howBig){
            //if it is smaller return true
            return true;
        }
        //if its not smaller return false
        return false;
    }

    public boolean isSmaller(Monster other) {
        //call isBigger() use !
        //according to the above comment we will use isBigger()
        //this reduces the amount of code we have and looks nicer
        if (isBigger(other)){
            //if the monster is bigger return false
            return false;
        }
        //if its smaller return true
        return true;
    }

    public boolean namesTheSame(Monster other) {
        //since string can get a little funny we use the .equals method for checking
        //so here we will use that to check if they are equal
        if (name.equals(other.name)){
            //if in fact their names are equal return true
            return true;
        }
        //if the names are not equal return false
        return false;
    }

    public String toString() {
        return "";
    }
}