// given a list of state objects, print the state codes.

package StreamApi;

import models.State;

import java.util.ArrayList;
import java.util.List;

public class PrintStateCode {
    public List<State> stateList = new ArrayList<>();

    public static void main(String[] args) {
        PrintStateCode obj = new PrintStateCode();
        obj.stateList.add(new State("A","A01"));
        obj.stateList.add(new State("B","B01"));
        obj.stateList.add(new State("C","C01"));
        obj.stateList.add(new State("D","D01"));
        obj.stateList.add(new State("E","E01"));
        obj.stateList.add(new State("F","F01"));

        obj.stateList.stream().map(State::getStateCode).forEach(System.out::println);
    }
}
