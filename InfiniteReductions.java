class InfiniteReduction {
    public static void main(String[] args) {
        int N = 6;
        String S = "ABCDEA";
        char result = reduceString(N, S);
        System.out.println(result);
    }

    public static char reduceString(int N, String S) {
        StringBuilder sb = new StringBuilder(S);
        while (sb.length() > 1) {
            StringBuilder temp = new StringBuilder();
            for (int i = 1; i < sb.length(); i += 2) {
                temp.append(sb.charAt(i));
            }
            sb = temp;
        }
        return sb.charAt(0);
    }
}