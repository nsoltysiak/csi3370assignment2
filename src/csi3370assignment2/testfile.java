package csi3370assignment2;


         
        for (int i = 99; i > 2; i--)
        {     
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer");
            System.out.println("take one down, pass it around, " + (i - 1) + " bottles of beer on the wall.");
            System.out.println();
        }
        
        for (int i = 2; i > 1; i--)
        {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer");
            System.out.println("take one down, pass it around, " + (i - 1) + " bottle of beer on the wall.");
            System.out.println();
        }
        
        for (int i = 1; i > 0; i--)
        {
            System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer");
            System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
            System.out.println();
        }
    }