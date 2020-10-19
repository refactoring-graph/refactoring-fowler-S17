import java.util.Enumeration;
public class HtmlStatement extends Statement {

  public String rentalCustomer(Customer aCustomer) {
    return "<H1>Rentals for <EM>" + aCustomer.getName() +
      "</EM></H1><P>\n";
  }
  
  public String rentalFigures(Rental each) {
    return each.getMovie().getTitle()+ ": " +
         String.valueOf(each.getCharge()) + "<BR>\n";
  }

  public String rentalFooter(Customer aCustomer){
    String result = "<P>You owe <EM>" +
      String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
      result += "On this rental you earned <EM>" + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      "</EM> frequent renter points<P>";
    return result;
  }
}