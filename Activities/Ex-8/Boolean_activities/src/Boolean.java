import java.util.Scanner;

public class Boolean {
    public static void main (){

        Scanner input = new Scanner(System.in);
        int eleccio;
        int x;
        int y;
        int z;
        boolean result,xb,yb;

        System.out.println("Quin exercici vols revisar?");
        eleccio = input.nextInt();

        System.out.println("Recorda et demanara per cada exercici les variables, començant per x, y i si es el cas z, introdueix el nombre i clica ENTER");

        switch(eleccio){
            case 4:
                //Ex 4
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                result = x==y;
                System.out.printf("El resultat de si %d es igual a %d es: %b\n",x,y, result);
                break;
            case 5:
                //Ex 5
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                result = x > y;
                System.out.printf("%d es mes gros que %d?? %b\n", x,y,result);
                break;
            case 6:
                //Ex 6
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                result = x < y;
                System.out.printf("%d es mes petit que %d?? %b\n", x,y,result);
                break;
            case 7:
                //Ex 7
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                result = x >= y;
                System.out.printf("%d es mes gros o igual que %d?? %b\n", x,y,result);
                break;
            case 8:
                //Ex 8
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                result = x <= y;
                System.out.printf("%d es mes petit o igual que %d?? %b\n", x,y,result);
                break;
            case 9:
                //Ex 9
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                result = x != y;
                System.out.printf("%d no es igual a %d?? %b\n", x,y,result);
                break;
            case 10:
                //Ex 10
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                result = !(x > y);
                System.out.printf("%d no es mes gros que%d?? %b\n", x,y,result);
                break;
            case 11:
                //Ex 11
                System.out.print("\nX (boolean): "); xb = input.nextBoolean();
                System.out.print("\nY (boolean): "); yb = input.nextBoolean();
                result = xb==yb;
                System.out.printf("%b es igual a %b: %b", xb,yb,result);
                break;
            case 12,13,14,15:
                System.out.print("\nX (boolean): "); xb = input.nextBoolean();
                System.out.print("\nY (boolean): "); yb = input.nextBoolean();
                result = xb==yb;
                System.out.printf("%b es igual a %b: %b", xb,yb,result);
                break;
            case 17:
                //Ex 17
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                result= ((x > 5)||(y < 7));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                result= ((x > 5)||(y < 7));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                result= ((x > 5)||(y < 7));
                System.out.println(result);
                break;
            case 18:
                //Ex 18
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                result= ((x >= 5)&&(y == 0));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                result= ((x >= 5)&&(y == 0));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                result= ((x >= 5)&&(y == 0));
                System.out.println(result);
                break;
            case 19:
                //Ex 19
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                result= ((x >= 5)&&(y != 0));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                result= ((x >= 5)&&(y != 0));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                result= ((x >= 5)&&(y != 0));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                result= ((x >= 5)&&(y != 0));
                System.out.println(result);
                break;
            case 20:
                //Ex 20
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                result = ((x > 5)^(y > 5));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                result = ((x > 5)^(y > 5));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                result = ((x > 5)^(y > 5));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                result = ((x > 5)^(y > 5));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                result = ((x > 5)^(y > 5));
                System.out.println(result);
                break;
            case 21:
                //Ex 21
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                System.out.print("\nZ: "); z = input.nextInt();
                result = ((x > 5) || (y > 15) || (z <= 25));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                System.out.print("\nZ: "); z = input.nextInt();
                result = ((x > 5) || (y > 15) || (z <= 25));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                System.out.print("\nZ: "); z = input.nextInt();
                result = ((x > 5) || (y > 15) || (z <= 25));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                System.out.print("\nZ: "); z = input.nextInt();
                result = ((x > 5) || (y > 15) || (z <= 25));
                System.out.println(result);
                break;
            case 22:
                //Ex 22
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                System.out.print("\nZ: "); z = input.nextInt();
                result = ((x >= 5) && (y < 15) || (z < 25));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                System.out.print("\nZ: "); z = input.nextInt();
                result = ((x >= 5) && (y < 15) || (z < 25));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                System.out.print("\nZ: "); z = input.nextInt();
                result = ((x >= 5) && (y < 15) || (z < 25));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                System.out.print("\nZ: "); z = input.nextInt();
                result = ((x >= 5) && (y < 15) || (z < 25));
                System.out.println(result);
                break;
            case 23:
                //Ex 23
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                System.out.print("\nZ: "); z = input.nextInt();
                result = ((x >= 5) || (y < 15) ^ (z < 15));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                System.out.print("\nZ: "); z = input.nextInt();
                result = ((x >= 5) || (y < 15) ^ (z < 15));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                System.out.print("\nZ: "); z = input.nextInt();
                result = ((x >= 5) || (y < 15) ^ (z < 15));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                System.out.print("\nZ: "); z = input.nextInt();
                result = ((x >= 5) || (y < 15) ^ (z < 15));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                System.out.print("\nZ: "); z = input.nextInt();
                result = ((x >= 5) || (y < 15) ^ (z < 15));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                System.out.print("\nZ: "); z = input.nextInt();
                result = ((x >= 5) || (y < 15) ^ (z < 15));
                System.out.println(result);
                break;
            case 24:
                //Ex 24
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                System.out.print("\nZ: "); z = input.nextInt();
                result = ((x >= 5) || (y < 15) ^ (z < 15));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                System.out.print("\nZ: "); z = input.nextInt();
                result = ((x >= 5) || (y < 15) ^ (z < 15));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                System.out.print("\nZ: "); z = input.nextInt();
                result = ((x >= 5) || (y < 15) ^ (z < 15));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                System.out.print("\nZ: "); z = input.nextInt();
                result = ((x >= 5) || (y < 15) ^ (z < 15));
                System.out.println(result);
                break;
            case 25:
                //Ex 25
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                System.out.print("\nZ: "); z = input.nextInt();
                result = ((x >= 5) && (y < 15) ^ (z < 15));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                System.out.print("\nZ: "); z = input.nextInt();
                result = ((x >= 5) && (y < 15) ^ (z < 15));
                System.out.println(result);
                System.out.print("\nX: "); x = input.nextInt();
                System.out.print("\nY: "); y = input.nextInt();
                System.out.print("\nZ: "); z = input.nextInt();
                result = ((x >= 5) && (y < 15) ^ (z < 15));
                System.out.println(result);
                break;
            default:
                System.out.println("Error: nombre no conegut o exercici inexistent");
        }

    }
}
