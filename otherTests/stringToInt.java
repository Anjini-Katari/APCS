public class stringToInt{
    public 

    public static void main(String[] args) {
        int[] _data = new int[10];
        int _size = _data.length -1 ;

        String answer = "[";
        for (int i = 0; i < _size - 1; i++) {
            answer += _data[i] + ", ";
        }
        answer += _data[_size] + "]";

        System.out.println(answer);
    }

}