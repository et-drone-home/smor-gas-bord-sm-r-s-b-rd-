public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;


    private int priceCode;
    private String movieStatment;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;

    }

    public int getPriceCode() {
        return priceCode;
    }

    public String getTitle() {
        return title;
    }

    public double getMovieCost(int daysRented) {
        double thisAmount = 0;
        // determines the amount for rental line
        switch (getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (daysRented > 2)
                    thisAmount += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (daysRented > 3)
                    thisAmount += (daysRented - 3) * 1.5;
                break;
        }
        return thisAmount;
    }

}