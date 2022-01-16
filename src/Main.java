import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int var_01 = 32;
        double var_02 = 10.35984;
        System.out.println(var_01);
        System.out.println(Locale.getDefault());
        Locale localeBr = new Locale("pt", "BR");
        System.out.printf(localeBr,"Locale pt-BR: %.2f\n", var_02);
        Locale.setDefault(Locale.US);
        System.out.printf("Locale US: %.2f\n", var_02);

//      Java scanner
        System.out.println("\nUser input:");
        System.out.print("Enter some word: ");
        Scanner sc = new Scanner(System.in);
        String var_03;

        var_03 = sc.next();
        System.out.println("You typed: " + var_03);

        int var_04;
        System.out.print("\nEnter an integer : ");
        var_04 = sc.nextInt();
        System.out.println("You typed: " + var_04);

        double var_05;
        System.out.println("\nType in US format!");
        System.out.print("Enter a float: ");
        var_05 = sc.nextDouble();
        System.out.println("You typed" + var_05);

        double var_06;
        System.out.println("\nType this in BR format!");
        System.out.print("Enter a float: ");
        sc.useLocale(localeBr);
        var_06 = sc.nextDouble();
        System.out.println("You typed: " + var_06);
        System.out.printf(localeBr,"You typed (locale pt_BR): %.2f%n", var_06);

        char var_07;
        System.out.print("\nEnter a char: ");
        var_07 = sc.next().charAt(0);
        System.out.println("You typed: " + var_07);


//      Multiple input in the same line (space as delimiter)
        System.out.println("\nMultiple input (US format): ");
        String var_08;
        int var_09;
        double var_10;
        var_08 = sc.next();
        var_09 = sc.nextInt();
        sc.useLocale(Locale.US);
        var_10 = sc.nextDouble();
        System.out.println("You typed:");
        System.out.println(var_08);
        System.out.println(var_09);
        System.out.println(var_10);


//      Multiple input with line break
        System.out.println("\nMultiple input with line break (US format): ");
        String var_11;
        String var_12;
        String var_13;
        sc.nextLine();
        var_11 = sc.nextLine();
        var_12 = sc.nextLine();
        var_13 = sc.nextLine();
        System.out.println("You typed: ");
        System.out.println(var_11);
        System.out.println(var_12);
        System.out.println(var_13);
        sc.close();
    }
}
