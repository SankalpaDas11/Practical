class Rectangle {
public static void main(String ...args) {
System.out.println("The length and breadth of the rectangle are : ");
int length = 12; // initialize the value of length
int breadth = 5; // initialize the value of breadth
int perimeter = (length+breadth)*2; // logic to find perimeter
int area = (length * breadth); // logic to find area
System.out.println(length + " " + breadth); // printing the side lengths
System.out.println("The perimeter of the rectangle is : " + perimeter); // printing the result of perimeter
System.out.println("The area of the rectangle is : " + area); // printing the result of area
}
}