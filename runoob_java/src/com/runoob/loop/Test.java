package com.runoob.loop;

public class Test {
    public static void main(String[] args) {
        int x = 10;
        while( x < 20 ) {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }

        x = 10;

        do{
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }while( x < 20 );

        for(x = 10; x < 20; x = x+1) {
            System.out.print("value of x : " + x );
            System.out.print("\n");
        }

        int [] numbers = {10, 20, 30, 40, 50};

        for(int y : numbers ){
            // x 等于 30 时跳出循环
            if( y == 30 ) {
                break;
            }
            System.out.print( y );
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names ={"James", "Larry", "Tom", "Lacy"};
        for( String name : names ) {
            if ("Tom".equals(name)) {
                continue;
            }
            System.out.print( name );
            System.out.print(",");
        }
    }
}
