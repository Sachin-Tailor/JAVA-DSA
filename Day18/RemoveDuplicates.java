public class RemoveDuplicates {

    static void removeDup(String str, int idx, String newStr, boolean map[]) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char curr = str.charAt(idx);

        if(map[curr - 'a']) {
            removeDup(str, idx + 1, newStr, map);
        } else {
            map[curr - 'a'] = true;
            removeDup(str, idx + 1, newStr + curr, map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDup(str, 0, "", new boolean[26]);
    }
}