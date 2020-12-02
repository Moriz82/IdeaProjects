public class Car{
    private int miles = 0, whenOil = 0;
    public Car(int a, int b){
        miles = a;
        whenOil = b;
    }
    public void addMiles(int add){
        miles+=add;
    }
    public boolean timeForOilChange(){
        boolean YorN = (miles>=whenOil);
        if (YorN)
            miles = 0;
        return YorN;
    }
}