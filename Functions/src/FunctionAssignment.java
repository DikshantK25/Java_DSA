import java.util.Scanner;

public class FunctionAssignment {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        //Q1
        System.out.println("Enter the 3 Number :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int largest=max(x,y,z);
        System.out.println("max from x,y and z:"+largest);
        int smallest=min(x,y,z);
        System.out.println("min from x,y and z:"+smallest);


         //Q2
        System.out.println("Enter the number:");
            int number=sc.nextInt();
              boolean  ans=EvenOdd(number);
              if(ans){
                  System.out.println(number+" is Even");
              }
              else {
                  System.out.println(number+" is odd");
              }


              //Q3
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        boolean condi= vote(age);
        if(condi){
            System.out.println("Person is eligible to vote ");
        }else {
            System.out.println("Person is 'Not' eligible to vote ");
        }


       // Q4
        System.out.println("enter the 2 Number for sum:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int ans4=Sum(num1,num2);
        System.out.println(ans4);


        //Q5
        System.out.println("enter the 2 Number for product:");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int answer=product(number1,number2);
        System.out.println(answer);




        //Q6
        System.out.println("Enter the radius:");
        double radius= sc.nextDouble();

//          double solution =Circle(radius);
//          System.out.println( "area : "+solution);
//         double solution2=Circle1(radius);
//         System.out.println("cercumfernce : "+solution2);
//
           double v[]= Circle(radius);
        System.out.println( "area : "+v[0]);
        System.out.println( "cercumfernce: "+v[1]);


        //Q7
        System.out.println("Enter the number for Prime or not");
        int solution7=sc.nextInt();
        boolean final_answer =isPrime(solution7);
        if (final_answer){
            System.out.println("Prime :"+solution7);
        }else {
            System.out.println("is not prime :"+solution7);
        }

        //Q8
        System.out.println("Enter the no of subject");
        int no =sc.nextInt();
        int sum=0;
        for(int i = 1; i <=no ; i++) {
            System.out.println("Enter the Marks"+i+" :");
            int mark=sc.nextInt();

            sum=sum+mark;
        }

        System.out.println("total marks:"+sum);
        int pecentage =(sum*100/(no*100));
        System.out.println("pecentage is:"+pecentage);

        String grade=score(pecentage);
           System.out.println("Grade:"+grade);


       // Q9
        System.out.println("Enter the number for Factorial:");
        int no1=sc.nextInt();
        int factorial=factorial(no1);
        System.out.println("factorial:"+factorial);




        //Q10
        System.out.println("Enter the no for palindrome:");
        int no3=sc.nextInt();
        boolean result=palindrome(no3);
        if (result){
            System.out.println("is palindrome");
        }
        else {
            System.out.println("is  Not palindrome");
        }


        //Q12
        System.out.println("Enter three number");
        int q=sc.nextInt();
        int w=sc.nextInt();
        int e=sc.nextInt();
         boolean ans11=triplet(q,w,e);
         if(ans11){
             System.out.println("is triplet");
         }else {
             System.out.println( "is not triplet");
         }



       //Q13
//        System.out.print("Enter a number a & b: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//             for(int i = a; i <=b ; i++) {
//                 if (isPrime0(i)) {
//            System.out.println(i);
//        }
////
//

        //*********
        System.out.print("Enter the lower bound: ");
        int lowerBound = sc.nextInt();

        System.out.print("Enter the upper bound: ");
        int upperBound = sc.nextInt();

        System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + " are:");

        for (int j = lowerBound; j <= upperBound; j++) {//important
            if (isPrime0(j)) {
                System.out.println(j);
}
            }


             //Q14
        System.out.println("Enter the n: for the sum from 1 to n:");
        int value14=sc.nextInt();
             int answer14=totalSum(value14);
             System.out.println("sum is 1 to "+value14+":"+answer14);





        }






// Q1   Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
    static int max(int a,int b,int c){
          int max=a;
        if (b>max){
           max=b;
//            return max;
        }
        if (c>max){
            max=c;
//            return max;

        }

        return max;
    }
    static int min(int a,int b,int c){
        int min=a;
        if (b<min){
            min=b;
            return min;
        }
          if (c<min){
            min=c;
            return min;

        }

        return min;
    }




//Q2 Define a program to find out whether a given number is even or odd
    static boolean EvenOdd(int n){
        int num=n;
        if(num%2==0){
            return true ;
        }

        return false;
    }



