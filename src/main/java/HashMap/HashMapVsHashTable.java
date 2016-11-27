package main.java.HashMap;

import java.util.HashMap;
import java.util.Hashtable;
public class HashMapVsHashTable {
    HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
    Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
}
/*
Hash tables and hash maps have three key differences:
*   Hash tables are synchronized and thread safe while hash maps are not. Concurrent access is
not allowed for hash tables, so only one thread can access a hash table at a time.
*   Hash maps allow both null keys and null values, while hash tables do not. If we try to insert a
null key or value into a hash table, we will get a null pointer exception.
*   When iterating through a hash map, and we try to modify one of the values, we will get a
concurrent modification exception. If we try to modify a hash table during iteration, we will not
get an error.
Coding
* */