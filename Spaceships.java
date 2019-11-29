public class spaceship1 {
    public static void main(String[] args){
        Spaceship first=new Spaceship(900,"pankihoy");
        Spaceship second=new Spaceship(1000, "dimohod");
        System.out.println(first.getSpeed());
        System.out.println(first.getName());
        System.out.println(second.getSpeed());
        System.out.println(second.getName());
        first.firstmethod();
        first.secondmethod();
        second.firstmethod();
        second.secondmethod();
    }
}
class Spaceship{
    private double speed;
    private String name;
    int firstmethod(){
        return 0;
    }
    int secondmethod(){
        return 0;
    }
    Spaceship(double speed,String name){
        this.speed=speed;
        this.name=name;
    }

    public double getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }
}