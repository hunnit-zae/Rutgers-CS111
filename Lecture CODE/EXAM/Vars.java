public class Vars {
    public static void main(String[] args) {

    // this is a comment


int x = 3;
int y = 15;
int z = 20;

int divYbyX = y/x;
System.out.println("The answer is : " + divYbyX);

int divZbyX = z/x;
System.out.println("The answer is : " + divZbyX);

double divZbyXreal = (z * 1.0)/x;
System.out.println("The answer is : " + divZbyXreal);

boolean mybool = true;
Boolean myotherbool = !mybool;
System.out.println("The bool is : " + mybool + " " + myotherbool);

System.out.println(Math.sqrt(25));


int xx = 2;
xx = xx + 1;

System.out.println(xx);

xx += 1;
System.out.println(xx);

xx++;
System.out.println(xx);

    }
}