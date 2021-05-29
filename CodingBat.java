/*
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
diff21(19) → 2
diff21(10) → 11
diff21(21) → 0*/

public int diff21(int n) {
    if (n <= 21) {
      return 21 - n;
    } else {
      return (n - 21) * 2;
    }
  }


  /**
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true */
public boolean makes10(int a, int b) {
    int sum = a+b;
    if (a ==10 || b ==10 || sum==10 ){
      return true;
    }else{
      return false;
    }
  }

/* 
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false */



public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    if(aSmile == true && bSmile == true){
      return true;
    }
    if (aSmile == false && bSmile == false){
      return true;
    }
      else{
      return false;
    }
  }
  

/**
Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false */

public boolean nearHundred(int n) {
    return ((Math.abs(100 - n) <= 10) ||
      (Math.abs(200 - n) <= 10));
  }

/**
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false */

public boolean parrotTrouble(boolean talking, int hour) {
    if ((hour<7 || hour>20)  && (talking ==true)){
      return true;
    }
    else{
      return false;
    }
    
  }

  /**
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false */

public boolean parrotTrouble(boolean talking, int hour) {
    if ((hour<7 || hour>20)  && (talking ==true)){
      return true;
    }
    else{
      return false;
    }
    
  }


    
/*The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true */

public boolean sleepIn(boolean weekday, boolean vacation) {
    if (weekday == false || vacation == true){
      return true;
    }else{
      return false;
    }
  }


  /*
Given two int values, return their sum. Unless the two values are the same, then return double their sum.
sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8 */

public int sumDouble(int a, int b) {
    if(a==b){
      return ((a+b)*2);
    }else{
      return a+b;
    }
  }


/**Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.


mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"} *//

public Map<String, String> mapBully(Map<String, String> map) {
    if (map.containsKey("a")) {
      map.put("b", map.get("a"));
      map.put("a", "");
    }
    return map;
  }

  /*Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.


mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"} */

public Map<String, String> mapShare(Map<String, String> map) {
    if (map.containsKey("a")){
      map.put("b",map.get("a"));
      
    }
    map.remove("c");
    return map;
  }

  /**Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab".


mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"} */

public Map<String, String> mapAB(Map<String, String> map) {
    if(map.containsKey("a") && map.containsKey("b")) {
     String ab =  map.get("a");
     String bh =  map.get("b");
     String ch = ab+bh;
     map.put("ab",ch);
    }
    return map;
  }

  /*Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".


topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
topping1({}) → {"bread": "butter"}
topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"} */

public Map<String, String> topping1(Map<String, String> map) {
    if (map.containsKey("ice cream")){
    map.put("ice cream","cherry");
      
    }
    map.put("bread","butter");
    return map;
    
  }

  /*
Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".


topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
topping2({"yogurt": "salt"}) → {"yogurt": "salt"} */

public Map<String, String> topping2(Map<String, String> map) {
    if(map.containsKey("ice cream")){
      map.put("yogurt",map.get("ice cream"));
    }
      if(map.containsKey("spinach")){
      map.put("spinach","nuts");
    }
    return map;
  }

  /*
Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value, set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".


topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}*/

public Map<String, String> topping3(Map<String, String> map) {
    if(map.containsKey("potato")){
      map.put("fries",map.get("potato"));
    }
    if(map.containsKey("salad")){
      map.put("spinach",map.get("salad"));
    }
    return map;
  }

  /*Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.


mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"} */
public Map<String, String> mapAB2(Map<String, String> map) {
    if(map.containsKey("a") && map.containsKey("b")){
      if(map.get("a") == map.get("b")){
        map.remove("a");
        map.remove("b");    
    }
    
    }
    return map;
  
  }

  /**
Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.


mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"} */

