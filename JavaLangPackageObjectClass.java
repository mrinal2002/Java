class MyObject{
    public String toString(){
        return "myobject";
    }
    public int hashCode(){
        return 100;
    }
    public boolean equals(Object o){
        return this.hashCode()==o.hashCode();
    }
}
public class JavaLangPackageObjectClass {
    public static void main(String[] args) {
        MyObject o1=new MyObject();
        MyObject o2=new MyObject();
        System.out.println(o1.toString());
        System.out.println(o1.equals(o2));
        System.out.println(o2.hashCode());
    }
}
