class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int wealth = 0;
        int highestwealth = 0;

        for(int i = 0; i < m; i++){
            wealth = 0;
            for(int j = 0; j < n; j++){
                wealth = wealth + accounts[i][j];
            }
            if(wealth > highestwealth)
                highestwealth = wealth;
        }
        return highestwealth;
    }
}
