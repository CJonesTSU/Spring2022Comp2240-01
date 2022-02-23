class StringBuilderVStringAppend {
  public static void main(String[] args){            
    String test1 = "";
    String test2;
    StringBuilder sBuilder = new StringBuilder();
    double concatTime = 0;
    double sBTime = 0;

    // spacing
    System.out.println("\n\n");

    double startTime = System.nanoTime();
    test1 += "a";
    double endTime = System.nanoTime();
    concatTime = endTime - startTime;
    System.out.println("Single character string concatenation took "+ concatTime + " ns");


    startTime = System.nanoTime();
    sBuilder.append("a");
    endTime = System.nanoTime();
    concatTime = endTime - startTime;
    System.out.println("Single character StringBuilder append took "+ concatTime + " ns");

    test1 = "";
    startTime = System.nanoTime();
    for(int i = 0; i < 1000; i++){
      test1 += "a";
    }
    endTime = System.nanoTime();
    concatTime = endTime - startTime;
    System.out.println("1000 character string concatenation took "+ concatTime + " ns");

    sBuilder.setLength(0);
    startTime = System.nanoTime();
    for(int i = 0; i < 1000; i++){
      sBuilder.append("a");
    }

    endTime = System.nanoTime();
    concatTime = endTime - startTime;
    System.out.println("1000 character StringBuilder append took "+ concatTime + " ns");




    test1 = "";
    startTime = System.nanoTime();
    for(int i = 0; i < 100000; i++){
      test1 += "a";
    }
    endTime = System.nanoTime();
    concatTime = endTime - startTime;
    System.out.println("100000 character string concatenation took "+ concatTime + " ns");


    sBuilder.setLength(0);
    startTime = System.nanoTime();
    for(int i = 0; i < 100000; i++){
      sBuilder.append("a");
    }

    endTime = System.nanoTime();
    concatTime = endTime - startTime;
    System.out.println("100000 character StringBuilder append took "+ concatTime + " ns");



    test1 = "";
    startTime = System.nanoTime();
    for(int i = 0; i < 1000000; i++){
      test1 += "a";
    }
    endTime = System.nanoTime();
    concatTime = endTime - startTime;
    System.out.println("1000000 character string concatenation took "+ concatTime + " ns");


    sBuilder.setLength(0);
    startTime = System.nanoTime();
    for(int i = 0; i < 1000000; i++){
      sBuilder.append("a");
    }

    endTime = System.nanoTime();
    concatTime = endTime - startTime;
    System.out.println("1000000 character StringBuilder append took "+ concatTime + " ns");

//     double startTime = System.nanoTime();
//     test1 += "a";
//     double endTime = System.nanoTime();
//     concatTime = endTime - startTime;
//     System.out.println("Single character string concatenation took "+ concatTime + " ns");


//     startTime = System.nanoTime();
//     sBuilder.append("a");
//     test2 = sBuilder.toString();
//     endTime = System.nanoTime();
//     sBTime = endTime - startTime;
//     System.out.println("Single character string append to StringBuilder took "+ sBTime + " ns");
//     System.out.println("SB took " + (sBTime/concatTime)*100
//       + "% as long as String append");

//     // reset all vars
//     test1 ="";
//     test2 = "";
//     sBuilder.setLength(0);

//     // spacing
//     System.out.println("\n\n");

//     // do it 100 times
//     startTime = System.nanoTime();
//     for(int i = 0; i < 100; i++){
//       test1 += "a";
//     }
//     endTime = System.nanoTime();
//     concatTime = endTime - startTime;
//     System.out.println("100 String concatenations took "+ concatTime + " ns");

//     startTime = System.nanoTime();
//     for(int i = 0; i < 100; i++){
//       sBuilder.append("a");
//     }
//     test2 = sBuilder.toString();
//     endTime = System.nanoTime();
//     sBTime = endTime - startTime;
//     System.out.println("100 StringBuilder appends took "+ sBTime + " ns");
//     System.out.println("SB took " + (sBTime/concatTime)*100
//       + "% as long as String append");
  
//     // reset all vars
//     test1 = "";
//     test2 = "";
//     sBuilder.setLength(0);

//     // spacing
//     System.out.println("\n\n");

//     // do it 1000 times
//     startTime = System.nanoTime();
//     for(int i = 0; i < 1000; i++){
//       test1 += "a";
//     }
//     endTime = System.nanoTime();
//     concatTime = endTime - startTime;
//     System.out.println("1000 String concatenations took "+ concatTime + " ns");

//     startTime = System.nanoTime();
//     for(int i = 0; i < 1000; i++){
//       sBuilder.append("a");
//     }
//     test2 = sBuilder.toString();
//     endTime = System.nanoTime();
//     sBTime = endTime - startTime;
//     System.out.println("1000 StringBuilder appends took "+ sBTime + " ns");
//     System.out.println("SB took " + (sBTime/concatTime)*100
//       + "% as long as String append");

//    // reset all vars
//     test1 = "";
//     test2 = "";
//     sBuilder.setLength(0);

//     // spacing
//     System.out.println("\n\n");

//     // do it 10000 times
//     startTime = System.nanoTime();
//     for(int i = 0; i < 10000; i++){
//       test1 += "a";
//     }
//     endTime = System.nanoTime();
//     concatTime = endTime - startTime;
//     System.out.println("10000 String concatenations took "+ concatTime + " ns");

//     startTime = System.nanoTime();
//     for(int i = 0; i < 10000; i++){
//       sBuilder.append("a");
//     }
//     test2 = sBuilder.toString();
//     endTime = System.nanoTime();
//     sBTime = endTime - startTime;
//     System.out.println("10000 StringBuilder appends took "+ sBTime + " ns");
//     System.out.println("SB took " + (sBTime/concatTime)*100
//       + "% as long as String append");





//    // reset all vars
//     test1 = "";
//     test2 = "";
//     sBuilder.setLength(0);

//     // spacing
//     System.out.println("\n\n");

//     // do it 10000 times
//     startTime = System.nanoTime();
//     for(int i = 0; i < 100000; i++){
//       test1 += "a";
//     }
//     endTime = System.nanoTime();
//     concatTime = endTime - startTime;
//     System.out.println("100000 String concatenations took "+ concatTime + " ns");

//     startTime = System.nanoTime();
//     for(int i = 0; i < 100000; i++){
//       sBuilder.append("a");
//     }
//     test2 = sBuilder.toString();
//     endTime = System.nanoTime();
//     sBTime = endTime - startTime;
//     System.out.println("100000 StringBuilder appends took "+ sBTime + " ns");
//     System.out.println("SB took " + (sBTime/concatTime)*100
//       + "% as long as String append");
// /*
//       // reset all vars
//     test1 = "";
//     test2 = "";
//     sBuilder.setLength(0);

//     // spacing
//     System.out.println("\n\n");

//     // do it 100000 times
//     startTime = System.currentTimeMillis();
//     for(int i = 0; i < 100000; i++){
//       test1 += "a";
//     }
//     endTime = System.currentTimeMillis();
//     concatTime = endTime - startTime;
//     System.out.println("100000 String appends took "+ appendTime + " ns");

//     startTime = System.currentTimeMillis();
//     for(int i = 0; i < 100000; i++){
//       sBuilder.append("a");
//     }
//     test2 = sBuilder.toString();
//     endTime = System.currentTimeMillis();
//     sBTime = endTime - startTime;
//     System.out.println("100000 StringBuilder appends took "+ sBTime + " ns");
//     System.out.println("SB took " + (sBTime/appendTime)*100
//       + "% as long as String append");
//   */
//   // System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
  }
}