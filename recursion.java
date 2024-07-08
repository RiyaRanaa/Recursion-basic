
public class recursion {
    /* 
    //write a fuction which is print 5 times "Hello"
    public static void main(String[] args) {
        message();
    }
    static void message(){
        System.out.println("Hello");
        message1();
    }
    static void message1(){
        System.out.println("Hello");
        message2();
    }
    static void message2(){
        System.out.println("Hello");
        message3();
    }
    static void message3(){
        System.out.println("Hello");
        message4();
    }
    static void message4(){
        System.out.println("Hello");
    }
    */




    /* 
    //Number Example 
    // write a fun that takes in a number and prints it
    // print 1st 5 numbers: 1 2 3 4 5
    public static void main(String[] args) {
        print1(1);
    }
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    static void print5(int n){
        System.out.println(n);
    }
    // fun is call another fun
    // one thing is commaon- taking 1 parameter and doing the same thing
    // - body and defitions are same in all fuctions.     
    //Function call that happen in the programming language goint to tha "Stack" memory.


    // how fun calls work in languages
    // -main fun are calls
    // - while the function is not finished executing it will remains in stack.
    // important point-> when a fun finishes executing it is remove from stack and the flow of prog is restored to where that function was called.
    // remove fom the stack 1st- print5 then print 4, print3, print2, print1 and then main fuction.
  

    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        //recursive call
        //if you are calling a function again and again, you can treat it as a separate call in the stack.
        //this is called tail recursion, last fun call.
        print(n+1);
    }

      */



    // "Base condition" in recursion- it is condition where are recursion stop making new calls.
    // recursive call 
    // if you are calling a function again and again, you can treat it as a separate call in the stack.
    // no base condition means-> func call will keep happaning, stack will be filled again and again every func take some memory
    // memoru of computer will exeed the limits->stack pverflow error.
    // what is recursion? ->fuction call itself.
    // why recursion? -> it helps us is solving bigger/complex problems in a simple way and
    // you can convert recursion solutions into iteration ans cise versa that is why we use recursion.
    // space complexity is not constant becoz of recursive calls.
    // it helps us in breaking down bigger prob into smaller problems.
    // vistualising recursion""""important.v.v.v
    // recursion tree ->
    //  main()
    //    |    ^
    //    V    |program over
    // print(1)
    //    |    |
    // print(2)      
    //    |    |
    // print(4)
    //    |    | 
    // print(5)



    /*
     Q. Fibinacci Numbr(find nth)
     1st 2nd 3rd 4th 5th 6th 7th..... 
     0    1   2   3   5   8   13.....

     how can find that->     F(N)=F(N-1)+F(N-2)   -> this is known as {"""recurrence relation"""}
                             
                             F(N-1)=F(N-2)+F(N-3)  and so on...

    tree:
    
                                    fibonacci(5)     
                            /                       \
                        fibo(4)                     fibo(3)     
                        /       \                    /    \
                    fibo(3)     fibo(2)           fibo(2)  fibo(1)
                    /     \      /    \             /   \
              fibo(2)  fibo(1) fibo(1) fibo(0)  fibo(1)  fibo(0)
               /    \
        fibo(1)    fibo(0)


    - break it down into smaller problem
    - the base condition is represented by answer is already have,  
           we know that F(0)=1
                        F(1)=1   this is base condition



     //code
     
        System.out.println(fibo(4));
    }
    static int fibo(int n){
        //base condition
        if(n<2){
            return n;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
}
//How to understand and approch a problem:-
//1. identify if you can break down problem into smaller problem
//2. write the recurence relation if needed
//3. draw the recursive tree
//4. about the tree:- see the flow of fun how they are getting in stack.
//                  - identify the  and focus on left tree calls and right tree calls.
//                  - draw the tree and pointers again and again pen and paper.
//                  - use a debugger to see the flow.
//5. see how the value are return in each step.
//6. see where the fun call will out of.
//7. end the end you will come out of the main functions.
//8. vvvimp- variables: 1. arguments 
                     // 2. returntype 
                     // 3. body of funtion.
     */


// binary search
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        int target=5;
        System.out.println(search(arr, target,0,arr.length-1));
    }
    static int search(int[]arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return search(arr,target,s,m-1);
        }
        return search(arr,target,m+1,e);
    }



    //     link for youtube video
    //     https://www.youtube.com/watch?v=M2uO2nMT0Bk&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=23&t=3846s



}