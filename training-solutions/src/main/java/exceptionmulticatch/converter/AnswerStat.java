package exceptionmulticatch.converter;

public class AnswerStat {
    private BinaryStringConverter binaryStringConverter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    public BinaryStringConverter getBinaryStringConverter() {
        return binaryStringConverter;
    }

    public boolean[] convert(String input) {
        try {
            return binaryStringConverter.binaryStringToBooleanArray(input);
        } catch (NullPointerException | IllegalArgumentException e) {
            throw new InvalidBinaryStringException(e.getMessage(), e);
        }
    }

    public int answerTruePercent(String answers) {
        boolean[] input = convert(answers);
        int countTrue = 0;
        for (boolean actual : input) {
            if (actual) {
                countTrue++;
            }
        }
        return ((countTrue * 100 / input.length));
    }
}
