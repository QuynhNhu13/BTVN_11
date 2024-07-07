
public class MyString implements IString {

    @Override
    public int f1(String string) {
        if (string == null || string.isEmpty()) {
            return 0;
        }
        int count = 0;
        String[] n = string.split("\\s+");
        for (String i : n) {
            if (checkLetter(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean checkLetter(String n) {
        for (char ch : n.toCharArray()) {
            if (Character.isLetter(ch)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String f2(String string) {
        StringBuilder sb = new StringBuilder();
        String[] n = string.split("\\s+");
        if (string == null || string.isEmpty()) {
            return string;
        }
        if (n.length == 1) {
            return "";
        }
        for (int i = 0; i < n.length - 1; i++) {
            sb.append(n[i]);
        }

        return sb.toString();

    }

}
