package Strings;

public class StringDemo {
    public static void main(String[] args) {

        char c = 'A';
        String demo = "Heute ist Freitag.";

        System.out.println(demo);
        System.out.println("demo.length() = " + demo.length()); // liefert die Länge
        System.out.println("demo.charAt(0) = " + demo.charAt(0)); // Liefert ein Zeichen an der Position, wichtig Position beginnt bei 0
        System.out.println("demo.charAt(7) = " + demo.charAt(7));

        System.out.println("demo.contains(\"Frei\") = " + demo.contains("Frei"));
        System.out.println("demo.contains(\"frei\") = " + demo.contains("frei"));
        System.out.println("demo.contains(\"Hallo\") = " + demo.contains("Hallo"));

        System.out.println("demo.toLowerCase() = " + demo.toLowerCase());
        System.out.println("demo.toUpperCase() = " + demo.toUpperCase());

        System.out.println("containsIgnoreCase(demo, \"frei\") = " + containsIgnoreCase(demo, "frei"));

        String demo2 = "Heute ist Freitag.";

        if (demo.equalsIgnoreCase(demo2)) {
            // Bei if-Abfragen, bei Strings, IMMER .equals() verwenden
            System.out.println("demo entspricht demo2");
        }
    }

    public static boolean containsIgnoreCase(String source, String search){
        String sourceLowerCase = source.toLowerCase();
        String searchLowerCase = search.toLowerCase();

        return sourceLowerCase.contains(searchLowerCase);
    }
}