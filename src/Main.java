import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        var accounts = Accounts.generateAccountList(18);
        var emailToBirthdayTable = new HashTable<String, LocalDate>();
        accounts.forEach(a -> emailToBirthdayTable.put(a.getEmail(), a.getBirthday()));
        emailToBirthdayTable.printTable();
    }
}
