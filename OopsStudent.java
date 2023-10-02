class Student{
    public String name;
    public int roll;
    public int m1,m2,m3;

    public int totoal(){
        return m1+m2+m3;
    }
    public float average(){
        return (float)totoal()/3;
    }

    public char grade(){
        if(average()>=90){
            return 'A';
        }
        else if(average()>=89 && average()<50){
            return 'B';
        }
        else{
            return 'C';
        }
    }
    public String details(){
            return "Roll : "+roll+" Name : "+name+" Total : "+totoal()+" Grade : "+grade();
        }
}
public class OopsStudent {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Mrinal Patra";
        s1.roll=1126;
        s1.m1=98;
        s1.m2=87;
        s1.m3=94;
        System.out.println(s1.details());
    }
}
