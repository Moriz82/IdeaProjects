public class NumberBox {
    public void run(int amnt){
        for (int i = 0; i < amnt; i++) {
            System.out.println("##"+(i+1)+"##---##"+(amnt-i)+"##---##"+(i+1)+"##");
        }
    }
}
