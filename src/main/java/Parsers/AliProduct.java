package Parsers;

public class AliProduct {
    private String productUrl;
    private String imageUrl;
    private String title;
    private String price;

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "AliProduct{" +
                "productUrl='" + productUrl + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
