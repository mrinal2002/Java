class HondaCity{
    static long price=20;
    int a,b;

    // static double onRoadPrice(String city){
    //     switch(city){
    //         case "delhi":
    //         return price+price*0.1;
    //         case "mumbai":
    //         return price+price*0.09;
    //     }
    // }
}
public class StaticMethods {
    public static void main(String args[]){
        HondaCity h1=new HondaCity();
        //double d=h1.onRoadPrice("delhi");
        System.out.println(h1.price);
        System.out.println(HondaCity.price);
    }
}
