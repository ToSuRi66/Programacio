public class Month {

    int monthNumber = 12;

    public void displayMonth() {

        switch (monthNumber) {
            case 1:
                IO.println("January");
                break;
            case 2:
                IO.println("February");
                break;
            case 3:
                IO.println("March");
                break;
            case 4:
                IO.println("April");
                break;
            case 5:
                IO.println("May");
                break;
            case 6:
                IO.println("June");
                break;
            case 7:
                IO.println("July");
                break;
            case 8:
                IO.println("August");
                break;
            case 9:
                IO.println("September");
                break;
            case 10:
                IO.println("October");
                break;
            case 11:
                IO.println("November");
                break;
            case 12:
                IO.println("December");
                break;
            default:
                IO.println("Error");
                break;
        } // End of switch

    } // End of Display

} // End of class
