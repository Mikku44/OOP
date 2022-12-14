import java.util.ArrayList;
import java.util.Date;

public class Receipt {
    // กำหนดคุณสมบัติ
    private Date dateOrder;
    private String userName ="Anonymous";
    private ArrayList<String> orderMenu = new ArrayList<String>();
    private int amountMenu = 0;
    private int total = 0;

    // Method สำหรับ วันที่สั่งซื้อ
    public void setdateOrder() {
        this.dateOrder = new Date();
    }

    // Method สำหรับ ชื่อผู้สั่ง
    public void setuserName(String userName) {
        this.userName = userName;
    }

    // Method สำหรับ รายการที่สั่ง
    public void setorderMenu(String[] orderMenu) {
        for (int i = 0; i < orderMenu.length; i += 1) {
            this.orderMenu.add(orderMenu[i]);
        }
    }

    // Method สำหรับ จำนวนเมนูทั้งหมด
    public void setamountMenu(int amountMenu) {
        this.amountMenu = this.amountMenu + amountMenu;
    }

    // Method สำหรับ ผลรวม
    public void settotal(int price, int amount) {
        this.total = total + price * amount;
    }

    // Method สำหรับ ลบเมฯู
    public void clearOrder() {
        this.orderMenu.clear();
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Method สำหรับไว้ให้เรียกดู วันที่สั่งซื้อ
    public Date getdateOrder() {
        return this.dateOrder;
    }

    // Method สำหรับไว้ให้เรียกดู ชื่อผู้สั่ง
    public String getuserName() {
        return this.userName;
    }

    // Method สำหรับไว้ให้เรียกดู รายการที่สั่ง
    public ArrayList<String> getorderMenu() {
        return this.orderMenu;
    }

    // Method สำหรับไว้ให้เรียกดูเส้น จำนวนเมนูทั้งหมด
    public int getamountMenu() {
        return this.amountMenu;
    }

    // Method สำหรับไว้ให้เรียกดู ผลรวม
    public int gettotal() {
        return this.total;
    }

}
