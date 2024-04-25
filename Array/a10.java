class point{
    int x=10;
    int y=20;
    point(){
          System.out.println("Inside Ctor");
    }
}
class sample{
    public static void main(String[] args){
         System.out.println("Inside main");
         point[] p=new point[3];
         p[0]=new point();
         System.out.println(p[0].x);
         System.out.println(p[0].y); 
         }
}