import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 
 */
public class Cart {
    List<String> itemName;
    List<Integer> itemPrice;

    public Cart(){
        itemName = new ArrayList<String>();
        itemPrice = new ArrayList<Integer>();
    }

    public void addItem(String item, int price, int quantity){
        for (int i =0; i<quantity; i++){
            itemName.add(item);
            itemPrice.add(price);
        }
    }
    
    public void placeOder(){
        int quantity = 1;
        for (int i = 0; i< itemName.size(); i++){
            if(i != itemName.size()-1) {
                if (itemName.get(i).equals(itemName.get(i + 1))) {
                    quantity++;
                }
                else{
                    System.out.println("Quantity: " + quantity + "\t" + "Item: " + itemName.get(i) + "\t" + "Price: " + quantity* itemPrice.get(i));
                    quantity  = 1;
                }
            }
            else{
                System.out.println("Quantity: " + quantity + "\t" + "Item: " + itemName.get(i) + "\t" + "Price: " + quantity* itemPrice.get(i));
                quantity  = 1;
            }
        }
        int totalprice = 0;
        for (int i = 0; i<itemPrice.size(); i++){
            totalprice = totalprice + itemPrice.get(i);
        }
        System.out.println("Total Item: " + itemPrice.size() + "\t " +"Total Price: " + totalprice);
    }
    public void editOrder() {
        System.out.println("0) Exit");
        for (int i = 0; i < itemName.size(); i++) {
            System.out.println((i + 1) + ") " + itemName.get(i) + " " + itemPrice.get(i));
        }
        System.out.print("Which item do youu want to remove? Enter Option: ");
        Scanner s3 = new Scanner(System.in);
        int inp = s3.nextInt();
        if (inp != 0) {
            itemName.remove(inp - 1);
            itemPrice.remove(inp - 1);
            placeOder();
            System.out.println("Cart Updated");
        }
        else{
        System.out.println("Cart Updated");
    }
    }
}
