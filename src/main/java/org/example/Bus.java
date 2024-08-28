package org.example;

public class Bus implements Vehicle{
    public DiscountService discountService;
    public String brandName;
    public double price;

    public String getBrandName() {
        return brandName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setDiscountService(DiscountService discountService) {
        this.discountService = discountService;
    }
    public Bus(){

    }

    public Bus(DiscountService discountService){
        this.discountService=discountService;
    }
    public String getMileage(){
        return "50kmpl";
    }
    public String getDiscountMessage(){
        return this.discountService.getDiscountMessage();
    }
}
