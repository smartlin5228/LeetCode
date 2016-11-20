package main.java.bit;

/**
 * Write a function that takes a byte and swaps the the first 4 bits with the last 4 bits.
 */
/*
*
* */
public class BitSwap {
    public class Solution {
        public byte swapBits(byte x) {
            return (byte) (((x & 0xf0) >> 4) | ((x & 0xf0 << 4)));
        }
    }
}
