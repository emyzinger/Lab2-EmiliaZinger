package edu.luc.cs.cs271.lab2;

import java.util.List;
import java.util.Optional;

public class Search {

  /** Looks for the position of the named team in an array. */
  public static Optional<Integer> findTeamPosition(final Team[] arr, final String key) {
    // Gets the array size
    final int size = arr.length;
    // Runs through a for loop to check
    for (int i = 0; i < size; i++) {
      // Gets the current item at index and compare name to key
      if (arr[i].getName().equals(key)) {
        // Return the index of where the item with key is located
        return Optional.of(i);
      }
    }
    // If it does not exist in the array then return an index of -1
    return Optional.empty();
  }

  /** Looks for the position of the named team in a list. */
  public static Optional<Integer> findTeamPosition(final List<Team> list, final String key) {
    //goes though the loop to try and find a match
    for (int i = 0; i<list.size(); i++){
      //compares each item of the list to the key
      if (list.get(i).getName().equals(key)) {
        return Optional.of(i);
      }
    }
    //if the item does not exist in the list
    return Optional.empty();
  }
  
  /** 
   * Looks for the position of the poorest team that has at least 
   * the specified funding level.
   * @pre arr is sorted
   * @post arr[result].funding >= minFunding && for all 0 <= i < result : arr[i].funding < minFunding
   */
  public static Optional<Integer> findTeamMinFunding(final Team[] arr, final int minFunding) {
    //runs though the array
    for (int i = 0; i<arr.length; i++){
      //checks each item if it is at least the amount of min
      if (minFunding <= arr[i].getFunding()){
        return Optional.of(i);
      }
    }
    return Optional.empty();
  }
  
  /** 
   * Looks for the position of the poorest team that has at least 
   * the specified funding level. 
   * Uses binary search: Initially consider the entire index range, 
   * then repeatedly eliminate the wrong half of the array until 
   * zero or one items are left.
   * @pre arr is sorted
   * @post arr[result].funding >= minFunding && for all 0 <= i < result : arr[i].funding < minFunding
   */
  public static Optional<Integer> findTeamMinFundingFast(final Team[] arr, final int minFunding) {
    // Gets the array size
    final int size = arr.length;
    // Initially consider the entire index range of the array
    int low = 0;
    int high = size - 1;
    // Keep going as long as there is more than one item to be checked
    while(low<high)
      if(minFunding <= arr[low].getFunding()){//check if low is the min you want
        return Optional.of(low);
      } else { // Eliminate the wrong half of the array
      int mid= (low+high)/2; //middle of the array
        if (minFunding<= arr[mid].getFunding()){//check if the middle is higher than what you want
          high = mid;
          low++;
        } else{//if middle is lower than what you want
          low = (mid)+1;
        }
      }
    // Return current item only if it meets the condition!
    if (low <= high && arr[low].getFunding() >= minFunding) {
      return Optional.of(low);
    } else {
      return Optional.empty();
    }
  }
}
