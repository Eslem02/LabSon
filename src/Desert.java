public class Desert extends Food  {
    private boolean containSugar;

    public Desert(String name,double price,boolean containSugar) {
        super(name, price);
        this.containSugar=containSugar;
    }
    public void describe(){
        System.out.print("Dessert: "+getInfo());
        if(containSugar){
            System.out.println("(with sugar)");
        }else{
            System.out.println("(sugar free)");
        }
    }
}
