public class Test {
    public static void main(String args[]){

        //main changed
        int i = 0;
        int count = 3 + i;
        System.out.print("This is a log");

        while (i < count) {
            System.out.print("12");
            System.out.print("This is a log");
            i++;
        }
        System.out.print("This is a log");
        while (1 >= count) {
            System.out.print("12");
            i--;
            System.out.print("This is a log");
            System.out.print("This is a log");

            for (int k = 0; k < 10; k++) {
                System.out.print("haha");
            }
            System.out.print("This is a log");
            System.out.print("This is a log");
        }
    }
}
