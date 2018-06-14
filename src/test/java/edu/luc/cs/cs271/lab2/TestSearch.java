package edu.luc.cs.cs271.lab2;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TestSearch {
  
  Team[] makeArrayFixture(final int size) {
    final Team[] array = new Team[size];
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
    }
    return array;
  }

  List<Team> makeListFixture(final int size) {
      final Team[] array = makeArrayFixture(size);
      final List<Team> list = Arrays.asList(array);
      return list;
  }

  @Test
  public void testFindPositionArray0() {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10s() {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10f() {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamPosition(arr, "Team 11").isPresent());
  }

    @Test
    public void testFindPositionList0() {
      final List<Team> list = makeListFixture(0);
      assertFalse(Search.findTeamPosition(list,"Team 5").isPresent());
    }

    @Test
    public void testFindPositionList10s() {
        final List<Team> list= makeListFixture(10);
        assertTrue(Search.findTeamPosition(list, "Team 5").isPresent());
    }

    @Test
    public void testFindPositionList10f() {
        final List<Team> list = makeListFixture(10);
        assertFalse(Search.findTeamPosition(list,"Team 11").isPresent());
    }

    @Test
    public void testFindMinFundingArray0() {
        final Team[] arr = makeArrayFixture(0);
        assertFalse(Search.findTeamMinFunding(arr, 100).isPresent());
    }

    @Test
    public void testFindMinFundingArray5() {
        final Team[] arr = makeArrayFixture(5);
        assertTrue(Search.findTeamMinFunding(arr, 100).isPresent());
    }

    @Test
    public void testFindMinFundingArray5f() {
        final Team[] arr = makeArrayFixture(5);
        assertFalse(Search.findTeamMinFunding(arr, 1000).isPresent());
    }

  @Test
  public void testFindMinFundingFastArray0() {
      final Team[] arr = makeArrayFixture(0);
      assertFalse(Search.findTeamMinFundingFast(arr, 100).isPresent());
  }

    @Test
    public void testFindMinFundingArrayFast5() {
        final Team[] arr = makeArrayFixture(5);
        assertTrue(Search.findTeamMinFundingFast(arr, 100).isPresent());
    }

    @Test
    public void testFindMinFundingArrayFast5f() {
        final Team[] arr = makeArrayFixture(5);
        assertFalse(Search.findTeamMinFundingFast(arr, 1000).isPresent());
    }

}
