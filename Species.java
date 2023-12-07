class species{
int age;
    species(){
        this.age=13;
    }
    species(int age){
        this.age=age;
    }
}
class human extends species{
    String name;
    human(String name){
        super(13);
        this.name=name;
    }
}

class animals extends species{
    String type;
    animals(String type){
        super(13);
        this.type=type;
    }
}

public class Species{
    public static void main(String[] args){
        human h1=new human("mrinal");
        System.out.println(h1.name);
    }
}