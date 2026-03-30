class Program3 {
    public static void main(String[] args) {

        // ===== Wrapper Classes =====
        int num = 10;

        // Boxing (primitive to object)
        Integer obj = Integer.valueOf(num);
        System.out.println("Boxing: " + obj);

        // Unboxing (object to primitive)
        int num2 = obj.intValue();
        System.out.println("Unboxing: " + num2);

        // Autoboxing & Auto-unboxing
        Integer autoObj = num;   // autoboxing
        int autoNum = autoObj;   // auto-unboxing
        System.out.println("Autoboxing: " + autoObj);
        System.out.println("Auto-unboxing: " + autoNum);


        // ===== String vs StringBuffer =====

        // String (Immutable)
        String s1 = "Hello";
        s1.concat(" World"); // does not change original string
        System.out.println("\nString after concat: " + s1);

        // StringBuffer (Mutable)
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // changes original object
        System.out.println("StringBuffer after append: " + sb);

        // Performance demonstration
        long start, end;

        // String performance
       
 start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 10000; i++) {
            s += "a";
        }
        end = System.currentTimeMillis();
        System.out.println("\nTime taken by String: " + (end - start) + " ms");

        // StringBuffer performance
        start = System.currentTimeMillis();
        StringBuffer sb2 = new StringBuffer("");
        for (int i = 0; i < 10000; i++) {
            sb2.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (end - start) + " ms");
    }
}
