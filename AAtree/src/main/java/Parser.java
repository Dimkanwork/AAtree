import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Parser {
    private Scanner sc;

    public Parser(InputStream in){
        this.sc = new Scanner(in);
    }

    public List<Integer> next(){
        String s = sc.nextLine();
        return Arrays.stream(s.split(",")).map(Integer::new).collect(Collectors.toList());
    }

    public boolean hasNext(){
        return sc.hasNextLine();
    }
}
