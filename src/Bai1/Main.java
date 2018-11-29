package Bai1;


public class Main {
    public static void main(String args[]){
        Person dad1 = new Parent("Nguyen Van A",20,new Date(1,05,1999),true);
        Person mom1 = new Parent("Le Thi B",20, new Date(02,05,1997),false);
        Person dad2 = new Parent("Luffy", 50, new Date(16,8, 1997), true);
        Person mom2 = new Parent("Rozo", 48, new Date(2,7,1996), false);
        Person child0 = new Children("Sanji",20,new Date(17,9,1996),false);
        Person child1 = new Children("Nguyen Van Long", 3, new Date(1,1,2020), true);
        Person child2 = new Children("Nguyen Duy", 2, new Date(4,2,2025), false);
        GenealogyManagement gm = new GenealogyManagement();
        /**
         *          dad2 married mom2
         *          - dad1(married mom1), child0
         *            child1,child2
         *
         */
        Person root = dad2;
        dad2.setMarried(mom2);
        dad2.addChild(dad1);
        dad2.addChild(child0);
        dad1.setMarried(mom1);
        dad1.addChild(child1);
        dad1.addChild(child2);

        //get person information
        System.out.println("Test person get information");
        System.out.println(dad1.getInformation());
        System.out.println();

        //Test get single person
        System.out.println("Test get single person");
        gm.findSingle(root);
        System.out.println("\n");

        //Test find 2 children couple
        System.out.println("Test find 2 children couple");
        gm.find2Children(root);
        System.out.println();

        //Test find new generation
        System.out.println("Test find new generation");
        gm.findNewGeneration(root);
        System.out.println();
    }
}
