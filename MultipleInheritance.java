package interfaces;
interface a1{
    void display();
}
interface b{
    void display();
}
public class imp implements a1,b{
    public void display(){
        System.out.println("Display method in A");
    }
    public static void main(String args[]){
        a1 obj = new a1();
        obj.display();
    }
}
