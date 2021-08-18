import javax.lang.model.element.NestingKind;

public class Main {
    public static void main (String[] args){
        System.out.println(Speed.toMilesPerHour(1.5));
        System.out.println(Speed.toMilesPerHour(10.25));
        System.out.println(Speed.toMilesPerHour(-5.6));
        System.out.println(Speed.toMilesPerHour(25.42));
        System.out.println(Speed.toMilesPerHour(75.114));
        Speed.printConversion(10.5);

    }
}
