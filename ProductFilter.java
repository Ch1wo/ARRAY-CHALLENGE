public class ProductFilter {
    public static void main(String[] args) {
        String[] productCodes = {"P100", "X205", "P789", "Z456", "P123", "L901"};

        System.out.println("Products starting with 'P':");
        for (String code : productCodes) {
            if (code.startsWith("P")) {
                System.out.println(code);
            }
        }
    }
}