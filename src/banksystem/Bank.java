package banksystem;
import java.util.ArrayList;
/**
 *
 * @author Muhammad Huzaifa Alam Khan
 */
public class Bank{
    private static ArrayList<AutomatedTellerMachine> atm = new ArrayList<>();
    private static ArrayList<User> users = new ArrayList<>();

    /**
     * To add a new user to the user name
     * @param userName the name of the user 
     * @param pin the pin of the user
     */
    public static void addUser(String userName, String pin) {
        users.add(new User(userName, pin));
    }
    
    public static ArrayList<User> getUsers() {
        return users;
    }
}