package tapan;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Perform {
	public static void main( String[] args ) throws IOException {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Welcome to  the Epam task  of Design Patterns: ");
            System.out.println("PRess 1 to implement Decorator  Pattern: ");
            System.out.println("Press 2 to implement Facade pattern: ");
            System.out.println("Press 3 to implement Factory method: ");
            System.out.println("Press 4 to implement Protoype method: ");
            System.out.println("Press 5 to  implement Temeplate method: ");
            System.out.println("Enter your choice = ");
            int ch = sc.nextInt();
            switch (ch){
                case 1: {
                    int c;
                    do{
                        System.out.print("========= Food Menu ============ \n");
                        System.out.print("            1. Vegetarian Food.   \n");
                        System.out.print("            2. Non-Vegetarian Food.\n");
                        System.out.print("            3. Chineese Food.         \n");
                        System.out.print("            4. Exit                        \n");
                        System.out.print("Enter your choice: ");
                        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                        c=Integer.parseInt(br.readLine());
                        switch (c) {
                            case 1:{
                                VegFood vf=new VegFood();
                                System.out.println(vf.prepareFood());
                                System.out.println( vf.foodPrice());
                            }
                            break;
                            case 2:{
                                Food f1=new NonVegFood((Food) new VegFood());
                                System.out.println(f1.prepareFood());
                                System.out.println( f1.foodPrice());
                            }
                            break;
                            case 3:{
                                Food f2=new ChineeseFood((Food) new VegFood());
                                System.out.println(f2.prepareFood());
                                System.out.println( f2.foodPrice());
                            }
                            break;

                            default:{
                                System.out.println("Other than these no food available");
                            }
                            return;
                        }
                        System.out.println("Press 4 to exitt");
                        c = sc.nextInt();
                    }while(c!=4);
                }
                    break;
                case 2:{
                    int c;
                    do{
                        System.out.print("========= Mobile Shop ============ \n");
                        System.out.print("            1. IPHONE.              \n");
                        System.out.print("            2. SAMSUNG.              \n");
                        System.out.print("            3. BLACKBERRY.            \n");
                        System.out.print("            4. Exit.                     \n");
                        System.out.print("Enter your choice: ");

                        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                        c=Integer.parseInt(br.readLine());
                        ShopKeeper sk=new ShopKeeper();
                        switch (c) {
                            case 1:
                            {
                                sk.iphoneSale();
                            }
                            break;
                            case 2:
                            {
                                sk.samsungSale();
                            }
                            break;
                            case 3:
                            {
                                sk.blackberrySale();
                            }
                            break;
                            default:
                            {
                                System.out.println("Nothing You purchased");
                            }
                            return;
                        }
                        System.out.println("Press 4 to exitt");
                        c = sc.nextInt();
                    }while(c!=4);
                }
                    break;
                case 3:{
                    Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
                    Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
                    System.out.println("Factory PC Config::"+pc);
                    System.out.println("Factory Server Config::"+server);
                }
                    break;
                case 4:{
                    BundledShapeCache cache = new BundledShapeCache();
                    Shape shape1 = cache.get("Big green circle");
                    Shape shape2 = cache.get("Medium blue rectangle");
                    Shape shape3 = cache.get("Medium blue rectangle");
                    if (shape1 != shape2 && !shape1.equals(shape2)) {
                        System.out.println("Big green circle != Medium blue rectangle (yay!)");
                    } else {
                        System.out.println("Big green circle == Medium blue rectangle (booo!)");
                    }
                    if (shape2 != shape3) {
                        System.out.println("Medium blue rectangles are two different objects (yay!)");
                        if (shape2.equals(shape3)) {
                            System.out.println("And they are identical (yay!)");
                        } else {
                            System.out.println("But they are not identical (booo!)");
                        }
                    } else {
                        System.out.println("Rectangle objects are the same (booo!)");
                    }
                }
                    break;
                case 5:{
                    OrderProcessTemplate netOrder = new NetOrder();
                    netOrder.processOrder(true);
                    System.out.println();
                    OrderProcessTemplate storeOrder = new StoreOrder();
                    storeOrder.processOrder(true);
                }
                    break;
                default:System.out.println("Wrong Choice ");
            }
            System.out.println("Press 0  to  exit");
            choice = sc.nextInt();
        }while(choice!=0);
    }
}



