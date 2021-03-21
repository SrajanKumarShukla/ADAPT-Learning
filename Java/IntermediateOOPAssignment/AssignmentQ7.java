// Q7. Develop an application for Dessert shop. The application should allow owner to add items like Candy, Cookie or 
// Ice Cream in the shop storage. Also customers should be able to place an order.
// DessertItem is an abstract class having an abstract method getCost(). Every dessert item has tax associated. 
// Candy item is sold in dollar currency, Cookie in Euro currency & Ice Cream in Rupees currency. The sub classes are 
// supposed to override these methods. When we run the application, it should ask us our role i.e. owner or customer. 
// If role is owner, we should be able to add dessert items in our storage. If role is customer, then we should be able 
// to place an order. The currency conversion rates are:
// 1 dollar = 60 rupees.
// 1 euro = 70 rupees.
package Java.IntermediateOOPAssignment;
class AssignmentQ7 {

    public static void main(String[] args) {}
    private void selectRoles(){

    }
    private void roles(String role){

    }
    private void addItems() {

    }
    private void addItemsOperation(int choice) {}
    private void placeOrder() {}
    private void placeOrderOperation(int choice) {}
}

abstract class DesertItem {
    abstract public int getCost();
}
class Candy extends DesertItem{
    private int candies = 0;
    public int addCandies(int candies){
        this.candies +=candies;
        return this.candies;
    }

    @Override
    public int getCost() {
        return candies*60;
    }
}
class Cookie extends DesertItem{
    private int cookies=0;

    public int addCookies(int candies){
        this.cookies += candies;
        return cookies;
    }

    @Override
    public int getCost() {
        return cookies*70;
    }
}

class IceCream extends DesertItem{
    private int iceCreams=0;

    public int addIceCreams(int candies){
        this.iceCreams += candies;
        return iceCreams;
    }

    @Override
    public int getCost() {
        return iceCreams;
    }
}
