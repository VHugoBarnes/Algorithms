package algorithm_introduction;

public class UserDefinedDataType {

    public char name [] = new char[50];
    public char id [] = new char[10];
    public float credit;
    public char address [] = new char[100];


    public UserDefinedDataType(char[] name, char[] id, float credit, char[] address) {
        this.name = name;
        this.id = id;
        this.credit = credit;
        this.address = address;
    }

    public UserDefinedDataType() {
    }
}
