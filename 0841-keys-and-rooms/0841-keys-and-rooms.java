class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis = new boolean[rooms.size()];

        dfs(0, rooms, vis);

        for (int i = 0; i < vis.length; i++) {
            if (vis[i] == false) {
                return false;
            }
        }
        return true;
    }

    private void dfs(int room, List<List<Integer>> rooms, boolean[] vis) {
        vis[room] = true;

        for (int key : rooms.get(room)) {
            if (!vis[key]) {
                dfs(key, rooms, vis);
            }
        }
    }
}