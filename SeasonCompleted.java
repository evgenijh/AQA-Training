import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeasonCompleted {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What month? (December, January, February, March, April, May, June, July, August," +
                " September, October, November)");
        String input = br.readLine();

        Season season;

        switch (input) {
            case "December":
            case "January":
            case "February":
                season = Season.WINTER;
                System.out.println("It's winter");
                break;
            case "March":
            case "April":
            case "May":
                season = Season.SPRING;
                System.out.println("It's spring");
                break;
            case "June":
            case "July":
            case "August":
                season = Season.SUMMER;
                System.out.println("It's summer");
                break;
            case "September":
            case "October":
            case "November":
                season = Season.AUTUMN;
                System.out.println("It's autumn");
                break;
            default:
                System.out.println("Not this time bro");
        }
    }

    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }
}
