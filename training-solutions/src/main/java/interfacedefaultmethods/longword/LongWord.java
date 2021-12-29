package interfacedefaultmethods.longword;

import java.nio.file.Path;
import java.util.List;

public class LongWord implements FileOperations {
    private Path path;

    public LongWord(Path path) {
        this.path = path;
    }

    @Override
    public String getLongWord() {
        StringBuilder sb = new StringBuilder();
        List<String> input = readFromFile(path);
        for (int i = 0; i < input.size(); i++) {
            if (i < input.size() - 1) {
                sb.append(input.get(i).substring(0, 1));
            } else {
                sb.append(input.get(i));
            }
        }
        return new String(sb);
    }
}
