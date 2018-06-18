package org.zn.user.entity;

public class guitarSpec {


    private String builder;

    private String style;

    private String  type;

    private String wood;

    private Integer serialNumber;


    private Integer id;

    private Integer price;


    public guitarSpec(){};


    public guitarSpec( Integer id, Integer price,String builder, String  style, String  type, String wood, Integer serialNumber){

        super();
        this.id = id;
        this.price = price;
        this.builder = builder;
        this.style = style;
        this.type = type;
        this.wood = wood;
        this.serialNumber = serialNumber;

    }



    public String getBuilder() {

        return builder;

    }



    public void setBuilder(String builder) {

        this.builder = builder;

    }



    public String getStyle() {

        return style;

    }



    public void setStyle(String model) {

        this.style = model;

    }



    public String getType() {

        return type;

    }



    public void setType(String type) {

        this.type = type;

    }



    public String getWood() {

        return wood;

    }



    public void setWood(String backWood) {

        this.wood = backWood;

    }



    public Integer getSerialNumber() {

        return serialNumber;

    }



    public void setSerialNumber(Integer serialNumber) {

        this.serialNumber = serialNumber;

    }

    public void setPrice(Integer price){
        this.price = price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId(){
        return  id;
    }
    public Integer getPrice(){
        return  price;
    }



}
