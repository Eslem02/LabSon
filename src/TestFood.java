public class TestFood {
    public static void main(String[] args){
        MainDish m1=new MainDish("Kebap",150.0,false);
        Desert d1=new Desert("Sütlaç",50,true);
        Drink dr=new Drink("Tea",20.0,false);

        m1.describe();
        d1.describe();
        dr.describe();


    }
}
