class square{
    
        int sides = 4;
        String color = "blue";

}
class triangle{
    
        int sides = 3;
        String color = "red";
}
public class shapes{
    public static void main(String args[]){
        square sq = new square();
        triangle tr = new triangle();
        System.out.println(sq.sides + sq.color);
    }
}
