import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {


        ContactInfomation contact1 = new ContactInfomation("HUssein", "dfbhjdfgv@bgmail.com");
        BusinessContact business1 = new BusinessContact("PPP", "dfguwergsf@gmail.com", "23645234");
        contact1.display();
        business1.display();

        ContactCollection book = new ContactCollection("ContactBook", "testing@gmail.com", 1);
        //book.addContact(contact1);
        //book.addContact(business1);
        book.display();







    }
}