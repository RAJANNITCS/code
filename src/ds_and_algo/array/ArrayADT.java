package ds_and_algo.array;

import java.util.Objects;

public class ArrayADT {

    public Integer arr[] = null;
    public Integer elementCount = 0;

    public ArrayADT(Integer sizeOfArray) {
        this.arr = new Integer[sizeOfArray];
    }

    public void add(Integer value) {
        if (this.elementCount != this.arr.length) {
            this.arr[this.elementCount] = value;
            this.elementCount++;
        }else {
            System.out.println("Array does not have space !!");
        }
    }

    public void displayV1() {
        if (this.elementCount > 0) {
            System.out.println("Display array :");
            for (int i = 0; i < this.elementCount; i++) {
                System.out.println(this.arr[i]);
            }
        }
    }

    public void insert(Integer index, Integer value) {
        if (this.elementCount != this.arr.length) {
            for (int i = this.elementCount; i > index; i--) {
                this.arr[i] = this.arr[i - 1];
            }
            this.arr[index] = value;
            this.elementCount++;
        }else {
            System.out.println("Give index is not valid !!");
        }
    }

    public Integer delete(Integer index) {
        Integer temp = 0;
        if (index <= this.arr.length && index < this.elementCount) {
            temp = this.arr[index];
            for (int i = index; i < this.elementCount; i++) {
                this.arr[i] = this.arr[i + 1];
            }
            this.elementCount--;
        }else {
            System.out.println("Give index is not valid !!");
        }
        return temp;
    }

    public Integer search(Integer value) {
        if (this.elementCount > 0) {
            for (int i = 0; i < this.elementCount; i++) {
                if (Objects.equals(this.arr[i], value)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
