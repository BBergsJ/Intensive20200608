import java.awt.*;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        {
            System.out.println("Кофе-машина");

            //TODO: читать из консоли!
            Scanner scanner = new Scanner(System.in);
            int moneyAmount = scanner.nextInt();

            int[] drinkPrices = {150, 80, 20, 60};
            String[] drinkNames = {"капучино", "эспрессо", "воду", "молоко"};

            boolean canBuyAnything = false;

            for(int i = 0; i < drinkNames.length; i++)
            {
                if(moneyAmount >= drinkPrices[i]) {
                    System.out.println("Вы можете купить " + drinkNames[i]);
                    canBuyAnything = true;
                }
            }

            if(!canBuyAnything) {
                System.out.println("Недостаточно средств :( Изучайте Java и зарабатывайте много! :)");
            }

            //TODO: 20200608_205858
            SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
            Date now = new Date();
            System.out.println(formatter.format(now));

            //TODO:
            BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            System.out.println(image.getWidth() + "x" + image.getHeight());

            //TODO: code + console => Telegram chat
            // #получилось
        }
    }
}
wTOPbqIyV0AAAAAAAAAAhBOLWnIv62itBrks1A9lW34Gu4mHvHFRFQ3k_cf6cEpu