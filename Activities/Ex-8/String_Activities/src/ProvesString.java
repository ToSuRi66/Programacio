import java.util.Scanner;

public class ProvesString {
    public void main (String[]args){

        String firstName = "John";
        String s1 ="Mary";
        String s2 ="had";
        String s3 ="a";
        String s4 = "little";
        String s5 = "lamb";
        String space = " ";
        String mary16 = "Mary had a little lamb";
        String mary17 = "Mary had a little lamb, little lamb, little lamb, Mary had a little lamb that was as white as snow";
        String mary18 = "Mary had a little lamb,\n little lamb,\n little lamb,\n Mary had a little lamb that was as white as snow";
        String paraula = "little";
        String numTel = "111-222-3333";

        Scanner input = new Scanner(System.in);
        System.out.println("Tria un exercici: ");
        int exercici = input.nextInt();

        switch(exercici){
            case 1:
                //Ex 1
                firstName = new String("John");
                break;
            case 2:
                //Ex 2
                firstName = "John";
                break;
            case 3:
                //Ex 3
                s1 = "John";
                s2 = "leavings";
                s3 = s1 + " " + s2;
                System.out.println(s3);
                break;
            case 4:
                //Ex 4
                s1 = "John";
                s2 = "leavings";
                s3 = s1;
                s3 = s3.concat(space);
                s3 = s3.concat(s2);
                break;
            case 5:
                int firstNameLength = firstName.length();
                System.out.println(firstNameLength);
                break;
            case 6:
                System.out.printf("La longitud es %d.\n", "Basketball!".length());
                break;
            case 7 , 8:
                String firstNameLowercase = firstName.toLowerCase();
                System.out.println(firstNameLowercase);
                System.out.println(firstNameLowercase.toUpperCase());
                break;
            case 15:
                int indexOfI = mary16.indexOf("i");
                System.out.printf("Sa posició de sa lletra 'i' es: %d.",indexOfI);
                break;
            case 16:
                System.out.println(mary16);
                int posicioPrimeraA = mary16.indexOf("a");
                int posicioSegonaA = mary16.indexOf("a", posicioPrimeraA +1);
                System.out.printf("Posició de la segona a: %d", posicioSegonaA);
                break;
            case 17:
                System.out.println(mary17);
                int primerLittle = mary17.indexOf(paraula);
                int segonLittle = mary17.indexOf(paraula, primerLittle+1);
                System.out.printf("La posició del segon little es: %d.", segonLittle);
                break;
            case 18:
                System.out.println(mary18);
                int darrerLittle = mary18.lastIndexOf(paraula);
                System.out.printf("La posició del darrer little es: %d.",darrerLittle);
                break;
            case 19:
                System.out.println(mary18);
                int darreraW = mary18.lastIndexOf('w');
                System.out.printf("La posició del darrer 'w' es: %d.",darreraW);
                break;
            case 20:
                System.out.println(mary18);
                String mary20 = mary18.replace("little", "big big");
                System.out.println(mary20);
                break;
            case 21:
                System.out.println(mary18);
                String mary21 = mary18.replace(" little", "");
                System.out.println(mary21);
                break;
            case 22:
                System.out.println(numTel);
                String areaCode = numTel.substring(0,3);
                System.out.printf("Codi d'area: %s.", areaCode);
                break;
            case 23:
                System.out.println(numTel);
                String subsCode = numTel.substring(4);
                System.out.printf("Codi de subscriptor: %s.", subsCode);
                break;
            case 24:
                System.out.println(numTel);
                int indexCentral = numTel.indexOf('-');
                int indexSubs =  numTel.indexOf('-',indexCentral+1);
                String centralCode = numTel.substring(indexCentral+1,indexSubs);
                System.out.printf("Codi de central: %s.",centralCode);
                break;
            case 25:
                System.out.println(numTel);
                int indexCent = numTel.indexOf('-');
                int lastOne = numTel.lastIndexOf('1',2);
                System.out.printf("El darrer 1 esta a la posició: %d.", lastOne +1);
                break;
            case 26:
                String question = "   how are you?   ";
                System.out.println(question);
                String questionTrim = question.trim()+"X";
                System.out.println(questionTrim);
                break;
            case 27:
                String question2 = ">>>>>>How are you<<<<<<";
                System.out.println(question2);
                String question2gt = question2.replace(">","");
                String question2lt = question2gt.replace("<","");
                System.out.println(question2lt);
                break;
            case 28:
                System.out.println(mary18);
                int indexNewLine = mary18.indexOf("\n")+1;
                int indexNewLine2 = mary18.indexOf("\n",indexNewLine);
                String rhyme2Line = mary18.substring(indexNewLine,indexNewLine2);
                System.out.println(rhyme2Line);
                break;
            case 29:
                System.out.printf("%10s\n",s1);
                System.out.printf("%10s\n",s2);
                System.out.printf("%10s\n",s3);
                System.out.printf("%10s\n",s4);
                System.out.printf("%10s\n",s5);
                break;
            case 30:
                System.out.printf("%-10s\n", s1);
                System.out.printf("%-10s\n", s2);
                System.out.printf("%-10s\n", s3);
                System.out.printf("%-10s\n", s4);
                System.out.printf("%-10s\n", s5);
                break;
            case 32:
                String s;
                s = String.format("|%-10s|\n",s1);
                s = s + String.format("|%-10s|\n",s2);
                s = s + String.format("|%-10s|\n",s3);
                s = s + String.format("|%-10s|\n",s4);
                s = s + String.format("|%-10s|\n",s5);
                System.out.println(s);
                break;
            default:
                System.out.println("Invalid number dumbass!");
                break;
        }
    }
}
