package Java;

public class Breakandcontinue {
    public static void main(String[] args){
        for (int value = 24; value < 56; value++){
            if (value == 36){                               // The continue statement will break an interation at 36 and continue at 37
                continue;
            }
            if (value == 40){                               // This will break the iteration at 40
                break;
            }
            System.out.println(value);
        }
        System.out.println("This is amazing, thank you!");
    }
}

/*
====OUTPUTS=====

24
25
26
27
28
29
30
31
32
33
34
35                                      ~~~~~~~A break at 36 and continued at 37
37
38
39                                      ~~~~~~~A break at 40, no continuation to 56, it ends here
This is amazing, thank you!
*/
