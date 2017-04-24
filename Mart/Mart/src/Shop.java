import java.util.List;
import java.util.Scanner;

/**
 
 */
public class Shop {
    String[] items = new String[]{"Rice","Sugar","Cooking Oil","Lentils","Spice","Cream","Detergents","HandWash","Shampoo","Soap","Edit Cart","Place Order"};

    public void displayItems(){
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + "- " + items[i]);
        }
        System.out.println("--------------------------------------------");
    }

    List<GroosryItems> list;
    Cart cart = new Cart();

    public Boolean shopping(String input){
        if(input.equals("1")){
            fRice obj = new fRice();
            list = obj.Rice;

            repeatedWork(list);
            return false;
        }
        else if(input.equals("2")){
            fSugar obj = new fSugar();
            list = obj.Sugar;

            repeatedWork(list);
            return false;
        }
        else if(input.equals("3")){
            fCookingOil obj = new fCookingOil();
            list = obj.CookingOil;

            repeatedWork(list);
            return false;
        }
        else if(input.equals("4")){
            fLentil obj = new fLentil();
            list = obj.Lentils;

            repeatedWork(list);
            return false;
        }
        else if(input.equals("5")){
            fSpice obj = new fSpice();
            list = obj.Spice;

            repeatedWork(list);
            return false;
        }
        else if(input.equals("6")){
            fCream obj = new fCream();
            list = obj.Cream;

            repeatedWork(list);
            return false;
        }
        else if(input.equals("7")){
            fDetergen obj = new fDetergen();
            list = obj.Detergen;

            repeatedWork(list);
            return false;
        }
        else if(input.equals("8")){
            fHandWash obj = new fHandWash();
            list = obj.HandWash;

            repeatedWork(list);
            return false;
        }
        else if(input.equals("9")){
            fShampoo obj = new fShampoo();
            list = obj.Shampoo;

            repeatedWork(list);
            return false;
        }
        else if(input.equals("10")){
            fSoap obj = new fSoap();
            list = obj.Soap;

            repeatedWork(list);
            return false;
        }
        else if(input.equals("11")){
            cart.editOrder();
            System.out.println("x" +
                    "x~~~~~~~~~~~~~~~~~~~~~~~~xx~~~~~~~~~~~~~~~~~~~~~~~x" + "\n");
            return false;
        }
        else if(input.equals("12")){
            cart.placeOder();
            System.out.println("x~~~~~~~~~~~~~~~~~~~~~~~~xx~~~~~~~~~~~~~~~~~~~~~~~x" + "\n");
            return true;
        }
        else {
            System.out.println("Wrong option");
            System.out.println("x~~~~~~~~~~~~~~~~~~~~~~~~xx~~~~~~~~~~~~~~~~~~~~~~~x" + "\n");
            return false;
        }
    }

    public void repeatedWork(List<GroosryItems> list){
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        for(GroosryItems i : list){
            System.out.println(count + "- " + i.ItemName());
            count++;
        }

        System.out.println("Enter Option: ");
        int selected = scanner.nextInt();
        System.out.println("Enter Quantity: ");
        int quantity = scanner.nextInt();

        if(quantity <= 0){
            quantity = 1;
        }
        cart.addItem(list.get(selected-1).ItemName(), list.get(selected-1).ItemPrice(),quantity);
        System.out.println("Item Added to Cart");
        System.out.println("x~~~~~~~~~~~~~~~~~~~~~~~~xx~~~~~~~~~~~~~~~~~~~~~~~x" + "\n");
    }
}
