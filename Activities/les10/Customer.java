public class Customer {

    int customerID = 0;
    String name = "-name required-",
        address = "-address required-",
        phoneNumber = "-phone required-",
        eMail = "-email optional-";

    public void setCustomerInfo(int Id, String nm,String addr, String phNum){
        customerID = Id;
        name = nm;
        address = addr;
        phoneNumber = phNum;
    }

    public void setCustomerInfo(int Id, String nm , String addr , String phNum , String email){
        customerID = Id;
        name = nm;
        address = addr;
        phoneNumber = phNum;
        eMail = email;
    }

    public void displayCustomer(){
        System.out.printf("Customer ID: &d\n",customerID);
        System.out.printf("Customer name: %s\n",name);
        System.out.printf("Customer address: %s\n",address);
        System.out.printf("Customer phone number: %s\n",phoneNumber);
        System.out.printf("Customer e-mail: %s\n",eMail);
    }

}
