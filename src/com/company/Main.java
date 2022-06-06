package com.company;

public class Main {

    public static void main(String[] args) {
    clothes []clothes = {
            new Pants(Size.XXS,"зеленый", 3000),
            new Skirt(Size.S, "жёлтый", 2500),
            new Tie(Size.L, "чёрный", 499),
            new TeeShirt(Size.M, "фиолетовый", 999),
            new Pants(Size.XS, "розовый", 600),
    };
    for (int i = 0; i < clothes.length; i++){
        System.out.println(clothes[i].size);
        System.out.println(clothes[i].color);
        System.out.println(clothes[i].cost);
        System.out.println(" ");
    }
    }
}
enum Size{
    XXS(40){
        @Override
        public String getDescription(){
            return "Детский размер";
        }
    },
    XS(38),
    S(36),
    M(34),
    L(32);
    Size(int euroSize){
        EuroSize = euroSize;
    }
    public String getDescription(){
        return "Взрослый размер";
    }
    @Override
    public String toString(){
        return name() + "(" + EuroSize + ")" + getDescription();
    }
    private int EuroSize;
}
interface mensClothing{
    static void dressMens(){
        System.out.println("Одеваем мужчину");
    }
}
interface womenClothing{
    static void dressWomen(){
        System.out.println("Одеваем женщину");
    }
}
abstract class clothes{
    Size size;
    String color;
    int cost;

    public clothes(Size size, String color, int cost){
        this.size = size;
        this.color = color;
        this.cost = cost;
    }
}
class TeeShirt extends clothes implements mensClothing, womenClothing{
    public TeeShirt(Size size, String color, int cost){
        super(size, color, cost);
    }
}
class Pants extends clothes implements mensClothing, womenClothing{
    public Pants(Size size, String color, int cost){
        super(size, color, cost);
    }
}
class Skirt extends clothes implements mensClothing, womenClothing{
    public Skirt(Size size, String color, int cost){
        super(size, color, cost);
    }
}
class Tie extends clothes implements mensClothing, womenClothing{
    public Tie(Size size, String color, int cost){
        super(size, color, cost);
    }
}
class Atelier{
    public void dressMens(clothes[] clothes){
        System.out.println("Мужская одежда в наличии: ");
        for (clothes clothes1 : clothes){
            if (clothes1 instanceof mensClothing){
                System.out.println(clothes1);
            }
        }
    }
    public void dressWomen(clothes[] clothes){
        System.out.println("Женская одежда в наличии: ");
        for (clothes clothes1 : clothes){
            if (clothes1 instanceof womenClothing){
                System.out.println(clothes1);
            }
        }
    }
}
