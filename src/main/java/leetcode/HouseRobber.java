package leetcode;

public class HouseRobber {
    public static void main(String[] args) {
        int[] house = {2, 7, 9, 3, 1};
        int money = robber(house);
        System.out.println(money);
    }

    public static int robber(int[] house) {
        if (house == null || house.length == 0) {
            return 0;
        }
        if (house.length == 1) {
            return house[0];
        }
        if (house.length == 2) {
            return house[0] + house[1];
        }
        return 1;
    }
}
