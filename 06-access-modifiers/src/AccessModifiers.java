public class AccessModifiers {

    // 1. PUBLIC
    // Can be accessed from any class/package.
    public String publicField = "Public";


    // 2. PROTECTED
    // Can be accessed within the same package and by subclasses.
    protected String protectedField = "Protected";


    // 3. PACKAGE-PRIVATE
    // No access modifier is specified.
    // Can only be accessed within the same package.
    String packagePrivateField = "Package-Private";


    // 4. PRIVATE
    // Can only be accessed within this class.
    private String privateField = "Private";


    public void showInsideClass() {

        // Inside the declaring class, all access levels are accessible.
        System.out.println(publicField);
        System.out.println(protectedField);
        System.out.println(packagePrivateField);
        System.out.println(privateField);
    }
}