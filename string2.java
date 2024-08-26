public class string2 {
    public static void main(String[] args) {
        String name="Vikash dubey";
        int letters=name.length();
        System.out.println(letters);
        String lcase=name.toLowerCase();
        System.out.println(lcase);
        String ucase=name.toUpperCase();
        System.out.println(ucase);
        String original="    Vikash dubey   ";
        System.out.println(original);
        String trimmed=original.trim();
        System.out.println(trimmed);
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,4));
        System.out.println(name.replace('h', 'S'));
        System.out.println(name.startsWith("Vik"));

        System.out.println(name.endsWith("ey"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("a"));
        String changed= "kumar vikash";
        System.out.println(changed.indexOf("a",4));
        System.out.println(changed.lastIndexOf("a"));
        System.out.println(name.equals("Vikash dubey"));
        System.out.println(name.equalsIgnoreCase("vikash dubey"));

    }
}
