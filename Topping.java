////@author eorichar
/// @version 1.0
/// this is a helper file to create Topping objects


public class Topping {
    public String printedName = "";
    public double price = 0;

    ////@param send this the name to be printed and the price of the topping
    /// @return no returns, public access to printedName and price
    Topping(String printedName, double price) {
        this.printedName = printedName;
        this.price = price;
    }
}
