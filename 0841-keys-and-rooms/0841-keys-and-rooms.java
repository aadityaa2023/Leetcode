class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis = new boolean[rooms.size()];
        Queue<Integer> q = new LinkedList<>();

        vis[0] = true;
        q.offer(0);
        while (!q.isEmpty()) {
            int node = q.poll();

            for (int key : rooms.get(node)) {
                if (!vis[key]) {
                    vis[key] = true;
                    q.offer(key);
                }
            }

        }
        for (int i = 0; i < vis.length; i++) {
            if (vis[i] == false) {
                return false;
            }
        }
        return true;
    }
}