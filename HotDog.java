////@author eorichar
////@version 1.0
/// this is my hotdog code for cs1121 Problem4


public class HotDog {
   // returns the number of combinations

   float basePrice = 0.99f;

   public Topping toppings[];
   
   ////@param none
   /// @return none
   /// this only stands to initialize all the topping objects
   HotDog() {
      
      toppings = new Topping[7];

      toppings[0] = new Topping("Ketchup",          0.15);
      toppings[1] = new Topping("Mustard",          0.17);
      toppings[2] = new Topping("Chopped Onions",   0.20);
      toppings[3] = new Topping("Tomato Wedge",     0.25);
      toppings[4] = new Topping("Sweet Relish",     0.30);
      toppings[5] = new Topping("Sport Peppers",    0.35);
      toppings[6] = new Topping("Suerkraut",        0.45);
   }
   
   ////@param none
   /// @return Prints the entire menu via system.out.print, returns 128
   /// @info each topping is represented as one of the bits used to makeup to i variable
   /// for each iteration of i, all toppings are compared to the current bits set within 
   /// int i, each topping found to be set is added to the cost and output string
   public long printMenu() {
      // YOUR CODE HERE
      for (int i = 0; i<128; i++) { //128 from 2^7, 7 toppings
         String output = i + " Dog in Bun";
         double cost = basePrice;

         for(int j = 0; j < 7; j++) {  //7 toppings so 7 bits to check
            if ((i & (1 << j)) != 0) { //check each bit for existing, bits 0-6 correspond to toppings
               output = output + " with " + toppings[j].printedName; //append to existing output string
               cost = cost + toppings[j].price; //append to price
            }
         }
         System.out.printf("%-150s $%.2f\n", output, cost);//use %(negative spaces)s to left align and pad for prices to show up on the right side
         //System.out.printf("%.2f\n", cost);
      }
      return 128;
   }
   
   //from given code, just runs above code
   public static void main( String [ ] args ) {
      HotDog obj = new HotDog( );
      long count = obj.printMenu( );
      assert count == 128;
   }
} 
