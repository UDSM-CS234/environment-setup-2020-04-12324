public class position {
    public static void main(String[] args){
        int Xi=0;
        double a=-9.81;
        int Vi=0;
        int t=10;
        double position=0.5*a*t*t+Vi*t+Xi;
        System.out.println("The position is " +position);

    }
}
