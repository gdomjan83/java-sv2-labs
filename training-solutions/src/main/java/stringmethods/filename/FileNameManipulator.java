package stringmethods.filename;

public class FileNameManipulator {
    public char findLastCharacter(String string) {
        String trimmed = string.trim();
        int lastPeriodIndex = trimmed.lastIndexOf(".");
        return string.charAt(lastPeriodIndex - 1);
    }

    public String findFileExtension(String fileName) {
        String trimmed = fileName.trim();
        int lastPeriodIndex = trimmed.lastIndexOf(".");
        return fileName.substring(lastPeriodIndex + 1);
    }

    public boolean identifyFilesByExtension(String extension, String fileName) {
        String trimmed = fileName.trim();
        return findFileExtension(trimmed).equals(extension);
    }

    public boolean compareFilesByName(String fileName, String actualFileName) {
        return fileName.equalsIgnoreCase(actualFileName);
    }

    public String changeExtensionToLower(String fileName) {
        String trimmed = fileName.trim();
        int lastPeriodIndex = trimmed.lastIndexOf(".");
        String lower = trimmed.substring(lastPeriodIndex + 1).toLowerCase();
        return trimmed.substring(0, lastPeriodIndex) + "." + lower;
    }

    public String replaceStringPart(String fileName, String present, String target) {
        String trimmed = fileName.trim();
        int lastPeriodIndex = trimmed.lastIndexOf(".");
        String name = trimmed.substring(0, lastPeriodIndex);
        return name.replace(target, present) + ".".concat(findFileExtension(fileName));
    }

    public static void main(String[] args) {
        FileNameManipulator manipulator = new FileNameManipulator();

        System.out.println(manipulator.findLastCharacter("run.exe"));
        System.out.println(manipulator.findFileExtension("autoexec.bat"));
        System.out.println(manipulator.findFileExtension("new.autoexec.bat"));
        System.out.println(manipulator.identifyFilesByExtension("com", "command.com"));
        System.out.println(manipulator.compareFilesByName("system.ini", "System.ini"));
        System.out.println(manipulator.changeExtensionToLower("game.Exe"));
        System.out.println(manipulator.replaceStringPart("oldsave.bat", "new", "old"));
    }
}
