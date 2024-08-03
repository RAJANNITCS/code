//Given a list of state objects, modify names to upper case,
// and print names whose codes begin with A and sorted in alphabetical order.
package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import models.State;

public class PrintStateNameStartWithAAndSort {
    public List<State> stateList = new ArrayList<>();

    public static void main(String[] args) {
        PrintStateNameStartWithAAndSort obj = new PrintStateNameStartWithAAndSort();
        obj.stateList.add(new State("A","A0001"));
        obj.stateList.add(new State("B","B0001"));
        obj.stateList.add(new State("G","G0001"));
        obj.stateList.add(new State("L","AL0001"));
        obj.stateList.add(new State("D","AD0001"));
        obj.stateList.add(new State("E","AE0001"));
        obj.stateList.add(new State("N","N0001"));

        List<String> sortStateName = obj.stateList.stream().filter(state -> state.getStateCode().startsWith("A"))
                .map(state -> state.getStateName().toUpperCase()).sorted().collect(Collectors.toList());
        sortStateName.forEach(System.out :: println);
    }
}
