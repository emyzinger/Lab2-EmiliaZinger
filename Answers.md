**What is the complexity of each of the four search methods in terms of array or list size n?**

The complexity of the three linear searches, team position array, team position list, and team funding array are all O(n). These are all the same complexity because with each of those methods the algorithm has to compare each element with the key in order until it finds the one it is looking for. The complexity of the binary search in the findTeamMinFundingFast() method is O(log(n)). This one is log(n) because with each iteration it cuts the number of elements to be checked in half. 

**What happens in the case of binary search if the array is not sorted?**
If a list is not ordered binary search will not work. The main thing in binary search is to check the middle value and then dismiss half the array if it does not meet the requirements. If the array is not sorted then the middle value would be checked, and it will be very possible that the thing you are looking for is in the half of the array that got discarded. This makes the binary search inaccurate.  

**What is the purpose of constructor argument validity checking?**

 The purpose of constructor argument validity checking is to make sure that what is passed into the constructor is reasonable and what you want for that class. If you do not want any value to be null and a null value does manage to be passed in validity checking will allow you to catch that and tell the user that it's not allowed. 

**What is the purpose of using the keyword final with variables and arguments?**

The purpose of using the keyword final with variables and arguments is to help eliminate programmer error. Final causes the variable to be unable to be changed. When an int is declared final nothing can be done to change the value assigned to it. In some situations this can help reduce error, for example in a == check, if the programmer accidentally enters = then the int will not be changed. Or if another programmer starts working on the same code and they unknowingly try to change the value of the variable they cannot. 

**What are alternatives to using Optional and how do they compare?**

An alternative to using Optional in java is just returning null. If you get a NullPointerException the program will crash and you have to figure out why it was null. You also have to check and verify that no variable is null before using it, if you don't want a NullPointerException. With Optional it is easier to test because you can just use .isPresent(). Additionally primitive types cannot be null, they always have to have a value.  Without Optional you would have to designate a value to mean failed. 



