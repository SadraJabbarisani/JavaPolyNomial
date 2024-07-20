package App;

public enum OperationType {
    Evaluate(1), Sum(2), Subtract(3), Multiply(4), Divide(6);
    
    private int value;
    OperationType(int value){
        this.value = value;
    }
}
