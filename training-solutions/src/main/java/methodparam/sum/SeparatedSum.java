package methodparam.sum;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SeparatedSum {

    public SummedNumbers sum(String floatingNumbers) {
        SummedNumbers sn = new SummedNumbers();
        for (String item : setupString(floatingNumbers)) {
            sumNumbers(sn, Double.parseDouble(item));
        }
        return sn;
    }

    private void sumNumbers(SummedNumbers summedNumbers, double number) {
        if (number >= 0) {
            summedNumbers.setPositiveNumberSum(summedNumbers.getPositiveNumberSum() + number);
        } else {
            summedNumbers.setNegativeNumbersSum(summedNumbers.getNegativeNumbersSum() + number);
        }
    }

    public String readFile(Path path) {
        try {
            List<String> result = new ArrayList<>(Files.readAllLines(path));
            return result.get(0);
        }
        catch (IOException ioe)  {
            throw new IllegalArgumentException("Cannot read file.");
        }
    }

    private String[] setupString(String inputstring) {
        String numbersWithPeriod = inputstring.replace(",", ".");
        String[] numbers = numbersWithPeriod.split(";");
        return numbers;
    }
}
