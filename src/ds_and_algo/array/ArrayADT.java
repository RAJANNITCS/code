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

    public void displayV2() {
        for (Integer value : this.arr) {
            System.out.println(value);
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

    public Integer get(Integer index) {
        if (index <= this.elementCount) {
            return this.arr[index];
        } else {
            System.out.println("Given index is not valid !!");
        }
        return -1;
    }

    public void set(Integer index,Integer value) {
        if (index <= this.elementCount) {
            this.arr[index] = value;
        }else {
            System.out.println("Given index is not valid !!");
        }
    }

    public Integer min() {
        Integer minValue = 0;
        if (this.elementCount > 0) {
            minValue = this.arr[0];
            for (int i = 0; i < this.elementCount; i++) {
                if (minValue > this.arr[i]) {
                    minValue = this.arr[i];
                }
            }
        }
        return minValue;
    }

    public Integer max() {
        Integer maxValue = 0;
        if (this.elementCount > 0) {
            maxValue = this.arr[0];
            for (int i = 0; i < this.elementCount; i++) {
                if (maxValue < this.arr[i]) {
                    maxValue = this.arr[i];
                }
            }
        }
        return maxValue;
    }

    public Integer sum() {
        Integer sum = 0;
        if (this.elementCount > 0) {
            for (int i = 0; i < this.elementCount; i++) {
                sum += this.arr[i];
            }
        }
        return sum;
    }

    public Integer avg() {
        if (this.elementCount > 0) {
            Integer sum = 0;
            for (int i = 0; i < this.elementCount; i++) {
                sum += this.arr[i];
            }
            return (sum / this.elementCount);
        } else {
            System.out.println("Array is empty !!");
        }
        return -1;
    }

    public Integer leftShift() {
        if (this.elementCount > 0) {
            Integer shiftValue = 0;
            shiftValue = this.arr[0];
            for (int i = 0; i < this.elementCount; i++) {
                this.arr[i] = this.arr[i+1];
            }
            this.arr[this.elementCount - 1] = 0;
            this.elementCount--;
            return shiftValue;
        }else {
            System.out.println("Array is Empty !!");
        }
        return -1;
    }

    public void leftRotate() {
        if (this.elementCount > 0) {
            Integer shiftValue = this.arr[0];
            for (int i = 0; i < this.elementCount-1; i++) {
                this.arr[i] = this.arr[i + 1];
            }
            this.arr[this.elementCount - 1] = shiftValue;
        }else {
            System.out.println("Array is empty !!");
        }
    }

    public void rightShift() {
        if (this.elementCount > 0) {
            if (this.elementCount != this.arr.length) {
                Integer shiftValue = this.arr[this.elementCount - 1];
                for (int i = this.elementCount; i > 0; i--) {
                    this.arr[i] = this.arr[i - 1];
                }
                this.arr[0] = 0;
                this.elementCount++;
            }else {
                System.out.println("Array does not have space !!");
            }
        } else {
            System.out.println("Array is empty !!");
        }
    }

    public void rightRotation() {
        if (this.elementCount > 0) {
            Integer shiftValue = this.arr[this.elementCount - 1];
            for (int i = this.elementCount - 1; i > 0; i--) {
                this.arr[i] = this.arr[i - 1];
            }
            this.arr[0] = shiftValue;
        } else {
            System.out.println("Array is empty !!");
        }
    }

    // using temp array
    public void reverseV1() {
        if (this.elementCount > 0) {
            Integer temp[] = new Integer[this.arr.length];
            for (int i = this.elementCount - 1, j = 0; i >= 0; i--, j++) {
                temp[j] = this.arr[i];
            }
            this.arr = temp;
        } else {
            System.out.println("Array is empty !!");
        }
    }

    // using temp variable
    public void reverseV2() {
        if (this.elementCount > 0) {
            Integer temp;
           for (int i = this.elementCount - 1, j = 0; i >= j; i--,j++) {
               temp = this.arr[i];
               this.arr[i] = this.arr[j];
               this.arr[j] = temp;
           }
        } else {
            System.out.println("Array is empty !!");
        }
    }
}
