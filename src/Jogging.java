public class Jogging {

    public void Compute(int lap) {
        int distance = lap * 4;
        System.out.println("distance is" + " " + distance);

    }

    void Compute(int lap1,int lap2) {
        int totalspeed = lap1+lap2;
        System.out.println("totalspeed is" + " " + totalspeed);
    }

    public void Compute(int lap1,int lap2,int lap3) {
        int steps = lap1+lap2+lap3;
        System.out.println("steps are" + " " + steps);

    }
}