package Junit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.LocalDate;

public class Upes {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "E:\\Ecplise-Workspace\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        Date date = new Date();
        System.out.println("Today's date: " + date);
        System.out.println("Day of week: " + date.dayOfWeek());

        date.addDays(5);
        System.out.println("5 days later: " + date);
        System.out.println("Day of week: " + date.dayOfWeek());
    }
}

class Date {
    private LocalDate localDate;

    public Date() {
        this(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());
    }

    public Date(int year, int month, int day) {
        if (year < 1) {
            throw new IllegalArgumentException("Year must be positive");
        }
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
        if (day < 1 || day > daysInMonth(year, month)) {
            throw new IllegalArgumentException("Day must be between 1 and " + daysInMonth(year, month));
        }
        localDate = LocalDate.of(year, month, day);
    }

    public int getYear() {
        return localDate.getYear();
    }

    public int getMonth() {
        return localDate.getMonthValue();
    }

    public int getDay() {
        return localDate.getDayOfMonth();
    }

    public void addDays(int days) {
        localDate = localDate.plusDays(days);
    }

    public int daysInMonth() {
        return localDate.lengthOfMonth();
    }

    public static boolean isLeapYear(int year) {
        return LocalDate.of(year, 1, 1).isLeapYear();
    }

    public String dayOfWeek() {
        return localDate.getDayOfWeek().name();
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Date)) {
            return false;
        }
        Date date = (Date) o;
        return localDate.equals(date.localDate);
    }

    public String toString() {
        return localDate.toString();
    }

    public void nextDay() {
        addDays(1);
    }

    private int daysInMonth(int year, int month) {
        return LocalDate.of(year, month, 1).lengthOfMonth();
    }
}
