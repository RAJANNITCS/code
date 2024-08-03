//Given a list of state objects, modify names to upper case, and print names whose codes begin with A.
package StreamApi;

import models.State;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintStateNameStartWithA {
    public List<State>  stateList = new ArrayList<>();

    public static void main(String[] args) {
        PrintStateNameStartWithA obj = new PrintStateNameStartWithA();
        obj.stateList.add(new State("a","A001"));
        obj.stateList.add(new State("b","B001"));
        obj.stateList.add(new State("c","C001"));
        obj.stateList.add(new State("d","D001"));
        obj.stateList.add(new State("e","AE001"));
        obj.stateList.add(new State("f","AF01"));
        obj.stateList.add(new State("g","G001"));

        List<String> stateName = obj.stateList.stream().filter(state-> state.getStateCode().startsWith("A")).map(state -> state.getStateName().toUpperCase()).collect(Collectors.toList());
        stateName.forEach(System.out :: println);
    }
}
