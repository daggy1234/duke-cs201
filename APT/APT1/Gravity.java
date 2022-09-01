public class Gravity {
    public double falling(double time, double velo){
        return (velo * time) + (0.5 * 9.8 * (time * time));
    }

    public static void main(String[] args) {
        Gravity obj = new Gravity();
        double time = 3;
        double velo = 5;
        System.out.println(obj.falling(time, velo));
    }
}
