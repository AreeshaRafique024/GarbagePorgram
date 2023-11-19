import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        ProgramDocumentation d = new ProgramDocumentation();

        d.writeToFile("GarbageCollectorProgram.txt", "This Program is explaining the job of garbage collector , firstly they came to collect the garbage from our home that contain either useful products that can recycle and non recycleable products. He separate the recycleable products from non recycleable products and then sell those waste products like plastic , steel , etc to factory ,where they reuse these products to form new prodcuts and by selling these he get amount and side by side he also get monthly pay from each house . In this way he not only get profitable amount but also make our surrounding clean and envirnonment friendly");
        d.readToFile("GarbageCollectorProgram.txt");


        WasteCategory w1 = new WasteCategory(RecycleAble_Waste.CLOTHES, 5, NonRecycleAble_Waste.LIQUID_PRODUCTS);
        WasteCategory w2 = new WasteCategory(RecycleAble_Waste.LEATHER, 10, NonRecycleAble_Waste.ROTTEN_FOOD);
        WasteCategory w3 = new WasteCategory(RecycleAble_Waste.PAPER, 20, NonRecycleAble_Waste.PLANTS);

        //ArrayList<House>houses=new ArrayList<>();

        House h1 = new House("ali", "120 sabzazar", w1);
        House h2 = new House("ali", "120 sabzazar", w2);
        House h3 = new House("ali", "120 sabzazar", w1);
        House h4 = new House("ali", "120 sabzazar", w2);
        House h5 = new House("ali", "120 sabzazar", w1);

        //ArrayList<WasteCollector> person = new ArrayList<>();
        WasteCollector[] wasteCollectors = new WasteCollector[5];
        WasteCollector p1 = new WasteCollector("ALi", 200, "122", 500, h1);
        WasteCollector p2 = new WasteCollector("hamza", 200, "123r", 500, h2);
        WasteCollector p3 = new WasteCollector("hamza", 200, "123r", 500, h2);
        WasteCollector p4 = new WasteCollector("hamza", 200, "123r", 500, h2);
        WasteCollector p5 = new WasteCollector("hamza", 200, "123r", 500, h2);


        wasteCollectors[0] = p1;
        wasteCollectors[1] = p2;
        wasteCollectors[2] = p3;
        wasteCollectors[3] = p4;
        wasteCollectors[4] = p5;
        //person.add(p1);
        //person.add(p2);
        //person.add(p3);
        //person.add(p4);
        //person.add(p5);


        // System.out.println(person);
        System.out.println();
        GarbageSellingPoint seller = new GarbageSellingPoint();

        seller.separation_of_RecycleAbleWaste(wasteCollectors);

        seller.display();
            //System.out.println(person);
        seller.total_monthly_income(wasteCollectors);

        }
    }