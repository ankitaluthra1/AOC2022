import InputParser.FileReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

class Day9Test {

    @Test
    public void shouldGivenOutputForFirstPuzzle() throws IOException {
        FileReader fileReader = new FileReader();
        List<String> inputList = fileReader.readFile("day9.txt");
        Day9 day9 = new Day9(inputList);
        int output = day9.solveFirstPuzzle();
        System.out.println(output);
    }

    @Test
    public void shouldGivenOutputForSecondPuzzle() throws IOException {
        FileReader fileReader = new FileReader();
        List<String> inputList = fileReader.readFile("day9.txt");
        Day9 day9 = new Day9(inputList);
        int output = day9.solveSecondPuzzle();
        System.out.println(output);
    }


}