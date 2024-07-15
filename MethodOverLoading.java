class imp{
    public static void main(String args[]){
        int a=3,b=4,c=5;
        double d=7.5,e=2.5;
        adder add = new adder();
        System.out.println(add.add(a,b));
        System.out.println(add.add(a,b,c));
        System.out.println(add.add(d,e));
    }
}
class adder{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
}
