
class Solution {
    public int reverse(int x) {
        String y = String.valueOf(x);
        String r = "";
        boolean neg = false;
        if (y.charAt(0) == '-')
        {
            neg = true;
            y = y.replace("-", "");
        }
        for (int i = 0; i < y.length(); i++)
        {
            r = y.charAt(i) + r;
        }
        if (neg) {
            r = "-" + r;
        }
        try {
    int n = Integer.parseInt(r);
    return n;
} catch (NumberFormatException e) {
    return 0;
}

    }
}
