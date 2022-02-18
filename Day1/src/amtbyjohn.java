
public class amtbyjohn {
      public static void main(String args[]) 
      {
    	 int priceofpencil = 5;
    	 int priceofpen = 10;
    	 int priceofbook = 50;
    	 int pencilbought = 2;
    	 int penbought = 6;
    	 int bookbought = 1;
    	 int pencilboughtprice = (priceofpencil * pencilbought);
    	 
    	 int penboughtprice = (priceofpen * penbought);
    	 int bookboughtprice = (priceofbook * bookbought);
    	 int total = (pencilboughtprice + penboughtprice + bookboughtprice);
    	
    	 double descamt = (total * 0.1);
    	 
    	 double taxamt = (total*0.05);
    	 
    	 double totalamtbyjohn = ((total - descamt) + taxamt);
    	 System.out.println(totalamtbyjohn);
      }
}