    //Q3 A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
static  boolean vote(int n){
        int num=n;
        if(num>=18){
           return true;
        }

        return false;

}



//  Q4  Write a program to print the sum of two numbers entered by user by defining your own method
static int Sum(int a,int b){
        int sum=a+b;
        return sum;
}


// Q5   Define a method that returns the product of two numbers entered by user.
static int product(int a,int b){
    int product=a*b;
    return  product;
}


//Q6Write a program to print the circumference and area of a circle of radius entered by user by defining your own method
static double[] Circle(double r){
        double number =r;

//        double value=r;
//        double area= 3.14*value*value;
//        double value1=area;
//        return value1;
//        }
//
//        static double Circle1(double r1){
//           double value2=r1;
//
//        double value3=2* value2*3.14;
//        return value3;
//
            double[] v=new double[2];
           v[0] = 3.14*number*number;

            v[1]= 2*3.14*number;

             return v;







}

//Q7Define a method to find out if a number is prime or not.
    static boolean isPrime(int num){
        int n=num;
        if(n<=1){
            return false;
        }
        for(int i =2; i *i<=n; i++) {
            if(n%i==0){
            return false;

        }
        }

        return true;

    }


//  Q8  Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:](https://www.techcrashcourse.com/2017/02/java-program-to-calculate-grade-of-students.html) <br/>
//    <pre>
//            Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail
static String score(int marks){
        int n=marks;
    if (marks >= 91 && marks <= 100) {
        return "AA";
    } else if (marks >= 81 && marks <= 90) {
        return "AB";
    } else if (marks >= 71 && marks <= 80) {
        return "BB";
    } else if (marks >= 61 && marks <= 70) {
        return "BC";
    } else if (marks >= 51 && marks <= 60) {
        return "CD";
    } else if (marks >= 41 && marks <= 50) {
        return "DD";
    } else {
        return "Fail";
    }
}


//Q9. Write a program to print the factorial of a number by defining a method named 'Factorial'.
//        Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.
//4! = 1 * 2 * 3 * 4 = 24
//        3! = 3 * 2 * 1 = 6
//        2! = 2 * 1 = 2
//        Also,
//        1! = 1
//        0! = 1

static int factorial(int n){
        int num=n,fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
}

// Q10   Write a function to find if a number is a palindrome or not. Take number as parameter
static boolean palindrome(int n){
        int original =n;
    int result=0;
        while(original>0){
            int digit=original%10;

            result=result*10+digit;
            original/=10;


}
        if (result==n){
            return true;
        }
        return false;

}

//  Q12  Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

static  boolean triplet(int a,int b,int c){
        int x=a,y=b,z=c;
        if( (x*x)+(y*y)==(z*z)){
            return true;
        }
        return false;
}

// ******** Q13 write function that retuns all prime number s between two given numbers
    static boolean isPrime0( int n){
            int num=n;

            if (num<=1){

                return false;
            }

            for(int i = 2; i *i <=num ; i++) {
                if (num%i==0){

                return false;
            }

            }


            return  true;
    }


//Q14 print the sum first n natural numbers
    static int totalSum(int n){
        int sum=0;
        int num=n;
        for(int i = 1; i <=num ; i++) {
            sum=sum+i;

        }
        return sum;

    }






//anoter code for prime print from betweeen limits
// Function to check if a number is prime

//         static boolean isPrime2(int number) {
//            if (number <= 1) {
//                return false;
//            }
//            if (number <= 3) {
//                return true;
//            }
//            if (number % 2 == 0 || number % 3 == 0) {
//                return false;
//            }
//            for (int i = 5; i * i <= number; i += 6) {
//                if (number % i == 0 || number % (i + 2) == 0) {
//                    return false;
//                }
//            }
//            return true;
//        }

 }






























