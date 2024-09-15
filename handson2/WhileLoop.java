package handson2;

public class WhileLoop {
    public static void main(String[] args) {
        int counter = 1;
        while(counter <= 20) {
            if (counter % 2 != 0){
                counter++;
                continue;
            }
            System.out.println(counter);
            counter++;
        }
    }
}
