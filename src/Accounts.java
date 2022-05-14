import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Accounts {
    private String email;
    private LocalDate birthday;

    static List<Accounts> accountsList = Arrays.asList(
            new Accounts("a@gmail.com",  LocalDate.of(2000, 12, 23)),
            new Accounts("b@gmail.com",  LocalDate.of(1998, 12, 23)),
            new Accounts("c@gmail.com",  LocalDate.of(1995, 12, 23)),
            new Accounts("e@gmail.com",  LocalDate.of(2001, 12, 23)),
            new Accounts("f@gmail.com",  LocalDate.of(2012, 12, 23)),
            new Accounts("g@gmail.com",  LocalDate.of(2000, 12, 23)),
            new Accounts("h@gmail.com",  LocalDate.of(2018, 12, 23)),
            new Accounts("i@gmail.com",  LocalDate.of(2000, 12, 23)),
            new Accounts("j@gmail.com",  LocalDate.of(2019, 12, 23)),
            new Accounts("k@gmail.com",  LocalDate.of(2011, 12, 23)),
            new Accounts("l@gmail.com",  LocalDate.of(2010, 12, 23)),
            new Accounts("m@gmail.com",  LocalDate.of(2011, 12, 23)),
            new Accounts("n@gmail.com",  LocalDate.of(2010, 12, 23)),
            new Accounts("o@gmail.com",  LocalDate.of(1999, 12, 23)),
            new Accounts("o@gmail.com",  LocalDate.of(1999, 12, 23)),
            new Accounts("olia@gmail.com",  LocalDate.of(1999, 12, 23)),
            new Accounts("po@gmail.com",  LocalDate.of(1999, 12, 23)),
            new Accounts("for@gmail.com",  LocalDate.of(1999, 12, 23)),
            new Accounts("p@gmail.com",  LocalDate.of(2002, 12, 23))
    );


    public Accounts(String email, LocalDate birthday) {
        this.email = email;
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public static List<Accounts> generateAccountList(Integer count) {

        return accountsList.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
