public class ClassMap {
    public String [] [] deskArray;
    public String name;

    public void setClassMap(){
        deskArray = new String [3] [4];
    }

    public void setDesk(){
        boolean flag = false;
        for (int row = 0; row<3 ; row++){
            for(int col = 0; col < 4; col++) {
                if (deskArray[row][col] == null) {
                    System.out.println(name + "se seura a fila " + row + " a la columna " + col);
                    deskArray[row][col] = name;
                    flag = true;
                    break;
                }
            }
            if (flag ==true){
                break;
            }
        }
        if(flag == false) {
            System.out.println("Totes ses taules ocupades");
        }
    }

    public void displayDeskMap(){
        for(int row = 0; row<3; row++){
            for (int col = 0; col<4; col++){
                System.out.print(deskArray[row][col] + " ");
            }
            System.out.println();
        }
    }

    public void searchDesk(){
        boolean flag = false;
        for(int row = 0; row<3;row++){
            for(int col = 0;col<4;col++){
                if(deskArray[row][col] != null && deskArray[row][col].equals(name)){
                    System.out.println(name + " esta assegut a: Fila: " + row + " i  Columna: " + col);
                    flag = true;
                    break;
                }
            }
            if (flag == true){
                break;
            }
        }
        if(flag == false){
            System.out.println(name + " no te taula");
        }
    }
}