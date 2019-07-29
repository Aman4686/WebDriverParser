package Parsers;

public class AliProduct {
    private String productUrl;
    private String imageUrl;
    private String title;
    private String price;

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "productUrl= " + productUrl +
                "; imageUrl= " + imageUrl +
                "; title= " + title +
                "; price= " + price;
    }
}
