package main.java.bit;

/*
 Because the XOR function is its own inverse, and it is commutative, we can perform the XOR
operation 3 times, storing it in the first variable, then the second, then the first again. This results in
swapping the two values without using any additional storage.
 */
public class SwapInPlace {
    public class Solution {
        public void swapInPlace(int a, int b) {
            a = a ^ b; //temp
            b = a ^ b; //b = a ^ (b ^ b) = a
            a = a ^ b;
        }
    }
}
