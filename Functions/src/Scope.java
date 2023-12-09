

public class Scope {
    public static void main(String[] args){
        int a=10; int b=20;
        String name ="Dikhsnt";
       // System.out.println(marks);// error
        {
           // int a=10;//already initialised outside the block in the same method ,hence you cannot initialise again
            a=70;//reassign  the origin ref variable value to same other value
            int c=99;
            // value initialized in this block ,will remain in block
             name ="rahul";
        }
        int c=1000;//outside box


        //System.out.println(c); //cannot use outside the block
        System.out.println(a);
        System.out.println(name);

        //scoping in for loop
        for(int i = 0; i <4 ; i++) {
            System.out.println(i);

        }
       // System.out.println(i);//Error
    }
    static void random(int marks){
        int num=67;
        System.out.println(num);
        System.out.println(marks);
    }
}
