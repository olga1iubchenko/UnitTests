package UnitTestsHW1;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework1 {
	
//1 Min of two numbers
	
	  static int a = -2;
	  static int b = 5;
	private static int sumMinMax;    
  public static int minValue(int a, int b) {
      if (a > b) {
    	  return b;
      }
    return a;
  }

//2 Sum of of numbers divided by two without  residue
 
  int arrayk [] = {1,4,3,5,7,6};
  int k = 3;
public static int sumDividedByK(int[] arr, int k){
int sum = 0;
for (int element: arr) {
  if(element%k==0){
    sum = sum + element;
  }
}
return sum ;
 }

//3 Create new array with zero element from other array
ArrayList <Integer>  array = (ArrayList<Integer>) Arrays.asList(1,4,0,3,0,5,0,0,0);
ArrayList <Integer>  arrayWithZeros = new ArrayList<Integer>();
public static ArrayList <Integer> arrayWithZeros(ArrayList<Integer> array, ArrayList<Integer> arrayWithZeros) {
for(int i=0 ; i <=array.size()-1; i++){
    if(array.get(i).equals(0));    
	arrayWithZeros.add(array.get(i));
       }
    System.out.println("No any zeros in the array");
     
      return arrayWithZeros;
}


//4 What the first number we met: positive or negative?

ArrayList <Integer>  arrayPosOrNeg = (ArrayList<Integer>) Arrays.asList(1,4,0,-3,0,-5,0);
public static String isPositiveOrNegative(ArrayList <Integer> arrayPosOrNeg){
  if(arrayPosOrNeg.get(0) > 0){
    return "the positive first";
  }

return "the nevative first";

  }


//5 Is the array ordered by ASC rule?

ArrayList <Integer>  arrayHowOrdered = (ArrayList<Integer>) Arrays.asList(1,4,2,-3,0,-5,11);
public static String isArrayOrdered(ArrayList <Integer> arrayHowOrdered, String sortingRule){
for (int i = 0; i < arrayHowOrdered.size(); i++) {
  if(arrayHowOrdered.get(i) > arrayHowOrdered.get(i+1)){
	  sortingRule = "array isn't ordered by asc rule";
    break;
  }
  else 
	 sortingRule = "array is ordered by asc rule";
	break;  
 } 
return sortingRule;
}

//6 Is array contain even numbers? If no - print the message
ArrayList <Integer>  arrayWithNumbers = (ArrayList<Integer>) Arrays.asList(1,4,-2,3,7,5,13);
ArrayList <Integer>  arrayWithEvenNumbers = new ArrayList<Integer>();

public static Object newArrayWithEvenNumbers(ArrayList <Integer> arrayWithNumbers, ArrayList <Integer> arrayWithEvenNumbers, String isEvenNumersMessage){
	int countOfEven = 0;
	for (int i = 0; i < arrayWithNumbers.size(); i++) {
      if(arrayWithNumbers.get(i)%2==0){
    	  arrayWithEvenNumbers.add(arrayWithNumbers.get(i));
    	  countOfEven++;
      }
	}
	 if(countOfEven==0){
          isEvenNumersMessage= "there is no even numbers in array"; 
          return isEvenNumersMessage;
          }
      return arrayWithEvenNumbers;        
        }    


static //7 If array element more then z replace it with z. Count the number of replacements

ArrayList <Integer>  arrayWithElementsMoreZ= (ArrayList<Integer>) Arrays.asList(1,4,-2,3,7,5,13);
public static ArrayList <Integer> newArrayWithElementsMoreZ(ArrayList<Integer> arrayVerifyToZ, int z){
  for (int i = 0; i < arrayWithElementsMoreZ.size(); i++) {
  if(arrayWithElementsMoreZ.get(i) > z){
	  arrayWithElementsMoreZ.set(i,z);
  }
}
return  arrayWithElementsMoreZ;
   }  

//8 Count positive, negative array elements and count of zeros

ArrayList <Integer>  arrayCountOfPosNeg= (ArrayList<Integer>) Arrays.asList(0,1,4,0,-3,0,-5,-1);
public static ArrayList <Integer> countOfElements(ArrayList <Integer> arrayCountOfPosNeg){
int countPositive = 0;
int countNegative = 0;
int countZeros = 0;
for (int i = 0; i < arrayCountOfPosNeg.size(); i++) {
  if(arrayCountOfPosNeg.get(i) > 0){
    countPositive++;
  }
  else if (arrayCountOfPosNeg.get(i) < 0){
    countNegative++;
  }
  else if (arrayCountOfPosNeg.get(i).equals(0)){
    countZeros++; 
  } 
}
ArrayList <Integer>  arrayCountPosNegZeros= (ArrayList<Integer>) Arrays.asList(countPositive,  countNegative, countZeros);
return arrayCountPosNegZeros;
}

//9 Switch Min and Max array elements

ArrayList <Integer>  arraySwitchPosAndNeg = (ArrayList<Integer>) Arrays.asList(1,4,-2,3,7,5,13);
public static ArrayList <Integer> minMaxChangedPositions(ArrayList <Integer> arraySwitchPosAndNeg){
int min = arraySwitchPosAndNeg.get(0);
int minPosition = 0;
int max = arraySwitchPosAndNeg.get(0); 
int maxPosition = 0;
for (int i = 1; i < arraySwitchPosAndNeg.size(); i++) {
  if(arraySwitchPosAndNeg.get(i) > max ){
    max = arraySwitchPosAndNeg.get(i);
    maxPosition = i;
  }
  if(arraySwitchPosAndNeg.get(i) < min ){
    min = arraySwitchPosAndNeg.get(i);
    minPosition = i;
  }
   }
arraySwitchPosAndNeg.set(maxPosition, min);
arraySwitchPosAndNeg.set(minPosition, max);
return arraySwitchPosAndNeg;
}

//10 Print only numbers with condition arr[i] ≤ i == true
ArrayList <Integer>  arrayWithNUmWithCond = (ArrayList<Integer>) Arrays.asList(1,4,-2,3,7,5,13);
public static ArrayList<Integer> onlyNumbersWithCondition(ArrayList<Integer> arrayWithNUmWithCond){
for (int i = 0; i < arrayWithNUmWithCond.size(); i++) {
  if(arrayWithNUmWithCond.get(i) <= i  ){
  }
 }
return arrayWithNUmWithCond;
}

//11 Print numbers where residue on M equal L

public static void elevenMethod(){
int array [] = {1,4,-2,3,8,5,10};
int m = 3;
int l = 1;
for (int element : array) {
  if(element % m == l ){
    System.out.println(element);
  }
  else
   System.out.println("no such elements");
  break;
  }
 }  

//12 Switch neighboring elements (а[0] и а[1], а[2] и а[3], …) 

public static void changePosition(){
int array [] = {1,4,-2,3,7,5,13};
for (int i = 1; i < array.length; i=i+2) {
 array[i] = array[i-1];
 array[i-1] = array[i];
  }
System.out.println(array);
 }


//13 Print numbers till the zero (including zero)

public static void numbersWithZero(){
int array [] = {1,4,-2,3,7,0,13};
int i = 0;
     do{
   System.out.println(array[i]);
   i++;
     } while (array[i]!=0&& i <array.length);
 }


//14. Find mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]).

public static void sumOfMinMax(){
int array [] = {1,4,-2,3,7,5,13,16,5};
int min = array[1];
int max = array[0];
  for (int i = 4; i < array.length; i=i+2) {
   if(array[i-2] > max ){
      max = array[i]; 
  }
   else if(array[i-1] < min ){
      min = array[i]; 
   }
 }
 sumMinMax = (max + min);
 System.out.println(sumMinMax);
 }

//15. Find the multiplication of array elements more then M

public static void multipleArrElements(){
int array [] = {1,4,2,3,7,5,13};
int m = 5;
int multiple = 1;
int count = 0;
for (int i = 0; i < array.length; i++) {
  if(array[i] > m ){
    multiple = multiple * array[i];
  }
  else 
    count++;
  }
if(count==array.length){
System.out.println("no elements more then defined m = " + m);
}
System.out.println(multiple);
 }


//16. Replace with zeros the numbers with condition (|a[i]| &gt; max{ a[0], a[1], ..., a[n]})

public static void maxMod(){
int array [] = {1,4,-2,3,7,5,13,16,5};
int max = array[0];
  for (int i = 1; i < array.length; i++) {
   if(array[i] > max ){
      max = array[i]; 
  }
  }
   
 for (int i = 0; i < array.length; i++) {  
   if(Math.abs(array[i]) > max ){
     array[i] = 0; 
   }
 }
 System.out.println(array);
 }

//17. Multiplication of positive P1 and negative P2 numbers. Find max from Mod(P1) and Mod(P2)

public static void modComparing(){
int array [] = {1,4,13,-3,9,-5,0};
int p1 = 1;
int p2 = 1;
for (int i = 0; i < array.length; i++) {
  if(array[i] > 0){
    p2 = p2 * Math.abs(array[i]);
  }
  else if (array[i] < 0){
    p1 = p1 * Math.abs(array[i]);
  }
}
  if(p1 > p2) {
 System.out.println("p1 more then p2");   
  } 
  else if (p2 > p1){
 System.out.println("p2 more then p1"); 
 }
  else{
System.out.println("No p2 nor p1 is more");     
  }
 }

//18. Array has equal elements. Find the first max number and replace it with zero

public static void maxSingleValue(){
int array [] = {1,4,-2,13,7,5,13,7,5};
int max = array[0];
  for (int i = 1; i < array.length; i++) {
    if (array[i] > max) {
          max = array[i];
      }   
 }
  for (int i = 1; i < array.length; i++) {
	    if (array[i] == max) {
	          array[i] = 0;
	          break;
	      }   
	 }
  System.out.println(array);
}



//19. Create new array from other one which elements end with k

public static void arrayEndingWithK() {
int array [] = {1,4,45,3,-15,5,6,7,25};
int k = 5;
int count = 0;
for(int i=0 ; i <=array.length-1; i++){
    if(array[i]%10 == k)
      count++;
}
if (count > 0){
   int array2[] = new int [count]; 
   int position=0;

   for (int i = 0; i < array.length; i++) {
     if(array[i]%10 == k){
         array2[position] = i;
        position++;
  }
   }
   for (int i=0;i<array2.length;i++)
   {
       if (i==array2.length-1)
   System.out.println(array2);
 }   
}
}

//20. Print the substraction of sum each second element which residue = 0 and other elements

public static void calcSubstrSumEchSecEl(){
int array [] = {1,4,45,3,9,5,200,-7,0,25};
int sumOfSecondEl = array[1];
int sumOfOtherEl= array[0];
int subsctract = 0;
for(int i=2 ; i <=array.length-2; i++){
    if(i%2 != 0 && array[i]%10 == 0){
    	sumOfSecondEl = sumOfSecondEl + array[i];
    }
    else {
    	sumOfOtherEl = sumOfOtherEl + array[i];
    }
}
   subsctract = sumOfSecondEl - sumOfOtherEl;
   
   System.out.println(subsctract);
 }   

public static void main(String[] args) {

	  //1 
	System.out.println(Homework1.minValue(a,b));
	  //2
	  //sumDividedByK();
	  //3
	  //arrayWithZeros();
	  //4
	  //isPositiveOrNegative();
	  //5
	  //isArrayOrdered();
	  //6
	  //newArrayWithEvenNumbers();
	  //7
	  //newArrayWithElementsMoreZ();
	  //8
	  //countOfElements();
	  //9
	  //minMaxChangedPositions();
	  //10
	  //onlyNumbersWithCondition();
	  //11
	  //elevenMethod();
	  //12
	  //changePosition();
	  //13
	  //numbersWithZero();
	  //14
	  //sumOfMinMax();
	  //15
	  //multipleArrElements();
	  //16
	  //maxMod();
	  //17
	  //modComparing();
	  //18
	  //maxSingleValue();
	  //19
	  //arrayEndingWithK();
	  //20
	  //calcSubstrSumEchSecEl();
	
	// System.out.println(Arrays.toString(OrderArray.orderAnArray(array)));
	
	  }
}





