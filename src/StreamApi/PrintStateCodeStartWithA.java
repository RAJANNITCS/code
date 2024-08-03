package StreamApi;

import models.State;
import java.util.ArrayList;
import java.util.List;

public class PrintStateCodeStartWithA {
    public List<State> listOfState = new ArrayList<>();

    public static void main(String[] args) {
        PrintStateCodeStartWithA obj = new PrintStateCodeStartWithA();
        obj.listOfState.add(new State("A","A001"));
        obj.listOfState.add(new State("B","B001"));
        obj.listOfState.add(new State("C","C001"));
        obj.listOfState.add(new State("D","D001"));
        obj.listOfState.add(new State("E","AE001"));

        obj.listOfState.stream().map(State::getStateCode).filter(stateCode -> stateCode.startsWith("A")).forEach(System.out :: println);
    }
}
