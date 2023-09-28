public class MethodsReferencingStringObject {
   static void welcome(String n){
        System.out.print("Hiii "+n);
    }
    public static void main(String args[]){
        String name="victor";
        welcome(name);
    }
}
