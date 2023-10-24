package concept;

public class DifferencesInCollection {

//
//	4) What is the difference between ArrayList and Vector?
//			No.	ArrayList	                                                               Vector
//			1)	ArrayList is not synchronized.	                                           Vector is synchronized.
//			2)	ArrayList is not a legacy class.	                                       Vector is a legacy class.
//			3)	ArrayList increases its size by 50% of the array size.	                   Vector increases its size by doubling the array size.
//			4)	ArrayList is not ?thread-safe? as it is not synchronized.	              Vector list is ?thread-safe? as it?s every method is synchronized.

//	5) What is the difference between ArrayList and LinkedList?
//			No.	ArrayList	                                                                                    LinkedList
//			1)	ArrayList uses a dynamic array.	                                                                 LinkedList uses a doubly linked list.
//			2)	ArrayList is not efficient for manipulation because too much is required.	                     LinkedList is efficient for manipulation.
//			3)	ArrayList is better to store and fetch data.	LinkedList is better to manipulate data.
//			4)	ArrayList provides random access.	LinkedList does not provide random access.
//			5)	ArrayList takes less memory overhead as it stores only object	                             LinkedList takes more memory overhead, as it stores the object as well as the address of that object.
//
//
//	

//No.	Iterator	                                                                          ListIterator
//1)	The Iterator traverses the elements in the forward direction only.	                       ListIterator traverses the elements in backward and forward directions both.
//2)	The Iterator can be used in List, Set, and Queue.	                                       ListIterator can be used in List only.
//3)	The Iterator can only perform remove operation while traversing the collection.	            ListIterator can perform ?add,? ?remove,? and ?set? operation while traversing the collection.
//	

//	8) What is the difference between List and Set?
//			The List and Set both extend the collection interface. However, there are some differences between the both which are listed below.
//
//			The List can contain duplicate elements whereas Set includes unique items.
//			The List is an ordered collection which maintains the insertion order whereas Set is an unordered collection which does not preserve the insertion order.
//			The List interface contains a single legacy class which is Vector class whereas Set interface does not have any legacy class.
//			The List interface can allow n number of null values whereas Set interface only allows a single null value.

//	9) What is the difference between HashSet and TreeSet?
//			The HashSet and TreeSet, both classes, implement Set interface. The differences between the both are listed below.
//
//			HashSet maintains no order whereas TreeSet maintains ascending order.
//			HashSet impended by hash table whereas TreeSet implemented by a Tree structure.
//			HashSet performs faster than TreeSet.
//			HashSet is backed by HashMap whereas TreeSet is backed by TreeMap.

//
//	10) What is the difference between Set and Map?
//			The differences between the Set and Map are given below.
//
//
//			Set contains values only whereas Map contains key and values both.
//			Set contains unique values whereas Map can contain unique Keys with duplicate values.
//			Set holds a single number of null value whereas Map can include a single null key with n number of null values.

//
//	11) What is the difference between HashSet and HashMap?
//			The differences between the HashSet and HashMap are listed below.
//
//			HashSet contains only values whereas HashMap includes the entry (key, value). HashSet can be iterated, but HashMap needs to convert into Set to be iterated.
//			HashSet implements Set interface whereas HashMap implements the Map interface
//			HashSet cannot have any duplicate value whereas HashMap can contain duplicate values with unique keys.
//			HashSet contains the only single number of null value whereas HashMap can hold a single null key with n number of null values.

//
//	12) What is the difference between HashMap and TreeMap?
//			The differences between the HashMap and TreeMap are given below.
//
//			HashMap maintains no order, but TreeMap maintains ascending order.
//			HashMap is implemented by hash table whereas TreeMap is implemented by a Tree structure.
//			HashMap can be sorted by Key or value whereas TreeMap can be sorted by Key.
//			HashMap may contain a null key with multiple null values whereas TreeMap cannot hold a null key but can have multiple null values.

//
//
//
//
//	14) What is the difference between Collection and Collections?
//			The differences between the Collection and Collections are given below.
//
//			The Collection is an interface whereas Collections is a class.
//			The Collection interface provides the standard functionality of data structure to List, Set, and Queue. However, Collections class is to sort and synchronize the collection elements.
//			The Collection interface provides the methods that can be used for data structure whereas Collections class provides the static methods which can be used for various operation on a collection.

//	15) What is the difference between Comparable and Comparator?
//			No.	Comparable	Comparator
//			1)	Comparable provides only one sort of sequence.	The Comparator provides multiple sorts of sequences.
//			2)	It provides one method named compareTo().	It provides one method named compare().
//			3)	It is found in java.lang package.	It is located in java.util package.
//			4)	If we implement the Comparable interface, The actual class is modified.	The actual class is not changed.

}
