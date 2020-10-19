import java.util.Enumeration;

public abstract class Statement {

  public abstract String rentalCustomer(Customer aCustomer);
  public abstract String rentalFigures(Rental each);
  public abstract String rentalFooter(Customer aCustomer);

  public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = rentalCustomer(aCustomer);
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for this rental
         result += rentalFigures(each);
      }
      //add footer lines
      result += rentalFooter(aCustomer);
      return result;
  }
}