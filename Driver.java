import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {

    // COMMENT: sign of the mantisssa
    public static int signFunction(String signMantissa){
        if(signMantissa.equalsIgnoreCase("-"))
            return 1;
        else
            return 0;
    }

    // COMMENT: E Prime
    public static int ePrimeFunction(double mantissa){
        int ePrime, base = 2, multiplier = 1, result = 0;
        ePrime = (int) mantissa+127;
        System.out.println("[ePrimeFunction] ePrime in decimal: " + ePrime);

        // COMMENT: getting the decimal of ePrime
        while (ePrime>0){
            int residue = ePrime%base;
            ePrime = ePrime/base;
            result = result + residue * multiplier;
            multiplier = multiplier * 10;
        }

//        System.out.println("[ePrimeFunction]" + (float)result);
        return result;
    }

    // COMMENT: excess/ after the decimal point
    public static Double functionalMantissa(double mantissa){
        double remaining = 0;
        String[] sRemaining;

        remaining = mantissa - Math.floor(mantissa);
//        System.out.println("[functionalMantissa]" + remaining);

        // COMMENT: split the string to get the numbers after the deciaml point
        sRemaining = String.valueOf(remaining).split("\\.");
//        System.out.println("[functionalMantissa]" + sRemaining[1]);
        remaining = Double.valueOf(sRemaining[1]);

        return remaining;
    }

    // COMMENT: converting binary to hex
    public static void binaryToHex(String sPrecision) {
        List<String> list = new ArrayList<>();
        int index = 0;

        long floatingPoint;
        String temp = "";
        String hex = "";
        boolean b = true;
        int i = 0;

        while (index<sPrecision.length()){
            list.add(sPrecision.substring(index, Math.min(index + 4, sPrecision.length())));
            index+=4;
        }

        for(i = 0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }
//
//        while(i<list.size()) {
            temp = list.get(i);
            System.out.println("TEMP:" + temp);
            if(temp.equals("0000")|| temp.equals("000") || temp.equals("00") || temp.equals("0")) {
                hex = hex + "0";
                System.out.print("[BINARYTOHEX] should be 0 -->");
                System.out.println("hex: " +hex);
            }
            else if(temp.equals("0001") || temp.equals("001")|| temp.equals("01") || temp.equals("1")) {
                hex = hex + "1";
                System.out.print("[BINARYTOHEX] should be 1 --> ");
                System.out.println("hex: " +hex);
            }
            else if(temp.equals("0010") || temp.equals("010") || temp.equals("10")) {
                hex = hex + "2";
                System.out.print("[BINARYTOHEX] should be 2 --> ");
                System.out.println("hex: " + hex);
            }
            else if(temp.equals("0011") || temp.equals("011") || temp.equals("11")) {
                hex = hex + "3";
                System.out.print("[BINARYTOHEX] should be 3 --> ");
                System.out.println("hex: " + hex);
            }
            else if(temp.equals("0100") || temp.equals("100")) {
                hex = hex + "4";
                System.out.print("[BINARYTOHEX] should be 4 --> ");
                System.out.println("hex: " + hex);
            }
            else if(temp.equals("0101") || temp.equals("101")) {
                hex = hex + "5";
                System.out.print("[BINARYTOHEX] should be 5 --> ");
                System.out.println("hex: " + hex);
            }
            else if(temp.equals("0110") || temp.equals("110")) {
                hex = hex + "6";
                System.out.print("[BINARYTOHEX] should be 6 --> ");
                System.out.println("hex: " + hex);
            }
            else if(temp.equals("0111") || temp.equals("111")) {
                hex = hex + "7";
                System.out.print("[BINARYTOHEX] should be 7 --> ");
                System.out.println("hex: " + hex);
            }
            else if(temp.equals("1000")) {
                hex = hex + "8";
                System.out.print("[BINARYTOHEX] should be 8 --> ");
                System.out.println("hex: " + hex);
            }
            else if(temp.equals("1001")) {
                hex = hex + "9";
                System.out.print("[BINARYTOHEX] should be 9 --> ");
                System.out.println("hex: " + hex);
            }
            else if(temp.equals("1010")) {
                hex = hex + "A";
                System.out.print("[BINARYTOHEX] should be A --> ");
                System.out.println("hex: " + hex);
            }
            else if(temp.equals("1011")) {
                hex = hex + "B";
                System.out.print("[BINARYTOHEX] should be B --> ");
                System.out.println("hex: " + hex);
            }
            else if(temp.equals("1100")) {
                hex = hex + "C";
                System.out.print("[BINARYTOHEX] should be C --> ");
                System.out.println("hex: " + hex);
            }
            else if(temp.equals("1101")) {
                hex = hex +  "D";
                System.out.print("[BINARYTOHEX] should be D --> ");
                System.out.println("hex: " + hex);
            }
            else if(temp.equals("1110")) {
                hex = hex + "E";
                System.out.print("[BINARYTOHEX] should be E --> ");
                System.out.println("hex: " + hex);
            }
            else if(temp.equals("1111")) {
                hex = hex + "F";
                System.out.print("[BINARYTOHEX] should be F --> ");
                System.out.println("hex: " + hex);
            }
            System.out.println("[BINARYTOHEX] temp: " + temp);
//            if(floatingPoint == 0) {
//                b = false;
//            }
        }
        System.out.println("[BINARYTOHEX] Hex Value:" + hex);
    }

    public static void main(String[] args) {
        double mantissa, remaining;
        int exponent, ePrime, sign;
        String sPrecision;
        String[] arrayPrecision;
        String signMantissa, signExponent;
        Scanner sc = new Scanner(System.in);

        // COMMENT: Sample test case
        signMantissa = "+";
        mantissa = 1110.101;
        signExponent = "+";
        exponent = 5;

//        // COMMENT: user inputs; indicates sign of binary mantissa in base 2
//        System.out.print("Enter Sign: ");
//        signMantissa = sc.nextLine();
//        System.out.print("Enter a binary number: ");
//        mantissa = sc.nextFloat();
//        System.out.print("Enter sign of exponent: ");
//        sc.nextLine();  // so that it wont skip a line
//        signExponent = sc.nextLine();
//        System.out.print("Enter an exponent: 2^" + signExponent);
//        exponent = sc.nextInt();

        // COMMENT: print what user enters
        System.out.println("Given: " + signMantissa + mantissa + "x2^" + signExponent + exponent);

        // COMMENT: to make mantissa in 1 significant figure
        while (mantissa > 2) {
            if(signExponent.equalsIgnoreCase("-")){
                mantissa /= 10;
                exponent--;
            }else {
                mantissa /= 10;
                exponent++;
            }
        }

        // COMMENT: single precision floating point
        System.out.println("Given: " + signMantissa + mantissa + "x2^" + signExponent + exponent);
        // TODO sign function
        sign = signFunction(signMantissa);
        System.out.println("Sign is: " + sign);
        // TODO E' function
        ePrime = ePrimeFunction(exponent);
        System.out.println("E' is: " + ePrime);
        // TODO functional mantissa
        remaining = functionalMantissa(mantissa);
        System.out.println("Excess is: " + remaining);
        // TODO binary to hex function
        sPrecision = String.valueOf(sign)+ String.valueOf(ePrime) + String.valueOf(remaining);
        System.out.println("Binary Single Precision: " + sPrecision);
        arrayPrecision = sPrecision.split("\\.");
        System.out.println("[BINARYTOHEX] floatingPoint: " + arrayPrecision[0]);
        binaryToHex(arrayPrecision[0]);
    }
}
