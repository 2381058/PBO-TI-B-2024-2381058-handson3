package handson2;

public class DoWhile {
    public static void main(String[] args) {
        int counter = 1;
        do {
            if (counter % 2 != 0){
                counter++;
                continue;
            }
            System.out.println(counter);
            counter++;
        }while(counter <= 20);
    }
}
