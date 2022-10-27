public class Noodle {
    private String noodles;
    private boolean cathchup;
    private String soup;
    private String typeOfMeat;
    private int amount;
    private int price;

    public void setNoodle(String noodles,boolean cathchup,String soup,String typeOfMeat,int amount,int price) {
        this.noodles = noodles;
        this.cathchup = cathchup;
        this.soup = soup;
        this.typeOfMeat = typeOfMeat;
        this.amount = amount;
        this.price = price;
    }
    public String[] getNoodle() {
        
        System.out.println(this.noodles);
        System.out.println(this.soup);
        System.out.println(this.typeOfMeat);
        System.out.println(this.cathchup);
        System.out.println(this.amount);
        System.out.println(this.price);

        String[] menu = {this.noodles,Boolean.toString(this.cathchup),this.soup,this.typeOfMeat,Integer.toString(this.amount),Integer.toString(this.price)};
        return menu;
    }

}
