import java.util.Scanner;

public class Conditional {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Tria un exercici:");
        int eleccio = input.nextInt();
        String a = input.nextLine();

        float xf,yf;
        int x,y;
        boolean xgt,ygt;

        switch (eleccio){
            case 1:
                x = 5;y = 7;
                xgt = x > y;
                ygt = x < y;
                if(xgt == true){
                    System.out.printf("%d is greater than %d",x,y);
                }
                if(ygt == true){
                    System.out.printf("%d is greater than %d",y,x);
                }
                break;
            case 2:
                xf = 5.77F;
                yf = 7.83F;
                if(xf == yf){
                    System.out.printf("%f and %f are equal",xf,yf);
                } else {
                    System.out.printf("%f and %f aren't equal",xf,yf);
                }
                break;
            case 3:
                x = 5; y= 7;
                if(x == y) {
                    System.out.printf("%d and %d are equal.",x,y);
                } else if (x > y) {
                        System.out.printf("X:%d is greater than Y:%d",x,y);
                } else {
                        System.out.printf("X:%d is less than Y:%d",x,y);
                }
                break;
            case 5:
                int temperature = 75;
                if (temperature < 60){
                    System.out.println("Cold enough to wear a coat");
                } else if (temperature >= 60 && temperature < 68) {
                    System.out.println("Cold enough to wear a jacket");
                } else {
                    System.out.println("No outwear required!");
                }
                break;
            case 10:
                x = 50; y = 0;
                y = x > 10 ? 5 : 27;
                System.out.println(y);
                break;
            case 11:
                System.out.println("Month?");
                String monthOg = input.nextLine();
                String month = monthOg.toLowerCase();
                month = month.substring(0,3);
                switch (month) {
                    case "jan","mar","may","jul","aug","oct","dec":
                        System.out.println("This month has 31 days");
                        break;
                    case "apr","jun","sep","nov":
                        System.out.println("This month has 30 days");
                        break;
                    case "feb":
                        System.out.println("This month has 28 days");
                        break;
                }
                break;
            case 14:
                System.out.println("Level?");
                String level = input.nextLine();
                level = level.toLowerCase();
                switch (level){
                    case "gold":
                        System.out.println("\t dinner for one");
                    case "silver":
                        System.out.println("\t breakfast");
                    case "bronze":
                        System.out.println("\t newspaper");
                        System.out.println("\t free parking");
                    default:
                        System.out.println("\t room");
                        break;
                }
                break;
            default:
                System.out.println("Invalid number dumbass!!");
                break;
        }


    }
}
