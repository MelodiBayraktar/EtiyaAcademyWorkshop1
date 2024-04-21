public class StringMethods {
    public static void main(String[] args) {
        //charAt

        String name = "Melodi";
        char m = name.charAt(0);
        System.out.println(m);

        int nameLength = name.length();
        System.out.println(nameLength);

        name = name.toUpperCase();
        System.out.println(name);

        name = name.toLowerCase();
        System.out.println(name);

        name = name.substring(0,6);
        System.out.println(name);

        int wordIndex = name.indexOf("e");
        System.out.println(wordIndex);

        name = name.replace("M","m");
        System.out.println(name);

        String name2 = "MELODİ";
        boolean sameName = name.equals(name2);
        System.out.println(sameName);

        boolean startsWithM = name.startsWith("M");
        System.out.println(startsWithM);

        boolean endsWithI = name.endsWith("i");
        System.out.println(endsWithI);

        name = " M e l o d i ";
        name = name.trim();
        System.out.println(name);

        boolean containsMel = name.contains("Mel");
        System.out.println(containsMel);
    }
}
