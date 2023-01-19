public class breakkey {
    public static void main(String[] args) {
        boolean summer=true;
        int temp=75;
        while (summer){
            if(temp<=100){
                System.out.println("i love summer "+temp);
            }else{
                System.out.println("it is hot "+temp);
                break;
            }
            temp+=5;

        }
    }
}
