package origin.company.project.commons.utils;

public class RandomUtils {
    public static int randomNumber() {
        int randomNum =  (int) (Math.random() * 1000);
        return randomNum;
    }
}
