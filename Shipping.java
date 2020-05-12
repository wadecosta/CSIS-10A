  class Shipping {

  //  add your shippingCost method here
  public static void shippingCost (int weight, int size) {
      double cost;
          
      if (weight < 8)
      {
          cost = 5.5;
      }
      else if (weight < 16)
      {
          cost = 8.5;
      }
      else if (weight < 32)
      {
          cost = 12.0;
      }
      else
      {
          cost = weight/2.0;
      }
      
      if (size > 12 & size < 24)
      {
          cost = cost + 2.0;
      }
      else if (size >= 24)
      {
          cost = cost + Math.pow(size,0.3333);
      }
      System.out.print("weight = " + weight + ", size " + size + ", cost = ");
      System.out.printf(" $%1.2f\n", cost);
  }



  public static void main (String[] args) {
      shippingCost(8, 20);
      shippingCost(4, 27);
      shippingCost(20, 6); 
      shippingCost(32, 5);
      shippingCost(40, 30);
      
  }
}
