public class Main {
    private static boolean v;
    public static void main(String[] args) {
       //1
        sum(10,10);
        System.out.println(v);

        //2
        negativeOrPositive(-1);
        //3
        suchMeaning(-1);
        System.out.println(v);
        //4
        write("Ежик по травке бежит и хохочет",2);
        //5
        year(4204);
       System.out.println(v);


    }
    //1
    private static boolean sum(int a, int b){
        int sum = a+b;
        if(sum>=10 && sum<=20){ v = true;}
        else  v = false;
        return  v;

    }
    //2
    private  static  void negativeOrPositive(int a){
        if(a<0) System.out.println("Число отрицательное");
        else System.out.println("Число положительное");
    }
    //3
    private  static  boolean suchMeaning (int a) {
        if (a < 0) {v = true;}
        else v = false;
        return v;
    }
    // 4

    private static void write(String s , int a){
        for (int i =0; i<a;i++){ System.out.println(s); }
    }
    //5
    private static boolean year(int a){
        if(a%100==0 && a%400!=0){ return v = false;}
        else if((a%4==0) || (a%400==0)){return v = true;}
        else  return v = false;
    }
}
