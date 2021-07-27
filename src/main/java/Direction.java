public enum Direction {
    W("S","N"),
    S("E","W"),
    E("N","S"),
    N("W","E");
    private String left;
    private String right;

    Direction(String left, String right) {
        this.left = left;
        this.right = right;
    }

    public  Direction toLeft(){
        return valueOf(left);
    }
}
