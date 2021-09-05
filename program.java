import java.util.Scanner;
class Main{
    float weight;
    float height;
}
class bmi{
    static void BMI(float h,float w){
        double bmi_value;
        bmi_value=(w/(Math.pow(h,2)))*10000;
        System.out.printf("BMI value: "+bmi_value);

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Main obj=new Main();
        System.out.printf("Enter the height in (cm) : ");
        obj.height=sc.nextFloat();
        System.out.printf("Enter the weight in (cm) : ");
        obj.weight=sc.nextFloat();
        BMI(obj.height,obj.weight);
    }
}
