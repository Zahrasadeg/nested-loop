public class nestedloopps {
    public static void main(String[] args) {
        for (int i = 0; i <6 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i <= 10; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i <= 15; i+=3) {
            System.out.print(i+" ");

        }
        System.out.println("****************");
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j <=5; j++) {
                System.out.print(i*j+" ");

            }
            System.out.println();
            
        }
    }
}
