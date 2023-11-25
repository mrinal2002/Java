enum Dept{
    CS,IT,CIVIL,ECE
}
public class WrapperClassEnum {
    public static void main(String[] args) {
        Dept d=Dept.CIVIL;
        switch(d){
            case CS:
            System.out.println("cs block ");
            break;
            case IT:
            System.out.println("it block ");
            break;
            case CIVIL:
            System.out.println("civil block ");
            break;
            case ECE:
            System.out.println("ece block ");
            break;
        }
    }
}
