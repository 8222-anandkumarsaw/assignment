package org.example;

public class Car implements Vehicle{
    public DiscountService discountService;
    public String brandName;
    public double price;

    public void setDiscountService(DiscountService discountService) {
        this.discountService = discountService;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Car(){

    }

    public Car(DiscountService discountService){
        this.discountService=discountService;
    }
    public String getMileage(){
        return "20";
    }

    @Override
    public String getDiscountMessage() {
        return this.discountService.getDiscountMessage();
    }



}
