package patternMatching;

public class Main {
    public static void main(String[] args) {

    }

    public static Double convertWithoutPatterMaching(Object obj){
        if(obj instanceof Integer){
            return 1.0;
        } else if(obj instanceof String){
            return 2.0;
        }else{
            throw new RuntimeException();
        }
    }
    public static Double convertWithPatterMaching(Object obj){
        return switch(obj) {
            case String s -> Double.parseDouble(s);
            //case Integer i -> i.doubleValue();
             case Integer i when i > 10 -> i.doubleValue(); // é como um If
             case Integer i -> 5d; // é como um else
            // O mais genérico coloca em baixo
            case null -> 2d;
            default -> 0d;
        };
    }
}
