package exam2_hashmap;

public class Pair <Key, Value> {
    private Key keyData; 
    private Value valueData; 

    public Pair(Key keyData, Value valueData) {
        this.keyData = keyData; 
        this.valueData = valueData; 
    }

    public Key getKey() {
        return keyData; 
    }

    public void setKey(Key keyData) {
        this.keyData = keyData; 
    }

    public Value getValue() {
        return valueData; 
    }

    public void setValue(Value valueData) {
        this.valueData = valueData; 
    }
}
