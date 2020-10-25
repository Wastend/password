import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String charSet = "abcdefghijklmnopqrstuvwxyz0123456789"; //Значения
    private static final SecureRandom secureRandom = new SecureRandom(); // получаем случайное значение

    public static String create(int length) {
        StringBuilder pass = new StringBuilder(length);
        for (int i = 0; i < length; i++) { //заполняем строку
            int randomIndex = secureRandom.nextInt(charSet.length());//присваиваем значение randomIndex длины charSet
            char randomChar = charSet.charAt(randomIndex);//Возвращает символ по указанному индексу строки
            pass.append(randomChar); //добавляем этот символ в строку
        }
        return pass.toString(); //возвращаем строку
    }
}