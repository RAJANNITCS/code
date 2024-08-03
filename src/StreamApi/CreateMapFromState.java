//Given a list of state objects, create a map with code as key and name as value.
package StreamApi;

import models.State;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CreateMapFromState {
    public List<State> stateList  = new ArrayList<>();

    public static void main(String[] args) {
        CreateMapFromState obj = new CreateMapFromState();
        obj.stateList.add(new State("A","A001"));
        obj.stateList.add(new State("B","B001"));
        obj.stateList.add(new State("C","C001"));
        obj.stateList.add(new State("D","D001"));
        obj.stateList.add(new State("E","E001"));
        obj.stateList.add(new State("F","F001"));

        Map<String,String> stateMap = obj.stateList.stream().collect(Collectors.toMap(State :: getStateCode,State :: getStateName));
        System.out.println(stateMap);
    }
}