public Map<String, String> mapAB3(Map<String, String> map) {
    if(map.containsKey("a")){
      if(map.containsKey("b")){
      return map;
    }else{
    map.put("b",map.get("a"));
  }
  }
  if(map.containsKey("b")){
    map.put("a",map.get("b"));
  }
  
  else{
return map;
}

/*
Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.


mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}/ */


public Map<String, String> mapAB4(Map<String, String> map) {

    if(!map.containsKey("a") || !map.containsKey("b")){ 
      return map; 
      
    }
    
    else if(map.get("a").length() > map.get("b").length()){
      map.put("c", map.get("a"));
      }
    
    else if(map.get("b").length() > map.get("a").length()){
      map.put("c", map.get("b")); 
      
    }
    
    else if(map.get("a").length() == map.get("b").length()){ 
      map.put("a", ""); 
      map.put("b", "");
      }
    
    return map;
    
    }

/* Given a list of integers, return a list where each integer is multiplied by 2.


doubling([1, 2, 3]) → [2, 4, 6]
doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
doubling([]) → []*/

public List<Integer> doubling(List<Integer> nums) {
    List<Integer> numbers = new ArrayList<> ();
    for (Integer n : nums)
    numbers.add(n*2);
    return numbers;
    
  }
/**Given a list of integers, return a list where each integer is multiplied with itself.


square([1, 2, 3]) → [1, 4, 9]
square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
square([]) → [] */  

public List<Integer> square(List<Integer> nums) {
    List<Integer> numbrs = new ArrayList<> ();
    for(Integer n : nums){
      numbrs.add(n*n);
      
    }
    return numbrs;
  }
/*
Given a list of strings, return a list where each string has "*" added at its end.


addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
addStar(["hello", "there"]) → ["hello*", "there*"]
addStar(["*"]) → ["**"] */

public List<String> addStar(List<String> strings) {
    List<String> stringsNew = new ArrayList<>();
    for(String s: strings){
      stringsNew.add(s+"*");
      
    }
    return stringsNew;
  }

/**
Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.


copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
copies3(["24", "a", ""]) → ["242424", "aaa", ""]
copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"] */

public List<String> copies3(List<String> strings) {
    List<String> s = new ArrayList<>();
    for(String st: strings){
      s.add(st+st+st);
    }
    return s;
  }

/**
 * 
Given a list of strings, return a list where each string has "y" added at its start and end.


moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
moreY(["yay"]) → ["yyayy"]
 */

public List<String> moreY(List<String> strings) {
    List<String> s = new ArrayList<>();
    for(String st: strings){
      s.add("y"+ st + "y");
    }
    return s;
  }
/**Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.


math1([1, 2, 3]) → [20, 30, 40]
math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
math1([10]) → [110] */  

public List<Integer> math1(List<Integer> nums) {
    List<Integer> it = new ArrayList<>();
    for(int t: nums){
      it.add((1+t)*10);
    }
    return it;
  } 
/*
Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)


rightDigit([1, 22, 93]) → [1, 2, 3]
rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
rightDigit([10, 0]) → [0, 0]*/

public List<Integer> rightDigit(List<Integer> nums) {
    nums.replaceAll(n -> n % 10);
    return nums;
  }


  /**
Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).


lower(["Hello", "Hi"]) → ["hello", "hi"]
lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"] */

public List<String> lower(List<String> strings) {
    strings.replaceAll(n -> n.toLowerCase());
    return strings;
  }
    
    

  /**
Given a list of integers, return a list of the integers, omitting any that are less than 0.


noNeg([1, -2]) → [1]
noNeg([-3, -3, 3, 3]) → [3, 3]
noNeg([-1, -1, -1]) → [] */


public List<Integer> noNeg(List<Integer> nums) {
    nums.removeIf(n-> n<0);
    return nums;
  }

/*Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)


no9([1, 2, 19]) → [1, 2]
no9([9, 19, 29, 3]) → [3]
no9([1, 2, 3]) → [1, 2, 3]*/


public List<Integer> no9(List<Integer> nums) {
    nums.removeIf(n -> n%10==9);
    return nums;
  }

  
/**Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.


noTeen([12, 13, 19, 20]) → [12, 20]
noTeen([1, 14, 1]) → [1, 1]
noTeen([15]) → [] */

public List<Integer> noTeen(List<Integer> nums) {
    nums.removeIf(n -> n>=13 & n<=19);
    return nums;
  }

/**Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)


noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
noZ(["hziz", "hzello", "hi"]) → ["hi"]
noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"] */

public List<String> noZ(List<String> strings) {
    strings.removeIf(n -> n.contains("z"));
    return strings;
  }


/**
Given a list of strings, return a list of the strings, omitting any string length 4 or more.


noLong(["this", "not", "too", "long"]) → ["not", "too"]
noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
noLong(["cccc", "cccc", "cccc"]) → [] */


public List<String> noLong(List<String> strings) {
    strings.removeIf(n -> n.length()>=4);
    return strings;
  }
/**
Given a list of strings, return a list of the strings, omitting any string length 3 or 4.


no34(["a", "bb", "ccc"]) → ["a", "bb"]
no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
no34(["ccc", "dddd", "apple"]) → ["apple" */


public List<String> no34(List<String> strings) {
    strings.removeIf(n -> n.length()==3 | n.length()==4);
    return strings;
  }

  /**iven a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.


noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
noYY(["a", "b", "cy"]) → ["ay", "by"]
noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"] */
public List<String> noYY(List<String> strings) {
    strings.replaceAll(s -> s + "y");
    strings.removeIf(s -> s.contains("yy"));
    return strings;
  }


  /*Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.


  two2([1, 2, 3]) → [4, 6]
  two2([2, 6, 11]) → [4]
  two2([0]) → [0]
 */

  public List<Integer> two2(List<Integer> nums) {
    nums.replaceAll(n -> n * 2);
    nums.removeIf(n -> n % 10 == 2);
    return nums;
  }


  /*
Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.


square56([3, 1, 4]) → [19, 11]
square56([1]) → [11]
square56([2]) → [14]*/

public List<Integer> square56(List<Integer> nums) {
    nums.replaceAll(n -> (int) Math.pow(n, 2) + 10);
    nums.removeIf(n -> Integer.toString(n).charAt(Integer.toString(n).length()-1) == '5' || Integer.toString(n).charAt(Integer.toString(n).length()-1) == '6');
    return nums;
  }
  


  /*Given a list of strings, return a list where each string has all its "x" removed.


  noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
  noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
  noX(["x"]) → [""] */

  public List<String> noX(List<String> strings) {
    strings.replaceAll(n-> n.replace("x",""));
    return strings;
  }
