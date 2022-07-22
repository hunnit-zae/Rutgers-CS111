public class myRect{

    private int width;
    private int height;

    myRect(){
        this.width = 1;
        this.height = 1;
    }
       
    myRect(int w , int h){
          width = w;
          height = h;
    }
    
    int getWidth(){
        return width;
    }
    
    int getHeight(){
        return height;
    }
    
    int perameter(){
        return (width + height) * 2;
    }
    
    int area(){
        return width * height;
    }
    

    public String toString(){
        String p = "a "+ width + "X" + height + " rectangle";
         
        return p;
    }
    
    
    public static void main(String[] args) {
         myRect r1 = new myRect() ;
         myRect r2 = new myRect(5,5);
         myRect r3 = new myRect(3,4);
         
         System.out.println("width of 1st object = " + r1.getWidth());
         System.out.println("area of the 2nd = " + r2.area());
         System.out.println(r3.toString());
    }
}