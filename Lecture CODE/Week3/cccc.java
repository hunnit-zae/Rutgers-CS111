public class cccc {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        int count = 0;

        while (number > 0){
            if(number % 10 == 2){
                count = count + 1;
            }
            number = number / 10;
        }

        System.out.println("Count: "+ count);
    }
}