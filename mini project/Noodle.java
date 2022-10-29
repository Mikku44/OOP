public class Noodle {
    //ประกาศตัวแปร 
    // Attribute
    private String noodles ;
    private boolean cathchup;
    private String soup;
    private String typeOfMeat;
    private int amount;
    private int price;

    //  method
    // ในวงเว็บคือพารามิเตอร์ ค่า ที่จะกำหนด
    // setNoodle("เส้นใหญ่");
    // set เป็น method ในการกำหนดตัวแปร 
    public void setNoodle(String noodles) {
        this.noodles = noodles;
    }
    public void setSoup(String soup){
        this.soup = soup;
    }
    public void setTypeOfMeat(String typeOfMeat){
        this.typeOfMeat = typeOfMeat;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setCathchup(boolean cathchup){
        this.cathchup = cathchup;
    }

    // Method ในการส่งค่า หรือ แสดงค่า
    // getNoodles();
    //? "เส้นใหญ่"
    // System.out.println(getNoodles());
    public String getNoodles(){
        return this.noodles;
    }

    public String getSoup(){
        return this.soup;
    }

    public String getTypeOfMeat(){
        return this.typeOfMeat;
    }

    public boolean getCathchup(){
        return this.cathchup;
    }

    public int getAmount(){
        return this.amount;
    }

    public int getPrice(){
        return this.price;
    }


}
